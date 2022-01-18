package org.chromium.components.location;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class LocationSettingsJni implements LocationSettings.Natives {
  private static LocationSettings.Natives testInstance;

  public static final JniStaticTestMocker<LocationSettings.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.location.LocationSettings.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.location.LocationSettings.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onLocationSettingsDialogOutcome(long callback, int result) {
    GEN_JNI.org_chromium_components_location_LocationSettings_onLocationSettingsDialogOutcome(callback, result);
  }

  public static LocationSettings.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.location.LocationSettings.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new LocationSettingsJni();
  }
}
