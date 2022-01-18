package org.chromium.content.browser;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class AudioFocusDelegateJni implements AudioFocusDelegate.Natives {
  private static AudioFocusDelegate.Natives testInstance;

  public static final JniStaticTestMocker<AudioFocusDelegate.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.AudioFocusDelegate.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.AudioFocusDelegate.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onSuspend(long nativeAudioFocusDelegateAndroid, AudioFocusDelegate caller) {
    GEN_JNI.org_chromium_content_browser_AudioFocusDelegate_onSuspend(nativeAudioFocusDelegateAndroid, caller);
  }

  @Override
  public void onResume(long nativeAudioFocusDelegateAndroid, AudioFocusDelegate caller) {
    GEN_JNI.org_chromium_content_browser_AudioFocusDelegate_onResume(nativeAudioFocusDelegateAndroid, caller);
  }

  @Override
  public void onStartDucking(long nativeAudioFocusDelegateAndroid, AudioFocusDelegate caller) {
    GEN_JNI.org_chromium_content_browser_AudioFocusDelegate_onStartDucking(nativeAudioFocusDelegateAndroid, caller);
  }

  @Override
  public void onStopDucking(long nativeAudioFocusDelegateAndroid, AudioFocusDelegate caller) {
    GEN_JNI.org_chromium_content_browser_AudioFocusDelegate_onStopDucking(nativeAudioFocusDelegateAndroid, caller);
  }

  @Override
  public void recordSessionDuck(long nativeAudioFocusDelegateAndroid, AudioFocusDelegate caller) {
    GEN_JNI.org_chromium_content_browser_AudioFocusDelegate_recordSessionDuck(nativeAudioFocusDelegateAndroid, caller);
  }

  public static AudioFocusDelegate.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.AudioFocusDelegate.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AudioFocusDelegateJni();
  }
}
