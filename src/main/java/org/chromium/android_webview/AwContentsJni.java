package org.chromium.android_webview;

import android.graphics.Canvas;
import android.os.Message;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.navigation_interception.InterceptNavigationDelegate;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class AwContentsJni implements AwContents.Natives {
  private static AwContents.Natives testInstance;

  public static final JniStaticTestMocker<AwContents.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.AwContents.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.android_webview.AwContents.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(long browserContextPointer) {
    return (long)GEN_JNI.org_chromium_android_1webview_AwContents_init(browserContextPointer);
  }

  @Override
  public void destroy(long nativeAwContents) {
    GEN_JNI.org_chromium_android_1webview_AwContents_destroy(nativeAwContents);
  }

  @Override
  public boolean hasRequiredHardwareExtensions() {
    return (boolean)GEN_JNI.org_chromium_android_1webview_AwContents_hasRequiredHardwareExtensions();
  }

  @Override
  public void setAwDrawSWFunctionTable(long functionTablePointer) {
    GEN_JNI.org_chromium_android_1webview_AwContents_setAwDrawSWFunctionTable(functionTablePointer);
  }

  @Override
  public void setAwDrawGLFunctionTable(long functionTablePointer) {
    GEN_JNI.org_chromium_android_1webview_AwContents_setAwDrawGLFunctionTable(functionTablePointer);
  }

  @Override
  public int getNativeInstanceCount() {
    return (int)GEN_JNI.org_chromium_android_1webview_AwContents_getNativeInstanceCount();
  }

  @Override
  public void setShouldDownloadFavicons() {
    GEN_JNI.org_chromium_android_1webview_AwContents_setShouldDownloadFavicons();
  }

  @Override
  public void updateDefaultLocale(String locale, String localeList) {
    GEN_JNI.org_chromium_android_1webview_AwContents_updateDefaultLocale(locale, localeList);
  }

  @Override
  public String getSafeBrowsingLocaleForTesting() {
    return (String)GEN_JNI.org_chromium_android_1webview_AwContents_getSafeBrowsingLocaleForTesting();
  }

  @Override
  public void setJavaPeers(long nativeAwContents, AwContents caller, AwContents awContents,
      AwWebContentsDelegate webViewWebContentsDelegate, AwContentsClientBridge contentsClientBridge,
      AwContentsIoThreadClient ioThreadClient,
      InterceptNavigationDelegate navigationInterceptionDelegate) {
    GEN_JNI.org_chromium_android_1webview_AwContents_setJavaPeers(nativeAwContents, caller, awContents, webViewWebContentsDelegate, contentsClientBridge, ioThreadClient, navigationInterceptionDelegate);
  }

  @Override
  public void initializeAndroidAutofill(long nativeAwContents) {
    GEN_JNI.org_chromium_android_1webview_AwContents_initializeAndroidAutofill(nativeAwContents);
  }

  @Override
  public WebContents getWebContents(long nativeAwContents, AwContents caller) {
    return (WebContents)GEN_JNI.org_chromium_android_1webview_AwContents_getWebContents(nativeAwContents, caller);
  }

  @Override
  public AwBrowserContext getBrowserContext(long nativeAwContents, AwContents caller) {
    return (AwBrowserContext)GEN_JNI.org_chromium_android_1webview_AwContents_getBrowserContext(nativeAwContents, caller);
  }

  @Override
  public void setCompositorFrameConsumer(long nativeAwContents, AwContents caller,
      long nativeCompositorFrameConsumer) {
    GEN_JNI.org_chromium_android_1webview_AwContents_setCompositorFrameConsumer(nativeAwContents, caller, nativeCompositorFrameConsumer);
  }

  @Override
  public void documentHasImages(long nativeAwContents, AwContents caller, Message message) {
    GEN_JNI.org_chromium_android_1webview_AwContents_documentHasImages(nativeAwContents, caller, message);
  }

  @Override
  public void generateMHTML(long nativeAwContents, AwContents caller, String path,
      Callback<String> callback) {
    GEN_JNI.org_chromium_android_1webview_AwContents_generateMHTML(nativeAwContents, caller, path, callback);
  }

  @Override
  public void addVisitedLinks(long nativeAwContents, AwContents caller, String[] visitedLinks) {
    GEN_JNI.org_chromium_android_1webview_AwContents_addVisitedLinks(nativeAwContents, caller, visitedLinks);
  }

  @Override
  public void zoomBy(long nativeAwContents, AwContents caller, float delta) {
    GEN_JNI.org_chromium_android_1webview_AwContents_zoomBy(nativeAwContents, caller, delta);
  }

  @Override
  public void onComputeScroll(long nativeAwContents, AwContents caller,
      long currentAnimationTimeMillis) {
    GEN_JNI.org_chromium_android_1webview_AwContents_onComputeScroll(nativeAwContents, caller, currentAnimationTimeMillis);
  }

  @Override
  public boolean onDraw(long nativeAwContents, AwContents caller, Canvas canvas,
      boolean isHardwareAccelerated, int scrollX, int scrollY, int visibleLeft, int visibleTop,
      int visibleRight, int visibleBottom, boolean forceAuxiliaryBitmapRendering) {
    return (boolean)GEN_JNI.org_chromium_android_1webview_AwContents_onDraw(nativeAwContents, caller, canvas, isHardwareAccelerated, scrollX, scrollY, visibleLeft, visibleTop, visibleRight, visibleBottom, forceAuxiliaryBitmapRendering);
  }

  @Override
  public boolean needToDrawBackgroundColor(long nativeAwContents, AwContents caller) {
    return (boolean)GEN_JNI.org_chromium_android_1webview_AwContents_needToDrawBackgroundColor(nativeAwContents, caller);
  }

  @Override
  public void findAllAsync(long nativeAwContents, AwContents caller, String searchString) {
    GEN_JNI.org_chromium_android_1webview_AwContents_findAllAsync(nativeAwContents, caller, searchString);
  }

  @Override
  public void findNext(long nativeAwContents, AwContents caller, boolean forward) {
    GEN_JNI.org_chromium_android_1webview_AwContents_findNext(nativeAwContents, caller, forward);
  }

  @Override
  public void clearMatches(long nativeAwContents, AwContents caller) {
    GEN_JNI.org_chromium_android_1webview_AwContents_clearMatches(nativeAwContents, caller);
  }

  @Override
  public void clearCache(long nativeAwContents, AwContents caller, boolean includeDiskFiles) {
    GEN_JNI.org_chromium_android_1webview_AwContents_clearCache(nativeAwContents, caller, includeDiskFiles);
  }

  @Override
  public byte[] getCertificate(long nativeAwContents, AwContents caller) {
    return (byte[])GEN_JNI.org_chromium_android_1webview_AwContents_getCertificate(nativeAwContents, caller);
  }

  @Override
  public void requestNewHitTestDataAt(long nativeAwContents, AwContents caller, float x, float y,
      float touchMajor) {
    GEN_JNI.org_chromium_android_1webview_AwContents_requestNewHitTestDataAt(nativeAwContents, caller, x, y, touchMajor);
  }

  @Override
  public void updateLastHitTestData(long nativeAwContents, AwContents caller) {
    GEN_JNI.org_chromium_android_1webview_AwContents_updateLastHitTestData(nativeAwContents, caller);
  }

  @Override
  public void onSizeChanged(long nativeAwContents, AwContents caller, int w, int h, int ow,
      int oh) {
    GEN_JNI.org_chromium_android_1webview_AwContents_onSizeChanged(nativeAwContents, caller, w, h, ow, oh);
  }

  @Override
  public void scrollTo(long nativeAwContents, AwContents caller, int x, int y) {
    GEN_JNI.org_chromium_android_1webview_AwContents_scrollTo(nativeAwContents, caller, x, y);
  }

  @Override
  public void restoreScrollAfterTransition(long nativeAwContents, AwContents caller, int x, int y) {
    GEN_JNI.org_chromium_android_1webview_AwContents_restoreScrollAfterTransition(nativeAwContents, caller, x, y);
  }

  @Override
  public void smoothScroll(long nativeAwContents, AwContents caller, int targetX, int targetY,
      long durationMs) {
    GEN_JNI.org_chromium_android_1webview_AwContents_smoothScroll(nativeAwContents, caller, targetX, targetY, durationMs);
  }

  @Override
  public void setViewVisibility(long nativeAwContents, AwContents caller, boolean visible) {
    GEN_JNI.org_chromium_android_1webview_AwContents_setViewVisibility(nativeAwContents, caller, visible);
  }

  @Override
  public void setWindowVisibility(long nativeAwContents, AwContents caller, boolean visible) {
    GEN_JNI.org_chromium_android_1webview_AwContents_setWindowVisibility(nativeAwContents, caller, visible);
  }

  @Override
  public void setIsPaused(long nativeAwContents, AwContents caller, boolean paused) {
    GEN_JNI.org_chromium_android_1webview_AwContents_setIsPaused(nativeAwContents, caller, paused);
  }

  @Override
  public void onAttachedToWindow(long nativeAwContents, AwContents caller, int w, int h) {
    GEN_JNI.org_chromium_android_1webview_AwContents_onAttachedToWindow(nativeAwContents, caller, w, h);
  }

  @Override
  public void onDetachedFromWindow(long nativeAwContents, AwContents caller) {
    GEN_JNI.org_chromium_android_1webview_AwContents_onDetachedFromWindow(nativeAwContents, caller);
  }

  @Override
  public boolean isVisible(long nativeAwContents, AwContents caller) {
    return (boolean)GEN_JNI.org_chromium_android_1webview_AwContents_isVisible(nativeAwContents, caller);
  }

  @Override
  public boolean isDisplayingInterstitialForTesting(long nativeAwContents, AwContents caller) {
    return (boolean)GEN_JNI.org_chromium_android_1webview_AwContents_isDisplayingInterstitialForTesting(nativeAwContents, caller);
  }

  @Override
  public void setDipScale(long nativeAwContents, AwContents caller, float dipScale) {
    GEN_JNI.org_chromium_android_1webview_AwContents_setDipScale(nativeAwContents, caller, dipScale);
  }

  @Override
  public boolean isDisplayingOpenWebContent(long nativeAwContents, AwContents caller) {
    return (boolean)GEN_JNI.org_chromium_android_1webview_AwContents_isDisplayingOpenWebContent(nativeAwContents, caller);
  }

  @Override
  public void updateOpenWebScreenArea(int pixels, int percentage) {
    GEN_JNI.org_chromium_android_1webview_AwContents_updateOpenWebScreenArea(pixels, percentage);
  }

  @Override
  public void onInputEvent(long nativeAwContents, AwContents caller) {
    GEN_JNI.org_chromium_android_1webview_AwContents_onInputEvent(nativeAwContents, caller);
  }

  @Override
  public byte[] getOpaqueState(long nativeAwContents, AwContents caller) {
    return (byte[])GEN_JNI.org_chromium_android_1webview_AwContents_getOpaqueState(nativeAwContents, caller);
  }

  @Override
  public boolean restoreFromOpaqueState(long nativeAwContents, AwContents caller, byte[] state) {
    return (boolean)GEN_JNI.org_chromium_android_1webview_AwContents_restoreFromOpaqueState(nativeAwContents, caller, state);
  }

  @Override
  public long releasePopupAwContents(long nativeAwContents, AwContents caller) {
    return (long)GEN_JNI.org_chromium_android_1webview_AwContents_releasePopupAwContents(nativeAwContents, caller);
  }

  @Override
  public void focusFirstNode(long nativeAwContents, AwContents caller) {
    GEN_JNI.org_chromium_android_1webview_AwContents_focusFirstNode(nativeAwContents, caller);
  }

  @Override
  public void setBackgroundColor(long nativeAwContents, AwContents caller, int color) {
    GEN_JNI.org_chromium_android_1webview_AwContents_setBackgroundColor(nativeAwContents, caller, color);
  }

  @Override
  public long capturePicture(long nativeAwContents, AwContents caller, int width, int height) {
    return (long)GEN_JNI.org_chromium_android_1webview_AwContents_capturePicture(nativeAwContents, caller, width, height);
  }

  @Override
  public void enableOnNewPicture(long nativeAwContents, AwContents caller, boolean enabled) {
    GEN_JNI.org_chromium_android_1webview_AwContents_enableOnNewPicture(nativeAwContents, caller, enabled);
  }

  @Override
  public void insertVisualStateCallback(long nativeAwContents, AwContents caller, long requestId,
      AwContents.VisualStateCallback callback) {
    GEN_JNI.org_chromium_android_1webview_AwContents_insertVisualStateCallback(nativeAwContents, caller, requestId, callback);
  }

  @Override
  public void clearView(long nativeAwContents, AwContents caller) {
    GEN_JNI.org_chromium_android_1webview_AwContents_clearView(nativeAwContents, caller);
  }

  @Override
  public void setExtraHeadersForUrl(long nativeAwContents, AwContents caller, String url,
      String extraHeaders) {
    GEN_JNI.org_chromium_android_1webview_AwContents_setExtraHeadersForUrl(nativeAwContents, caller, url, extraHeaders);
  }

  @Override
  public void invokeGeolocationCallback(long nativeAwContents, AwContents caller, boolean value,
      String requestingFrame) {
    GEN_JNI.org_chromium_android_1webview_AwContents_invokeGeolocationCallback(nativeAwContents, caller, value, requestingFrame);
  }

  @Override
  public int getEffectivePriority(long nativeAwContents, AwContents caller) {
    return (int)GEN_JNI.org_chromium_android_1webview_AwContents_getEffectivePriority(nativeAwContents, caller);
  }

  @Override
  public void setJsOnlineProperty(long nativeAwContents, AwContents caller, boolean networkUp) {
    GEN_JNI.org_chromium_android_1webview_AwContents_setJsOnlineProperty(nativeAwContents, caller, networkUp);
  }

  @Override
  public void trimMemory(long nativeAwContents, AwContents caller, int level, boolean visible) {
    GEN_JNI.org_chromium_android_1webview_AwContents_trimMemory(nativeAwContents, caller, level, visible);
  }

  @Override
  public void createPdfExporter(long nativeAwContents, AwContents caller,
      AwPdfExporter awPdfExporter) {
    GEN_JNI.org_chromium_android_1webview_AwContents_createPdfExporter(nativeAwContents, caller, awPdfExporter);
  }

  @Override
  public void preauthorizePermission(long nativeAwContents, AwContents caller, String origin,
      long resources) {
    GEN_JNI.org_chromium_android_1webview_AwContents_preauthorizePermission(nativeAwContents, caller, origin, resources);
  }

  @Override
  public void grantFileSchemeAccesstoChildProcess(long nativeAwContents, AwContents caller) {
    GEN_JNI.org_chromium_android_1webview_AwContents_grantFileSchemeAccesstoChildProcess(nativeAwContents, caller);
  }

  @Override
  public void resumeLoadingCreatedPopupWebContents(long nativeAwContents, AwContents caller) {
    GEN_JNI.org_chromium_android_1webview_AwContents_resumeLoadingCreatedPopupWebContents(nativeAwContents, caller);
  }

  @Override
  public AwRenderProcess getRenderProcess(long nativeAwContents, AwContents caller) {
    return (AwRenderProcess)GEN_JNI.org_chromium_android_1webview_AwContents_getRenderProcess(nativeAwContents, caller);
  }

  @Override
  public int addDocumentStartJavaScript(long nativeAwContents, AwContents caller, String script,
      String[] allowedOriginRules) {
    return (int)GEN_JNI.org_chromium_android_1webview_AwContents_addDocumentStartJavaScript(nativeAwContents, caller, script, allowedOriginRules);
  }

  @Override
  public void removeDocumentStartJavaScript(long nativeAwContents, AwContents caller,
      int scriptId) {
    GEN_JNI.org_chromium_android_1webview_AwContents_removeDocumentStartJavaScript(nativeAwContents, caller, scriptId);
  }

  @Override
  public String addWebMessageListener(long nativeAwContents, AwContents caller,
      WebMessageListenerHolder listener, String jsObjectName, String[] allowedOrigins) {
    return (String)GEN_JNI.org_chromium_android_1webview_AwContents_addWebMessageListener(nativeAwContents, caller, listener, jsObjectName, allowedOrigins);
  }

  @Override
  public void removeWebMessageListener(long nativeAwContents, AwContents caller,
      String jsObjectName) {
    GEN_JNI.org_chromium_android_1webview_AwContents_removeWebMessageListener(nativeAwContents, caller, jsObjectName);
  }

  @Override
  public WebMessageListenerInfo[] getJsObjectsInfo(long nativeAwContents, AwContents caller,
      Class clazz) {
    return (WebMessageListenerInfo[])GEN_JNI.org_chromium_android_1webview_AwContents_getJsObjectsInfo(nativeAwContents, caller, clazz);
  }

  public static AwContents.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.AwContents.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwContentsJni();
  }
}
