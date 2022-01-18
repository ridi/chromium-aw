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

    // If enabled, listen for screen power state change and factor into the native
    // window occlusion detection - Windows-only.
    public static final String SCREEN_POWER_LISTENER_FOR_NATIVE_WIN_OCCLUSION = "ScreenPowerListenerForNativeWinOcclusion";

    // Whether or not to delegate color queries to the color provider.
    public static final String COLOR_PROVIDER_REDIRECTION = "ColorProviderRedirection";

    // Integrate input method specific settings to Chrome OS settings page.
    // https://crbug.com/895886.
    public static final String SETTINGS_SHOWS_PER_KEYBOARD_SETTINGS = "InputMethodIntegratedSettings";

    // Experimental shortcut handling and mapping to address i18n issues.
    // https://crbug.com/1067269
    public static final String NEW_SHORTCUT_MAPPING = "NewShortcutMapping";


    public static final String DEPRECATE_ALT_CLICK = "DeprecateAltClick";


    public static final String SHORTCUT_CUSTOMIZATION_APP = "ShortcutCustomizationApp";

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

    // Cached in Java as well, make sure defaults are updated together.
    public static final String ELASTIC_OVERSCROLL = "ElasticOverscroll";

    // Enables focus follow follow cursor (sloppyfocus).
    public static final String FOCUS_FOLLOWS_CURSOR = "FocusFollowsCursor";

    // Enables InputPane API for controlling on screen keyboard.
    public static final String INPUT_PANE_ON_SCREEN_KEYBOARD = "InputPaneOnScreenKeyboard";

    // Enables using WM_POINTER instead of WM_TOUCH for touch events.
    public static final String POINTER_EVENTS_FOR_TOUCH = "PointerEventsForTouch";

    // Enables using TSF (over IMM32) for IME.
    public static final String TSF_IME_SUPPORT = "TSFImeSupport";

    // Enables Logging for DirectManipulation.
    public static final String PRECISION_TOUCHPAD_LOGGING = "PrecisionTouchpadLogging";

    // This feature supercedes kNewShortcutMapping.
    public static final String IMPROVED_KEYBOARD_SHORTCUTS = "ImprovedKeyboardShortcuts";

    // Whether to deprecate the Alt-Based event rewrites that map to the
    // Page Up/Down, Home/End, Insert/Delete keys. This feature was a
    // part of kImprovedKeyboardShortcuts, but it is being postponed until
    // the new shortcut customization app ships.
    // TODO(crbug.com/1179893): Remove after the customization app ships.
    public static final String DEPRECATE_ALT_BASED_SIX_PACK = "DeprecateAltBasedSixPack";

    // Enables forced colors mode for web content.
    public static final String FORCED_COLORS = "ForcedColors";

    // Enables the eye-dropper in the refresh color-picker for Windows, Mac
    // and Linux. This feature will be released for other platforms in later
    // milestones.
    public static final String EYE_DROPPER = "EyeDropper";

    // Enable the common select popup.
    public static final String USE_COMMON_SELECT_POPUP = "UseCommonSelectPopup";

    // Enables keyboard accessible tooltip.
    public static final String KEYBOARD_ACCESSIBLE_TOOLTIP = "KeyboardAccessibleTooltip";


    public static final String HANDWRITING_GESTURE = "HandwritingGesture";


    public static final String SYNCHRONOUS_PAGE_FLIP_TESTING = "SynchronousPageFlipTesting";


    public static final String RESAMPLING_SCROLL_EVENTS_EXPERIMENTAL_PREDICTION = "ResamplingScrollEventsExperimentalPrediction";


    public static final String USE_OZONE_PLATFORM = "UseOzonePlatform";


    public static final String SWIPE_TO_MOVE_CURSOR = "SwipeToMoveCursor";


    public static final String UI_DEBUG_TOOLS = "ui-debug-tools";

    // Prevent instantiation.
    private UiFeatures() {}
}