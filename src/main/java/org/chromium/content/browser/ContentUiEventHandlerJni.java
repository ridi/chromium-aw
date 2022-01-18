package org.chromium.content.browser;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class ContentUiEventHandlerJni implements ContentUiEventHandler.Natives {
  private static ContentUiEventHandler.Natives testInstance;

  public static final JniStaticTestMocker<ContentUiEventHandler.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.ContentUiEventHandler.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.ContentUiEventHandler.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(ContentUiEventHandler caller, WebContents webContents) {
    return (long)GEN_JNI.org_chromium_content_browser_ContentUiEventHandler_init(caller, webContents);
  }

  @Override
  public void sendMouseWheelEvent(long nativeContentUiEventHandler, ContentUiEventHandler caller,
      long timeMs, float x, float y, float ticksX, float ticksY) {
    GEN_JNI.org_chromium_content_browser_ContentUiEventHandler_sendMouseWheelEvent(nativeContentUiEventHandler, caller, timeMs, x, y, ticksX, ticksY);
  }

  @Override
  public void sendMouseEvent(long nativeContentUiEventHandler, ContentUiEventHandler caller,
      long timeMs, int action, float x, float y, int pointerId, float pressure, float orientation,
      float tilt, int changedButton, int buttonState, int metaState, int toolType) {
    GEN_JNI.org_chromium_content_browser_ContentUiEventHandler_sendMouseEvent(nativeContentUiEventHandler, caller, timeMs, action, x, y, pointerId, pressure, orientation, tilt, changedButton, buttonState, metaState, toolType);
  }

  @Override
  public void sendScrollEvent(long nativeContentUiEventHandler, ContentUiEventHandler caller,
      long timeMs, float deltaX, float deltaY) {
    GEN_JNI.org_chromium_content_browser_ContentUiEventHandler_sendScrollEvent(nativeContentUiEventHandler, caller, timeMs, deltaX, deltaY);
  }

  @Override
  public void cancelFling(long nativeContentUiEventHandler, ContentUiEventHandler caller,
      long timeMs) {
    GEN_JNI.org_chromium_content_browser_ContentUiEventHandler_cancelFling(nativeContentUiEventHandler, caller, timeMs);
  }

  public static ContentUiEventHandler.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.ContentUiEventHandler.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ContentUiEventHandlerJni();
  }
}
