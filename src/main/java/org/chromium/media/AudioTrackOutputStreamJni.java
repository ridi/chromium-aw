package org.chromium.media;

import J.N;
import java.lang.Override;
import java.nio.ByteBuffer;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AudioTrackOutputStreamJni implements AudioTrackOutputStream.Natives {
  private static AudioTrackOutputStream.Natives testInstance;

  public static final JniStaticTestMocker<AudioTrackOutputStream.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.media.AudioTrackOutputStream.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.media.AudioTrackOutputStream.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public AudioTrackOutputStream.AudioBufferInfo onMoreData(long nativeAudioTrackOutputStream,
      AudioTrackOutputStream caller, ByteBuffer audioData, long delayInFrames) {
    return (AudioTrackOutputStream.AudioBufferInfo)N.MEPH2V3G(nativeAudioTrackOutputStream, caller, audioData, delayInFrames);
  }

  @Override
  public void onError(long nativeAudioTrackOutputStream, AudioTrackOutputStream caller) {
    N.Mr6$Ko2f(nativeAudioTrackOutputStream, caller);
  }

  @Override
  public long getAddress(long nativeAudioTrackOutputStream, AudioTrackOutputStream caller,
      ByteBuffer byteBuffer) {
    return (long)N.MMQ1O_vA(nativeAudioTrackOutputStream, caller, byteBuffer);
  }

  public static AudioTrackOutputStream.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.media.AudioTrackOutputStream.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AudioTrackOutputStreamJni();
  }
}
