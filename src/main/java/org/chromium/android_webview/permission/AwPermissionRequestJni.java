package org.chromium.android_webview.permission;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class AwPermissionRequestJni implements AwPermissionRequest.Natives {
  private static AwPermissionRequest.Natives testInstance;

  public static final JniStaticTestMocker<AwPermissionRequest.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.permission.AwPermissionRequest.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.android_webview.permission.AwPermissionRequest.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onAccept(long nativeAwPermissionRequest, AwPermissionRequest caller,
      boolean allowed) {
    GEN_JNI.org_chromium_android_1webview_permission_AwPermissionRequest_onAccept(nativeAwPermissionRequest, caller, allowed);
  }

  @Override
  public void destroy(long nativeAwPermissionRequest) {
    GEN_JNI.org_chromium_android_1webview_permission_AwPermissionRequest_destroy(nativeAwPermissionRequest);
  }

  public static AwPermissionRequest.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.permission.AwPermissionRequest.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwPermissionRequestJni();
  }
}
