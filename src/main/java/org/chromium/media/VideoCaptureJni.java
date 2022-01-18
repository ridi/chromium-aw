package org.chromium.media;

import java.lang.Override;
import java.lang.String;
import java.nio.ByteBuffer;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class VideoCaptureJni implements VideoCapture.Natives {
  private static VideoCapture.Natives testInstance;

  public static final JniStaticTestMocker<VideoCapture.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.media.VideoCapture.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.media.VideoCapture.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onFrameAvailable(long nativeVideoCaptureDeviceAndroid, VideoCapture caller,
      byte[] data, int length, int rotation) {
    GEN_JNI.org_chromium_media_VideoCapture_onFrameAvailable(nativeVideoCaptureDeviceAndroid, caller, data, length, rotation);
  }

  @Override
  public void onI420FrameAvailable(long nativeVideoCaptureDeviceAndroid, VideoCapture caller,
      ByteBuffer yBuffer, int yStride, ByteBuffer uBuffer, ByteBuffer vBuffer, int uvRowStride,
      int uvPixelStride, int width, int height, int rotation, long timestamp) {
    GEN_JNI.org_chromium_media_VideoCapture_onI420FrameAvailable(nativeVideoCaptureDeviceAndroid, caller, yBuffer, yStride, uBuffer, vBuffer, uvRowStride, uvPixelStride, width, height, rotation, timestamp);
  }

  @Override
  public void onError(long nativeVideoCaptureDeviceAndroid, VideoCapture caller,
      int androidVideoCaptureError, String message) {
    GEN_JNI.org_chromium_media_VideoCapture_onError(nativeVideoCaptureDeviceAndroid, caller, androidVideoCaptureError, message);
  }

  @Override
  public void onFrameDropped(long nativeVideoCaptureDeviceAndroid, VideoCapture caller,
      int androidVideoCaptureFrameDropReason) {
    GEN_JNI.org_chromium_media_VideoCapture_onFrameDropped(nativeVideoCaptureDeviceAndroid, caller, androidVideoCaptureFrameDropReason);
  }

  @Override
  public void onGetPhotoCapabilitiesReply(long nativeVideoCaptureDeviceAndroid, VideoCapture caller,
      long callbackId, PhotoCapabilities result) {
    GEN_JNI.org_chromium_media_VideoCapture_onGetPhotoCapabilitiesReply(nativeVideoCaptureDeviceAndroid, caller, callbackId, result);
  }

  @Override
  public void onPhotoTaken(long nativeVideoCaptureDeviceAndroid, VideoCapture caller,
      long callbackId, byte[] data) {
    GEN_JNI.org_chromium_media_VideoCapture_onPhotoTaken(nativeVideoCaptureDeviceAndroid, caller, callbackId, data);
  }

  @Override
  public void onStarted(long nativeVideoCaptureDeviceAndroid, VideoCapture caller) {
    GEN_JNI.org_chromium_media_VideoCapture_onStarted(nativeVideoCaptureDeviceAndroid, caller);
  }

  @Override
  public void dCheckCurrentlyOnIncomingTaskRunner(long nativeVideoCaptureDeviceAndroid,
      VideoCapture caller) {
    GEN_JNI.org_chromium_media_VideoCapture_dCheckCurrentlyOnIncomingTaskRunner(nativeVideoCaptureDeviceAndroid, caller);
  }

  public static VideoCapture.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.media.VideoCapture.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new VideoCaptureJni();
  }
}
