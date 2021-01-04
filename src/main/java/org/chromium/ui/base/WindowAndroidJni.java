package org.chromium.ui.base;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class WindowAndroidJni implements WindowAndroid.Natives {
  private static WindowAndroid.Natives testInstance;

  public static final JniStaticTestMocker<WindowAndroid.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.ui.base.WindowAndroid.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.ui.base.WindowAndroid.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(WindowAndroid caller, int displayId, float scrollFactor,
      boolean windowIsWideColorGamut) {
    return (long)N.MFjTMMS_(caller, displayId, scrollFactor, windowIsWideColorGamut);
  }

  @Override
  public void onVisibilityChanged(long nativeWindowAndroid, WindowAndroid caller, boolean visible) {
    N.MrnNdVRa(nativeWindowAndroid, caller, visible);
  }

  @Override
  public void onActivityStopped(long nativeWindowAndroid, WindowAndroid caller) {
    N.MMLuxHp6(nativeWindowAndroid, caller);
  }

  @Override
  public void onActivityStarted(long nativeWindowAndroid, WindowAndroid caller) {
    N.MbyUPhMo(nativeWindowAndroid, caller);
  }

  @Override
  public void setVSyncPaused(long nativeWindowAndroid, WindowAndroid caller, boolean paused) {
    N.MotttR54(nativeWindowAndroid, caller, paused);
  }

  @Override
  public void onUpdateRefreshRate(long nativeWindowAndroid, WindowAndroid caller,
      float refreshRate) {
    N.MWNjxKcW(nativeWindowAndroid, caller, refreshRate);
  }

  @Override
  public void destroy(long nativeWindowAndroid, WindowAndroid caller) {
    N.MV00Qksi(nativeWindowAndroid, caller);
  }

  @Override
  public void onCursorVisibilityChanged(long nativeWindowAndroid, WindowAndroid caller,
      boolean visible) {
    N.ML$dVqbX(nativeWindowAndroid, caller, visible);
  }

  @Override
  public void onFallbackCursorModeToggled(long nativeWindowAndroid, WindowAndroid caller,
      boolean isOn) {
    N.Mpksm6S7(nativeWindowAndroid, caller, isOn);
  }

  @Override
  public void onSupportedRefreshRatesUpdated(long nativeWindowAndroid, WindowAndroid caller,
      float[] supportedRefreshRates) {
    N.MTDQeb$o(nativeWindowAndroid, caller, supportedRefreshRates);
  }

  public static WindowAndroid.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.ui.base.WindowAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new WindowAndroidJni();
  }
}
