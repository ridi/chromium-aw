package org.chromium.content.browser;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SpeechRecognitionImplJni implements SpeechRecognitionImpl.Natives {
  private static SpeechRecognitionImpl.Natives testInstance;

  public static final JniStaticTestMocker<SpeechRecognitionImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.SpeechRecognitionImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.SpeechRecognitionImpl.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onAudioStart(long nativeSpeechRecognizerImplAndroid, SpeechRecognitionImpl caller) {
    N.MdhaXGcn(nativeSpeechRecognizerImplAndroid, caller);
  }

  @Override
  public void onSoundStart(long nativeSpeechRecognizerImplAndroid, SpeechRecognitionImpl caller) {
    N.M2Nl8ID9(nativeSpeechRecognizerImplAndroid, caller);
  }

  @Override
  public void onSoundEnd(long nativeSpeechRecognizerImplAndroid, SpeechRecognitionImpl caller) {
    N.MFB2QCbe(nativeSpeechRecognizerImplAndroid, caller);
  }

  @Override
  public void onAudioEnd(long nativeSpeechRecognizerImplAndroid, SpeechRecognitionImpl caller) {
    N.M2TRi32V(nativeSpeechRecognizerImplAndroid, caller);
  }

  @Override
  public void onRecognitionResults(long nativeSpeechRecognizerImplAndroid,
      SpeechRecognitionImpl caller, String[] results, float[] scores, boolean provisional) {
    N.MnkvkoGY(nativeSpeechRecognizerImplAndroid, caller, results, scores, provisional);
  }

  @Override
  public void onRecognitionError(long nativeSpeechRecognizerImplAndroid,
      SpeechRecognitionImpl caller, int error) {
    N.MUf_fHKN(nativeSpeechRecognizerImplAndroid, caller, error);
  }

  @Override
  public void onRecognitionEnd(long nativeSpeechRecognizerImplAndroid,
      SpeechRecognitionImpl caller) {
    N.MmgQYR9M(nativeSpeechRecognizerImplAndroid, caller);
  }

  public static SpeechRecognitionImpl.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.SpeechRecognitionImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SpeechRecognitionImplJni();
  }
}
