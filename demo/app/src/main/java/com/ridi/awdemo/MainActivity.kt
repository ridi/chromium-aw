package com.ridi.awdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {
    private lateinit var webViewContainer: FrameLayout
    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialization before system WebView access
        WebView.initialize(application)

        setContentView(R.layout.activity_main)
        webViewContainer = findViewById(R.id.web_view_container)

        loadWebView()
    }
    
    private fun loadWebView() {
        webView = WebView(this)
        webViewContainer.addView(
            webView,
            ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        )
        webView.loadUrl("https://github.com/ridi/chromium-aw")
    }

    override fun onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}