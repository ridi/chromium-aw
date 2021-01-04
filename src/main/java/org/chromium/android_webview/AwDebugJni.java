package org.chromium.android_webview;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AwDebugJni implements AwDebug.Natives {
  private static AwDebug.Natives testInstance;

  public static final JniStaticTestMocker<AwDebug.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.AwDebug.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.android_webview.AwDebug.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean dumpWithoutCrashing(String dumpPath) {
    return (boolean)N.MmSf62mU(dumpPath);
  }

  @Override
  public void initCrashKeysForWebViewTesting() {
    N.MDJuylSA();
  }

  @Override
  public void setWhiteListedKeyForTesting() {
    N.M7oEM7wa();
  }

  @Override
  public void setNonWhiteListedKeyForTesting() {
    N.MNM504jU();
  }

  @Override
  public void setSupportLibraryWebkitVersionCrashKey(String version) {
    N.M06DsVuS(version);
  }

  public static AwDebug.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.AwDebug.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwDebugJni();
  }
}
