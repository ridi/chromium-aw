package org.chromium.android_webview;

import J.N;
import java.lang.Override;
import java.lang.String;
import java.security.PrivateKey;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AwContentsClientBridgeJni implements AwContentsClientBridge.Natives {
  private static AwContentsClientBridge.Natives testInstance;

  public static final JniStaticTestMocker<AwContentsClientBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.AwContentsClientBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.android_webview.AwContentsClientBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void takeSafeBrowsingAction(long nativeAwContentsClientBridge,
      AwContentsClientBridge caller, int action, boolean reporting, int requestId) {
    N.MXMPzQYm(nativeAwContentsClientBridge, caller, action, reporting, requestId);
  }

  @Override
  public void proceedSslError(long nativeAwContentsClientBridge, AwContentsClientBridge caller,
      boolean proceed, int id) {
    N.MgWlsTs7(nativeAwContentsClientBridge, caller, proceed, id);
  }

  @Override
  public void provideClientCertificateResponse(long nativeAwContentsClientBridge,
      AwContentsClientBridge caller, int id, byte[][] certChain, PrivateKey androidKey) {
    N.MZT_Y79r(nativeAwContentsClientBridge, caller, id, certChain, androidKey);
  }

  @Override
  public void confirmJsResult(long nativeAwContentsClientBridge, AwContentsClientBridge caller,
      int id, String prompt) {
    N.MNISBPG1(nativeAwContentsClientBridge, caller, id, prompt);
  }

  @Override
  public void cancelJsResult(long nativeAwContentsClientBridge, AwContentsClientBridge caller,
      int id) {
    N.MXWyhv9x(nativeAwContentsClientBridge, caller, id);
  }

  public static AwContentsClientBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.AwContentsClientBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwContentsClientBridgeJni();
  }
}
