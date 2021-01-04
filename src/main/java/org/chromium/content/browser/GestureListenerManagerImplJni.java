package org.chromium.content.browser;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content.browser.webcontents.WebContentsImpl;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class GestureListenerManagerImplJni implements GestureListenerManagerImpl.Natives {
  private static GestureListenerManagerImpl.Natives testInstance;

  public static final JniStaticTestMocker<GestureListenerManagerImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.GestureListenerManagerImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.GestureListenerManagerImpl.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(GestureListenerManagerImpl caller, WebContentsImpl webContents) {
    return (long)N.MefCIE9S(caller, webContents);
  }

  @Override
  public void resetGestureDetection(long nativeGestureListenerManager,
      GestureListenerManagerImpl caller) {
    N.MMR0DKoy(nativeGestureListenerManager, caller);
  }

  @Override
  public void setDoubleTapSupportEnabled(long nativeGestureListenerManager,
      GestureListenerManagerImpl caller, boolean enabled) {
    N.MrZmTSS9(nativeGestureListenerManager, caller, enabled);
  }

  @Override
  public void setMultiTouchZoomSupportEnabled(long nativeGestureListenerManager,
      GestureListenerManagerImpl caller, boolean enabled) {
    N.M6a5zchR(nativeGestureListenerManager, caller, enabled);
  }

  public static GestureListenerManagerImpl.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.GestureListenerManagerImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new GestureListenerManagerImplJni();
  }
}
