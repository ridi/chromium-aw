package org.chromium.content.app;

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
final class ContentChildProcessServiceDelegateJni implements ContentChildProcessServiceDelegate.Natives {
  private static ContentChildProcessServiceDelegate.Natives testInstance;

  public static final JniStaticTestMocker<ContentChildProcessServiceDelegate.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.app.ContentChildProcessServiceDelegate.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.app.ContentChildProcessServiceDelegate.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void initChildProcess(ContentChildProcessServiceDelegate caller, int cpuCount,
      long cpuFeatures) {
    N.MBlO3kR9(caller, cpuCount, cpuFeatures);
  }

  @Override
  public void retrieveFileDescriptorsIdsToKeys(ContentChildProcessServiceDelegate caller) {
    N.M0zXFFiu(caller);
  }

  public static ContentChildProcessServiceDelegate.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.app.ContentChildProcessServiceDelegate.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new ContentChildProcessServiceDelegateJni();
  }
}
