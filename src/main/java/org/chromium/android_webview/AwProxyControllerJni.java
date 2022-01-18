package org.chromium.android_webview;

import java.lang.Override;
import java.lang.Runnable;
import java.lang.String;
import java.util.concurrent.Executor;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class AwProxyControllerJni implements AwProxyController.Natives {
  private static AwProxyController.Natives testInstance;

  public static final JniStaticTestMocker<AwProxyController.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.AwProxyController.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.android_webview.AwProxyController.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String setProxyOverride(AwProxyController caller, String[] urlSchemes, String[] proxyUrls,
      String[] bypassRules, Runnable listener, Executor executor, boolean reverseBypass) {
    return (String)GEN_JNI.org_chromium_android_1webview_AwProxyController_setProxyOverride(caller, urlSchemes, proxyUrls, bypassRules, listener, executor, reverseBypass);
  }

  @Override
  public void clearProxyOverride(AwProxyController caller, Runnable listener, Executor executor) {
    GEN_JNI.org_chromium_android_1webview_AwProxyController_clearProxyOverride(caller, listener, executor);
  }

  public static AwProxyController.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.AwProxyController.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwProxyControllerJni();
  }
}
