package org.chromium.content.browser.accessibility;

import J.N;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class WebContentsAccessibilityImplJni implements WebContentsAccessibilityImpl.Natives {
  private static WebContentsAccessibilityImpl.Natives testInstance;

  public static final JniStaticTestMocker<WebContentsAccessibilityImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(WebContentsAccessibilityImpl caller, WebContents webContents) {
    return (long)N.MjYAnP1s(caller, webContents);
  }

  @Override
  public void deleteEarly(long nativeWebContentsAccessibilityAndroid) {
    N.MxGfnb$m(nativeWebContentsAccessibilityAndroid);
  }

  @Override
  public void onAutofillPopupDisplayed(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller) {
    N.MMiqVowe(nativeWebContentsAccessibilityAndroid, caller);
  }

  @Override
  public void onAutofillPopupDismissed(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller) {
    N.MdET073e(nativeWebContentsAccessibilityAndroid, caller);
  }

  @Override
  public int getIdForElementAfterElementHostingAutofillPopup(
      long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller) {
    return (int)N.Mk31b3DX(nativeWebContentsAccessibilityAndroid, caller);
  }

  @Override
  public int getRootId(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller) {
    return (int)N.MI8pU34f(nativeWebContentsAccessibilityAndroid, caller);
  }

  @Override
  public boolean isNodeValid(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id) {
    return (boolean)N.MTBNGzHX(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  @Override
  public boolean isAutofillPopupNode(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id) {
    return (boolean)N.M5uHFthk(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  @Override
  public boolean isEditableText(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id) {
    return (boolean)N.MCMbXu4W(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  @Override
  public boolean isFocused(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id) {
    return (boolean)N.M8UuMlLD(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  @Override
  public int getEditableTextSelectionStart(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id) {
    return (int)N.MnVi6Frs(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  @Override
  public int getEditableTextSelectionEnd(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id) {
    return (int)N.Mxt_kc4Q(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  @Override
  public boolean populateAccessibilityNodeInfo(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, AccessibilityNodeInfo info, int id) {
    return (boolean)N.MJGtghd9(nativeWebContentsAccessibilityAndroid, caller, info, id);
  }

  @Override
  public boolean populateAccessibilityEvent(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, AccessibilityEvent event, int id, int eventType) {
    return (boolean)N.M2E1dEU9(nativeWebContentsAccessibilityAndroid, caller, event, id, eventType);
  }

  @Override
  public void click(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller,
      int id) {
    N.MM4OAOXm(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  @Override
  public void focus(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller,
      int id) {
    N.MG_OiJKg(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  @Override
  public void blur(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller) {
    N.MNm00fYN(nativeWebContentsAccessibilityAndroid, caller);
  }

  @Override
  public void scrollToMakeNodeVisible(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id) {
    N.MB302_MP(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  @Override
  public int findElementType(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int startId, String elementType, boolean forwards) {
    return (int)N.MavOU0SM(nativeWebContentsAccessibilityAndroid, caller, startId, elementType, forwards);
  }

  @Override
  public void setTextFieldValue(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id, String newValue) {
    N.MEJD7Boi(nativeWebContentsAccessibilityAndroid, caller, id, newValue);
  }

  @Override
  public void setSelection(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id, int start, int end) {
    N.MVuu0R4P(nativeWebContentsAccessibilityAndroid, caller, id, start, end);
  }

  @Override
  public boolean nextAtGranularity(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int selectionGranularity, boolean extendSelection,
      int id, int cursorIndex) {
    return (boolean)N.McKjfBnu(nativeWebContentsAccessibilityAndroid, caller, selectionGranularity, extendSelection, id, cursorIndex);
  }

  @Override
  public boolean previousAtGranularity(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int selectionGranularity, boolean extendSelection,
      int id, int cursorIndex) {
    return (boolean)N.M3suD0ji(nativeWebContentsAccessibilityAndroid, caller, selectionGranularity, extendSelection, id, cursorIndex);
  }

  @Override
  public boolean adjustSlider(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id, boolean increment) {
    return (boolean)N.MLjXc4lw(nativeWebContentsAccessibilityAndroid, caller, id, increment);
  }

  @Override
  public void moveAccessibilityFocus(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int oldId, int newId) {
    N.MPQKLw45(nativeWebContentsAccessibilityAndroid, caller, oldId, newId);
  }

  @Override
  public boolean isSlider(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id) {
    return (boolean)N.MkaakTGI(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  @Override
  public boolean scroll(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id, int direction) {
    return (boolean)N.MNch0m9c(nativeWebContentsAccessibilityAndroid, caller, id, direction);
  }

  @Override
  public String getSupportedHtmlElementTypes(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller) {
    return (String)N.MPyIoFYC(nativeWebContentsAccessibilityAndroid, caller);
  }

  @Override
  public void showContextMenu(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id) {
    N.MOikWIf9(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  @Override
  public boolean isEnabled(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller) {
    return (boolean)N.Mr9fGid2(nativeWebContentsAccessibilityAndroid, caller);
  }

  @Override
  public void enable(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller) {
    N.Mg$cuhZc(nativeWebContentsAccessibilityAndroid, caller);
  }

  @Override
  public boolean areInlineTextBoxesLoaded(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id) {
    return (boolean)N.MZcfOSQW(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  @Override
  public void loadInlineTextBoxes(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id) {
    N.M2WbOJ7$(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  @Override
  public int[] getCharacterBoundingBoxes(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id, int start, int len) {
    return (int[])N.MVBiMGvZ(nativeWebContentsAccessibilityAndroid, caller, id, start, len);
  }

  @Override
  public int getTextLength(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id) {
    return (int)N.MhMiVz6m(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  @Override
  public void addSpellingErrorForTesting(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id, int startOffset, int endOffset) {
    N.MzygGmQh(nativeWebContentsAccessibilityAndroid, caller, id, startOffset, endOffset);
  }

  public static WebContentsAccessibilityImpl.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new WebContentsAccessibilityImplJni();
  }
}
