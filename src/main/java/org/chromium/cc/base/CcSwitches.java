// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.cc.base;

/**
 * Contains all of the command line switches that are specific to the cc/ layer.
 */
public final class CcSwitches {


    // This following string constants were inserted by
    //     java_cpp_strings.py
    // From
    //     ../../cc/base/switches.cc
    // Into
    //     ../../cc/base/android/java/src/org/chromium/cc/base/CcSwitches.java.tmpl


    public static final String DISABLE_THREADED_ANIMATION = "disable-threaded-animation";

    // Disables layer-edge anti-aliasing in the compositor.
    public static final String DISABLE_COMPOSITED_ANTIALIASING = "disable-composited-antialiasing";

    // Disables sending the next BeginMainFrame before the previous commit
    // activates. Overrides the kEnableMainFrameBeforeActivation flag.
    public static final String DISABLE_MAIN_FRAME_BEFORE_ACTIVATION = "disable-main-frame-before-activation";

    // Enables sending the next BeginMainFrame before the previous commit activates.
    public static final String ENABLE_MAIN_FRAME_BEFORE_ACTIVATION = "enable-main-frame-before-activation";

    // Disabled defering all image decodes to the image decode service, ignoring
    // DecodingMode preferences specified on PaintImage.
    public static final String DISABLE_CHECKER_IMAGING = "disable-checker-imaging";

    // Percentage of the browser controls need to be hidden before they will auto
    // hide.
    public static final String BROWSER_CONTROLS_HIDE_THRESHOLD = "top-controls-hide-threshold";

    // Percentage of the browser controls need to be shown before they will auto
    // show.
    public static final String BROWSER_CONTROLS_SHOW_THRESHOLD = "top-controls-show-threshold";

    // Re-rasters everything multiple times to simulate a much slower machine.
    // Give a scale factor to cause raster to take that many times longer to
    // complete, such as --slow-down-raster-scale-factor=25.
    public static final String SLOW_DOWN_RASTER_SCALE_FACTOR = "slow-down-raster-scale-factor";

    // Checks damage early and aborts the frame if no damage, so that clients like
    // Android WebView don't invalidate unnecessarily.
    public static final String CHECK_DAMAGE_EARLY = "check-damage-early";

    // Enables the GPU benchmarking extension
    public static final String ENABLE_GPU_BENCHMARKING = "enable-gpu-benchmarking";

    // Disables LayerTreeHost::OnMemoryPressure
    public static final String DISABLE_LAYER_TREE_HOST_MEMORY_PRESSURE = "disable-layer-tree-host-memory-pressure";

    // Renders a border around compositor layers to help debug and study
    // layer compositing.
    public static final String SHOW_COMPOSITED_LAYER_BORDERS = "show-composited-layer-borders";


    public static final String UI_SHOW_COMPOSITED_LAYER_BORDERS = "ui-show-composited-layer-borders";

    // Parameters for kUIShowCompositedLayerBorders.
    public static final String COMPOSITED_RENDER_PASS_BORDERS = "renderpass";


    public static final String COMPOSITED_SURFACE_BORDERS = "surface";


    public static final String COMPOSITED_LAYER_BORDERS = "layer";

    // Checks and logs double background blur as an error if any.
    public static final String LOG_ON_UI_DOUBLE_BACKGROUND_BLUR = "log-on-ui-double-background-blur";

    // Draws a heads-up-display showing Frames Per Second as well as GPU memory
    // usage. If you also use --enable-logging=stderr --vmodule="head*=1" then FPS
    // will also be output to the console log.
    public static final String SHOW_FPS_COUNTER = "show-fps-counter";


    public static final String UI_SHOW_FPS_COUNTER = "ui-show-fps-counter";

    // Renders a border that represents the bounding box for the layer's animation.
    public static final String SHOW_LAYER_ANIMATION_BOUNDS = "show-layer-animation-bounds";


    public static final String UI_SHOW_LAYER_ANIMATION_BOUNDS = "ui-show-layer-animation-bounds";

    // Show rects in the HUD around layers whose properties have changed.
    public static final String SHOW_PROPERTY_CHANGED_RECTS = "show-property-changed-rects";


    public static final String UI_SHOW_PROPERTY_CHANGED_RECTS = "ui-show-property-changed-rects";

    // Show rects in the HUD around damage as it is recorded into each render
    // surface.
    public static final String SHOW_SURFACE_DAMAGE_RECTS = "show-surface-damage-rects";


    public static final String UI_SHOW_SURFACE_DAMAGE_RECTS = "ui-show-surface-damage-rects";

    // Show rects in the HUD around the screen-space transformed bounds of every
    // layer.
    public static final String SHOW_SCREEN_SPACE_RECTS = "show-screenspace-rects";


    public static final String UI_SHOW_SCREEN_SPACE_RECTS = "ui-show-screenspace-rects";

    // Highlights layers that can't use lcd text. Layers containing no text won't
    // be highlighted. See DebugColors::NonLCDTextHighlightColor() for the colors.
    public static final String HIGHLIGHT_NON_LCD_TEXT_LAYERS = "highlight-non-lcd-text-layers";

    // Switches the ui compositor to use layer lists instead of layer trees.
    public static final String UI_ENABLE_LAYER_LISTS = "ui-enable-layer-lists";

    // Enables the resume method on animated images.
    public static final String ANIMATED_IMAGE_RESUME = "animated-image-resume";

    // Allows scaling clipped images in GpuImageDecodeCache. Note that this may
    // cause color-bleeding.
    // TODO(crbug.com/1157548): Remove this workaround flag once the underlying
    // cache problems are solved.
    public static final String ENABLE_CLIPPED_IMAGE_SCALING = "enable-scaling-clipped-images";

    // Prevents the layer tree unit tests from timing out.
    public static final String CC_LAYER_TREE_TEST_NO_TIMEOUT = "cc-layer-tree-test-no-timeout";

    // Increases timeout for memory checkers.
    public static final String CC_LAYER_TREE_TEST_LONG_TIMEOUT = "cc-layer-tree-test-long-timeout";

    // Controls the duration of the scroll animation curve.
    public static final String CC_SCROLL_ANIMATION_DURATION_FOR_TESTING = "cc-scroll-animation-duration-in-seconds";

    // Prevent instantiation.
    private CcSwitches() {}
}
