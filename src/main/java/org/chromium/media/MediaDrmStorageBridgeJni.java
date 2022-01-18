package org.chromium.media;

import java.lang.Boolean;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
class MediaDrmStorageBridgeJni implements MediaDrmStorageBridge.Natives {
  private static MediaDrmStorageBridge.Natives testInstance;

  public static final JniStaticTestMocker<MediaDrmStorageBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.media.MediaDrmStorageBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.media.MediaDrmStorageBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onProvisioned(long nativeMediaDrmStorageBridge, MediaDrmStorageBridge caller,
      Callback<Boolean> cb) {
    GEN_JNI.org_chromium_media_MediaDrmStorageBridge_onProvisioned(nativeMediaDrmStorageBridge, caller, cb);
  }

  @Override
  public void onLoadInfo(long nativeMediaDrmStorageBridge, MediaDrmStorageBridge caller,
      byte[] sessionId, Callback<MediaDrmStorageBridge.PersistentInfo> cb) {
    GEN_JNI.org_chromium_media_MediaDrmStorageBridge_onLoadInfo(nativeMediaDrmStorageBridge, caller, sessionId, cb);
  }

  @Override
  public void onSaveInfo(long nativeMediaDrmStorageBridge, MediaDrmStorageBridge caller,
      MediaDrmStorageBridge.PersistentInfo info, Callback<Boolean> cb) {
    GEN_JNI.org_chromium_media_MediaDrmStorageBridge_onSaveInfo(nativeMediaDrmStorageBridge, caller, info, cb);
  }

  @Override
  public void onClearInfo(long nativeMediaDrmStorageBridge, MediaDrmStorageBridge caller,
      byte[] sessionId, Callback<Boolean> cb) {
    GEN_JNI.org_chromium_media_MediaDrmStorageBridge_onClearInfo(nativeMediaDrmStorageBridge, caller, sessionId, cb);
  }

  public static MediaDrmStorageBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.media.MediaDrmStorageBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new MediaDrmStorageBridgeJni();
  }
}
