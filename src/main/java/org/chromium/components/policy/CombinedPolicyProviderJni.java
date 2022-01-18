package org.chromium.components.policy;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class CombinedPolicyProviderJni implements CombinedPolicyProvider.Natives {
  private static CombinedPolicyProvider.Natives testInstance;

  public static final JniStaticTestMocker<CombinedPolicyProvider.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.policy.CombinedPolicyProvider.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.policy.CombinedPolicyProvider.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void flushPolicies(long nativeAndroidCombinedPolicyProvider,
      CombinedPolicyProvider caller) {
    GEN_JNI.org_chromium_components_policy_CombinedPolicyProvider_flushPolicies(nativeAndroidCombinedPolicyProvider, caller);
  }

  public static CombinedPolicyProvider.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.policy.CombinedPolicyProvider.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CombinedPolicyProviderJni();
  }
}
