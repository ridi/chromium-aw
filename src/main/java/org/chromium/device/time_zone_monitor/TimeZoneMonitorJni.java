package org.chromium.device.time_zone_monitor;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class TimeZoneMonitorJni implements TimeZoneMonitor.Natives {
  private static TimeZoneMonitor.Natives testInstance;

  public static final JniStaticTestMocker<TimeZoneMonitor.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.device.time_zone_monitor.TimeZoneMonitor.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.device.time_zone_monitor.TimeZoneMonitor.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void timeZoneChangedFromJava(long nativeTimeZoneMonitorAndroid, TimeZoneMonitor caller) {
    GEN_JNI.org_chromium_device_time_1zone_1monitor_TimeZoneMonitor_timeZoneChangedFromJava(nativeTimeZoneMonitorAndroid, caller);
  }

  public static TimeZoneMonitor.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.device.time_zone_monitor.TimeZoneMonitor.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TimeZoneMonitorJni();
  }
}
