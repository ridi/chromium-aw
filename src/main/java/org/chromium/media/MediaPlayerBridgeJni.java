package org.chromium.media;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class MediaPlayerBridgeJni implements MediaPlayerBridge.Natives {
  private static MediaPlayerBridge.Natives testInstance;

  public static final JniStaticTestMocker<MediaPlayerBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.media.MediaPlayerBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.media.MediaPlayerBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onDidSetDataUriDataSource(long nativeMediaPlayerBridge, MediaPlayerBridge caller,
      boolean success) {
    GEN_JNI.org_chromium_media_MediaPlayerBridge_onDidSetDataUriDataSource(nativeMediaPlayerBridge, caller, success);
  }

  public static MediaPlayerBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.media.MediaPlayerBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new MediaPlayerBridgeJni();
  }
}
