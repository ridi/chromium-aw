package org.chromium.base;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
class FeaturesJni implements Features.Natives {
  private static Features.Natives testInstance;

  public static final JniStaticTestMocker<Features.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.Features.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.base.Features.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isEnabled(long featurePointer) {
    return (boolean)GEN_JNI.org_chromium_base_Features_isEnabled(featurePointer);
  }

  @Override
  public boolean getFieldTrialParamByFeatureAsBoolean(long featurePointer, String paramName,
      boolean defaultValue) {
    return (boolean)GEN_JNI.org_chromium_base_Features_getFieldTrialParamByFeatureAsBoolean(featurePointer, paramName, defaultValue);
  }

  public static Features.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.Features.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new FeaturesJni();
  }
}
