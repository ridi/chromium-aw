package org.chromium.content.browser.androidoverlay;

import J.N;
import android.view.Surface;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.gfx.mojom.Rect;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class DialogOverlayImplJni implements DialogOverlayImpl.Natives {
  private static DialogOverlayImpl.Natives testInstance;

  public static final JniStaticTestMocker<DialogOverlayImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.androidoverlay.DialogOverlayImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.androidoverlay.DialogOverlayImpl.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(DialogOverlayImpl caller, long high, long low, boolean isPowerEfficient) {
    return (long)N.MqPi0d6D(caller, high, low, isPowerEfficient);
  }

  @Override
  public void completeInit(long nativeDialogOverlayImpl, DialogOverlayImpl caller) {
    N.MQAm7B7f(nativeDialogOverlayImpl, caller);
  }

  @Override
  public void destroy(long nativeDialogOverlayImpl, DialogOverlayImpl caller) {
    N.MJj9v_ba(nativeDialogOverlayImpl, caller);
  }

  @Override
  public void getCompositorOffset(long nativeDialogOverlayImpl, DialogOverlayImpl caller,
      Rect rect) {
    N.MAd6qeVr(nativeDialogOverlayImpl, caller, rect);
  }

  @Override
  public int registerSurface(Surface surface) {
    return (int)N.MpcpmTlm(surface);
  }

  @Override
  public void unregisterSurface(int surfaceId) {
    N.M1e4GdYZ(surfaceId);
  }

  @Override
  public Surface lookupSurfaceForTesting(int surfaceId) {
    return (Surface)N.MzUgOpRk(surfaceId);
  }

  public static DialogOverlayImpl.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.androidoverlay.DialogOverlayImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new DialogOverlayImplJni();
  }
}
