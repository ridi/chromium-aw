package com.ridi.awdemo

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.util.Size
import android.webkit.WebViewClient
import android.widget.FrameLayout
import android.widget.LinearLayout
import org.chromium.android_webview.AwBrowserContext
import org.chromium.android_webview.AwBrowserProcess
import org.chromium.android_webview.AwContents
import org.chromium.android_webview.AwDevToolsServer
import org.chromium.android_webview.AwSettings
import org.chromium.android_webview.shell.AwShellResourceProvider
import org.chromium.android_webview.test.AwTestContainerView
import org.chromium.android_webview.test.NullContentsClient
import org.chromium.base.CommandLine
import org.chromium.base.ContextUtils

@SuppressLint("SetJavaScriptEnabled")
@Suppress("ViewConstructor")
class WebView(context: Context) : FrameLayout(context) {
    private val awTestContainerView: AwTestContainerView
    private val awBrowserContext: AwBrowserContext
    private val awContents: AwContents
    private var webViewClient: WebViewClient? = null

    var settings: AwSettings
        private set

    init {
        AwTestContainerView.installDrawFnFunctionTable(false)
        awTestContainerView = AwTestContainerView(context, true)

        val sharedPreferences =
                context.getSharedPreferences(javaClass.simpleName, Context.MODE_PRIVATE)
        val nativePointer = AwBrowserContext.getDefault().nativePointer
        awBrowserContext = AwBrowserContext(sharedPreferences, nativePointer, true)

        settings = AwSettings(context, true, false, false, false, false).apply {
            javaScriptEnabled = true
            domStorageEnabled = true
        }

        awContents = AwContents(
                awBrowserContext,
                awTestContainerView,
                awTestContainerView.context,
                awTestContainerView.internalAccessDelegate,
                awTestContainerView.nativeDrawFunctorFactory,
                object : NullContentsClient() {
                    override fun onPageFinished(url: String) {
                        webViewClient?.onPageFinished(null, url)
                    }
                }, settings)

        awTestContainerView.initialize(awContents)

        awTestContainerView.layoutParams =
                LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT, 1f)
        addView(awTestContainerView)
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

    companion object {
        // https://chromium.googlesource.com/chromium/src.git/+/refs/tags/92.0.4515.115/third_party/blink/renderer/platform/runtime_enabled_features.json5
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