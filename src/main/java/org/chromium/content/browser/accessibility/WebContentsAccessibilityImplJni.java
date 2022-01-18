package org.chromium.content.browser.accessibility;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class WebContentsAccessibilityImplJni implements WebContentsAccessibilityImpl.Natives {
  private static WebContentsAccessibilityImpl.Natives testInstance;

  public static final JniStaticTestMocker<WebContentsAccessibilityImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(WebContentsAccessibilityImpl caller, WebContents webContents) {
    return (long)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_init(caller, webContents);
  }

  @Override
  public long initWithAXTree(WebContentsAccessibilityImpl caller, long axTreePtr) {
    return (long)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_initWithAXTree(caller, axTreePtr);
  }

  @Override
  public void deleteEarly(long nativeWebContentsAccessibilityAndroid) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_deleteEarly(nativeWebContentsAccessibilityAndroid);
  }

  @Override
  public void onAutofillPopupDisplayed(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_onAutofillPopupDisplayed(nativeWebContentsAccessibilityAndroid, caller);
  }

  @Override
  public void onAutofillPopupDismissed(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_onAutofillPopupDismissed(nativeWebContentsAccessibilityAndroid, caller);
  }

  @Override
  public int getIdForElementAfterElementHostingAutofillPopup(
      long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller) {
    return (int)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getIdForElementAfterElementHostingAutofillPopup(nativeWebContentsAccessibilityAndroid, caller);
  }

  @Override
  public int getRootId(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller) {
    return (int)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getRootId(nativeWebContentsAccessibilityAndroid, caller);
  }

  @Override
  public boolean isNodeValid(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_isNodeValid(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  @Override
  public boolean isAutofillPopupNode(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_isAutofillPopupNode(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  @Override
  public boolean isEditableText(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_isEditableText(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  @Override
  public boolean isFocused(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_isFocused(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  @Override
  public int getEditableTextSelectionStart(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id) {
    return (int)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getEditableTextSelectionStart(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  @Override
  public int getEditableTextSelectionEnd(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id) {
    return (int)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getEditableTextSelectionEnd(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  @Override
  public int[] getAbsolutePositionForNode(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id) {
    return (int[])GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getAbsolutePositionForNode(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  @Override
  public boolean updateCachedAccessibilityNodeInfo(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, AccessibilityNodeInfo info, int id) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_updateCachedAccessibilityNodeInfo(nativeWebContentsAccessibilityAndroid, caller, info, id);
  }

  @Override
  public boolean populateAccessibilityNodeInfo(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, AccessibilityNodeInfo info, int id) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_populateAccessibilityNodeInfo(nativeWebContentsAccessibilityAndroid, caller, info, id);
  }

  @Override
  public boolean populateAccessibilityEvent(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, AccessibilityEvent event, int id, int eventType) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_populateAccessibilityEvent(nativeWebContentsAccessibilityAndroid, caller, event, id, eventType);
  }

  @Override
  public void click(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller,
      int id) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_click(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  @Override
  public void focus(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller,
      int id) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_focus(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  @Override
  public void blur(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_blur(nativeWebContentsAccessibilityAndroid, caller);
  }

  @Override
  public void scrollToMakeNodeVisible(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_scrollToMakeNodeVisible(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  @Override
  public int findElementType(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int startId, String elementType, boolean forwards,
      boolean canWrapToLastElement) {
    return (int)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_findElementType(nativeWebContentsAccessibilityAndroid, caller, startId, elementType, forwards, canWrapToLastElement);
  }

  @Override
  public void setTextFieldValue(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id, String newValue) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_setTextFieldValue(nativeWebContentsAccessibilityAndroid, caller, id, newValue);
  }

  @Override
  public void setSelection(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id, int start, int end) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_setSelection(nativeWebContentsAccessibilityAndroid, caller, id, start, end);
  }

  @Override
  public boolean nextAtGranularity(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int selectionGranularity, boolean extendSelection,
      int id, int cursorIndex) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_nextAtGranularity(nativeWebContentsAccessibilityAndroid, caller, selectionGranularity, extendSelection, id, cursorIndex);
  }

  @Override
  public boolean previousAtGranularity(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int selectionGranularity, boolean extendSelection,
      int id, int cursorIndex) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_previousAtGranularity(nativeWebContentsAccessibilityAndroid, caller, selectionGranularity, extendSelection, id, cursorIndex);
  }

  @Override
  public boolean adjustSlider(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id, boolean increment) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_adjustSlider(nativeWebContentsAccessibilityAndroid, caller, id, increment);
  }

  @Override
  public void moveAccessibilityFocus(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int oldId, int newId) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_moveAccessibilityFocus(nativeWebContentsAccessibilityAndroid, caller, oldId, newId);
  }

  @Override
  public boolean isSlider(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_isSlider(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  @Override
  public boolean scroll(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id, int direction, boolean pageScroll) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_scroll(nativeWebContentsAccessibilityAndroid, caller, id, direction, pageScroll);
  }

  @Override
  public boolean setRangeValue(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id, float value) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_setRangeValue(nativeWebContentsAccessibilityAndroid, caller, id, value);
  }

  @Override
  public String getSupportedHtmlElementTypes(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller) {
    return (String)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getSupportedHtmlElementTypes(nativeWebContentsAccessibilityAndroid, caller);
  }

  @Override
  public void showContextMenu(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_showContextMenu(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  @Override
  public boolean isEnabled(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_isEnabled(nativeWebContentsAccessibilityAndroid, caller);
  }

  @Override
  public void enable(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, boolean screenReaderMode) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_enable(nativeWebContentsAccessibilityAndroid, caller, screenReaderMode);
  }

  @Override
  public void setAXMode(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, boolean screenReaderMode) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_setAXMode(nativeWebContentsAccessibilityAndroid, caller, screenReaderMode);
  }

  @Override
  public boolean areInlineTextBoxesLoaded(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_areInlineTextBoxesLoaded(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  @Override
  public void loadInlineTextBoxes(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_loadInlineTextBoxes(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  @Override
  public int[] getCharacterBoundingBoxes(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id, int start, int len) {
    return (int[])GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getCharacterBoundingBoxes(nativeWebContentsAccessibilityAndroid, caller, id, start, len);
  }

  @Override
  public int getTextLength(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id) {
    return (int)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getTextLength(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  @Override
  public void addSpellingErrorForTesting(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int id, int startOffset, int endOffset) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_addSpellingErrorForTesting(nativeWebContentsAccessibilityAndroid, caller, id, startOffset, endOffset);
  }

  @Override
  public void setMaxContentChangedEventsToFireForTesting(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, int maxEvents) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_setMaxContentChangedEventsToFireForTesting(nativeWebContentsAccessibilityAndroid, caller, maxEvents);
  }

  @Override
  public int getMaxContentChangedEventsToFireForTesting(
      long nativeWebContentsAccessibilityAndroid) {
    return (int)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getMaxContentChangedEventsToFireForTesting(nativeWebContentsAccessibilityAndroid);
  }

  @Override
  public void signalEndOfTestForTesting(long nativeWebContentsAccessibilityAndroid) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_signalEndOfTestForTesting(nativeWebContentsAccessibilityAndroid);
  }

  @Override
  public void setIsRunningAsWebView(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, boolean isWebView) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_setIsRunningAsWebView(nativeWebContentsAccessibilityAndroid, caller, isWebView);
  }

  @Override
  public boolean onHoverEventNoRenderer(long nativeWebContentsAccessibilityAndroid,
      WebContentsAccessibilityImpl caller, float x, float y) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_onHoverEventNoRenderer(nativeWebContentsAccessibilityAndroid, caller, x, y);
  }

  public static WebContentsAccessibilityImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new WebContentsAccessibilityImplJni();
  }
}
