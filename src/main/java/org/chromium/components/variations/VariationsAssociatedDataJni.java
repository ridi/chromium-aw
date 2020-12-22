package org.chromium.components.variations;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class VariationsAssociatedDataJni implements VariationsAssociatedData.Natives {
  private static VariationsAssociatedData.Natives testInstance;

  public static final JniStaticTestMocker<VariationsAssociatedData.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.variations.VariationsAssociatedData.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.variations.VariationsAssociatedData.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String getVariationParamValue(String trialName, String paramName) {
    return (String)N.MOVY9QtZ(trialName, paramName);
  }

  @Override
  public String getFeedbackVariations() {
    return (String)N.Mkq2qJev();
  }

  public static VariationsAssociatedData.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.variations.VariationsAssociatedData.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new VariationsAssociatedDataJni();
  }
}
