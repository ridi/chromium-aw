package com.ridi.awdemo

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.graphics.Canvas
import android.graphics.Rect
import android.os.Bundle
import android.util.Size
import android.view.accessibility.AccessibilityNodeProvider
import android.view.DragEvent
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputConnection
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.view.ViewStructure
import android.webkit.WebViewClient
import android.widget.FrameLayout
import org.chromium.android_webview.AwBrowserContext
import org.chromium.android_webview.AwBrowserProcess
import org.chromium.android_webview.AwContents
import org.chromium.android_webview.AwDevToolsServer
import org.chromium.android_webview.AwSettings
import org.chromium.android_webview.gfx.AwDrawFnImpl
import org.chromium.android_webview.shell.AwShellResourceProvider
import org.chromium.android_webview.test.NullContentsClient
import org.chromium.base.CommandLine
import org.chromium.base.ContextUtils

@SuppressLint("SetJavaScriptEnabled")
@Suppress("ViewConstructor")
class WebView(context: Context) : FrameLayout(context) {
    private val awContents: AwContents
    private var webViewClient: WebViewClient? = null

    var settings: AwSettings
        private set

    init {
        settings = AwSettings(context, true, false, false, false, false).apply {
            javaScriptEnabled = true
            domStorageEnabled = true
        }

        val sharedPreferences = context.getSharedPreferences(javaClass.simpleName, Context.MODE_PRIVATE)
        awContents = AwContents(
            AwBrowserContext(sharedPreferences, AwBrowserContext.getDefault().nativePointer, false),
            this, context, InternalAccessAdapter(), NativeDrawFunctorFactory(),
            object : NullContentsClient() {
                override fun onPageFinished(url: String) {
                    webViewClient?.onPageFinished(null, url)
                }
            }, settings
        )

        setLayerType(LAYER_TYPE_SOFTWARE, null)
    }

    @Suppress("unused")
    fun getSize() = Size(awContents.contentWidthCss, awContents.contentHeightCss)

    @Suppress("unused")
    fun setWebViewClient(webViewClient: WebViewClient?) {
        this.webViewClient = webViewClient
    }

    @Suppress("unused")
    fun addJavascriptInterface(`object`: Any, name: String) {
        awContents.addJavascriptInterface(`object`, name)
    }

    @Suppress("unused")
    fun removeJavascriptInterface(name: String) {
        awContents.removeJavascriptInterface(name)
    }

    @Suppress("unused")
    fun loadUrl(url: String) {
        awContents.loadUrl(url)
    }

    @Suppress("unused")
    fun loadUrl(url: String, additionalHttpHeaders: Map<String, String>) {
        awContents.loadUrl(url, additionalHttpHeaders)
    }

    @Suppress("unused")
    fun loadDataWithBaseURL(
        baseUrl: String?,
        data: String,
        mimeType: String?,
        encoding: String?,
        historyUrl: String?
    ) {
        awContents.loadDataWithBaseURL(baseUrl, data, mimeType, encoding, historyUrl)
    }

    @Suppress("unused")
    fun reload() {
        awContents.reload()
    }

    @Suppress("unused")
    fun stopLoading() {
        awContents.stopLoading()
    }

    @Suppress("unused")
    fun canGoBack() = awContents.canGoBack()

    @Suppress("unused")
    fun canGoForward() = awContents.canGoForward()

    @Suppress("unused")
    fun goBack() = awContents.goBack()

    @Suppress("unused")
    fun goForward() = awContents.goForward()

    @Suppress("unused")
    fun clearView() {
        awContents.clearView()
    }

    @Suppress("unused")
    fun clearCache(includeDiskFiles: Boolean) {
        awContents.clearCache(includeDiskFiles)
    }

    @Suppress("unused")
    fun destroy() {
        awContents.destroy()
    }

    @Suppress("unused")
    fun evaluateJavascript(script: String) {
        awContents.evaluateJavaScript(script, null)
    }

    override fun shouldDelayChildPressedState() = true

    override fun getAccessibilityNodeProvider(): AccessibilityNodeProvider? {
        val provider = awContents.accessibilityNodeProvider
        return provider ?: super.getAccessibilityNodeProvider()
    }

    override fun onProvideVirtualStructure(structure: ViewStructure) {
        awContents.onProvideVirtualStructure(structure)
    }

