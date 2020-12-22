package org.chromium.device.time_zone_monitor;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TimeZoneMonitorJni implements TimeZoneMonitor.Natives {
  private static TimeZoneMonitor.Natives testInstance;

  public static final JniStaticTestMocker<TimeZoneMonitor.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.device.time_zone_monitor.TimeZoneMonitor.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.device.time_zone_monitor.TimeZoneMonitor.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void timeZoneChangedFromJava(long nativeTimeZoneMonitorAndroid, TimeZoneMonitor caller) {
    N.MjxIGcDd(nativeTimeZoneMonitorAndroid, caller);
  }

  public static TimeZoneMonitor.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.device.time_zone_monitor.TimeZoneMonitor.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TimeZoneMonitorJni();
  }
}
