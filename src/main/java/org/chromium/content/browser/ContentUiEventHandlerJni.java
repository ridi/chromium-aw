package org.chromium.content.browser;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ContentUiEventHandlerJni implements ContentUiEventHandler.Natives {
  private static ContentUiEventHandler.Natives testInstance;

  public static final JniStaticTestMocker<ContentUiEventHandler.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.ContentUiEventHandler.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.ContentUiEventHandler.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(ContentUiEventHandler caller, WebContents webContents) {
    return (long)N.MXL6itCa(caller, webContents);
  }

  @Override
  public void sendMouseWheelEvent(long nativeContentUiEventHandler, ContentUiEventHandler caller,
      long timeMs, float x, float y, float ticksX, float ticksY) {
    N.MifdK0lh(nativeContentUiEventHandler, caller, timeMs, x, y, ticksX, ticksY);
  }

  @Override
  public void sendMouseEvent(long nativeContentUiEventHandler, ContentUiEventHandler caller,
      long timeMs, int action, float x, float y, int pointerId, float pressure, float orientation,
      float tilt, int changedButton, int buttonState, int metaState, int toolType) {
    N.MjyjK8Gd(nativeContentUiEventHandler, caller, timeMs, action, x, y, pointerId, pressure, orientation, tilt, changedButton, buttonState, metaState, toolType);
  }

  @Override
  public void sendScrollEvent(long nativeContentUiEventHandler, ContentUiEventHandler caller,
      long timeMs, float deltaX, float deltaY) {
    N.M_1sgTVt(nativeContentUiEventHandler, caller, timeMs, deltaX, deltaY);
  }

  @Override
  public void cancelFling(long nativeContentUiEventHandler, ContentUiEventHandler caller,
      long timeMs) {
    N.MW$k83qi(nativeContentUiEventHandler, caller, timeMs);
  }

  public static ContentUiEventHandler.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.ContentUiEventHandler.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ContentUiEventHandlerJni();
  }
}
