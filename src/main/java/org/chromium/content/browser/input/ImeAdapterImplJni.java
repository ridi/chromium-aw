package org.chromium.content.browser.input;

import android.view.KeyEvent;
import java.lang.CharSequence;
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
class ImeAdapterImplJni implements ImeAdapterImpl.Natives {
  private static ImeAdapterImpl.Natives testInstance;

  public static final JniStaticTestMocker<ImeAdapterImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.input.ImeAdapterImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.input.ImeAdapterImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(ImeAdapterImpl caller, WebContents webContents) {
    return (long)GEN_JNI.org_chromium_content_browser_input_ImeAdapterImpl_init(caller, webContents);
  }

  @Override
  public boolean sendKeyEvent(long nativeImeAdapterAndroid, ImeAdapterImpl caller, KeyEvent event,
      int type, int modifiers, long timestampMs, int keyCode, int scanCode, boolean isSystemKey,
      int unicodeChar) {
    return (boolean)GEN_JNI.org_chromium_content_browser_input_ImeAdapterImpl_sendKeyEvent(nativeImeAdapterAndroid, caller, event, type, modifiers, timestampMs, keyCode, scanCode, isSystemKey, unicodeChar);
  }

  @Override
  public void appendUnderlineSpan(long spanPtr, int start, int end) {
    GEN_JNI.org_chromium_content_browser_input_ImeAdapterImpl_appendUnderlineSpan(spanPtr, start, end);
  }

  @Override
  public void appendBackgroundColorSpan(long spanPtr, int start, int end, int backgroundColor) {
    GEN_JNI.org_chromium_content_browser_input_ImeAdapterImpl_appendBackgroundColorSpan(spanPtr, start, end, backgroundColor);
  }

  @Override
  public void appendSuggestionSpan(long spanPtr, int start, int end, boolean isMisspelling,
      boolean removeOnFinishComposing, int underlineColor, int suggestionHighlightColor,
      String[] suggestions) {
    GEN_JNI.org_chromium_content_browser_input_ImeAdapterImpl_appendSuggestionSpan(spanPtr, start, end, isMisspelling, removeOnFinishComposing, underlineColor, suggestionHighlightColor, suggestions);
  }

  @Override
  public void setComposingText(long nativeImeAdapterAndroid, ImeAdapterImpl caller,
      CharSequence text, String textStr, int newCursorPosition) {
    GEN_JNI.org_chromium_content_browser_input_ImeAdapterImpl_setComposingText(nativeImeAdapterAndroid, caller, text, textStr, newCursorPosition);
  }

  @Override
  public void commitText(long nativeImeAdapterAndroid, ImeAdapterImpl caller, CharSequence text,
      String textStr, int newCursorPosition) {
    GEN_JNI.org_chromium_content_browser_input_ImeAdapterImpl_commitText(nativeImeAdapterAndroid, caller, text, textStr, newCursorPosition);
  }

  @Override
  public void finishComposingText(long nativeImeAdapterAndroid, ImeAdapterImpl caller) {
    GEN_JNI.org_chromium_content_browser_input_ImeAdapterImpl_finishComposingText(nativeImeAdapterAndroid, caller);
  }

  @Override
  public void setEditableSelectionOffsets(long nativeImeAdapterAndroid, ImeAdapterImpl caller,
      int start, int end) {
    GEN_JNI.org_chromium_content_browser_input_ImeAdapterImpl_setEditableSelectionOffsets(nativeImeAdapterAndroid, caller, start, end);
  }

  @Override
  public void setComposingRegion(long nativeImeAdapterAndroid, ImeAdapterImpl caller, int start,
      int end) {
    GEN_JNI.org_chromium_content_browser_input_ImeAdapterImpl_setComposingRegion(nativeImeAdapterAndroid, caller, start, end);
  }

  @Override
  public void deleteSurroundingText(long nativeImeAdapterAndroid, ImeAdapterImpl caller, int before,
      int after) {
    GEN_JNI.org_chromium_content_browser_input_ImeAdapterImpl_deleteSurroundingText(nativeImeAdapterAndroid, caller, before, after);
  }

  @Override
  public void deleteSurroundingTextInCodePoints(long nativeImeAdapterAndroid, ImeAdapterImpl caller,
      int before, int after) {
    GEN_JNI.org_chromium_content_browser_input_ImeAdapterImpl_deleteSurroundingTextInCodePoints(nativeImeAdapterAndroid, caller, before, after);
  }

  @Override
  public boolean requestTextInputStateUpdate(long nativeImeAdapterAndroid, ImeAdapterImpl caller) {
    return (boolean)GEN_JNI.org_chromium_content_browser_input_ImeAdapterImpl_requestTextInputStateUpdate(nativeImeAdapterAndroid, caller);
  }

  @Override
  public void requestCursorUpdate(long nativeImeAdapterAndroid, ImeAdapterImpl caller,
      boolean immediateRequest, boolean monitorRequest) {
    GEN_JNI.org_chromium_content_browser_input_ImeAdapterImpl_requestCursorUpdate(nativeImeAdapterAndroid, caller, immediateRequest, monitorRequest);
  }

  @Override
  public void advanceFocusInForm(long nativeImeAdapterAndroid, ImeAdapterImpl caller,
      int focusType) {
    GEN_JNI.org_chromium_content_browser_input_ImeAdapterImpl_advanceFocusInForm(nativeImeAdapterAndroid, caller, focusType);
  }

  public static ImeAdapterImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.input.ImeAdapterImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ImeAdapterImplJni();
  }
}
