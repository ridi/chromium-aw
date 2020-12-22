package org.chromium.android_webview.metrics;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AwMetricsServiceClientJni implements AwMetricsServiceClient.Natives {
  private static AwMetricsServiceClient.Natives testInstance;

  public static final JniStaticTestMocker<AwMetricsServiceClient.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.metrics.AwMetricsServiceClient.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.android_webview.metrics.AwMetricsServiceClient.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void setHaveMetricsConsent(boolean userConsent, boolean appConsent) {
    N.Mdl6A1eo(userConsent, appConsent);
  }

  @Override
  public void setFastStartupForTesting(boolean fastStartupForTesting) {
    N.M3qPS3Ay(fastStartupForTesting);
  }

  @Override
  public void setUploadIntervalForTesting(long uploadIntervalMs) {
    N.Mo7ROkjk(uploadIntervalMs);
  }

  public static AwMetricsServiceClient.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.metrics.AwMetricsServiceClient.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwMetricsServiceClientJni();
  }
}
