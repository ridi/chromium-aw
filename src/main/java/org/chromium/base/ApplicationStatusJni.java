package org.chromium.base;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class ApplicationStatusJni implements ApplicationStatus.Natives {
  private static ApplicationStatus.Natives testInstance;

  public static final JniStaticTestMocker<ApplicationStatus.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.ApplicationStatus.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.base.ApplicationStatus.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onApplicationStateChange(int newState) {
    GEN_JNI.org_chromium_base_ApplicationStatus_onApplicationStateChange(newState);
  }

  public static ApplicationStatus.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.ApplicationStatus.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ApplicationStatusJni();
  }
}
