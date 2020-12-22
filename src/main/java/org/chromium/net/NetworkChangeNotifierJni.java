package org.chromium.net;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class NetworkChangeNotifierJni implements NetworkChangeNotifier.Natives {
  private static NetworkChangeNotifier.Natives testInstance;

  public static final JniStaticTestMocker<NetworkChangeNotifier.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.net.NetworkChangeNotifier.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.net.NetworkChangeNotifier.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void notifyConnectionTypeChanged(long nativePtr, NetworkChangeNotifier caller,
      int newConnectionType, long defaultNetId) {
    N.MbPIImnU(nativePtr, caller, newConnectionType, defaultNetId);
  }

  @Override
  public void notifyMaxBandwidthChanged(long nativePtr, NetworkChangeNotifier caller, int subType) {
    N.Mt26m31j(nativePtr, caller, subType);
  }

  @Override
  public void notifyOfNetworkConnect(long nativePtr, NetworkChangeNotifier caller, long netId,
      int connectionType) {
    N.MBT1i5cd(nativePtr, caller, netId, connectionType);
  }

  @Override
  public void notifyOfNetworkSoonToDisconnect(long nativePtr, NetworkChangeNotifier caller,
      long netId) {
    N.MiJIMrTb(nativePtr, caller, netId);
  }

  @Override
  public void notifyOfNetworkDisconnect(long nativePtr, NetworkChangeNotifier caller, long netId) {
    N.MDpuHJTB(nativePtr, caller, netId);
  }

  @Override
  public void notifyPurgeActiveNetworkList(long nativePtr, NetworkChangeNotifier caller,
      long[] activeNetIds) {
    N.MpF$179U(nativePtr, caller, activeNetIds);
  }

  public static NetworkChangeNotifier.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.NetworkChangeNotifier.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new NetworkChangeNotifierJni();
  }
}
