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
public class PolicyMapJni implements PolicyMap.Natives {
  private static PolicyMap.Natives testInstance;

  public static final JniStaticTestMocker<PolicyMap.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.policy.PolicyMap.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.components.policy.PolicyMap.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean hasValue(long nativePolicyMap, PolicyMap caller, String policy) {
    return (boolean)GEN_JNI.org_chromium_components_policy_PolicyMap_hasValue(nativePolicyMap, caller, policy);
  }

  @Override
  public int getIntValue(long nativePolicyMap, PolicyMap caller, String policy) {
    return (int)GEN_JNI.org_chromium_components_policy_PolicyMap_getIntValue(nativePolicyMap, caller, policy);
  }

  @Override
  public boolean getBooleanValue(long nativePolicyMap, PolicyMap caller, String policy) {
    return (boolean)GEN_JNI.org_chromium_components_policy_PolicyMap_getBooleanValue(nativePolicyMap, caller, policy);
  }

  @Override
  public String getStringValue(long nativePolicyMap, PolicyMap caller, String policy) {
    return (String)GEN_JNI.org_chromium_components_policy_PolicyMap_getStringValue(nativePolicyMap, caller, policy);
  }

  @Override
  public String getListValue(long nativePolicyMap, PolicyMap caller, String policy) {
    return (String)GEN_JNI.org_chromium_components_policy_PolicyMap_getListValue(nativePolicyMap, caller, policy);
  }

  @Override
  public String getDictValue(long nativePolicyMap, PolicyMap caller, String policy) {
    return (String)GEN_JNI.org_chromium_components_policy_PolicyMap_getDictValue(nativePolicyMap, caller, policy);
  }

  @Override
  public boolean equals(long nativePolicyMap, PolicyMap caller, long nativeOtherPolicyMap) {
    return (boolean)GEN_JNI.org_chromium_components_policy_PolicyMap_equals(nativePolicyMap, caller, nativeOtherPolicyMap);
  }

  public static PolicyMap.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.policy.PolicyMap.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PolicyMapJni();
  }
}
