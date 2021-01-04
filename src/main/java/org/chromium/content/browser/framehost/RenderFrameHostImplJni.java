package org.chromium.content.browser.framehost;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.UnguessableToken;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.url.Origin;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class RenderFrameHostImplJni implements RenderFrameHostImpl.Natives {
  private static RenderFrameHostImpl.Natives testInstance;

  public static final JniStaticTestMocker<RenderFrameHostImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.framehost.RenderFrameHostImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.framehost.RenderFrameHostImpl.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String getLastCommittedURL(long nativeRenderFrameHostAndroid, RenderFrameHostImpl caller) {
    return (String)N.MBg$jIAu(nativeRenderFrameHostAndroid, caller);
  }

  @Override
  public Origin getLastCommittedOrigin(long nativeRenderFrameHostAndroid,
      RenderFrameHostImpl caller) {
    return (Origin)N.Mcdslkop(nativeRenderFrameHostAndroid, caller);
  }

  @Override
  public void getCanonicalUrlForSharing(long nativeRenderFrameHostAndroid,
      RenderFrameHostImpl caller, Callback<String> callback) {
    N.MUV0o0vB(nativeRenderFrameHostAndroid, caller, callback);
  }

  @Override
  public boolean isPaymentFeaturePolicyEnabled(long nativeRenderFrameHostAndroid,
      RenderFrameHostImpl caller) {
    return (boolean)N.MfPH28_F(nativeRenderFrameHostAndroid, caller);
  }

  @Override
  public UnguessableToken getAndroidOverlayRoutingToken(long nativeRenderFrameHostAndroid,
      RenderFrameHostImpl caller) {
    return (UnguessableToken)N.MJDViTxW(nativeRenderFrameHostAndroid, caller);
  }

  @Override
  public void notifyUserActivation(long nativeRenderFrameHostAndroid, RenderFrameHostImpl caller) {
    N.M$j92GA1(nativeRenderFrameHostAndroid, caller);
  }

  @Override
  public boolean isRenderFrameCreated(long nativeRenderFrameHostAndroid,
      RenderFrameHostImpl caller) {
    return (boolean)N.MhaRMzRy(nativeRenderFrameHostAndroid, caller);
  }

  @Override
  public boolean isProcessBlocked(long nativeRenderFrameHostAndroid, RenderFrameHostImpl caller) {
    return (boolean)N.M6cbowZq(nativeRenderFrameHostAndroid, caller);
  }

  public static RenderFrameHostImpl.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.framehost.RenderFrameHostImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new RenderFrameHostImplJni();
  }
}
