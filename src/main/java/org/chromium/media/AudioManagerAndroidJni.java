package org.chromium.media;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class AudioManagerAndroidJni implements AudioManagerAndroid.Natives {
  private static AudioManagerAndroid.Natives testInstance;

  public static final JniStaticTestMocker<AudioManagerAndroid.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.media.AudioManagerAndroid.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.media.AudioManagerAndroid.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void setMute(long nativeAudioManagerAndroid, AudioManagerAndroid caller, boolean muted) {
    GEN_JNI.org_chromium_media_AudioManagerAndroid_setMute(nativeAudioManagerAndroid, caller, muted);
  }

  public static AudioManagerAndroid.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.media.AudioManagerAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AudioManagerAndroidJni();
  }
}
