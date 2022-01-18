package org.chromium.net;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class NetworkActivationRequestJni implements NetworkActivationRequest.Natives {
  private static NetworkActivationRequest.Natives testInstance;

  public static final JniStaticTestMocker<NetworkActivationRequest.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.net.NetworkActivationRequest.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.net.NetworkActivationRequest.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void notifyAvailable(long nativeNetworkActivationRequest, long netId) {
    GEN_JNI.org_chromium_net_NetworkActivationRequest_notifyAvailable(nativeNetworkActivationRequest, netId);
  }

  public static NetworkActivationRequest.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.NetworkActivationRequest.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new NetworkActivationRequestJni();
  }
}
