package org.chromium.device.geolocation;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class LocationProviderAdapterJni implements LocationProviderAdapter.Natives {
  private static LocationProviderAdapter.Natives testInstance;

  public static final JniStaticTestMocker<LocationProviderAdapter.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.device.geolocation.LocationProviderAdapter.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.device.geolocation.LocationProviderAdapter.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void newLocationAvailable(double latitude, double longitude, double timeStamp,
      boolean hasAltitude, double altitude, boolean hasAccuracy, double accuracy,
      boolean hasHeading, double heading, boolean hasSpeed, double speed) {
    N.MvJnRjJi(latitude, longitude, timeStamp, hasAltitude, altitude, hasAccuracy, accuracy, hasHeading, heading, hasSpeed, speed);
  }

  @Override
  public void newErrorAvailable(String message) {
    N.M8Iz7Ptw(message);
  }

  public static LocationProviderAdapter.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.device.geolocation.LocationProviderAdapter.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new LocationProviderAdapterJni();
  }
}
