package org.chromium.base.metrics;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class StatisticsRecorderAndroidJni implements StatisticsRecorderAndroid.Natives {
  private static StatisticsRecorderAndroid.Natives testInstance;

  public static final JniStaticTestMocker<StatisticsRecorderAndroid.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.metrics.StatisticsRecorderAndroid.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.base.metrics.StatisticsRecorderAndroid.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String toJson(int verbosityLevel) {
    return (String)GEN_JNI.org_chromium_base_metrics_StatisticsRecorderAndroid_toJson(verbosityLevel);
  }

  public static StatisticsRecorderAndroid.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.metrics.StatisticsRecorderAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new StatisticsRecorderAndroidJni();
  }
}
