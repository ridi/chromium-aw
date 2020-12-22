package org.chromium.android_webview.gfx;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AwGLFunctorJni implements AwGLFunctor.Natives {
  private static AwGLFunctor.Natives testInstance;

  public static final JniStaticTestMocker<AwGLFunctor.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.gfx.AwGLFunctor.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.android_webview.gfx.AwGLFunctor.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void deleteHardwareRenderer(long nativeAwGLFunctor, AwGLFunctor caller) {
    N.MsCe5UVl(nativeAwGLFunctor, caller);
  }

  @Override
  public void removeFromCompositorFrameProducer(long nativeAwGLFunctor, AwGLFunctor caller) {
    N.MOiMYd0I(nativeAwGLFunctor, caller);
  }

  @Override
  public long getCompositorFrameConsumer(long nativeAwGLFunctor, AwGLFunctor caller) {
    return (long)N.MfRoRhka(nativeAwGLFunctor, caller);
  }

  @Override
  public long getAwDrawGLFunction() {
    return (long)N.Mq4IKpgt();
  }

  @Override
  public void destroy(long nativeAwGLFunctor) {
    N.Ms3_fBgF(nativeAwGLFunctor);
  }

  @Override
  public long create(AwGLFunctor javaProxy) {
    return (long)N.Me9QwrxV(javaProxy);
  }

  @Override
  public int getNativeInstanceCount() {
    return (int)N.MW0m24ct();
  }

  public static AwGLFunctor.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.gfx.AwGLFunctor.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwGLFunctorJni();
  }
}
