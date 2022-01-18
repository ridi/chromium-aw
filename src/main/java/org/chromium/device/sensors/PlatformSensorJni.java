package org.chromium.device.sensors;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class PlatformSensorJni implements PlatformSensor.Natives {
  private static PlatformSensor.Natives testInstance;

  public static final JniStaticTestMocker<PlatformSensor.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.device.sensors.PlatformSensor.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.device.sensors.PlatformSensor.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void notifyPlatformSensorError(long nativePlatformSensorAndroid, PlatformSensor caller) {
    GEN_JNI.org_chromium_device_sensors_PlatformSensor_notifyPlatformSensorError(nativePlatformSensorAndroid, caller);
  }

  @Override
  public void updatePlatformSensorReading(long nativePlatformSensorAndroid, PlatformSensor caller,
      double timestamp, double value1, double value2, double value3, double value4) {
    GEN_JNI.org_chromium_device_sensors_PlatformSensor_updatePlatformSensorReading(nativePlatformSensorAndroid, caller, timestamp, value1, value2, value3, value4);
  }

  public static PlatformSensor.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.device.sensors.PlatformSensor.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PlatformSensorJni();
  }
}
