package org.chromium.components.variations;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class VariationsAssociatedDataJni implements VariationsAssociatedData.Natives {
  private static VariationsAssociatedData.Natives testInstance;

  public static final JniStaticTestMocker<VariationsAssociatedData.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.variations.VariationsAssociatedData.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.variations.VariationsAssociatedData.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String getVariationParamValue(String trialName, String paramName) {
    return (String)GEN_JNI.org_chromium_components_variations_VariationsAssociatedData_getVariationParamValue(trialName, paramName);
  }

  @Override
  public String getFeedbackVariations() {
    return (String)GEN_JNI.org_chromium_components_variations_VariationsAssociatedData_getFeedbackVariations();
  }

  @Override
  public String getGoogleAppVariations() {
    return (String)GEN_JNI.org_chromium_components_variations_VariationsAssociatedData_getGoogleAppVariations();
  }

  public static VariationsAssociatedData.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.variations.VariationsAssociatedData.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new VariationsAssociatedDataJni();
  }
}
