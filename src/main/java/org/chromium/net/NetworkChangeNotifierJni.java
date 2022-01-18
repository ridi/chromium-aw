package org.chromium.net;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class NetworkChangeNotifierJni implements NetworkChangeNotifier.Natives {
  private static NetworkChangeNotifier.Natives testInstance;

  public static final JniStaticTestMocker<NetworkChangeNotifier.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.net.NetworkChangeNotifier.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.net.NetworkChangeNotifier.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void notifyConnectionTypeChanged(long nativePtr, NetworkChangeNotifier caller,
      int newConnectionType, long defaultNetId) {
    GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyConnectionTypeChanged(nativePtr, caller, newConnectionType, defaultNetId);
  }

  @Override
  public void notifyMaxBandwidthChanged(long nativePtr, NetworkChangeNotifier caller, int subType) {
    GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyMaxBandwidthChanged(nativePtr, caller, subType);
  }

  @Override
  public void notifyOfNetworkConnect(long nativePtr, NetworkChangeNotifier caller, long netId,
      int connectionType) {
    GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyOfNetworkConnect(nativePtr, caller, netId, connectionType);
  }

  @Override
  public void notifyOfNetworkSoonToDisconnect(long nativePtr, NetworkChangeNotifier caller,
      long netId) {
    GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyOfNetworkSoonToDisconnect(nativePtr, caller, netId);
  }

  @Override
  public void notifyOfNetworkDisconnect(long nativePtr, NetworkChangeNotifier caller, long netId) {
    GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyOfNetworkDisconnect(nativePtr, caller, netId);
  }

  @Override
  public void notifyPurgeActiveNetworkList(long nativePtr, NetworkChangeNotifier caller,
      long[] activeNetIds) {
    GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyPurgeActiveNetworkList(nativePtr, caller, activeNetIds);
  }

  public static NetworkChangeNotifier.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.NetworkChangeNotifier.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new NetworkChangeNotifierJni();
  }
}
