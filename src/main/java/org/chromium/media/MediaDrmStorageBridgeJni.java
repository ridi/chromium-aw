package org.chromium.media;

import J.N;
import java.lang.Boolean;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
final class MediaDrmStorageBridgeJni implements MediaDrmStorageBridge.Natives {
  private static MediaDrmStorageBridge.Natives testInstance;

  public static final JniStaticTestMocker<MediaDrmStorageBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.media.MediaDrmStorageBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.media.MediaDrmStorageBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onProvisioned(long nativeMediaDrmStorageBridge, MediaDrmStorageBridge caller,
      Callback<Boolean> cb) {
    N.ME6vNmlv(nativeMediaDrmStorageBridge, caller, cb);
  }

  @Override
  public void onLoadInfo(long nativeMediaDrmStorageBridge, MediaDrmStorageBridge caller,
      byte[] sessionId, Callback<MediaDrmStorageBridge.PersistentInfo> cb) {
    N.Mmi_qOX8(nativeMediaDrmStorageBridge, caller, sessionId, cb);
  }

  @Override
  public void onSaveInfo(long nativeMediaDrmStorageBridge, MediaDrmStorageBridge caller,
      MediaDrmStorageBridge.PersistentInfo info, Callback<Boolean> cb) {
    N.MeALR1v2(nativeMediaDrmStorageBridge, caller, info, cb);
  }

  @Override
  public void onClearInfo(long nativeMediaDrmStorageBridge, MediaDrmStorageBridge caller,
      byte[] sessionId, Callback<Boolean> cb) {
    N.MYa_y6Dg(nativeMediaDrmStorageBridge, caller, sessionId, cb);
  }

  public static MediaDrmStorageBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.media.MediaDrmStorageBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new MediaDrmStorageBridgeJni();
  }
}
