package org.chromium.media;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class MediaCodecBridgeJni implements MediaCodecBridge.Natives {
  private static MediaCodecBridge.Natives testInstance;

  public static final JniStaticTestMocker<MediaCodecBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.media.MediaCodecBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.media.MediaCodecBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onBuffersAvailable(long nativeMediaCodecBridge, MediaCodecBridge caller) {
    N.MNqjfk23(nativeMediaCodecBridge, caller);
  }

  public static MediaCodecBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.media.MediaCodecBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new MediaCodecBridgeJni();
  }
}
