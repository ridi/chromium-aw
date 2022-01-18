package org.chromium.android_webview;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class AwRenderProcessJni implements AwRenderProcess.Natives {
  private static AwRenderProcess.Natives testInstance;

  public static final JniStaticTestMocker<AwRenderProcess.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.AwRenderProcess.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.android_webview.AwRenderProcess.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean terminateChildProcess(long nativeAwRenderProcess, AwRenderProcess caller) {
    return (boolean)GEN_JNI.org_chromium_android_1webview_AwRenderProcess_terminateChildProcess(nativeAwRenderProcess, caller);
  }

  @Override
  public boolean isProcessLockedToSiteForTesting(long nativeAwRenderProcess,
      AwRenderProcess caller) {
    return (boolean)GEN_JNI.org_chromium_android_1webview_AwRenderProcess_isProcessLockedToSiteForTesting(nativeAwRenderProcess, caller);
  }

  public static AwRenderProcess.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.AwRenderProcess.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwRenderProcessJni();
  }
}
