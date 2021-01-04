package org.chromium.components.content_capture;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ContentCaptureFeaturesJni implements ContentCaptureFeatures.Natives {
  private static ContentCaptureFeatures.Natives testInstance;

  public static final JniStaticTestMocker<ContentCaptureFeatures.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.content_capture.ContentCaptureFeatures.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.content_capture.ContentCaptureFeatures.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isEnabled() {
    return (boolean)N.MRrWU$ia();
  }

  public static ContentCaptureFeatures.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.content_capture.ContentCaptureFeatures.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ContentCaptureFeaturesJni();
  }
}
