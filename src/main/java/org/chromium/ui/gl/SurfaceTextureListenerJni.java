package org.chromium.ui.gl;

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
class SurfaceTextureListenerJni implements SurfaceTextureListener.Natives {
  private static SurfaceTextureListener.Natives testInstance;

  public static final JniStaticTestMocker<SurfaceTextureListener.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.ui.gl.SurfaceTextureListener.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.ui.gl.SurfaceTextureListener.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void frameAvailable(long nativeSurfaceTextureListener, SurfaceTextureListener caller) {
    GEN_JNI.org_chromium_ui_gl_SurfaceTextureListener_frameAvailable(nativeSurfaceTextureListener, caller);
  }

  @Override
  public void destroy(long nativeSurfaceTextureListener, SurfaceTextureListener caller) {
    GEN_JNI.org_chromium_ui_gl_SurfaceTextureListener_destroy(nativeSurfaceTextureListener, caller);
  }

  public static SurfaceTextureListener.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.ui.gl.SurfaceTextureListener.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new SurfaceTextureListenerJni();
  }
}
