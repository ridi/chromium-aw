package org.chromium.content.browser;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class ChildProcessLauncherHelperImplJni implements ChildProcessLauncherHelperImpl.Natives {
  private static ChildProcessLauncherHelperImpl.Natives testInstance;

  public static final JniStaticTestMocker<ChildProcessLauncherHelperImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.ChildProcessLauncherHelperImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.ChildProcessLauncherHelperImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onChildProcessStarted(long nativeChildProcessLauncherHelper, int pid) {
    GEN_JNI.org_chromium_content_browser_ChildProcessLauncherHelperImpl_onChildProcessStarted(nativeChildProcessLauncherHelper, pid);
  }

  @Override
  public void setTerminationInfo(long termiantionInfoPtr, int bindingState, boolean killedByUs,
      boolean cleanExit, boolean exceptionDuringInit, int remainingStrong, int remainingModerate,
      int remainingWaived, int reverseRank) {
    GEN_JNI.org_chromium_content_browser_ChildProcessLauncherHelperImpl_setTerminationInfo(termiantionInfoPtr, bindingState, killedByUs, cleanExit, exceptionDuringInit, remainingStrong, remainingModerate, remainingWaived, reverseRank);
  }

  @Override
  public boolean serviceGroupImportanceEnabled() {
    return (boolean)GEN_JNI.org_chromium_content_browser_ChildProcessLauncherHelperImpl_serviceGroupImportanceEnabled();
  }

  public static ChildProcessLauncherHelperImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.ChildProcessLauncherHelperImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ChildProcessLauncherHelperImplJni();
  }
}
