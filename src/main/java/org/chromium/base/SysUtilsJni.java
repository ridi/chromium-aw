package org.chromium.base;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
class SysUtilsJni implements SysUtils.Natives {
  private static SysUtils.Natives testInstance;

  public static final JniStaticTestMocker<SysUtils.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.SysUtils.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.base.SysUtils.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void logPageFaultCountToTracing() {
    GEN_JNI.org_chromium_base_SysUtils_logPageFaultCountToTracing();
  }

  public static SysUtils.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.SysUtils.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new SysUtilsJni();
  }
}
