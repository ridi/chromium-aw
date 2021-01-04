package org.chromium.components.content_capture;

import J.N;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ContentCaptureControllerJni implements ContentCaptureController.Natives {
  private static ContentCaptureController.Natives testInstance;

  public static final JniStaticTestMocker<ContentCaptureController.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.content_capture.ContentCaptureController.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.content_capture.ContentCaptureController.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(Object contentCaptureController) {
    return (long)N.MM$06MFa(contentCaptureController);
  }

  @Override
  public void setWhitelist(long nativeContentCaptureController, ContentCaptureController caller,
      String[] whitelist, boolean[] isRegex) {
    N.MMJ$SEno(nativeContentCaptureController, caller, whitelist, isRegex);
  }

  public static ContentCaptureController.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.content_capture.ContentCaptureController.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ContentCaptureControllerJni();
  }
}
