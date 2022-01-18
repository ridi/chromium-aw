package org.chromium.content.browser.androidoverlay;

import android.view.Surface;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.gfx.mojom.Rect;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class DialogOverlayImplJni implements DialogOverlayImpl.Natives {
  private static DialogOverlayImpl.Natives testInstance;

  public static final JniStaticTestMocker<DialogOverlayImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.androidoverlay.DialogOverlayImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.androidoverlay.DialogOverlayImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(DialogOverlayImpl caller, long high, long low, boolean isPowerEfficient) {
    return (long)GEN_JNI.org_chromium_content_browser_androidoverlay_DialogOverlayImpl_init(caller, high, low, isPowerEfficient);
  }

  @Override
  public void completeInit(long nativeDialogOverlayImpl, DialogOverlayImpl caller) {
    GEN_JNI.org_chromium_content_browser_androidoverlay_DialogOverlayImpl_completeInit(nativeDialogOverlayImpl, caller);
  }

  @Override
  public void destroy(long nativeDialogOverlayImpl, DialogOverlayImpl caller) {
    GEN_JNI.org_chromium_content_browser_androidoverlay_DialogOverlayImpl_destroy(nativeDialogOverlayImpl, caller);
  }

  @Override
  public void getCompositorOffset(long nativeDialogOverlayImpl, DialogOverlayImpl caller,
      Rect rect) {
    GEN_JNI.org_chromium_content_browser_androidoverlay_DialogOverlayImpl_getCompositorOffset(nativeDialogOverlayImpl, caller, rect);
  }

  @Override
  public int registerSurface(Surface surface) {
    return (int)GEN_JNI.org_chromium_content_browser_androidoverlay_DialogOverlayImpl_registerSurface(surface);
  }

  @Override
  public void unregisterSurface(int surfaceId) {
    GEN_JNI.org_chromium_content_browser_androidoverlay_DialogOverlayImpl_unregisterSurface(surfaceId);
  }

  @Override
  public Surface lookupSurfaceForTesting(int surfaceId) {
    return (Surface)GEN_JNI.org_chromium_content_browser_androidoverlay_DialogOverlayImpl_lookupSurfaceForTesting(surfaceId);
  }

  @Override
  public void notifyDestroyedSynchronously(int messagePipeHandle) {
    GEN_JNI.org_chromium_content_browser_androidoverlay_DialogOverlayImpl_notifyDestroyedSynchronously(messagePipeHandle);
  }

  public static DialogOverlayImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.androidoverlay.DialogOverlayImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new DialogOverlayImplJni();
  }
}