    override fun performAccessibilityAction(action: Int, arguments: Bundle?) =
        if (awContents.supportsAccessibilityAction(action)) {
            awContents.performAccessibilityAction(action, arguments)
        } else {
            super.performAccessibilityAction(action, arguments)
        }

    @Suppress("UNNECESSARY_SAFE_CALL")
    override fun setOverScrollMode(overScrollMode: Int) {
        super.setOverScrollMode(overScrollMode)
        awContents?.setOverScrollMode(overScrollMode)
    }

    @Suppress("UNNECESSARY_SAFE_CALL")
    override fun setScrollBarStyle(style: Int) {
        awContents?.setScrollBarStyle(style)
        super.setScrollBarStyle(style)
    }

    override fun onOverScrolled(scrollX: Int, scrollY: Int, clampedX: Boolean, clampedY: Boolean) {
        awContents.onContainerViewOverScrolled(scrollX, scrollY, clampedX, clampedY)
    }

    override fun onWindowVisibilityChanged(visibility: Int) {
        if (visibility != View.GONE) {
            super.onWindowVisibilityChanged(View.VISIBLE)
            awContents.onWindowVisibilityChanged(View.VISIBLE)
        }
    }

    override fun onDraw(canvas: Canvas) {
        awContents.onDraw(canvas)
    }

    override fun setLayoutParams(params: ViewGroup.LayoutParams?) {
        super.setLayoutParams(params)
        awContents.setLayoutParams(params)
    }

    override fun performLongClick() = if (parent != null) super.performLongClick() else false

    override fun onConfigurationChanged(newConfig: Configuration) {
        awContents.onConfigurationChanged(newConfig)
    }

    override fun onDragEvent(event: DragEvent) = awContents.onDragEvent(event)

    override fun onCreateInputConnection(outAttrs: EditorInfo): InputConnection? =
        awContents.onCreateInputConnection(outAttrs) ?: super.onCreateInputConnection(outAttrs)

    override fun onKeyMultiple(keyCode: Int, repeatCount: Int, event: KeyEvent) = false

    override fun onKeyDown(keyCode: Int, event: KeyEvent) = false

