package org.chromium.device.bluetooth;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class ChromeBluetoothRemoteGattDescriptorJni implements ChromeBluetoothRemoteGattDescriptor.Natives {
  private static ChromeBluetoothRemoteGattDescriptor.Natives testInstance;

  public static final JniStaticTestMocker<ChromeBluetoothRemoteGattDescriptor.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.device.bluetooth.ChromeBluetoothRemoteGattDescriptor.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.device.bluetooth.ChromeBluetoothRemoteGattDescriptor.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onRead(long nativeBluetoothRemoteGattDescriptorAndroid,
      ChromeBluetoothRemoteGattDescriptor caller, int status, byte[] value) {
    GEN_JNI.org_chromium_device_bluetooth_ChromeBluetoothRemoteGattDescriptor_onRead(nativeBluetoothRemoteGattDescriptorAndroid, caller, status, value);
  }

  @Override
  public void onWrite(long nativeBluetoothRemoteGattDescriptorAndroid,
      ChromeBluetoothRemoteGattDescriptor caller, int status) {
    GEN_JNI.org_chromium_device_bluetooth_ChromeBluetoothRemoteGattDescriptor_onWrite(nativeBluetoothRemoteGattDescriptorAndroid, caller, status);
  }

  public static ChromeBluetoothRemoteGattDescriptor.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.device.bluetooth.ChromeBluetoothRemoteGattDescriptor.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ChromeBluetoothRemoteGattDescriptorJni();
  }
}
