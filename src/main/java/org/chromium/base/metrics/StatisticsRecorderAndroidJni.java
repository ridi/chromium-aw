package org.chromium.base.metrics;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class StatisticsRecorderAndroidJni implements StatisticsRecorderAndroid.Natives {
  private static StatisticsRecorderAndroid.Natives testInstance;

  public static final JniStaticTestMocker<StatisticsRecorderAndroid.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.metrics.StatisticsRecorderAndroid.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.base.metrics.StatisticsRecorderAndroid.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String toJson(int verbosityLevel) {
    return (String)N.MvO$oy3r(verbosityLevel);
  }

  public static StatisticsRecorderAndroid.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.metrics.StatisticsRecorderAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new StatisticsRecorderAndroidJni();
  }
}
