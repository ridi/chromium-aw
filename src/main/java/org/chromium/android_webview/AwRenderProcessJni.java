package org.chromium.android_webview;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AwRenderProcessJni implements AwRenderProcess.Natives {
  private static AwRenderProcess.Natives testInstance;

  public static final JniStaticTestMocker<AwRenderProcess.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.AwRenderProcess.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.android_webview.AwRenderProcess.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean terminateChildProcess(long nativeAwRenderProcess, AwRenderProcess caller) {
    return (boolean)N.MjS72mtS(nativeAwRenderProcess, caller);
  }

  public static AwRenderProcess.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.AwRenderProcess.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwRenderProcessJni();
  }
}
