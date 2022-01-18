package org.chromium.media;

import java.lang.Override;
import java.nio.ByteBuffer;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class AudioTrackOutputStreamJni implements AudioTrackOutputStream.Natives {
  private static AudioTrackOutputStream.Natives testInstance;

  public static final JniStaticTestMocker<AudioTrackOutputStream.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.media.AudioTrackOutputStream.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.media.AudioTrackOutputStream.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public AudioTrackOutputStream.AudioBufferInfo onMoreData(long nativeAudioTrackOutputStream,
      AudioTrackOutputStream caller, ByteBuffer audioData, long delayInFrames) {
    return (AudioTrackOutputStream.AudioBufferInfo)GEN_JNI.org_chromium_media_AudioTrackOutputStream_onMoreData(nativeAudioTrackOutputStream, caller, audioData, delayInFrames);
  }

  @Override
  public void onError(long nativeAudioTrackOutputStream, AudioTrackOutputStream caller) {
    GEN_JNI.org_chromium_media_AudioTrackOutputStream_onError(nativeAudioTrackOutputStream, caller);
  }

  @Override
  public long getAddress(long nativeAudioTrackOutputStream, AudioTrackOutputStream caller,
      ByteBuffer byteBuffer) {
    return (long)GEN_JNI.org_chromium_media_AudioTrackOutputStream_getAddress(nativeAudioTrackOutputStream, caller, byteBuffer);
  }

  public static AudioTrackOutputStream.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.media.AudioTrackOutputStream.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AudioTrackOutputStreamJni();
  }
}
