package org.chromium.media;

import android.media.MediaCrypto;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
class MediaDrmBridgeJni implements MediaDrmBridge.Natives {
  private static MediaDrmBridge.Natives testInstance;

  public static final JniStaticTestMocker<MediaDrmBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.media.MediaDrmBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.media.MediaDrmBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onMediaCryptoReady(long nativeMediaDrmBridge, MediaDrmBridge caller,
      MediaCrypto mediaCrypto) {
    GEN_JNI.org_chromium_media_MediaDrmBridge_onMediaCryptoReady(nativeMediaDrmBridge, caller, mediaCrypto);
  }

  @Override
  public void onProvisionRequest(long nativeMediaDrmBridge, MediaDrmBridge caller,
      String defaultUrl, byte[] requestData) {
    GEN_JNI.org_chromium_media_MediaDrmBridge_onProvisionRequest(nativeMediaDrmBridge, caller, defaultUrl, requestData);
  }

  @Override
  public void onProvisioningComplete(long nativeMediaDrmBridge, MediaDrmBridge caller,
      boolean success) {
    GEN_JNI.org_chromium_media_MediaDrmBridge_onProvisioningComplete(nativeMediaDrmBridge, caller, success);
  }

  @Override
  public void onPromiseResolved(long nativeMediaDrmBridge, MediaDrmBridge caller, long promiseId) {
    GEN_JNI.org_chromium_media_MediaDrmBridge_onPromiseResolved(nativeMediaDrmBridge, caller, promiseId);
  }

  @Override
  public void onPromiseResolvedWithSession(long nativeMediaDrmBridge, MediaDrmBridge caller,
      long promiseId, byte[] emeSessionId) {
    GEN_JNI.org_chromium_media_MediaDrmBridge_onPromiseResolvedWithSession(nativeMediaDrmBridge, caller, promiseId, emeSessionId);
  }

  @Override
  public void onPromiseRejected(long nativeMediaDrmBridge, MediaDrmBridge caller, long promiseId,
      String errorMessage) {
    GEN_JNI.org_chromium_media_MediaDrmBridge_onPromiseRejected(nativeMediaDrmBridge, caller, promiseId, errorMessage);
  }

  @Override
  public void onSessionMessage(long nativeMediaDrmBridge, MediaDrmBridge caller,
      byte[] emeSessionId, int requestType, byte[] message) {
    GEN_JNI.org_chromium_media_MediaDrmBridge_onSessionMessage(nativeMediaDrmBridge, caller, emeSessionId, requestType, message);
  }

  @Override
  public void onSessionClosed(long nativeMediaDrmBridge, MediaDrmBridge caller,
      byte[] emeSessionId) {
    GEN_JNI.org_chromium_media_MediaDrmBridge_onSessionClosed(nativeMediaDrmBridge, caller, emeSessionId);
  }

  @Override
  public void onSessionKeysChange(long nativeMediaDrmBridge, MediaDrmBridge caller,
      byte[] emeSessionId, Object[] keysInfo, boolean hasAdditionalUsableKey,
      boolean isKeyRelease) {
    GEN_JNI.org_chromium_media_MediaDrmBridge_onSessionKeysChange(nativeMediaDrmBridge, caller, emeSessionId, keysInfo, hasAdditionalUsableKey, isKeyRelease);
  }

  @Override
  public void onSessionExpirationUpdate(long nativeMediaDrmBridge, MediaDrmBridge caller,
      byte[] emeSessionId, long expirationTime) {
    GEN_JNI.org_chromium_media_MediaDrmBridge_onSessionExpirationUpdate(nativeMediaDrmBridge, caller, emeSessionId, expirationTime);
  }

  public static MediaDrmBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.media.MediaDrmBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new MediaDrmBridgeJni();
  }
}
