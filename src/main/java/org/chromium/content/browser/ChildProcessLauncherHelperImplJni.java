package org.chromium.content.browser;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ChildProcessLauncherHelperImplJni implements ChildProcessLauncherHelperImpl.Natives {
  private static ChildProcessLauncherHelperImpl.Natives testInstance;

  public static final JniStaticTestMocker<ChildProcessLauncherHelperImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.ChildProcessLauncherHelperImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.ChildProcessLauncherHelperImpl.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onChildProcessStarted(long nativeChildProcessLauncherHelper, int pid) {
    N.MXR$KaDS(nativeChildProcessLauncherHelper, pid);
  }

  @Override
  public void setTerminationInfo(long termiantionInfoPtr, int bindingState, boolean killedByUs,
      boolean cleanExit, int remainingStrong, int remainingModerate, int remainingWaived,
      int reverseRank) {
    N.MJcoZ9pW(termiantionInfoPtr, bindingState, killedByUs, cleanExit, remainingStrong, remainingModerate, remainingWaived, reverseRank);
  }

  public static ChildProcessLauncherHelperImpl.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.ChildProcessLauncherHelperImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ChildProcessLauncherHelperImplJni();
  }
}
