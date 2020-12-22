package org.chromium.device.gamepad;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class GamepadListJni implements GamepadList.Natives {
  private static GamepadList.Natives testInstance;

  public static final JniStaticTestMocker<GamepadList.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.device.gamepad.GamepadList.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.device.gamepad.GamepadList.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void setGamepadData(GamepadList caller, long webGamepadsPtr, int index, boolean mapping,
      boolean connected, String devicename, long timestamp, float[] axes, float[] buttons) {
    N.MOkngxPY(caller, webGamepadsPtr, index, mapping, connected, devicename, timestamp, axes, buttons);
  }

  public static GamepadList.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.device.gamepad.GamepadList.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new GamepadListJni();
  }
}
