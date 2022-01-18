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
class FieldTrialListJni implements FieldTrialList.Natives {
  private static FieldTrialList.Natives testInstance;

  public static final JniStaticTestMocker<FieldTrialList.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.FieldTrialList.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.base.FieldTrialList.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String findFullName(String trialName) {
    return (String)GEN_JNI.org_chromium_base_FieldTrialList_findFullName(trialName);
  }

  @Override
  public boolean trialExists(String trialName) {
    return (boolean)GEN_JNI.org_chromium_base_FieldTrialList_trialExists(trialName);
  }

  @Override
  public String getVariationParameter(String trialName, String parameterKey) {
    return (String)GEN_JNI.org_chromium_base_FieldTrialList_getVariationParameter(trialName, parameterKey);
  }

  @Override
  public void logActiveTrials() {
    GEN_JNI.org_chromium_base_FieldTrialList_logActiveTrials();
  }

  @Override
  public boolean createFieldTrial(String trialName, String groupName) {
    return (boolean)GEN_JNI.org_chromium_base_FieldTrialList_createFieldTrial(trialName, groupName);
  }

  public static FieldTrialList.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.FieldTrialList.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new FieldTrialListJni();
  }
}
