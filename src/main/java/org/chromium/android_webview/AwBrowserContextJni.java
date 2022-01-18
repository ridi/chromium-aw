package org.chromium.android_webview;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class AwBrowserContextJni implements AwBrowserContext.Natives {
  private static AwBrowserContext.Natives testInstance;

  public static final JniStaticTestMocker<AwBrowserContext.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.AwBrowserContext.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.android_webview.AwBrowserContext.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public AwBrowserContext getDefaultJava() {
    return (AwBrowserContext)GEN_JNI.org_chromium_android_1webview_AwBrowserContext_getDefaultJava();
  }

  @Override
  public long getQuotaManagerBridge(long nativeAwBrowserContext) {
    return (long)GEN_JNI.org_chromium_android_1webview_AwBrowserContext_getQuotaManagerBridge(nativeAwBrowserContext);
  }

  @Override
  public void setWebLayerRunningInSameProcess(long nativeAwBrowserContext) {
    GEN_JNI.org_chromium_android_1webview_AwBrowserContext_setWebLayerRunningInSameProcess(nativeAwBrowserContext);
  }

  public static AwBrowserContext.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.AwBrowserContext.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwBrowserContextJni();
  }
}
