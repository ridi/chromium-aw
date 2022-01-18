package org.chromium.android_webview.gfx;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class AwDrawFnImplJni implements AwDrawFnImpl.Natives {
  private static AwDrawFnImpl.Natives testInstance;

  public static final JniStaticTestMocker<AwDrawFnImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.gfx.AwDrawFnImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.android_webview.gfx.AwDrawFnImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public int getFunctorHandle(long nativeAwDrawFnImpl, AwDrawFnImpl caller) {
    return (int)GEN_JNI.org_chromium_android_1webview_gfx_AwDrawFnImpl_getFunctorHandle(nativeAwDrawFnImpl, caller);
  }

  @Override
  public long getCompositorFrameConsumer(long nativeAwDrawFnImpl, AwDrawFnImpl caller) {
    return (long)GEN_JNI.org_chromium_android_1webview_gfx_AwDrawFnImpl_getCompositorFrameConsumer(nativeAwDrawFnImpl, caller);
  }

  @Override
  public void releaseHandle(long nativeAwDrawFnImpl, AwDrawFnImpl caller) {
    GEN_JNI.org_chromium_android_1webview_gfx_AwDrawFnImpl_releaseHandle(nativeAwDrawFnImpl, caller);
  }

  @Override
  public void setDrawFnFunctionTable(long functionTablePointer) {
    GEN_JNI.org_chromium_android_1webview_gfx_AwDrawFnImpl_setDrawFnFunctionTable(functionTablePointer);
  }

  @Override
  public long create() {
    return (long)GEN_JNI.org_chromium_android_1webview_gfx_AwDrawFnImpl_create();
  }

  public static AwDrawFnImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.gfx.AwDrawFnImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwDrawFnImplJni();
  }
}
