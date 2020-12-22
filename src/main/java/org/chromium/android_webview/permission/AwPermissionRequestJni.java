package org.chromium.android_webview.permission;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AwPermissionRequestJni implements AwPermissionRequest.Natives {
  private static AwPermissionRequest.Natives testInstance;

  public static final JniStaticTestMocker<AwPermissionRequest.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.permission.AwPermissionRequest.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.android_webview.permission.AwPermissionRequest.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onAccept(long nativeAwPermissionRequest, AwPermissionRequest caller,
      boolean allowed) {
    N.Mk3Msvx7(nativeAwPermissionRequest, caller, allowed);
  }

  @Override
  public void destroy(long nativeAwPermissionRequest) {
    N.MhKumtZE(nativeAwPermissionRequest);
  }

  public static AwPermissionRequest.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.permission.AwPermissionRequest.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwPermissionRequestJni();
  }
}
