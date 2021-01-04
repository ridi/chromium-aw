package org.chromium.media;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class MediaPlayerBridgeJni implements MediaPlayerBridge.Natives {
  private static MediaPlayerBridge.Natives testInstance;

  public static final JniStaticTestMocker<MediaPlayerBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.media.MediaPlayerBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.media.MediaPlayerBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onDidSetDataUriDataSource(long nativeMediaPlayerBridge, MediaPlayerBridge caller,
      boolean success) {
    N.Mo4Rd8TE(nativeMediaPlayerBridge, caller, success);
  }

  public static MediaPlayerBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.media.MediaPlayerBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new MediaPlayerBridgeJni();
  }
}
