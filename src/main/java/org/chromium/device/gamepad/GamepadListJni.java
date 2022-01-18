package org.chromium.device.gamepad;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class GamepadListJni implements GamepadList.Natives {
  private static GamepadList.Natives testInstance;

  public static final JniStaticTestMocker<GamepadList.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.device.gamepad.GamepadList.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.device.gamepad.GamepadList.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void setGamepadData(GamepadList caller, long webGamepadsPtr, int index, boolean mapping,
      boolean connected, String devicename, int vendorId, int productId, long timestamp,
      float[] axes, float[] buttons, int buttonsLength) {
    GEN_JNI.org_chromium_device_gamepad_GamepadList_setGamepadData(caller, webGamepadsPtr, index, mapping, connected, devicename, vendorId, productId, timestamp, axes, buttons, buttonsLength);
  }

  public static GamepadList.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.device.gamepad.GamepadList.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new GamepadListJni();
  }
}
