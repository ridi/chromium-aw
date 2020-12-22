package org.chromium.media;

import J.N;
import java.lang.Override;
import java.lang.String;
import java.nio.ByteBuffer;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class VideoCaptureJni implements VideoCapture.Natives {
  private static VideoCapture.Natives testInstance;

  public static final JniStaticTestMocker<VideoCapture.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.media.VideoCapture.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.media.VideoCapture.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onFrameAvailable(long nativeVideoCaptureDeviceAndroid, VideoCapture caller,
      byte[] data, int length, int rotation) {
    N.Mq5gIPzl(nativeVideoCaptureDeviceAndroid, caller, data, length, rotation);
  }

  @Override
  public void onI420FrameAvailable(long nativeVideoCaptureDeviceAndroid, VideoCapture caller,
      ByteBuffer yBuffer, int yStride, ByteBuffer uBuffer, ByteBuffer vBuffer, int uvRowStride,
      int uvPixelStride, int width, int height, int rotation, long timestamp) {
    N.MlTacwJQ(nativeVideoCaptureDeviceAndroid, caller, yBuffer, yStride, uBuffer, vBuffer, uvRowStride, uvPixelStride, width, height, rotation, timestamp);
  }

  @Override
  public void onError(long nativeVideoCaptureDeviceAndroid, VideoCapture caller,
      int androidVideoCaptureError, String message) {
    N.MhmwjISE(nativeVideoCaptureDeviceAndroid, caller, androidVideoCaptureError, message);
  }

  @Override
  public void onFrameDropped(long nativeVideoCaptureDeviceAndroid, VideoCapture caller,
      int androidVideoCaptureFrameDropReason) {
    N.M651cEC1(nativeVideoCaptureDeviceAndroid, caller, androidVideoCaptureFrameDropReason);
  }

  @Override
  public void onGetPhotoCapabilitiesReply(long nativeVideoCaptureDeviceAndroid, VideoCapture caller,
      long callbackId, PhotoCapabilities result) {
    N.MumkJZ3e(nativeVideoCaptureDeviceAndroid, caller, callbackId, result);
  }

  @Override
  public void onPhotoTaken(long nativeVideoCaptureDeviceAndroid, VideoCapture caller,
      long callbackId, byte[] data) {
    N.MdZBZ$ST(nativeVideoCaptureDeviceAndroid, caller, callbackId, data);
  }

  @Override
  public void onStarted(long nativeVideoCaptureDeviceAndroid, VideoCapture caller) {
    N.MPaf3s5k(nativeVideoCaptureDeviceAndroid, caller);
  }

  @Override
  public void dCheckCurrentlyOnIncomingTaskRunner(long nativeVideoCaptureDeviceAndroid,
      VideoCapture caller) {
    N.Mqw5545M(nativeVideoCaptureDeviceAndroid, caller);
  }

  public static VideoCapture.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.media.VideoCapture.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new VideoCaptureJni();
  }
}
