package org.chromium.ui.base;

import J.N;
import android.view.KeyEvent;
import android.view.MotionEvent;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class EventForwarderJni implements EventForwarder.Natives {
  private static EventForwarder.Natives testInstance;

  public static final JniStaticTestMocker<EventForwarder.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.ui.base.EventForwarder.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.ui.base.EventForwarder.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public WindowAndroid getJavaWindowAndroid(long nativeEventForwarder, EventForwarder caller) {
    return (WindowAndroid)N.M4_mlka_(nativeEventForwarder, caller);
  }

  @Override
  public boolean onTouchEvent(long nativeEventForwarder, EventForwarder caller, MotionEvent event,
      long timeMs, int action, int pointerCount, int historySize, int actionIndex, float x0,
      float y0, float x1, float y1, int pointerId0, int pointerId1, float touchMajor0,
      float touchMajor1, float touchMinor0, float touchMinor1, float orientation0,
      float orientation1, float tilt0, float tilt1, float rawX, float rawY, int androidToolType0,
      int androidToolType1, int androidButtonState, int androidMetaState,
      boolean isTouchHandleEvent) {
    return (boolean)N.Mcw1yi1C(nativeEventForwarder, caller, event, timeMs, action, pointerCount, historySize, actionIndex, x0, y0, x1, y1, pointerId0, pointerId1, touchMajor0, touchMajor1, touchMinor0, touchMinor1, orientation0, orientation1, tilt0, tilt1, rawX, rawY, androidToolType0, androidToolType1, androidButtonState, androidMetaState, isTouchHandleEvent);
  }

  @Override
  public void onMouseEvent(long nativeEventForwarder, EventForwarder caller, long timeMs,
      int action, float x, float y, int pointerId, float pressure, float orientation, float tilt,
      int changedButton, int buttonState, int metaState, int toolType) {
    N.M$2oj6EQ(nativeEventForwarder, caller, timeMs, action, x, y, pointerId, pressure, orientation, tilt, changedButton, buttonState, metaState, toolType);
  }

  @Override
  public void onDragEvent(long nativeEventForwarder, EventForwarder caller, int action, int x,
      int y, int screenX, int screenY, String[] mimeTypes, String content) {
    N.MZ1ZkPta(nativeEventForwarder, caller, action, x, y, screenX, screenY, mimeTypes, content);
  }

  @Override
  public boolean onGestureEvent(long nativeEventForwarder, EventForwarder caller, int type,
      long timeMs, float delta) {
    return (boolean)N.MtyC4Bd2(nativeEventForwarder, caller, type, timeMs, delta);
  }

  @Override
  public boolean onGenericMotionEvent(long nativeEventForwarder, EventForwarder caller,
      MotionEvent event, long timeMs) {
    return (boolean)N.MvdB06Zi(nativeEventForwarder, caller, event, timeMs);
  }

  @Override
  public boolean onKeyUp(long nativeEventForwarder, EventForwarder caller, KeyEvent event,
      int keyCode) {
    return (boolean)N.MRbfSEI1(nativeEventForwarder, caller, event, keyCode);
  }

  @Override
  public boolean dispatchKeyEvent(long nativeEventForwarder, EventForwarder caller,
      KeyEvent event) {
    return (boolean)N.MZE$0qqv(nativeEventForwarder, caller, event);
  }

  @Override
  public void scrollBy(long nativeEventForwarder, EventForwarder caller, float deltaX,
      float deltaY) {
    N.MMwH$VBb(nativeEventForwarder, caller, deltaX, deltaY);
  }

  @Override
  public void scrollTo(long nativeEventForwarder, EventForwarder caller, float x, float y) {
    N.M6lTZ5w8(nativeEventForwarder, caller, x, y);
  }

  @Override
  public void doubleTap(long nativeEventForwarder, EventForwarder caller, long timeMs, int x,
      int y) {
    N.MNnWXapV(nativeEventForwarder, caller, timeMs, x, y);
  }

  @Override
  public void startFling(long nativeEventForwarder, EventForwarder caller, long timeMs,
      float velocityX, float velocityY, boolean syntheticScroll, boolean preventBoosting) {
    N.MT1C98PL(nativeEventForwarder, caller, timeMs, velocityX, velocityY, syntheticScroll, preventBoosting);
  }

  @Override
  public void cancelFling(long nativeEventForwarder, EventForwarder caller, long timeMs,
      boolean preventBoosting) {
    N.MSvJWvYj(nativeEventForwarder, caller, timeMs, preventBoosting);
  }

  public static EventForwarder.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.ui.base.EventForwarder.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new EventForwarderJni();
  }
}
