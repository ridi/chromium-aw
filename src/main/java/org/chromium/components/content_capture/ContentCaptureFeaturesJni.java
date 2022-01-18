package org.chromium.components.content_capture;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class ContentCaptureFeaturesJni implements ContentCaptureFeatures.Natives {
  private static ContentCaptureFeatures.Natives testInstance;

  public static final JniStaticTestMocker<ContentCaptureFeatures.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.content_capture.ContentCaptureFeatures.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.content_capture.ContentCaptureFeatures.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isEnabled() {
    return (boolean)GEN_JNI.org_chromium_components_content_1capture_ContentCaptureFeatures_isEnabled();
  }

  @Override
  public boolean shouldTriggerContentCaptureForExperiment() {
    return (boolean)GEN_JNI.org_chromium_components_content_1capture_ContentCaptureFeatures_shouldTriggerContentCaptureForExperiment();
  }

  public static ContentCaptureFeatures.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.content_capture.ContentCaptureFeatures.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ContentCaptureFeaturesJni();
  }
}
