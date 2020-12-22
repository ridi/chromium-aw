package org.chromium.policy;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PolicyConverterJni implements PolicyConverter.Natives {
  private static PolicyConverter.Natives testInstance;

  public static final JniStaticTestMocker<PolicyConverter.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.policy.PolicyConverter.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.policy.PolicyConverter.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void setPolicyBoolean(long nativePolicyConverter, PolicyConverter caller, String policyKey,
      boolean value) {
    N.MpCbKnQi(nativePolicyConverter, caller, policyKey, value);
  }

  @Override
  public void setPolicyInteger(long nativePolicyConverter, PolicyConverter caller, String policyKey,
      int value) {
    N.MTuFp9B7(nativePolicyConverter, caller, policyKey, value);
  }

  @Override
  public void setPolicyString(long nativePolicyConverter, PolicyConverter caller, String policyKey,
      String value) {
    N.MeuOZAup(nativePolicyConverter, caller, policyKey, value);
  }

  @Override
  public void setPolicyStringArray(long nativePolicyConverter, PolicyConverter caller,
      String policyKey, String[] value) {
    N.MGY2QXB9(nativePolicyConverter, caller, policyKey, value);
  }

  public static PolicyConverter.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.policy.PolicyConverter.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PolicyConverterJni();
  }
}
