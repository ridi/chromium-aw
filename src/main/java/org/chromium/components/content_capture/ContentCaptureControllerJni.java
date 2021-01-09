package org.chromium.components.content_capture;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ContentCaptureControllerJni implements ContentCaptureController.Natives {
  private static ContentCaptureController.Natives testInstance;

  public static final JniStaticTestMocker<ContentCaptureController.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.content_capture.ContentCaptureController.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.content_capture.ContentCaptureController.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(Object contentCaptureController) {
    return (long)GEN_JNI.org_chromium_components_content_1capture_ContentCaptureController_init(contentCaptureController);
  }

  @Override
  public void setAllowlist(long nativeContentCaptureController, ContentCaptureController caller,
      String[] allowlist, boolean[] isRegex) {
    GEN_JNI.org_chromium_components_content_1capture_ContentCaptureController_setAllowlist(nativeContentCaptureController, caller, allowlist, isRegex);
  }

  @Override
  public boolean shouldCapture(long nativeContentCaptureController, ContentCaptureController caller,
      String[] urls) {
    return (boolean)GEN_JNI.org_chromium_components_content_1capture_ContentCaptureController_shouldCapture(nativeContentCaptureController, caller, urls);
  }

  public static ContentCaptureController.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.content_capture.ContentCaptureController.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ContentCaptureControllerJni();
  }
}
