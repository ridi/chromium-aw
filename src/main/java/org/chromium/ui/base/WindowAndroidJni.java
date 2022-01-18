package org.chromium.ui.base;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class WindowAndroidJni implements WindowAndroid.Natives {
  private static WindowAndroid.Natives testInstance;

  public static final JniStaticTestMocker<WindowAndroid.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.ui.base.WindowAndroid.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.ui.base.WindowAndroid.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(WindowAndroid caller, int displayId, float scrollFactor,
      boolean windowIsWideColorGamut) {
    return (long)GEN_JNI.org_chromium_ui_base_WindowAndroid_init(caller, displayId, scrollFactor, windowIsWideColorGamut);
  }

  @Override
  public void onVisibilityChanged(long nativeWindowAndroid, WindowAndroid caller, boolean visible) {
    GEN_JNI.org_chromium_ui_base_WindowAndroid_onVisibilityChanged(nativeWindowAndroid, caller, visible);
  }

  @Override
  public void onActivityStopped(long nativeWindowAndroid, WindowAndroid caller) {
    GEN_JNI.org_chromium_ui_base_WindowAndroid_onActivityStopped(nativeWindowAndroid, caller);
  }

  @Override
  public void onActivityStarted(long nativeWindowAndroid, WindowAndroid caller) {
    GEN_JNI.org_chromium_ui_base_WindowAndroid_onActivityStarted(nativeWindowAndroid, caller);
  }

  @Override
  public void setVSyncPaused(long nativeWindowAndroid, WindowAndroid caller, boolean paused) {
    GEN_JNI.org_chromium_ui_base_WindowAndroid_setVSyncPaused(nativeWindowAndroid, caller, paused);
  }

  @Override
  public void onUpdateRefreshRate(long nativeWindowAndroid, WindowAndroid caller,
      float refreshRate) {
    GEN_JNI.org_chromium_ui_base_WindowAndroid_onUpdateRefreshRate(nativeWindowAndroid, caller, refreshRate);
  }

  @Override
  public void destroy(long nativeWindowAndroid, WindowAndroid caller) {
    GEN_JNI.org_chromium_ui_base_WindowAndroid_destroy(nativeWindowAndroid, caller);
  }

  @Override
  public void onSupportedRefreshRatesUpdated(long nativeWindowAndroid, WindowAndroid caller,
      float[] supportedRefreshRates) {
    GEN_JNI.org_chromium_ui_base_WindowAndroid_onSupportedRefreshRatesUpdated(nativeWindowAndroid, caller, supportedRefreshRates);
  }

  public static WindowAndroid.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.ui.base.WindowAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new WindowAndroidJni();
  }
}
