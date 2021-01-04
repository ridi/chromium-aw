package org.chromium.content.browser.webcontents;

import J.N;
import android.graphics.Rect;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content.browser.RenderWidgetHostViewImpl;
import org.chromium.content_public.browser.AccessibilitySnapshotCallback;
import org.chromium.content_public.browser.ImageDownloadCallback;
import org.chromium.content_public.browser.JavaScriptCallback;
import org.chromium.content_public.browser.MessagePort;
import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.OverscrollRefreshHandler;
import org.chromium.ui.base.EventForwarder;
import org.chromium.ui.base.ViewAndroidDelegate;
import org.chromium.ui.base.WindowAndroid;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class WebContentsImplJni implements WebContentsImpl.Natives {
  private static WebContentsImpl.Natives testInstance;

  public static final JniStaticTestMocker<WebContentsImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.webcontents.WebContentsImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.webcontents.WebContentsImpl.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void destroyWebContents(long webContentsAndroidPtr) {
    N.MxxzO9Pe(webContentsAndroidPtr);
  }

  @Override
  public WebContents fromNativePtr(long webContentsAndroidPtr) {
    return (WebContents)N.M$eaBDjM(webContentsAndroidPtr);
  }

  @Override
  public void clearNativeReference(long nativeWebContentsAndroid, WebContentsImpl caller) {
    N.M0iG1Oc2(nativeWebContentsAndroid, caller);
  }

  @Override
  public WindowAndroid getTopLevelNativeWindow(long nativeWebContentsAndroid,
      WebContentsImpl caller) {
    return (WindowAndroid)N.MunY3e38(nativeWebContentsAndroid, caller);
  }

  @Override
  public void setTopLevelNativeWindow(long nativeWebContentsAndroid, WebContentsImpl caller,
      WindowAndroid windowAndroid) {
    N.MOKG_Wbb(nativeWebContentsAndroid, caller, windowAndroid);
  }

  @Override
  public RenderFrameHost getMainFrame(long nativeWebContentsAndroid, WebContentsImpl caller) {
    return (RenderFrameHost)N.MjidYpBx(nativeWebContentsAndroid, caller);
  }

  @Override
  public RenderFrameHost getFocusedFrame(long nativeWebContentsAndroid, WebContentsImpl caller) {
    return (RenderFrameHost)N.MT2cFaRc(nativeWebContentsAndroid, caller);
  }

  @Override
  public RenderWidgetHostViewImpl getRenderWidgetHostView(long nativeWebContentsAndroid,
      WebContentsImpl caller) {
    return (RenderWidgetHostViewImpl)N.Mj9slq6o(nativeWebContentsAndroid, caller);
  }

  @Override
  public WebContentsImpl[] getInnerWebContents(long nativeWebContentsAndroid,
      WebContentsImpl caller) {
    return (WebContentsImpl[])N.MJSe_z5C(nativeWebContentsAndroid, caller);
  }

  @Override
  public String getTitle(long nativeWebContentsAndroid, WebContentsImpl caller) {
    return (String)N.M7OgjMU8(nativeWebContentsAndroid, caller);
  }

  @Override
  public String getVisibleURL(long nativeWebContentsAndroid, WebContentsImpl caller) {
    return (String)N.M8927Uaf(nativeWebContentsAndroid, caller);
  }

  @Override
  public String getEncoding(long nativeWebContentsAndroid, WebContentsImpl caller) {
    return (String)N.M4pZ82rG(nativeWebContentsAndroid, caller);
  }

  @Override
  public boolean isLoading(long nativeWebContentsAndroid, WebContentsImpl caller) {
    return (boolean)N.MtSTkEp2(nativeWebContentsAndroid, caller);
  }

  @Override
  public boolean isLoadingToDifferentDocument(long nativeWebContentsAndroid,
      WebContentsImpl caller) {
    return (boolean)N.M93b11tE(nativeWebContentsAndroid, caller);
  }

  @Override
  public void stop(long nativeWebContentsAndroid, WebContentsImpl caller) {
    N.M$$25N5$(nativeWebContentsAndroid, caller);
  }

  @Override
  public void cut(long nativeWebContentsAndroid, WebContentsImpl caller) {
    N.MhIiCaN7(nativeWebContentsAndroid, caller);
  }

  @Override
  public void copy(long nativeWebContentsAndroid, WebContentsImpl caller) {
    N.MpfMxfut(nativeWebContentsAndroid, caller);
  }

  @Override
  public void paste(long nativeWebContentsAndroid, WebContentsImpl caller) {
    N.MYRJ_nNk(nativeWebContentsAndroid, caller);
  }

  @Override
  public void pasteAsPlainText(long nativeWebContentsAndroid, WebContentsImpl caller) {
    N.MdSkKRWg(nativeWebContentsAndroid, caller);
  }

  @Override
  public void replace(long nativeWebContentsAndroid, WebContentsImpl caller, String word) {
    N.MevqfbP8(nativeWebContentsAndroid, caller, word);
  }

  @Override
  public void selectAll(long nativeWebContentsAndroid, WebContentsImpl caller) {
    N.MNvj1u1S(nativeWebContentsAndroid, caller);
  }

  @Override
  public void collapseSelection(long nativeWebContentsAndroid, WebContentsImpl caller) {
    N.MDK_KK0z(nativeWebContentsAndroid, caller);
  }

  @Override
  public void onHide(long nativeWebContentsAndroid, WebContentsImpl caller) {
    N.MHNkuuGQ(nativeWebContentsAndroid, caller);
  }

  @Override
  public void onShow(long nativeWebContentsAndroid, WebContentsImpl caller) {
    N.MtakfqIH(nativeWebContentsAndroid, caller);
  }

  @Override
  public void setImportance(long nativeWebContentsAndroid, WebContentsImpl caller, int importance) {
    N.MkBVGSRs(nativeWebContentsAndroid, caller, importance);
  }

  @Override
  public void suspendAllMediaPlayers(long nativeWebContentsAndroid, WebContentsImpl caller) {
    N.MSOsA4Ii(nativeWebContentsAndroid, caller);
  }

  @Override
  public void setAudioMuted(long nativeWebContentsAndroid, WebContentsImpl caller, boolean mute) {
    N.M4fkbrQM(nativeWebContentsAndroid, caller, mute);
  }

  @Override
  public boolean isShowingInterstitialPage(long nativeWebContentsAndroid, WebContentsImpl caller) {
    return (boolean)N.MPePqASo(nativeWebContentsAndroid, caller);
  }

  @Override
  public boolean focusLocationBarByDefault(long nativeWebContentsAndroid, WebContentsImpl caller) {
    return (boolean)N.MkIL2bW9(nativeWebContentsAndroid, caller);
  }

  @Override
  public void exitFullscreen(long nativeWebContentsAndroid, WebContentsImpl caller) {
    N.M6c69Eq5(nativeWebContentsAndroid, caller);
  }

  @Override
  public void scrollFocusedEditableNodeIntoView(long nativeWebContentsAndroid,
      WebContentsImpl caller) {
    N.MgbVQff0(nativeWebContentsAndroid, caller);
  }

  @Override
  public void selectWordAroundCaret(long nativeWebContentsAndroid, WebContentsImpl caller) {
    N.MlfwWHGJ(nativeWebContentsAndroid, caller);
  }

  @Override
  public void adjustSelectionByCharacterOffset(long nativeWebContentsAndroid,
      WebContentsImpl caller, int startAdjust, int endAdjust, boolean showSelectionMenu) {
    N.MjgOFo_o(nativeWebContentsAndroid, caller, startAdjust, endAdjust, showSelectionMenu);
  }

  @Override
  public String getLastCommittedURL(long nativeWebContentsAndroid, WebContentsImpl caller) {
    return (String)N.MrqMRJsG(nativeWebContentsAndroid, caller);
  }

  @Override
  public boolean isIncognito(long nativeWebContentsAndroid, WebContentsImpl caller) {
    return (boolean)N.MZbfAARG(nativeWebContentsAndroid, caller);
  }

  @Override
  public void resumeLoadingCreatedWebContents(long nativeWebContentsAndroid,
      WebContentsImpl caller) {
    N.MQnLkNkP(nativeWebContentsAndroid, caller);
  }

  @Override
  public void evaluateJavaScript(long nativeWebContentsAndroid, WebContentsImpl caller,
      String script, JavaScriptCallback callback) {
    N.M0uS2SDH(nativeWebContentsAndroid, caller, script, callback);
  }

  @Override
  public void evaluateJavaScriptForTests(long nativeWebContentsAndroid, WebContentsImpl caller,
      String script, JavaScriptCallback callback) {
    N.MPoHZQTR(nativeWebContentsAndroid, caller, script, callback);
  }

  @Override
  public void addMessageToDevToolsConsole(long nativeWebContentsAndroid, WebContentsImpl caller,
      int level, String message) {
    N.MseJ7A4a(nativeWebContentsAndroid, caller, level, message);
  }

  @Override
  public void postMessageToMainFrame(long nativeWebContentsAndroid, WebContentsImpl caller,
      String message, String sourceOrigin, String targetOrigin, MessagePort[] ports) {
    N.MZFXk0el(nativeWebContentsAndroid, caller, message, sourceOrigin, targetOrigin, ports);
  }

  @Override
  public boolean hasAccessedInitialDocument(long nativeWebContentsAndroid, WebContentsImpl caller) {
    return (boolean)N.M6It8dra(nativeWebContentsAndroid, caller);
  }

  @Override
  public int getThemeColor(long nativeWebContentsAndroid, WebContentsImpl caller) {
    return (int)N.MGZCJ6jO(nativeWebContentsAndroid, caller);
  }

  @Override
  public float getLoadProgress(long nativeWebContentsAndroid, WebContentsImpl caller) {
    return (float)N.MoQgY_pw(nativeWebContentsAndroid, caller);
  }

  @Override
  public void requestSmartClipExtract(long nativeWebContentsAndroid, WebContentsImpl caller,
      WebContentsImpl.SmartClipCallback callback, int x, int y, int width, int height) {
    N.MHF1rPTW(nativeWebContentsAndroid, caller, callback, x, y, width, height);
  }

  @Override
  public void requestAccessibilitySnapshot(long nativeWebContentsAndroid, WebContentsImpl caller,
      AccessibilitySnapshotCallback callback) {
    N.M16eLpU9(nativeWebContentsAndroid, caller, callback);
  }

  @Override
  public void setOverscrollRefreshHandler(long nativeWebContentsAndroid, WebContentsImpl caller,
      OverscrollRefreshHandler nativeOverscrollRefreshHandler) {
    N.MTTB8znA(nativeWebContentsAndroid, caller, nativeOverscrollRefreshHandler);
  }

  @Override
  public void setSpatialNavigationDisabled(long nativeWebContentsAndroid, WebContentsImpl caller,
      boolean disabled) {
    N.MjBPqNgx(nativeWebContentsAndroid, caller, disabled);
  }

  @Override
  public int downloadImage(long nativeWebContentsAndroid, WebContentsImpl caller, String url,
      boolean isFavicon, int maxBitmapSize, boolean bypassCache, ImageDownloadCallback callback) {
    return (int)N.Mi3V1mlO(nativeWebContentsAndroid, caller, url, isFavicon, maxBitmapSize, bypassCache, callback);
  }

  @Override
  public void setHasPersistentVideo(long nativeWebContentsAndroid, WebContentsImpl caller,
      boolean value) {
    N.M12SiBFk(nativeWebContentsAndroid, caller, value);
  }

  @Override
  public boolean hasActiveEffectivelyFullscreenVideo(long nativeWebContentsAndroid,
      WebContentsImpl caller) {
    return (boolean)N.MZao1OQG(nativeWebContentsAndroid, caller);
  }

  @Override
  public boolean isPictureInPictureAllowedForFullscreenVideo(long nativeWebContentsAndroid,
      WebContentsImpl caller) {
    return (boolean)N.MS0xMYL9(nativeWebContentsAndroid, caller);
  }

  @Override
  public Rect getFullscreenVideoSize(long nativeWebContentsAndroid, WebContentsImpl caller) {
    return (Rect)N.MN9JdEk5(nativeWebContentsAndroid, caller);
  }

  @Override
  public void setSize(long nativeWebContentsAndroid, WebContentsImpl caller, int width,
      int height) {
    N.M7tTrJ_X(nativeWebContentsAndroid, caller, width, height);
  }

  @Override
  public int getWidth(long nativeWebContentsAndroid, WebContentsImpl caller) {
    return (int)N.MB0i5_ri(nativeWebContentsAndroid, caller);
  }

  @Override
  public int getHeight(long nativeWebContentsAndroid, WebContentsImpl caller) {
    return (int)N.MRVeP4Wk(nativeWebContentsAndroid, caller);
  }

  @Override
  public EventForwarder getOrCreateEventForwarder(long nativeWebContentsAndroid,
      WebContentsImpl caller) {
    return (EventForwarder)N.MJJFrmZs(nativeWebContentsAndroid, caller);
  }

  @Override
  public void setViewAndroidDelegate(long nativeWebContentsAndroid, WebContentsImpl caller,
      ViewAndroidDelegate viewDelegate) {
    N.MgyWdCWB(nativeWebContentsAndroid, caller, viewDelegate);
  }

  @Override
  public void sendOrientationChangeEvent(long nativeWebContentsAndroid, WebContentsImpl caller,
      int orientation) {
    N.MlztHl3v(nativeWebContentsAndroid, caller, orientation);
  }

  @Override
  public void onScaleFactorChanged(long nativeWebContentsAndroid, WebContentsImpl caller) {
    N.MqhGkzSt(nativeWebContentsAndroid, caller);
  }

  @Override
  public void setFocus(long nativeWebContentsAndroid, WebContentsImpl caller, boolean focused) {
    N.M9QxNoTJ(nativeWebContentsAndroid, caller, focused);
  }

  @Override
  public void setDisplayCutoutSafeArea(long nativeWebContentsAndroid, WebContentsImpl caller,
      int top, int left, int bottom, int right) {
    N.MtjP03pj(nativeWebContentsAndroid, caller, top, left, bottom, right);
  }

  @Override
  public void notifyRendererPreferenceUpdate(long nativeWebContentsAndroid,
      WebContentsImpl caller) {
    N.Mzsx8Sk2(nativeWebContentsAndroid, caller);
  }

  @Override
  public void notifyBrowserControlsHeightChanged(long nativeWebContentsAndroid,
      WebContentsImpl caller) {
    N.MgcGzQax(nativeWebContentsAndroid, caller);
  }

  @Override
  public boolean isBeingDestroyed(long nativeWebContentsAndroid, WebContentsImpl caller) {
    return (boolean)N.M5A4vDoy(nativeWebContentsAndroid, caller);
  }

  public static WebContentsImpl.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.webcontents.WebContentsImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new WebContentsImplJni();
  }
}
