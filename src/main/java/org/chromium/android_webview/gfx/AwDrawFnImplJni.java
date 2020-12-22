package org.chromium.android_webview.gfx;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AwDrawFnImplJni implements AwDrawFnImpl.Natives {
  private static AwDrawFnImpl.Natives testInstance;

  public static final JniStaticTestMocker<AwDrawFnImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.gfx.AwDrawFnImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.android_webview.gfx.AwDrawFnImpl.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public int getFunctorHandle(long nativeAwDrawFnImpl, AwDrawFnImpl caller) {
    return (int)N.MVv$dooB(nativeAwDrawFnImpl, caller);
  }

  @Override
  public long getCompositorFrameConsumer(long nativeAwDrawFnImpl, AwDrawFnImpl caller) {
    return (long)N.MyqeD0HT(nativeAwDrawFnImpl, caller);
  }

  @Override
  public void releaseHandle(long nativeAwDrawFnImpl, AwDrawFnImpl caller) {
    N.MTNG5d$d(nativeAwDrawFnImpl, caller);
  }

  @Override
  public void setDrawFnFunctionTable(long functionTablePointer) {
    N.Muf_UBRy(functionTablePointer);
  }

  @Override
  public long create() {
    return (long)N.M_e6WGre();
  }

  public static AwDrawFnImpl.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.gfx.AwDrawFnImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwDrawFnImplJni();
  }
}
