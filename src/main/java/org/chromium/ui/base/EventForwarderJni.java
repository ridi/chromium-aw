package org.chromium.ui.base;

import android.view.KeyEvent;
import android.view.MotionEvent;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class EventForwarderJni implements EventForwarder.Natives {
  private static EventForwarder.Natives testInstance;

  public static final JniStaticTestMocker<EventForwarder.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.ui.base.EventForwarder.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.ui.base.EventForwarder.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public WindowAndroid getJavaWindowAndroid(long nativeEventForwarder, EventForwarder caller) {
    return (WindowAndroid)GEN_JNI.org_chromium_ui_base_EventForwarder_getJavaWindowAndroid(nativeEventForwarder, caller);
  }

  @Override
  public boolean onTouchEvent(long nativeEventForwarder, EventForwarder caller, MotionEvent event,
      long timeMs, int action, int pointerCount, int historySize, int actionIndex, float x0,
      float y0, float x1, float y1, int pointerId0, int pointerId1, float touchMajor0,
      float touchMajor1, float touchMinor0, float touchMinor1, float orientation0,
      float orientation1, float tilt0, float tilt1, float rawX, float rawY, int androidToolType0,
      int androidToolType1, int gestureClassification, int androidButtonState, int androidMetaState,
      boolean isTouchHandleEvent) {
    return (boolean)GEN_JNI.org_chromium_ui_base_EventForwarder_onTouchEvent(nativeEventForwarder, caller, event, timeMs, action, pointerCount, historySize, actionIndex, x0, y0, x1, y1, pointerId0, pointerId1, touchMajor0, touchMajor1, touchMinor0, touchMinor1, orientation0, orientation1, tilt0, tilt1, rawX, rawY, androidToolType0, androidToolType1, gestureClassification, androidButtonState, androidMetaState, isTouchHandleEvent);
  }

  @Override
  public void onMouseEvent(long nativeEventForwarder, EventForwarder caller, long timeMs,
      int action, float x, float y, int pointerId, float pressure, float orientation, float tilt,
      int changedButton, int buttonState, int metaState, int toolType) {
    GEN_JNI.org_chromium_ui_base_EventForwarder_onMouseEvent(nativeEventForwarder, caller, timeMs, action, x, y, pointerId, pressure, orientation, tilt, changedButton, buttonState, metaState, toolType);
  }

  @Override
  public void onDragEvent(long nativeEventForwarder, EventForwarder caller, int action, int x,
      int y, int screenX, int screenY, String[] mimeTypes, String content) {
    GEN_JNI.org_chromium_ui_base_EventForwarder_onDragEvent(nativeEventForwarder, caller, action, x, y, screenX, screenY, mimeTypes, content);
  }

  @Override
  public boolean onGestureEvent(long nativeEventForwarder, EventForwarder caller, int type,
      long timeMs, float delta) {
    return (boolean)GEN_JNI.org_chromium_ui_base_EventForwarder_onGestureEvent(nativeEventForwarder, caller, type, timeMs, delta);
  }

  @Override
  public boolean onGenericMotionEvent(long nativeEventForwarder, EventForwarder caller,
      MotionEvent event, long timeMs) {
    return (boolean)GEN_JNI.org_chromium_ui_base_EventForwarder_onGenericMotionEvent(nativeEventForwarder, caller, event, timeMs);
  }

  @Override
  public boolean onKeyUp(long nativeEventForwarder, EventForwarder caller, KeyEvent event,
      int keyCode) {
    return (boolean)GEN_JNI.org_chromium_ui_base_EventForwarder_onKeyUp(nativeEventForwarder, caller, event, keyCode);
  }

  @Override
  public boolean dispatchKeyEvent(long nativeEventForwarder, EventForwarder caller,
      KeyEvent event) {
    return (boolean)GEN_JNI.org_chromium_ui_base_EventForwarder_dispatchKeyEvent(nativeEventForwarder, caller, event);
  }

  @Override
  public void scrollBy(long nativeEventForwarder, EventForwarder caller, float deltaX,
      float deltaY) {
    GEN_JNI.org_chromium_ui_base_EventForwarder_scrollBy(nativeEventForwarder, caller, deltaX, deltaY);
  }

  @Override
  public void scrollTo(long nativeEventForwarder, EventForwarder caller, float x, float y) {
    GEN_JNI.org_chromium_ui_base_EventForwarder_scrollTo(nativeEventForwarder, caller, x, y);
  }

  @Override
  public void doubleTap(long nativeEventForwarder, EventForwarder caller, long timeMs, int x,
      int y) {
    GEN_JNI.org_chromium_ui_base_EventForwarder_doubleTap(nativeEventForwarder, caller, timeMs, x, y);
  }

  @Override
  public void startFling(long nativeEventForwarder, EventForwarder caller, long timeMs,
      float velocityX, float velocityY, boolean syntheticScroll, boolean preventBoosting) {
    GEN_JNI.org_chromium_ui_base_EventForwarder_startFling(nativeEventForwarder, caller, timeMs, velocityX, velocityY, syntheticScroll, preventBoosting);
  }

  @Override
  public void cancelFling(long nativeEventForwarder, EventForwarder caller, long timeMs,
      boolean preventBoosting) {
    GEN_JNI.org_chromium_ui_base_EventForwarder_cancelFling(nativeEventForwarder, caller, timeMs, preventBoosting);
  }

  public static EventForwarder.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.ui.base.EventForwarder.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new EventForwarderJni();
  }
}
