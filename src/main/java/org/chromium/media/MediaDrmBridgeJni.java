package org.chromium.media;

import J.N;
import android.media.MediaCrypto;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
final class MediaDrmBridgeJni implements MediaDrmBridge.Natives {
  private static MediaDrmBridge.Natives testInstance;

  public static final JniStaticTestMocker<MediaDrmBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.media.MediaDrmBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.media.MediaDrmBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onMediaCryptoReady(long nativeMediaDrmBridge, MediaDrmBridge caller,
      MediaCrypto mediaCrypto) {
    N.MV9yuwVC(nativeMediaDrmBridge, caller, mediaCrypto);
  }

  @Override
  public void onProvisionRequest(long nativeMediaDrmBridge, MediaDrmBridge caller,
      String defaultUrl, byte[] requestData) {
    N.MmhSkOYV(nativeMediaDrmBridge, caller, defaultUrl, requestData);
  }

  @Override
  public void onProvisioningComplete(long nativeMediaDrmBridge, MediaDrmBridge caller,
      boolean success) {
    N.MAaklmRW(nativeMediaDrmBridge, caller, success);
  }

  @Override
  public void onPromiseResolved(long nativeMediaDrmBridge, MediaDrmBridge caller, long promiseId) {
    N.MOzXytse(nativeMediaDrmBridge, caller, promiseId);
  }

  @Override
  public void onPromiseResolvedWithSession(long nativeMediaDrmBridge, MediaDrmBridge caller,
      long promiseId, byte[] emeSessionId) {
    N.MtWWjNjU(nativeMediaDrmBridge, caller, promiseId, emeSessionId);
  }

  @Override
  public void onPromiseRejected(long nativeMediaDrmBridge, MediaDrmBridge caller, long promiseId,
      String errorMessage) {
    N.M2P7BQ98(nativeMediaDrmBridge, caller, promiseId, errorMessage);
  }

  @Override
  public void onSessionMessage(long nativeMediaDrmBridge, MediaDrmBridge caller,
      byte[] emeSessionId, int requestType, byte[] message) {
    N.Mf7HZHqV(nativeMediaDrmBridge, caller, emeSessionId, requestType, message);
  }

  @Override
  public void onSessionClosed(long nativeMediaDrmBridge, MediaDrmBridge caller,
      byte[] emeSessionId) {
    N.MulYy5b7(nativeMediaDrmBridge, caller, emeSessionId);
  }

  @Override
  public void onSessionKeysChange(long nativeMediaDrmBridge, MediaDrmBridge caller,
      byte[] emeSessionId, Object[] keysInfo, boolean hasAdditionalUsableKey,
      boolean isKeyRelease) {
    N.Mk8V79M2(nativeMediaDrmBridge, caller, emeSessionId, keysInfo, hasAdditionalUsableKey, isKeyRelease);
  }

  @Override
  public void onSessionExpirationUpdate(long nativeMediaDrmBridge, MediaDrmBridge caller,
      byte[] emeSessionId, long expirationTime) {
    N.MFLUFEZc(nativeMediaDrmBridge, caller, emeSessionId, expirationTime);
  }

  public static MediaDrmBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.media.MediaDrmBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new MediaDrmBridgeJni();
  }
}
