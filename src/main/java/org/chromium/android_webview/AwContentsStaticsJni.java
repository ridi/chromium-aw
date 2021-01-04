package org.chromium.android_webview;

import J.N;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.Runnable;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AwContentsStaticsJni implements AwContentsStatics.Natives {
  private static AwContentsStatics.Natives testInstance;

  public static final JniStaticTestMocker<AwContentsStatics.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.AwContentsStatics.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.android_webview.AwContentsStatics.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void logCommandLineForDebugging() {
    N.MjT_gThK();
  }

  @Override
  public String getSafeBrowsingPrivacyPolicyUrl() {
    return (String)N.Mdfl4F0j();
  }

  @Override
  public void clearClientCertPreferences(Runnable callback) {
    N.Ml71D$Ud(callback);
  }

  @Override
  public String getUnreachableWebDataUrl() {
    return (String)N.M0AyjO$E();
  }

  @Override
  public String getProductVersion() {
    return (String)N.MhBmyxCD();
  }

  @Override
  public void setServiceWorkerIoThreadClient(AwContentsIoThreadClient ioThreadClient,
      AwBrowserContext browserContext) {
    N.MhYNFMfv(ioThreadClient, browserContext);
  }

  @Override
  public void setSafeBrowsingWhitelist(String[] urls, Callback<Boolean> callback) {
    N.MlIL02rX(urls, callback);
  }

  @Override
  public void setCheckClearTextPermitted(boolean permitted) {
    N.Mu0fMVv8(permitted);
  }

  @Override
  public boolean isMultiProcessEnabled() {
    return (boolean)N.M04mALrd();
  }

  public static AwContentsStatics.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.AwContentsStatics.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwContentsStaticsJni();
  }
}
