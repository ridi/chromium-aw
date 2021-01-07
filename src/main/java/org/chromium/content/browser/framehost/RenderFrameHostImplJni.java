package org.chromium.content.browser.framehost;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.UnguessableToken;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.url.Origin;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class RenderFrameHostImplJni implements RenderFrameHostImpl.Natives {
  private static RenderFrameHostImpl.Natives testInstance;

  public static final JniStaticTestMocker<RenderFrameHostImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.framehost.RenderFrameHostImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.framehost.RenderFrameHostImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String getLastCommittedURL(long nativeRenderFrameHostAndroid, RenderFrameHostImpl caller) {
    return (String)GEN_JNI.org_chromium_content_browser_framehost_RenderFrameHostImpl_getLastCommittedURL(nativeRenderFrameHostAndroid, caller);
  }

  @Override
  public Origin getLastCommittedOrigin(long nativeRenderFrameHostAndroid,
      RenderFrameHostImpl caller) {
    return (Origin)GEN_JNI.org_chromium_content_browser_framehost_RenderFrameHostImpl_getLastCommittedOrigin(nativeRenderFrameHostAndroid, caller);
  }

  @Override
  public void getCanonicalUrlForSharing(long nativeRenderFrameHostAndroid,
      RenderFrameHostImpl caller, Callback<String> callback) {
    GEN_JNI.org_chromium_content_browser_framehost_RenderFrameHostImpl_getCanonicalUrlForSharing(nativeRenderFrameHostAndroid, caller, callback);
  }

  @Override
  public boolean isFeatureEnabled(long nativeRenderFrameHostAndroid, RenderFrameHostImpl caller,
      int feature) {
    return (boolean)GEN_JNI.org_chromium_content_browser_framehost_RenderFrameHostImpl_isFeatureEnabled(nativeRenderFrameHostAndroid, caller, feature);
  }

  @Override
  public UnguessableToken getAndroidOverlayRoutingToken(long nativeRenderFrameHostAndroid,
      RenderFrameHostImpl caller) {
    return (UnguessableToken)GEN_JNI.org_chromium_content_browser_framehost_RenderFrameHostImpl_getAndroidOverlayRoutingToken(nativeRenderFrameHostAndroid, caller);
  }

  @Override
  public void notifyUserActivation(long nativeRenderFrameHostAndroid, RenderFrameHostImpl caller) {
    GEN_JNI.org_chromium_content_browser_framehost_RenderFrameHostImpl_notifyUserActivation(nativeRenderFrameHostAndroid, caller);
  }

  @Override
  public boolean isRenderFrameCreated(long nativeRenderFrameHostAndroid,
      RenderFrameHostImpl caller) {
    return (boolean)GEN_JNI.org_chromium_content_browser_framehost_RenderFrameHostImpl_isRenderFrameCreated(nativeRenderFrameHostAndroid, caller);
  }

  @Override
  public boolean isProcessBlocked(long nativeRenderFrameHostAndroid, RenderFrameHostImpl caller) {
    return (boolean)GEN_JNI.org_chromium_content_browser_framehost_RenderFrameHostImpl_isProcessBlocked(nativeRenderFrameHostAndroid, caller);
  }

  @Override
  public int performGetAssertionWebAuthSecurityChecks(long nativeRenderFrameHostAndroid,
      RenderFrameHostImpl caller, String relyingPartyId, Origin effectiveOrigin) {
    return (int)GEN_JNI.org_chromium_content_browser_framehost_RenderFrameHostImpl_performGetAssertionWebAuthSecurityChecks(nativeRenderFrameHostAndroid, caller, relyingPartyId, effectiveOrigin);
  }

  @Override
  public int performMakeCredentialWebAuthSecurityChecks(long nativeRenderFrameHostAndroid,
      RenderFrameHostImpl caller, String relyingPartyId, Origin effectiveOrigin) {
    return (int)GEN_JNI.org_chromium_content_browser_framehost_RenderFrameHostImpl_performMakeCredentialWebAuthSecurityChecks(nativeRenderFrameHostAndroid, caller, relyingPartyId, effectiveOrigin);
  }

  public static RenderFrameHostImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.framehost.RenderFrameHostImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new RenderFrameHostImplJni();
  }
}
