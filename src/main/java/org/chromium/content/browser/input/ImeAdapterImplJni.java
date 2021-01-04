package org.chromium.content.browser.input;

import J.N;
import android.view.KeyEvent;
import java.lang.CharSequence;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ImeAdapterImplJni implements ImeAdapterImpl.Natives {
  private static ImeAdapterImpl.Natives testInstance;

  public static final JniStaticTestMocker<ImeAdapterImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.input.ImeAdapterImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.input.ImeAdapterImpl.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(ImeAdapterImpl caller, WebContents webContents) {
    return (long)N.MhbsQh1H(caller, webContents);
  }

  @Override
  public boolean sendKeyEvent(long nativeImeAdapterAndroid, ImeAdapterImpl caller, KeyEvent event,
      int type, int modifiers, long timestampMs, int keyCode, int scanCode, boolean isSystemKey,
      int unicodeChar) {
    return (boolean)N.M1qwlrOP(nativeImeAdapterAndroid, caller, event, type, modifiers, timestampMs, keyCode, scanCode, isSystemKey, unicodeChar);
  }

  @Override
  public void appendUnderlineSpan(long spanPtr, int start, int end) {
    N.MFfRzF$Z(spanPtr, start, end);
  }

  @Override
  public void appendBackgroundColorSpan(long spanPtr, int start, int end, int backgroundColor) {
    N.MqqhDONa(spanPtr, start, end, backgroundColor);
  }

  @Override
  public void appendSuggestionSpan(long spanPtr, int start, int end, boolean isMisspelling,
      boolean removeOnFinishComposing, int underlineColor, int suggestionHighlightColor,
      String[] suggestions) {
    N.M$b45Vvn(spanPtr, start, end, isMisspelling, removeOnFinishComposing, underlineColor, suggestionHighlightColor, suggestions);
  }

  @Override
  public void setComposingText(long nativeImeAdapterAndroid, ImeAdapterImpl caller,
      CharSequence text, String textStr, int newCursorPosition) {
    N.Mlslst_P(nativeImeAdapterAndroid, caller, text, textStr, newCursorPosition);
  }

  @Override
  public void commitText(long nativeImeAdapterAndroid, ImeAdapterImpl caller, CharSequence text,
      String textStr, int newCursorPosition) {
    N.Mb6t43di(nativeImeAdapterAndroid, caller, text, textStr, newCursorPosition);
  }

  @Override
  public void finishComposingText(long nativeImeAdapterAndroid, ImeAdapterImpl caller) {
    N.M_V5g5ie(nativeImeAdapterAndroid, caller);
  }

  @Override
  public void setEditableSelectionOffsets(long nativeImeAdapterAndroid, ImeAdapterImpl caller,
      int start, int end) {
    N.MmtjCblb(nativeImeAdapterAndroid, caller, start, end);
  }

  @Override
  public void setComposingRegion(long nativeImeAdapterAndroid, ImeAdapterImpl caller, int start,
      int end) {
    N.M8ty0WHb(nativeImeAdapterAndroid, caller, start, end);
  }

  @Override
  public void deleteSurroundingText(long nativeImeAdapterAndroid, ImeAdapterImpl caller, int before,
      int after) {
    N.M26GCjn5(nativeImeAdapterAndroid, caller, before, after);
  }

  @Override
  public void deleteSurroundingTextInCodePoints(long nativeImeAdapterAndroid, ImeAdapterImpl caller,
      int before, int after) {
    N.Mvb046o_(nativeImeAdapterAndroid, caller, before, after);
  }

  @Override
  public boolean requestTextInputStateUpdate(long nativeImeAdapterAndroid, ImeAdapterImpl caller) {
    return (boolean)N.M7o5Xhhi(nativeImeAdapterAndroid, caller);
  }

  @Override
  public void requestCursorUpdate(long nativeImeAdapterAndroid, ImeAdapterImpl caller,
      boolean immediateRequest, boolean monitorRequest) {
    N.MdwW1P2L(nativeImeAdapterAndroid, caller, immediateRequest, monitorRequest);
  }

  @Override
  public void advanceFocusInForm(long nativeImeAdapterAndroid, ImeAdapterImpl caller,
      int focusType) {
    N.Mm_z91JF(nativeImeAdapterAndroid, caller, focusType);
  }

  public static ImeAdapterImpl.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.input.ImeAdapterImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ImeAdapterImplJni();
  }
}
