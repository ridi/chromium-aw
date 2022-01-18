package org.chromium.android_webview;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.component_updater.ComponentLoaderPolicyBridge;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class AwBrowserProcessJni implements AwBrowserProcess.Natives {
  private static AwBrowserProcess.Natives testInstance;

  public static final JniStaticTestMocker<AwBrowserProcess.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.AwBrowserProcess.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.android_webview.AwBrowserProcess.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void setProcessNameCrashKey(String processName) {
    GEN_JNI.org_chromium_android_1webview_AwBrowserProcess_setProcessNameCrashKey(processName);
  }

  @Override
  public ComponentLoaderPolicyBridge[] getComponentLoaderPolicies() {
    return (ComponentLoaderPolicyBridge[])GEN_JNI.org_chromium_android_1webview_AwBrowserProcess_getComponentLoaderPolicies();
  }

  public static AwBrowserProcess.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.AwBrowserProcess.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwBrowserProcessJni();
  }
}
