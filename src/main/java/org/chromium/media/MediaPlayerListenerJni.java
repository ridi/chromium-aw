package org.chromium.media;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class MediaPlayerListenerJni implements MediaPlayerListener.Natives {
  private static MediaPlayerListener.Natives testInstance;

  public static final JniStaticTestMocker<MediaPlayerListener.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.media.MediaPlayerListener.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.media.MediaPlayerListener.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onMediaError(long nativeMediaPlayerListener, MediaPlayerListener caller,
      int errorType) {
    GEN_JNI.org_chromium_media_MediaPlayerListener_onMediaError(nativeMediaPlayerListener, caller, errorType);
  }

  @Override
  public void onVideoSizeChanged(long nativeMediaPlayerListener, MediaPlayerListener caller,
      int width, int height) {
    GEN_JNI.org_chromium_media_MediaPlayerListener_onVideoSizeChanged(nativeMediaPlayerListener, caller, width, height);
  }

  @Override
  public void onMediaPrepared(long nativeMediaPlayerListener, MediaPlayerListener caller) {
    GEN_JNI.org_chromium_media_MediaPlayerListener_onMediaPrepared(nativeMediaPlayerListener, caller);
  }

  @Override
  public void onPlaybackComplete(long nativeMediaPlayerListener, MediaPlayerListener caller) {
    GEN_JNI.org_chromium_media_MediaPlayerListener_onPlaybackComplete(nativeMediaPlayerListener, caller);
  }

  public static MediaPlayerListener.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.media.MediaPlayerListener.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new MediaPlayerListenerJni();
  }
}
