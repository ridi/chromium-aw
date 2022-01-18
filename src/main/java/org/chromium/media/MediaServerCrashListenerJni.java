package org.chromium.media;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class MediaServerCrashListenerJni implements MediaServerCrashListener.Natives {
  private static MediaServerCrashListener.Natives testInstance;

  public static final JniStaticTestMocker<MediaServerCrashListener.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.media.MediaServerCrashListener.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.media.MediaServerCrashListener.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onMediaServerCrashDetected(long nativeMediaServerCrashListener,
      MediaServerCrashListener caller, boolean watchdogNeedsRelease) {
    GEN_JNI.org_chromium_media_MediaServerCrashListener_onMediaServerCrashDetected(nativeMediaServerCrashListener, caller, watchdogNeedsRelease);
  }

  public static MediaServerCrashListener.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.media.MediaServerCrashListener.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new MediaServerCrashListenerJni();
  }
}
