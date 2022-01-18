package org.chromium.content_public.common;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class UseZoomForDSFPolicyJni implements UseZoomForDSFPolicy.Natives {
  private static UseZoomForDSFPolicy.Natives testInstance;

  public static final JniStaticTestMocker<UseZoomForDSFPolicy.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content_public.common.UseZoomForDSFPolicy.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content_public.common.UseZoomForDSFPolicy.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isUseZoomForDSFEnabled() {
    return (boolean)GEN_JNI.org_chromium_content_1public_common_UseZoomForDSFPolicy_isUseZoomForDSFEnabled();
  }

  public static UseZoomForDSFPolicy.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content_public.common.UseZoomForDSFPolicy.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new UseZoomForDSFPolicyJni();
  }
}
