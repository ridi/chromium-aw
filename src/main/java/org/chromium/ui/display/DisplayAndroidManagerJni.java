package org.chromium.ui.display;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
class DisplayAndroidManagerJni implements DisplayAndroidManager.Natives {
  private static DisplayAndroidManager.Natives testInstance;

  public static final JniStaticTestMocker<DisplayAndroidManager.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.ui.display.DisplayAndroidManager.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.ui.display.DisplayAndroidManager.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void updateDisplay(long nativeDisplayAndroidManager, DisplayAndroidManager caller,
      int sdkDisplayId, int width, int height, float dipScale, int rotationDegrees,
      int bitsPerPixel, int bitsPerComponent, boolean isWideColorGamut) {
    GEN_JNI.org_chromium_ui_display_DisplayAndroidManager_updateDisplay(nativeDisplayAndroidManager, caller, sdkDisplayId, width, height, dipScale, rotationDegrees, bitsPerPixel, bitsPerComponent, isWideColorGamut);
  }

  @Override
  public void removeDisplay(long nativeDisplayAndroidManager, DisplayAndroidManager caller,
      int sdkDisplayId) {
    GEN_JNI.org_chromium_ui_display_DisplayAndroidManager_removeDisplay(nativeDisplayAndroidManager, caller, sdkDisplayId);
  }

  @Override
  public void setPrimaryDisplayId(long nativeDisplayAndroidManager, DisplayAndroidManager caller,
      int sdkDisplayId) {
    GEN_JNI.org_chromium_ui_display_DisplayAndroidManager_setPrimaryDisplayId(nativeDisplayAndroidManager, caller, sdkDisplayId);
  }

  public static DisplayAndroidManager.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.ui.display.DisplayAndroidManager.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new DisplayAndroidManagerJni();
  }
}
