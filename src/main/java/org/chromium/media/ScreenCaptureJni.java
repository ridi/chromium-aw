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
final class ScreenCaptureJni implements ScreenCapture.Natives {
  private static ScreenCapture.Natives testInstance;

  public static final JniStaticTestMocker<ScreenCapture.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.media.ScreenCapture.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.media.ScreenCapture.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onRGBAFrameAvailable(long nativeScreenCaptureMachineAndroid, ScreenCapture caller,
      ByteBuffer buf, int rowStride, int left, int top, int width, int height, long timestamp) {
    N.MjDBp6op(nativeScreenCaptureMachineAndroid, caller, buf, rowStride, left, top, width, height, timestamp);
  }

  @Override
  public void onI420FrameAvailable(long nativeScreenCaptureMachineAndroid, ScreenCapture caller,
      ByteBuffer yBuffer, int yStride, ByteBuffer uBuffer, ByteBuffer vBuffer, int uvRowStride,
      int uvPixelStride, int left, int top, int width, int height, long timestamp) {
    N.MgLL$kUF(nativeScreenCaptureMachineAndroid, caller, yBuffer, yStride, uBuffer, vBuffer, uvRowStride, uvPixelStride, left, top, width, height, timestamp);
  }

  @Override
  public void onActivityResult(long nativeScreenCaptureMachineAndroid, ScreenCapture caller,
      boolean result) {
    N.M2auslLM(nativeScreenCaptureMachineAndroid, caller, result);
  }

  @Override
  public void onOrientationChange(long nativeScreenCaptureMachineAndroid, ScreenCapture caller,
      int rotation) {
    N.Ml8UDaFX(nativeScreenCaptureMachineAndroid, caller, rotation);
  }

  public static ScreenCapture.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.media.ScreenCapture.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ScreenCaptureJni();
  }
}
