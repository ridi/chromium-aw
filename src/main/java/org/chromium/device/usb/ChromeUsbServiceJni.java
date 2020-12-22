package org.chromium.device.usb;

import J.N;
import android.hardware.usb.UsbDevice;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ChromeUsbServiceJni implements ChromeUsbService.Natives {
  private static ChromeUsbService.Natives testInstance;

  public static final JniStaticTestMocker<ChromeUsbService.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.device.usb.ChromeUsbService.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.device.usb.ChromeUsbService.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void deviceAttached(long nativeUsbServiceAndroid, ChromeUsbService caller,
      UsbDevice device) {
    N.MNmyS$Xi(nativeUsbServiceAndroid, caller, device);
  }

  @Override
  public void deviceDetached(long nativeUsbServiceAndroid, ChromeUsbService caller, int deviceId) {
    N.MrBuy2sN(nativeUsbServiceAndroid, caller, deviceId);
  }

  @Override
  public void devicePermissionRequestComplete(long nativeUsbServiceAndroid, ChromeUsbService caller,
      int deviceId, boolean granted) {
    N.MDvFAfgT(nativeUsbServiceAndroid, caller, deviceId, granted);
  }

  public static ChromeUsbService.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.device.usb.ChromeUsbService.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ChromeUsbServiceJni();
  }
}
