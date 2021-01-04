package org.chromium.base;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ApplicationStatusJni implements ApplicationStatus.Natives {
  private static ApplicationStatus.Natives testInstance;

  public static final JniStaticTestMocker<ApplicationStatus.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.ApplicationStatus.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.base.ApplicationStatus.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onApplicationStateChange(int newState) {
    N.MiAkQ_SU(newState);
  }

  public static ApplicationStatus.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.ApplicationStatus.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ApplicationStatusJni();
  }
}
