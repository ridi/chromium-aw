package org.chromium.content.browser;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AudioFocusDelegateJni implements AudioFocusDelegate.Natives {
  private static AudioFocusDelegate.Natives testInstance;

  public static final JniStaticTestMocker<AudioFocusDelegate.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.AudioFocusDelegate.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.AudioFocusDelegate.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onSuspend(long nativeAudioFocusDelegateAndroid, AudioFocusDelegate caller) {
    N.MUFA7yj7(nativeAudioFocusDelegateAndroid, caller);
  }

  @Override
  public void onResume(long nativeAudioFocusDelegateAndroid, AudioFocusDelegate caller) {
    N.MqbF3KiE(nativeAudioFocusDelegateAndroid, caller);
  }

  @Override
  public void onStartDucking(long nativeAudioFocusDelegateAndroid, AudioFocusDelegate caller) {
    N.My_SIOp6(nativeAudioFocusDelegateAndroid, caller);
  }

  @Override
  public void onStopDucking(long nativeAudioFocusDelegateAndroid, AudioFocusDelegate caller) {
    N.MeoE5HbI(nativeAudioFocusDelegateAndroid, caller);
  }

  @Override
  public void recordSessionDuck(long nativeAudioFocusDelegateAndroid, AudioFocusDelegate caller) {
    N.Mn3dG6eh(nativeAudioFocusDelegateAndroid, caller);
  }

  public static AudioFocusDelegate.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.AudioFocusDelegate.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AudioFocusDelegateJni();
  }
}
