package org.chromium.components.content_capture;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ContentCaptureReceiverManagerJni implements ContentCaptureReceiverManager.Natives {
  private static ContentCaptureReceiverManager.Natives testInstance;

  public static final JniStaticTestMocker<ContentCaptureReceiverManager.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.content_capture.ContentCaptureReceiverManager.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.content_capture.ContentCaptureReceiverManager.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public ContentCaptureReceiverManager createOrGet(WebContents webContents) {
    return (ContentCaptureReceiverManager)GEN_JNI.org_chromium_components_content_1capture_ContentCaptureReceiverManager_createOrGet(webContents);
  }

  public static ContentCaptureReceiverManager.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.content_capture.ContentCaptureReceiverManager.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ContentCaptureReceiverManagerJni();
  }
}
