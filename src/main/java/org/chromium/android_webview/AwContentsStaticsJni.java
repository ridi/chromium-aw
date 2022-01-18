package org.chromium.android_webview;

import java.lang.Boolean;
import java.lang.Override;
import java.lang.Runnable;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class AwContentsStaticsJni implements AwContentsStatics.Natives {
  private static AwContentsStatics.Natives testInstance;

  public static final JniStaticTestMocker<AwContentsStatics.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.AwContentsStatics.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.android_webview.AwContentsStatics.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void logCommandLineForDebugging() {
    GEN_JNI.org_chromium_android_1webview_AwContentsStatics_logCommandLineForDebugging();
  }

  @Override
  public void logFlagMetrics(String[] switches, String[] features) {
    GEN_JNI.org_chromium_android_1webview_AwContentsStatics_logFlagMetrics(switches, features);
  }

  @Override
  public String getSafeBrowsingPrivacyPolicyUrl() {
    return (String)GEN_JNI.org_chromium_android_1webview_AwContentsStatics_getSafeBrowsingPrivacyPolicyUrl();
  }

  @Override
  public void clearClientCertPreferences(Runnable callback) {
    GEN_JNI.org_chromium_android_1webview_AwContentsStatics_clearClientCertPreferences(callback);
  }

  @Override
  public String getUnreachableWebDataUrl() {
    return (String)GEN_JNI.org_chromium_android_1webview_AwContentsStatics_getUnreachableWebDataUrl();
  }

  @Override
  public String getProductVersion() {
    return (String)GEN_JNI.org_chromium_android_1webview_AwContentsStatics_getProductVersion();
  }

  @Override
  public void setServiceWorkerIoThreadClient(AwContentsIoThreadClient ioThreadClient,
      AwBrowserContext browserContext) {
    GEN_JNI.org_chromium_android_1webview_AwContentsStatics_setServiceWorkerIoThreadClient(ioThreadClient, browserContext);
  }

  @Override
  public void setSafeBrowsingAllowlist(String[] urls, Callback<Boolean> callback) {
    GEN_JNI.org_chromium_android_1webview_AwContentsStatics_setSafeBrowsingAllowlist(urls, callback);
  }

  @Override
  public void setCheckClearTextPermitted(boolean permitted) {
    GEN_JNI.org_chromium_android_1webview_AwContentsStatics_setCheckClearTextPermitted(permitted);
  }

  @Override
  public boolean isMultiProcessEnabled() {
    return (boolean)GEN_JNI.org_chromium_android_1webview_AwContentsStatics_isMultiProcessEnabled();
  }

  public static AwContentsStatics.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.AwContentsStatics.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwContentsStaticsJni();
  }
}
