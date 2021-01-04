package org.chromium.android_webview;

import J.N;
import android.graphics.Canvas;
import android.os.Message;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.components.autofill.AutofillProvider;
import org.chromium.components.navigation_interception.InterceptNavigationDelegate;
import org.chromium.content_public.browser.JavaScriptCallback;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AwContentsJni implements AwContents.Natives {
  private static AwContents.Natives testInstance;

  public static final JniStaticTestMocker<AwContents.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.AwContents.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.android_webview.AwContents.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(long browserContextPointer) {
    return (long)N.MFiR_zHY(browserContextPointer);
  }

  @Override
  public void destroy(long nativeAwContents) {
    N.MQGusfGb(nativeAwContents);
  }

  @Override
  public boolean hasRequiredHardwareExtensions() {
    return (boolean)N.MmfcaMzE();
  }

  @Override
  public void setAwDrawSWFunctionTable(long functionTablePointer) {
    N.M1aUwTSB(functionTablePointer);
  }

  @Override
  public void setAwDrawGLFunctionTable(long functionTablePointer) {
    N.MHELqQxx(functionTablePointer);
  }

  @Override
  public int getNativeInstanceCount() {
    return (int)N.MpyFb$bm();
  }

  @Override
  public void setShouldDownloadFavicons() {
    N.Mbm7UXr0();
  }

  @Override
  public void updateDefaultLocale(String locale, String localeList) {
    N.Mer1B1Jd(locale, localeList);
  }

  @Override
  public String getSafeBrowsingLocaleForTesting() {
    return (String)N.M8bzablT();
  }

  @Override
  public void evaluateJavaScriptOnInterstitialForTesting(long nativeAwContents, AwContents caller,
      String script, JavaScriptCallback jsCallback) {
    N.MpysRKyN(nativeAwContents, caller, script, jsCallback);
  }

  @Override
  public void setJavaPeers(long nativeAwContents, AwContents caller, AwContents awContents,
      AwWebContentsDelegate webViewWebContentsDelegate, AwContentsClientBridge contentsClientBridge,
      AwContentsIoThreadClient ioThreadClient,
      InterceptNavigationDelegate navigationInterceptionDelegate,
      AutofillProvider autofillProvider) {
    N.MaOp$2xn(nativeAwContents, caller, awContents, webViewWebContentsDelegate, contentsClientBridge, ioThreadClient, navigationInterceptionDelegate, autofillProvider);
  }

  @Override
  public WebContents getWebContents(long nativeAwContents, AwContents caller) {
    return (WebContents)N.MybAxcKt(nativeAwContents, caller);
  }

  @Override
  public AwBrowserContext getBrowserContext(long nativeAwContents, AwContents caller) {
    return (AwBrowserContext)N.Mg88vWvb(nativeAwContents, caller);
  }

  @Override
  public void setCompositorFrameConsumer(long nativeAwContents, AwContents caller,
      long nativeCompositorFrameConsumer) {
    N.MzAVKSgA(nativeAwContents, caller, nativeCompositorFrameConsumer);
  }

  @Override
  public void documentHasImages(long nativeAwContents, AwContents caller, Message message) {
    N.M74pgHWN(nativeAwContents, caller, message);
  }

  @Override
  public void generateMHTML(long nativeAwContents, AwContents caller, String path,
      Callback<String> callback) {
    N.MfwgZRb_(nativeAwContents, caller, path, callback);
  }

  @Override
  public void addVisitedLinks(long nativeAwContents, AwContents caller, String[] visitedLinks) {
    N.MGEWt61o(nativeAwContents, caller, visitedLinks);
  }

  @Override
  public void zoomBy(long nativeAwContents, AwContents caller, float delta) {
    N.MuRWIe$h(nativeAwContents, caller, delta);
  }

  @Override
  public void onComputeScroll(long nativeAwContents, AwContents caller,
      long currentAnimationTimeMillis) {
    N.MkR1ETvU(nativeAwContents, caller, currentAnimationTimeMillis);
  }

  @Override
  public boolean onDraw(long nativeAwContents, AwContents caller, Canvas canvas,
      boolean isHardwareAccelerated, int scrollX, int scrollY, int visibleLeft, int visibleTop,
      int visibleRight, int visibleBottom, boolean forceAuxiliaryBitmapRendering) {
    return (boolean)N.MTXp4fn_(nativeAwContents, caller, canvas, isHardwareAccelerated, scrollX, scrollY, visibleLeft, visibleTop, visibleRight, visibleBottom, forceAuxiliaryBitmapRendering);
  }

  @Override
  public boolean needToDrawBackgroundColor(long nativeAwContents, AwContents caller) {
    return (boolean)N.Mcwwaem4(nativeAwContents, caller);
  }

  @Override
  public void findAllAsync(long nativeAwContents, AwContents caller, String searchString) {
    N.MkkpS1L9(nativeAwContents, caller, searchString);
  }

  @Override
  public void findNext(long nativeAwContents, AwContents caller, boolean forward) {
    N.M21lr0OA(nativeAwContents, caller, forward);
  }

  @Override
  public void clearMatches(long nativeAwContents, AwContents caller) {
    N.MFtcGkhm(nativeAwContents, caller);
  }

  @Override
  public void clearCache(long nativeAwContents, AwContents caller, boolean includeDiskFiles) {
    N.MhT$Vsgm(nativeAwContents, caller, includeDiskFiles);
  }

  @Override
  public void killRenderProcess(long nativeAwContents, AwContents caller) {
    N.M6HE38c5(nativeAwContents, caller);
  }

  @Override
  public byte[] getCertificate(long nativeAwContents, AwContents caller) {
    return (byte[])N.MJl6bbdC(nativeAwContents, caller);
  }

  @Override
  public void requestNewHitTestDataAt(long nativeAwContents, AwContents caller, float x, float y,
      float touchMajor) {
    N.MbVTYFDu(nativeAwContents, caller, x, y, touchMajor);
  }

  @Override
  public void updateLastHitTestData(long nativeAwContents, AwContents caller) {
    N.MHBuiDmd(nativeAwContents, caller);
  }

  @Override
  public void onSizeChanged(long nativeAwContents, AwContents caller, int w, int h, int ow,
      int oh) {
    N.MNxSIAOu(nativeAwContents, caller, w, h, ow, oh);
  }

  @Override
  public void scrollTo(long nativeAwContents, AwContents caller, int x, int y) {
    N.Mnc0PDKE(nativeAwContents, caller, x, y);
  }

  @Override
  public void restoreScrollAfterTransition(long nativeAwContents, AwContents caller, int x, int y) {
    N.MFKs48sP(nativeAwContents, caller, x, y);
  }

  @Override
  public void smoothScroll(long nativeAwContents, AwContents caller, int targetX, int targetY,
      long durationMs) {
    N.MgUWjwjs(nativeAwContents, caller, targetX, targetY, durationMs);
  }

  @Override
  public void setViewVisibility(long nativeAwContents, AwContents caller, boolean visible) {
    N.MJqblGS2(nativeAwContents, caller, visible);
  }

  @Override
  public void setWindowVisibility(long nativeAwContents, AwContents caller, boolean visible) {
    N.MkfSbdDV(nativeAwContents, caller, visible);
  }

  @Override
  public void setIsPaused(long nativeAwContents, AwContents caller, boolean paused) {
    N.M11ykFVM(nativeAwContents, caller, paused);
  }

  @Override
  public void onAttachedToWindow(long nativeAwContents, AwContents caller, int w, int h) {
    N.MtQhJq6u(nativeAwContents, caller, w, h);
  }

  @Override
  public void onDetachedFromWindow(long nativeAwContents, AwContents caller) {
    N.MqVX7tnS(nativeAwContents, caller);
  }

  @Override
  public boolean isVisible(long nativeAwContents, AwContents caller) {
    return (boolean)N.M5$3H1S$(nativeAwContents, caller);
  }

  @Override
  public boolean isDisplayingInterstitialForTesting(long nativeAwContents, AwContents caller) {
    return (boolean)N.MYvj_j$8(nativeAwContents, caller);
  }

  @Override
  public void setDipScale(long nativeAwContents, AwContents caller, float dipScale) {
    N.MYYge55A(nativeAwContents, caller, dipScale);
  }

  @Override
  public void onInputEvent(long nativeAwContents, AwContents caller) {
    N.MQn4UPnT(nativeAwContents, caller);
  }

  @Override
  public byte[] getOpaqueState(long nativeAwContents, AwContents caller) {
    return (byte[])N.MtUUIkJC(nativeAwContents, caller);
  }

  @Override
  public boolean restoreFromOpaqueState(long nativeAwContents, AwContents caller, byte[] state) {
    return (boolean)N.M$ugXLRy(nativeAwContents, caller, state);
  }

  @Override
  public long releasePopupAwContents(long nativeAwContents, AwContents caller) {
    return (long)N.MOttaOmZ(nativeAwContents, caller);
  }

  @Override
  public void focusFirstNode(long nativeAwContents, AwContents caller) {
    N.MunvchpP(nativeAwContents, caller);
  }

  @Override
  public void setBackgroundColor(long nativeAwContents, AwContents caller, int color) {
    N.MLVoXr_n(nativeAwContents, caller, color);
  }

  @Override
  public long capturePicture(long nativeAwContents, AwContents caller, int width, int height) {
    return (long)N.MpPu_UgV(nativeAwContents, caller, width, height);
  }

  @Override
  public void enableOnNewPicture(long nativeAwContents, AwContents caller, boolean enabled) {
    N.MjvLhcRF(nativeAwContents, caller, enabled);
  }

  @Override
  public void insertVisualStateCallback(long nativeAwContents, AwContents caller, long requestId,
      AwContents.VisualStateCallback callback) {
    N.ME4bwr8X(nativeAwContents, caller, requestId, callback);
  }

  @Override
  public void clearView(long nativeAwContents, AwContents caller) {
    N.MsURZ4Xi(nativeAwContents, caller);
  }

  @Override
  public void setExtraHeadersForUrl(long nativeAwContents, AwContents caller, String url,
      String extraHeaders) {
    N.Me4$sHFE(nativeAwContents, caller, url, extraHeaders);
  }

  @Override
  public void invokeGeolocationCallback(long nativeAwContents, AwContents caller, boolean value,
      String requestingFrame) {
    N.M0cKB_Do(nativeAwContents, caller, value, requestingFrame);
  }

  @Override
  public int getEffectivePriority(long nativeAwContents, AwContents caller) {
    return (int)N.MmkSmonh(nativeAwContents, caller);
  }

  @Override
  public void setJsOnlineProperty(long nativeAwContents, AwContents caller, boolean networkUp) {
    N.MSO7DbfT(nativeAwContents, caller, networkUp);
  }

  @Override
  public void trimMemory(long nativeAwContents, AwContents caller, int level, boolean visible) {
    N.MxV2T4AB(nativeAwContents, caller, level, visible);
  }

  @Override
  public void createPdfExporter(long nativeAwContents, AwContents caller,
      AwPdfExporter awPdfExporter) {
    N.MND9REwd(nativeAwContents, caller, awPdfExporter);
  }

  @Override
  public void preauthorizePermission(long nativeAwContents, AwContents caller, String origin,
      long resources) {
    N.MZm6NYk2(nativeAwContents, caller, origin, resources);
  }

  @Override
  public void grantFileSchemeAccesstoChildProcess(long nativeAwContents, AwContents caller) {
    N.Mt543z$z(nativeAwContents, caller);
  }

  @Override
  public void resumeLoadingCreatedPopupWebContents(long nativeAwContents, AwContents caller) {
    N.MlAm1rvf(nativeAwContents, caller);
  }

  @Override
  public AwRenderProcess getRenderProcess(long nativeAwContents, AwContents caller) {
    return (AwRenderProcess)N.Mj2HEglc(nativeAwContents, caller);
  }

  @Override
  public String addWebMessageListener(long nativeAwContents, AwContents caller,
      WebMessageListenerHolder listener, String jsObjectName, String[] allowedOrigins) {
    return (String)N.MxPw2eDG(nativeAwContents, caller, listener, jsObjectName, allowedOrigins);
  }

  @Override
  public void removeWebMessageListener(long nativeAwContents, AwContents caller,
      String jsObjectName) {
    N.MJJ_9Fzq(nativeAwContents, caller, jsObjectName);
  }

  public static AwContents.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.AwContents.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwContentsJni();
  }
}
