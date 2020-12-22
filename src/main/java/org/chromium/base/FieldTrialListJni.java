package org.chromium.base;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
final class FieldTrialListJni implements FieldTrialList.Natives {
  private static FieldTrialList.Natives testInstance;

  public static final JniStaticTestMocker<FieldTrialList.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.FieldTrialList.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.base.FieldTrialList.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String findFullName(String trialName) {
    return (String)N.MdC43qwX(trialName);
  }

  @Override
  public boolean trialExists(String trialName) {
    return (boolean)N.Mmqqda9c(trialName);
  }

  @Override
  public String getVariationParameter(String trialName, String parameterKey) {
    return (String)N.MZWMOP4I(trialName, parameterKey);
  }

  @Override
  public void logActiveTrials() {
    N.MHz6Fn06();
  }

  public static FieldTrialList.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.FieldTrialList.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new FieldTrialListJni();
  }
}
