package org.chromium.base;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
class MemoryPressureListenerJni implements MemoryPressureListener.Natives {
  private static MemoryPressureListener.Natives testInstance;

  public static final JniStaticTestMocker<MemoryPressureListener.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.MemoryPressureListener.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.base.MemoryPressureListener.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onMemoryPressure(int pressure) {
    GEN_JNI.org_chromium_base_MemoryPressureListener_onMemoryPressure(pressure);
  }

  public static MemoryPressureListener.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.MemoryPressureListener.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new MemoryPressureListenerJni();
  }
}
