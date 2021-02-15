// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.components.viz.common;

/**
 * Constants for the names of Viz Features.
 */
public final class VizFeatures {


    // This following string constants were inserted by
    //     java_cpp_features.py
    // From
    //     ../../components/viz/common/features.cc
    // Into
    //     ../../components/viz/common/java/src/org/chromium/components/viz/common/VizFeatures.java.tmpl


    public static final String ENABLE_OVERLAY_PRIORITIZATION = "EnableOverlayPrioritization";

    // Use the SkiaRenderer.
    public static final String USE_SKIA_RENDERER = "UseSkiaRenderer";

    // Kill-switch to disable de-jelly, even if flags/properties indicate it should
    // be enabled.
    public static final String DISABLE_DE_JELLY = "DisableDeJelly";

    // When wide color gamut content from the web is encountered, promote our
    // display to wide color gamut if supported.
    public static final String DYNAMIC_COLOR_GAMUT = "DynamicColorGamut";

    // Uses glClear to composite solid color quads whenever possible.
    public static final String FAST_SOLID_COLOR_DRAW = "FastSolidColorDraw";

    // Viz for WebView architecture.
    public static final String VIZ_FOR_WEBVIEW = "VizForWebView";

    // Submit CompositorFrame from SynchronousLayerTreeFrameSink directly to viz in
    // WebView.
    public static final String VIZ_FRAME_SUBMISSION_FOR_WEBVIEW = "VizFrameSubmissionForWebView";


    public static final String USE_PREFERRED_INTERVAL_FOR_VIDEO = "UsePreferredIntervalForVideo";

    // Whether we should use the real buffers corresponding to overlay candidates in
    // order to do a pageflip test rather than allocating test buffers.
    public static final String USE_REAL_BUFFERS_FOR_PAGE_FLIP_TEST = "UseRealBuffersForPageFlipTest";

    // Enables SkiaOutputDeviceBufferQueue instead of Vulkan swapchain on Fuchsia.
    public static final String USE_SKIA_OUTPUT_DEVICE_BUFFER_QUEUE = "UseSkiaOutputDeviceBufferQueue";

    // Whether we should log extra debug information to webrtc native log.
    public static final String WEB_RTC_LOG_CAPTURE_PIPELINE = "WebRtcLogCapturePipeline";

    // Enables swap chains to call SetPresentDuration to request DWM/OS to reduce
    // vsync.
    public static final String USE_SET_PRESENT_DURATION = "UseSetPresentDuration";

    // Uses X11 Present Extensions instead of the Vulkan swapchain for presenting.
    public static final String USE_X11_PRESENT = "UseX11Present";

    // Used to debug Android WebView Vulkan composite. Composite to an intermediate
    // buffer and draw the intermediate buffer to the secondary command buffer.
    public static final String WEBVIEW_VULKAN_INTERMEDIATE_BUFFER = "WebViewVulkanIntermediateBuffer";

    // Prevent instantiation.
    private VizFeatures() {}
}
