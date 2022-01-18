package org.chromium.android_webview;

import java.lang.Override;
import java.lang.String;
import java.security.PrivateKey;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class AwContentsClientBridgeJni implements AwContentsClientBridge.Natives {
  private static AwContentsClientBridge.Natives testInstance;

  public static final JniStaticTestMocker<AwContentsClientBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.AwContentsClientBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.android_webview.AwContentsClientBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void takeSafeBrowsingAction(long nativeAwContentsClientBridge,
      AwContentsClientBridge caller, int action, boolean reporting, int requestId) {
    GEN_JNI.org_chromium_android_1webview_AwContentsClientBridge_takeSafeBrowsingAction(nativeAwContentsClientBridge, caller, action, reporting, requestId);
  }

  @Override
  public void proceedSslError(long nativeAwContentsClientBridge, AwContentsClientBridge caller,
      boolean proceed, int id) {
    GEN_JNI.org_chromium_android_1webview_AwContentsClientBridge_proceedSslError(nativeAwContentsClientBridge, caller, proceed, id);
  }

  @Override
  public void provideClientCertificateResponse(long nativeAwContentsClientBridge,
      AwContentsClientBridge caller, int id, byte[][] certChain, PrivateKey androidKey) {
    GEN_JNI.org_chromium_android_1webview_AwContentsClientBridge_provideClientCertificateResponse(nativeAwContentsClientBridge, caller, id, certChain, androidKey);
  }

  @Override
  public void confirmJsResult(long nativeAwContentsClientBridge, AwContentsClientBridge caller,
      int id, String prompt) {
    GEN_JNI.org_chromium_android_1webview_AwContentsClientBridge_confirmJsResult(nativeAwContentsClientBridge, caller, id, prompt);
  }

  @Override
  public void cancelJsResult(long nativeAwContentsClientBridge, AwContentsClientBridge caller,
      int id) {
    GEN_JNI.org_chromium_android_1webview_AwContentsClientBridge_cancelJsResult(nativeAwContentsClientBridge, caller, id);
  }

  public static AwContentsClientBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.AwContentsClientBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwContentsClientBridgeJni();
  }
}
