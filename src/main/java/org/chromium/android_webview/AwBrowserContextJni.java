package org.chromium.android_webview;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AwBrowserContextJni implements AwBrowserContext.Natives {
  private static AwBrowserContext.Natives testInstance;

  public static final JniStaticTestMocker<AwBrowserContext.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.AwBrowserContext.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.android_webview.AwBrowserContext.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public AwBrowserContext getDefaultJava() {
    return (AwBrowserContext)N.MCLx2xtg();
  }

  @Override
  public long getQuotaManagerBridge(long nativeAwBrowserContext) {
    return (long)N.MyGX0Tx3(nativeAwBrowserContext);
  }

  public static AwBrowserContext.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.AwBrowserContext.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwBrowserContextJni();
  }
}
