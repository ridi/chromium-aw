package org.chromium.android_webview.gfx;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class AwGLFunctorJni implements AwGLFunctor.Natives {
  private static AwGLFunctor.Natives testInstance;

  public static final JniStaticTestMocker<AwGLFunctor.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.gfx.AwGLFunctor.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.android_webview.gfx.AwGLFunctor.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void deleteHardwareRenderer(long nativeAwGLFunctor, AwGLFunctor caller) {
    GEN_JNI.org_chromium_android_1webview_gfx_AwGLFunctor_deleteHardwareRenderer(nativeAwGLFunctor, caller);
  }

  @Override
  public void removeFromCompositorFrameProducer(long nativeAwGLFunctor, AwGLFunctor caller) {
    GEN_JNI.org_chromium_android_1webview_gfx_AwGLFunctor_removeFromCompositorFrameProducer(nativeAwGLFunctor, caller);
  }

  @Override
  public long getCompositorFrameConsumer(long nativeAwGLFunctor, AwGLFunctor caller) {
    return (long)GEN_JNI.org_chromium_android_1webview_gfx_AwGLFunctor_getCompositorFrameConsumer(nativeAwGLFunctor, caller);
  }

  @Override
  public long getAwDrawGLFunction() {
    return (long)GEN_JNI.org_chromium_android_1webview_gfx_AwGLFunctor_getAwDrawGLFunction();
  }

  @Override
  public void destroy(long nativeAwGLFunctor) {
    GEN_JNI.org_chromium_android_1webview_gfx_AwGLFunctor_destroy(nativeAwGLFunctor);
  }

  @Override
  public long create(AwGLFunctor javaProxy) {
    return (long)GEN_JNI.org_chromium_android_1webview_gfx_AwGLFunctor_create(javaProxy);
  }

  @Override
  public int getNativeInstanceCount() {
    return (int)GEN_JNI.org_chromium_android_1webview_gfx_AwGLFunctor_getNativeInstanceCount();
  }

  public static AwGLFunctor.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.gfx.AwGLFunctor.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwGLFunctorJni();
  }
}
