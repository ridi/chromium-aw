package org.chromium.media;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AudioManagerAndroidJni implements AudioManagerAndroid.Natives {
  private static AudioManagerAndroid.Natives testInstance;

  public static final JniStaticTestMocker<AudioManagerAndroid.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.media.AudioManagerAndroid.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.media.AudioManagerAndroid.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void setMute(long nativeAudioManagerAndroid, AudioManagerAndroid caller, boolean muted) {
    N.MCgftn_d(nativeAudioManagerAndroid, caller, muted);
  }

  public static AudioManagerAndroid.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.media.AudioManagerAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AudioManagerAndroidJni();
  }
}
