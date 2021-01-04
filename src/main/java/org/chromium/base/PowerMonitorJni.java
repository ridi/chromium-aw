package org.chromium.base;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PowerMonitorJni implements PowerMonitor.Natives {
  private static PowerMonitor.Natives testInstance;

  public static final JniStaticTestMocker<PowerMonitor.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.PowerMonitor.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.base.PowerMonitor.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onBatteryChargingChanged() {
    N.MCImhGql();
  }

  public static PowerMonitor.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.PowerMonitor.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PowerMonitorJni();
  }
}