    override fun onKeyUp(keyCode: Int, event: KeyEvent) = awContents.onKeyUp(keyCode, event)

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        awContents.onAttachedToWindow()
    }

    override fun onDetachedFromWindow() {
        awContents.onDetachedFromWindow()
        super.onDetachedFromWindow()
    }

    override fun onVisibilityChanged(changedView: View, visibility: Int) {
        super.onVisibilityChanged(changedView, visibility)
        awContents.onVisibilityChanged(changedView, visibility)
    }

    override fun onWindowFocusChanged(hasWindowFocus: Boolean) {
        awContents.onWindowFocusChanged(hasWindowFocus)
        super.onWindowFocusChanged(hasWindowFocus)
    }

    override fun onFocusChanged(focused: Boolean, direction: Int, previouslyFocusedRect: Rect?) {
        awContents.onFocusChanged(focused, direction, previouslyFocusedRect)
        super.onFocusChanged(focused, direction, previouslyFocusedRect)
    }

    override fun onSizeChanged(w: Int, h: Int, ow: Int, oh: Int) {
        super.onSizeChanged(w, h, ow, oh)
        awContents.onSizeChanged(w, h, ow, oh)
    }

    override fun onScrollChanged(l: Int, t: Int, oldl: Int, oldt: Int) {
        super.onScrollChanged(l, t, oldl, oldt)
        awContents.onContainerViewScrollChanged(l, t, oldl, oldt)
    }

    override fun dispatchKeyEvent(event: KeyEvent) = awContents.dispatchKeyEvent(event)

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouchEvent(event: MotionEvent) = awContents.onTouchEvent(event)

    override fun onHoverEvent(event: MotionEvent) = awContents.onHoverEvent(event)

    override fun onGenericMotionEvent(event: MotionEvent) = false

    override fun requestFocus(direction: Int, previouslyFocusedRect: Rect?): Boolean {
        awContents.requestFocus()
        return super.requestFocus(direction, previouslyFocusedRect)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        awContents.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }

    override fun requestChildRectangleOnScreen(child: View, rectangle: Rect, immediate: Boolean) =
        awContents.requestChildRectangleOnScreen(child, rectangle, immediate)

    override fun setBackgroundColor(color: Int) {
        awContents.setBackgroundColor(color)
    }

    override fun computeHorizontalScrollRange() = awContents.computeHorizontalScrollRange()

    override fun computeHorizontalScrollOffset() = awContents.computeHorizontalScrollOffset()

    override fun computeVerticalScrollRange() = awContents.computeVerticalScrollRange()

    override fun computeVerticalScrollOffset() = awContents.computeVerticalScrollOffset()

    override fun computeVerticalScrollExtent() = awContents.computeVerticalScrollExtent()

    override fun computeScroll() {
        awContents.computeScroll()
    }

    private inner class InternalAccessAdapter : AwContents.InternalAccessDelegate {
        override fun super_onKeyUp(keyCode: Int, event: KeyEvent): Boolean {
            // Intentional no-op
            return false
        }

        override fun super_dispatchKeyEvent(event: KeyEvent): Boolean {
            return super@WebView.dispatchKeyEvent(event)
        }

        override fun super_onGenericMotionEvent(event: MotionEvent): Boolean {
            return super@WebView.onGenericMotionEvent(event)
        }

        override fun super_onConfigurationChanged(newConfig: Configuration) {
            // Intentional no-op
        }

        override fun super_getScrollBarStyle(): Int {
            return super@WebView.getScrollBarStyle()
        }

        override fun super_startActivityForResult(intent: Intent, requestCode: Int) {}

        override fun onScrollChanged(l: Int, t: Int, oldl: Int, oldt: Int) {
            // Intentional no-op.
            // Chromium calls this directly to trigger accessibility events. That isn't needed
            // for WebView since super_scrollTo invokes onScrollChanged for us.
        }

        override fun overScrollBy(
            deltaX: Int,
            deltaY: Int,
            scrollX: Int,
            scrollY: Int,
            scrollRangeX: Int,
            scrollRangeY: Int,
            maxOverScrollX: Int,
            maxOverScrollY: Int,
            isTouchEvent: Boolean
        ) {
            // We're intentionally not calling super.scrollTo here to make testing easier.
            this@WebView.overScrollBy(
                deltaX, deltaY, scrollX, scrollY,
                scrollRangeX, scrollRangeY, maxOverScrollX, maxOverScrollY, isTouchEvent
            )
        }

        override fun super_scrollTo(scrollX: Int, scrollY: Int) {
            // We're intentionally not calling super.scrollTo here to make testing easier.
            super@WebView.scrollTo(scrollX, scrollY)
        }

        override fun setMeasuredDimension(measuredWidth: Int, measuredHeight: Int) {
            this@WebView.setMeasuredDimension(measuredWidth, measuredHeight)
        }
    }

    private class NativeDrawFunctorFactory : AwContents.NativeDrawFunctorFactory {
        override fun createGLFunctor(context: Long) = NativeDrawFunctor(context)

        override fun getDrawFnAccess() = DrawFnAccess()
    }

    private class DrawFnAccess : AwDrawFnImpl.DrawFnAccess {
        override fun drawWebViewFunctor(canvas: Canvas, functor: Int) {}
    }

    private class NativeDrawFunctorDestroyRunnable(private var context: Long) : Runnable {
        override fun run() {
            context = 0
        }
    }

    private class NativeDrawFunctor(context: Long) : AwContents.NativeDrawGLFunctor {
        private val destroyRunnable = NativeDrawFunctorDestroyRunnable(context)

        override fun supportsDrawGLFunctorReleasedCallback() = false

        override fun requestDrawGL(canvas: Canvas, releasedRunnable: Runnable?) = false

        override fun requestInvokeGL(containerView: View, waitForCompletion: Boolean) = false

        override fun detach(containerView: View) {}

        override fun destroy() = destroyRunnable.run()
    }

    companion object {
        // https://chromium.googlesource.com/chromium/src.git/+/refs/tags/91.0.4472.70/third_party/blink/renderer/platform/runtime_enabled_features.json5
        private val COMMAND =
            arrayOf(
                "", // Just put an empty string or any string.
                "--enable-blink-features=LayoutNG,LayoutNGBlockFragmentation"
            )

        fun initialize(application: Application) {
            AwShellResourceProvider.registerResources(application)
            CommandLine.init(COMMAND)
            ContextUtils.initApplicationContext(application)
            AwBrowserProcess.loadLibrary("AwDemo")
            AwBrowserProcess.start()

            if (BuildConfig.DEBUG) {
                AwDevToolsServer().setRemoteDebuggingEnabled(true)
            }
        }
    }
}