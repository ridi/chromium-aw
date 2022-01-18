package org.chromium.android_webview;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class AwFormDatabaseJni implements AwFormDatabase.Natives {
  private static AwFormDatabase.Natives testInstance;

  public static final JniStaticTestMocker<AwFormDatabase.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.AwFormDatabase.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.android_webview.AwFormDatabase.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean hasFormData() {
    return (boolean)GEN_JNI.org_chromium_android_1webview_AwFormDatabase_hasFormData();
  }

  @Override
  public void clearFormData() {
    GEN_JNI.org_chromium_android_1webview_AwFormDatabase_clearFormData();
  }

  public static AwFormDatabase.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.AwFormDatabase.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwFormDatabaseJni();
  }
}
