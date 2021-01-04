package org.chromium.android_webview;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AwFormDatabaseJni implements AwFormDatabase.Natives {
  private static AwFormDatabase.Natives testInstance;

  public static final JniStaticTestMocker<AwFormDatabase.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.AwFormDatabase.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.android_webview.AwFormDatabase.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean hasFormData() {
    return (boolean)N.MxzPtFuv();
  }

  @Override
  public void clearFormData() {
    N.MonDM6EC();
  }

  public static AwFormDatabase.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.AwFormDatabase.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwFormDatabaseJni();
  }
}
