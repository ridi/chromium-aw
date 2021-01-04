package org.chromium.device.bluetooth;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ChromeBluetoothRemoteGattDescriptorJni implements ChromeBluetoothRemoteGattDescriptor.Natives {
  private static ChromeBluetoothRemoteGattDescriptor.Natives testInstance;

  public static final JniStaticTestMocker<ChromeBluetoothRemoteGattDescriptor.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.device.bluetooth.ChromeBluetoothRemoteGattDescriptor.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.device.bluetooth.ChromeBluetoothRemoteGattDescriptor.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onRead(long nativeBluetoothRemoteGattDescriptorAndroid,
      ChromeBluetoothRemoteGattDescriptor caller, int status, byte[] value) {
    N.MaKNZo8k(nativeBluetoothRemoteGattDescriptorAndroid, caller, status, value);
  }

  @Override
  public void onWrite(long nativeBluetoothRemoteGattDescriptorAndroid,
      ChromeBluetoothRemoteGattDescriptor caller, int status) {
    N.M4SmPJiR(nativeBluetoothRemoteGattDescriptorAndroid, caller, status);
  }

  public static ChromeBluetoothRemoteGattDescriptor.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.device.bluetooth.ChromeBluetoothRemoteGattDescriptor.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ChromeBluetoothRemoteGattDescriptorJni();
  }
}
