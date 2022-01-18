package org.chromium.android_webview.metrics;

import java.lang.Override;
import java.lang.Runnable;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class AwMetricsServiceClientJni implements AwMetricsServiceClient.Natives {
  private static AwMetricsServiceClient.Natives testInstance;

  public static final JniStaticTestMocker<AwMetricsServiceClient.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.metrics.AwMetricsServiceClient.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.android_webview.metrics.AwMetricsServiceClient.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void setHaveMetricsConsent(boolean userConsent, boolean appConsent) {
    GEN_JNI.org_chromium_android_1webview_metrics_AwMetricsServiceClient_setHaveMetricsConsent(userConsent, appConsent);
  }

  @Override
  public void setFastStartupForTesting(boolean fastStartupForTesting) {
    GEN_JNI.org_chromium_android_1webview_metrics_AwMetricsServiceClient_setFastStartupForTesting(fastStartupForTesting);
  }

  @Override
  public void setUploadIntervalForTesting(long uploadIntervalMs) {
    GEN_JNI.org_chromium_android_1webview_metrics_AwMetricsServiceClient_setUploadIntervalForTesting(uploadIntervalMs);
  }

  @Override
  public void setOnFinalMetricsCollectedListenerForTesting(Runnable listener) {
    GEN_JNI.org_chromium_android_1webview_metrics_AwMetricsServiceClient_setOnFinalMetricsCollectedListenerForTesting(listener);
  }

  @Override
  public void setAppPackageNameLoggingRuleForTesting(String version, long expiryDateMs) {
    GEN_JNI.org_chromium_android_1webview_metrics_AwMetricsServiceClient_setAppPackageNameLoggingRuleForTesting(version, expiryDateMs);
  }

  public static AwMetricsServiceClient.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.metrics.AwMetricsServiceClient.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwMetricsServiceClientJni();
  }
}
