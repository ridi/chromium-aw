package org.chromium.components.policy;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class PolicyConverterJni implements PolicyConverter.Natives {
  private static PolicyConverter.Natives testInstance;

  public static final JniStaticTestMocker<PolicyConverter.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.policy.PolicyConverter.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.policy.PolicyConverter.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void setPolicyBoolean(long nativePolicyConverter, PolicyConverter caller, String policyKey,
      boolean value) {
    GEN_JNI.org_chromium_components_policy_PolicyConverter_setPolicyBoolean(nativePolicyConverter, caller, policyKey, value);
  }

  @Override
  public void setPolicyInteger(long nativePolicyConverter, PolicyConverter caller, String policyKey,
      int value) {
    GEN_JNI.org_chromium_components_policy_PolicyConverter_setPolicyInteger(nativePolicyConverter, caller, policyKey, value);
  }

  @Override
  public void setPolicyString(long nativePolicyConverter, PolicyConverter caller, String policyKey,
      String value) {
    GEN_JNI.org_chromium_components_policy_PolicyConverter_setPolicyString(nativePolicyConverter, caller, policyKey, value);
  }

  @Override
  public void setPolicyStringArray(long nativePolicyConverter, PolicyConverter caller,
      String policyKey, String[] value) {
    GEN_JNI.org_chromium_components_policy_PolicyConverter_setPolicyStringArray(nativePolicyConverter, caller, policyKey, value);
  }

  public static PolicyConverter.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.policy.PolicyConverter.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PolicyConverterJni();
  }
}
