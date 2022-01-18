package org.chromium.components.policy;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public class PolicyServiceJni implements PolicyService.Natives {
  private static PolicyService.Natives testInstance;

  public static final JniStaticTestMocker<PolicyService.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.policy.PolicyService.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.components.policy.PolicyService.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void addObserver(long nativePolicyService, PolicyService caller) {
    GEN_JNI.org_chromium_components_policy_PolicyService_addObserver(nativePolicyService, caller);
  }

  @Override
  public void removeObserver(long nativePolicyService, PolicyService caller) {
    GEN_JNI.org_chromium_components_policy_PolicyService_removeObserver(nativePolicyService, caller);
  }

  @Override
  public boolean isInitializationComplete(long nativePolicyService, PolicyService caller) {
    return (boolean)GEN_JNI.org_chromium_components_policy_PolicyService_isInitializationComplete(nativePolicyService, caller);
  }

  @Override
  public PolicyMap getPolicies(long nativePolicyService, PolicyService caller) {
    return (PolicyMap)GEN_JNI.org_chromium_components_policy_PolicyService_getPolicies(nativePolicyService, caller);
  }

  public static PolicyService.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.policy.PolicyService.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PolicyServiceJni();
  }
}
