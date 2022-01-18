package org.chromium.content.browser;

import android.view.Surface;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.UnguessableToken;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.common.SurfaceWrapper;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class GpuProcessCallbackJni implements GpuProcessCallback.Natives {
  private static GpuProcessCallback.Natives testInstance;

  public static final JniStaticTestMocker<GpuProcessCallback.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.GpuProcessCallback.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.GpuProcessCallback.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void completeScopedSurfaceRequest(UnguessableToken requestToken, Surface surface) {
    GEN_JNI.org_chromium_content_browser_GpuProcessCallback_completeScopedSurfaceRequest(requestToken, surface);
  }

  @Override
  public SurfaceWrapper getViewSurface(int surfaceId) {
    return (SurfaceWrapper)GEN_JNI.org_chromium_content_browser_GpuProcessCallback_getViewSurface(surfaceId);
  }

  public static GpuProcessCallback.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.GpuProcessCallback.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new GpuProcessCallbackJni();
  }
}
