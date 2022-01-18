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

    // Enables the use of CPU scheduling APIs on Android.
    public static final String ADPF = "Adpf";


    public static final String ENABLE_OVERLAY_PRIORITIZATION = "EnableOverlayPrioritization";


    public static final String DELEGATED_COMPOSITING = "DelegatedCompositing";


    public static final String SIMPLE_FRAME_RATE_THROTTLING = "SimpleFrameRateThrottling";

    // Use the SkiaRenderer.
    public static final String USE_SKIA_RENDERER = "UseSkiaRenderer";

    // Kill-switch to disable de-jelly, even if flags/properties indicate it should
    // be enabled.
    public static final String DISABLE_DE_JELLY = "DisableDeJelly";

    // On platform and configuration where viz controls the allocation of frame
    // buffers (ie SkiaOutputDeviceBufferQueue is used), allocate and release frame
    // buffers on demand.
    public static final String DYNAMIC_BUFFER_QUEUE_ALLOCATION = "DynamicBufferQueueAllocation";

    // When wide color gamut content from the web is encountered, promote our
    // display to wide color gamut if supported.
    public static final String DYNAMIC_COLOR_GAMUT = "DynamicColorGamut";

    // Uses glClear to composite solid color quads whenever possible.
    public static final String FAST_SOLID_COLOR_DRAW = "FastSolidColorDraw";

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

    // Enables platform supported delegated ink trails instead of Skia backed
    // delegated ink trails.
    public static final String USE_PLATFORM_DELEGATED_INK = "UsePlatformDelegatedInk";

    // Used to debug Android WebView Vulkan composite. Composite to an intermediate
    // buffer and draw the intermediate buffer to the secondary command buffer.
    public static final String WEBVIEW_VULKAN_INTERMEDIATE_BUFFER = "WebViewVulkanIntermediateBuffer";

    // Hardcoded as disabled for WebView to have a different default for
    // UseSurfaceLayerForVideo from chrome.
    public static final String USE_SURFACE_LAYER_FOR_VIDEO_DEFAULT = "UseSurfaceLayerForVideoDefault";

    // Used by CC to throttle frame production of older surfaces. Used by the
    // Browser to batch SurfaceSync calls sent to the Renderer for properties can
    // change in close proximity to each other.
    public static final String SURFACE_SYNC_THROTTLING = "SurfaceSyncThrottling";

    // Prevent instantiation.
    private VizFeatures() {}
}
