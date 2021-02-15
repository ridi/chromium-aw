// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.ui.base;

/**
 * Constants for the names of UI Features.
 */
public final class UiFeatures {


    // This following string constants were inserted by
    //     java_cpp_features.py
    // From
    //     ../../ui/base/ui_base_features.cc
    // Into
    //     ../../ui/android/java/src/org/chromium/ui/base/UiFeatures.java.tmpl

    // If enabled, calculate native window occlusion - Windows-only.
    public static final String CALCULATE_NATIVE_WIN_OCCLUSION = "CalculateNativeWinOcclusion";


    public static final String CALCULATE_NATIVE_WIN_OCCLUSION_CHECK_VIRTUAL_DESKTOP_USED = "CalculateNativeWinOcclusionCheckVirtualDesktopUsed";

    // Whether or not to delegate color queries to the color provider.
    public static final String COLOR_PROVIDER_REDIRECTION = "ColorProviderRedirection";

    // Integrate input method specific settings to Chrome OS settings page.
    // https://crbug.com/895886.
    public static final String SETTINGS_SHOWS_PER_KEYBOARD_SETTINGS = "InputMethodIntegratedSettings";

    // Experimental shortcut handling and mapping to address i18n issues.
    // https://crbug.com/1067269
    public static final String NEW_SHORTCUT_MAPPING = "NewShortcutMapping";

    // Update of the virtual keyboard settings UI as described in
    // https://crbug.com/876901.
    public static final String INPUT_METHOD_SETTINGS_UI_UPDATE = "InputMethodSettingsUiUpdate";

    // Enables percent-based scrolling for mousewheel and keyboard initiated
    // scrolls.
    public static final String PERCENT_BASED_SCROLLING = "PercentBasedScrolling";

    // Allows requesting unadjusted movement when entering pointerlock.
    public static final String POINTER_LOCK_OPTIONS = "PointerLockOptions";

    // Allows system caption style for WebVTT Captions.
    public static final String SYSTEM_CAPTION_STYLE = "SystemCaptionStyle";

    // Allows system keyboard event capture via the keyboard lock API.
    public static final String SYSTEM_KEYBOARD_LOCK = "SystemKeyboardLock";


    public static final String NOTIFICATION_INDICATOR = "EnableNotificationIndicator";

    // Enables GPU rasterization for all UI drawing (where not blocklisted).
    public static final String UI_GPU_RASTERIZATION = "UiGpuRasterization";

    // Enables scrolling with layers under ui using the ui::Compositor.
    public static final String UI_COMPOSITOR_SCROLL_WITH_LAYERS = "UiCompositorScrollWithLayers";

    // Enables compositor threaded scrollbar scrolling by mapping pointer events to
    // gesture events.
    public static final String COMPOSITOR_THREADED_SCROLLBAR_SCROLLING = "CompositorThreadedScrollbarScrolling";

    // Enables the use of a touch fling curve that is based on the behavior of
    // native apps on Windows.
    public static final String EXPERIMENTAL_FLING_ANIMATION = "ExperimentalFlingAnimation";


    public static final String ELASTIC_OVERSCROLL_WIN = "ElasticOverscrollWin";

    // Enables InputPane API for controlling on screen keyboard.
    public static final String INPUT_PANE_ON_SCREEN_KEYBOARD = "InputPaneOnScreenKeyboard";

    // Enables using WM_POINTER instead of WM_TOUCH for touch events.
    public static final String POINTER_EVENTS_FOR_TOUCH = "PointerEventsForTouch";

    // Enables using TSF (over IMM32) for IME.
    public static final String TSF_IME_SUPPORT = "TSFImeSupport";

    // Enables Logging for DirectManipulation.
    public static final String PRECISION_TOUCHPAD_LOGGING = "PrecisionTouchpadLogging";

    // Enables stylus appearing as touch when in contact with digitizer.
    public static final String DIRECT_MANIPULATION_STYLUS = "DirectManipulationStylus";

    // Enables forced colors mode for web content.
    public static final String FORCED_COLORS = "ForcedColors";

    // Enables the eye-dropper in the refresh color-picker for Windows and Mac.
    // This feature will be released for other platforms in later milestones.
    public static final String EYE_DROPPER = "EyeDropper";

    // Enable the CSSColorSchemeUARendering feature for Windows, ChromeOS, Linux,
    // and Mac. This feature will be released for Android in later milestones. See
    // crbug.com/1086530 for the Desktop launch bug.
    public static final String CSS_COLOR_SCHEME_UA_RENDERING = "CSSColorSchemeUARendering";

    // Enable the FormControlsRefresh feature for Windows, ChromeOS, Linux, and Mac.
    // This feature will be released for Android in later milestones. See
    // crbug.com/1012106 for the Windows launch bug, and crbug.com/1012108 for the
    // Mac launch bug.
    public static final String FORM_CONTROLS_REFRESH = "FormControlsRefresh";

    // Enable the common select popup.
    public static final String USE_COMMON_SELECT_POPUP = "UseCommonSelectPopup";


    public static final String HANDWRITING_GESTURE = "HandwritingGesture";


    public static final String SYNCHRONOUS_PAGE_FLIP_TESTING = "SynchronousPageFlipTesting";


    public static final String RESAMPLING_SCROLL_EVENTS_EXPERIMENTAL_PREDICTION = "ResamplingScrollEventsExperimentalPrediction";


    public static final String USE_OZONE_PLATFORM = "UseOzonePlatform";


    public static final String SWIPE_TO_MOVE_CURSOR = "SwipeToMoveCursor";

    // Prevent instantiation.
    private UiFeatures() {}
}