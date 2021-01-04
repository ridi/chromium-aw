package org.chromium.content.browser;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class BrowserStartupControllerImplJni implements BrowserStartupControllerImpl.Natives {
  private static BrowserStartupControllerImpl.Natives testInstance;

  public static final JniStaticTestMocker<BrowserStartupControllerImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.BrowserStartupControllerImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.BrowserStartupControllerImpl.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void setCommandLineFlags(boolean singleProcess) {
    N.MwoPtAzD(singleProcess);
  }

  @Override
  public boolean isOfficialBuild() {
    return (boolean)N.MT$iIjxT();
  }

  @Override
  public void flushStartupTasks() {
    N.M9iLjy6T();
  }

  public static BrowserStartupControllerImpl.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.BrowserStartupControllerImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new BrowserStartupControllerImplJni();
  }
}
