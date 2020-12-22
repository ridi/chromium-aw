package org.chromium.content.browser;

import J.N;
import android.view.Surface;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.UnguessableToken;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content.common.SurfaceWrapper;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class GpuProcessCallbackJni implements GpuProcessCallback.Natives {
  private static GpuProcessCallback.Natives testInstance;

  public static final JniStaticTestMocker<GpuProcessCallback.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.GpuProcessCallback.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.GpuProcessCallback.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void completeScopedSurfaceRequest(UnguessableToken requestToken, Surface surface) {
    N.M$O7xE3y(requestToken, surface);
  }

  @Override
  public SurfaceWrapper getViewSurface(int surfaceId) {
    return (SurfaceWrapper)N.Mm9rCM0m(surfaceId);
  }

  public static GpuProcessCallback.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.GpuProcessCallback.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new GpuProcessCallbackJni();
  }
}
