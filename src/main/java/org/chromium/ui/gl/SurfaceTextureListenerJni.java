package org.chromium.ui.gl;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
final class SurfaceTextureListenerJni implements SurfaceTextureListener.Natives {
  private static SurfaceTextureListener.Natives testInstance;

  public static final JniStaticTestMocker<SurfaceTextureListener.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.ui.gl.SurfaceTextureListener.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.ui.gl.SurfaceTextureListener.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void frameAvailable(long nativeSurfaceTextureListener, SurfaceTextureListener caller) {
    N.MRbPfCZQ(nativeSurfaceTextureListener, caller);
  }

  @Override
  public void destroy(long nativeSurfaceTextureListener, SurfaceTextureListener caller) {
    N.MUH2vhAN(nativeSurfaceTextureListener, caller);
  }

  public static SurfaceTextureListener.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.ui.gl.SurfaceTextureListener.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new SurfaceTextureListenerJni();
  }
}
