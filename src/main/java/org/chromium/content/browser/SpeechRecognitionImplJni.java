package org.chromium.content.browser;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class SpeechRecognitionImplJni implements SpeechRecognitionImpl.Natives {
  private static SpeechRecognitionImpl.Natives testInstance;

  public static final JniStaticTestMocker<SpeechRecognitionImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.SpeechRecognitionImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.SpeechRecognitionImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onAudioStart(long nativeSpeechRecognizerImplAndroid, SpeechRecognitionImpl caller) {
    GEN_JNI.org_chromium_content_browser_SpeechRecognitionImpl_onAudioStart(nativeSpeechRecognizerImplAndroid, caller);
  }

  @Override
  public void onSoundStart(long nativeSpeechRecognizerImplAndroid, SpeechRecognitionImpl caller) {
    GEN_JNI.org_chromium_content_browser_SpeechRecognitionImpl_onSoundStart(nativeSpeechRecognizerImplAndroid, caller);
  }

  @Override
  public void onSoundEnd(long nativeSpeechRecognizerImplAndroid, SpeechRecognitionImpl caller) {
    GEN_JNI.org_chromium_content_browser_SpeechRecognitionImpl_onSoundEnd(nativeSpeechRecognizerImplAndroid, caller);
  }

  @Override
  public void onAudioEnd(long nativeSpeechRecognizerImplAndroid, SpeechRecognitionImpl caller) {
    GEN_JNI.org_chromium_content_browser_SpeechRecognitionImpl_onAudioEnd(nativeSpeechRecognizerImplAndroid, caller);
  }

  @Override
  public void onRecognitionResults(long nativeSpeechRecognizerImplAndroid,
      SpeechRecognitionImpl caller, String[] results, float[] scores, boolean provisional) {
    GEN_JNI.org_chromium_content_browser_SpeechRecognitionImpl_onRecognitionResults(nativeSpeechRecognizerImplAndroid, caller, results, scores, provisional);
  }

  @Override
  public void onRecognitionError(long nativeSpeechRecognizerImplAndroid,
      SpeechRecognitionImpl caller, int error) {
    GEN_JNI.org_chromium_content_browser_SpeechRecognitionImpl_onRecognitionError(nativeSpeechRecognizerImplAndroid, caller, error);
  }

  @Override
  public void onRecognitionEnd(long nativeSpeechRecognizerImplAndroid,
      SpeechRecognitionImpl caller) {
    GEN_JNI.org_chromium_content_browser_SpeechRecognitionImpl_onRecognitionEnd(nativeSpeechRecognizerImplAndroid, caller);
  }

  public static SpeechRecognitionImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.SpeechRecognitionImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SpeechRecognitionImplJni();
  }
}
