package org.chromium.content.browser;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class RenderWidgetHostViewImplJni implements RenderWidgetHostViewImpl.Natives {
  private static RenderWidgetHostViewImpl.Natives testInstance;

  public static final JniStaticTestMocker<RenderWidgetHostViewImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.RenderWidgetHostViewImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.RenderWidgetHostViewImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isReady(long nativeRenderWidgetHostViewAndroid, RenderWidgetHostViewImpl caller) {
    return (boolean)GEN_JNI.org_chromium_content_browser_RenderWidgetHostViewImpl_isReady(nativeRenderWidgetHostViewAndroid, caller);
  }

  @Override
  public int getBackgroundColor(long nativeRenderWidgetHostViewAndroid,
      RenderWidgetHostViewImpl caller) {
    return (int)GEN_JNI.org_chromium_content_browser_RenderWidgetHostViewImpl_getBackgroundColor(nativeRenderWidgetHostViewAndroid, caller);
  }

  @Override
  public void dismissTextHandles(long nativeRenderWidgetHostViewAndroid,
      RenderWidgetHostViewImpl caller) {
    GEN_JNI.org_chromium_content_browser_RenderWidgetHostViewImpl_dismissTextHandles(nativeRenderWidgetHostViewAndroid, caller);
  }

  @Override
  public void showContextMenuAtTouchHandle(long nativeRenderWidgetHostViewAndroid,
      RenderWidgetHostViewImpl caller, int x, int y) {
    GEN_JNI.org_chromium_content_browser_RenderWidgetHostViewImpl_showContextMenuAtTouchHandle(nativeRenderWidgetHostViewAndroid, caller, x, y);
  }

  @Override
  public void onViewportInsetBottomChanged(long nativeRenderWidgetHostViewAndroid,
      RenderWidgetHostViewImpl caller) {
    GEN_JNI.org_chromium_content_browser_RenderWidgetHostViewImpl_onViewportInsetBottomChanged(nativeRenderWidgetHostViewAndroid, caller);
  }

  @Override
  public void writeContentBitmapToDiskAsync(long nativeRenderWidgetHostViewAndroid,
      RenderWidgetHostViewImpl caller, int width, int height, String path,
      Callback<String> callback) {
    GEN_JNI.org_chromium_content_browser_RenderWidgetHostViewImpl_writeContentBitmapToDiskAsync(nativeRenderWidgetHostViewAndroid, caller, width, height, path, callback);
  }

  public static RenderWidgetHostViewImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.RenderWidgetHostViewImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new RenderWidgetHostViewImplJni();
  }
}
