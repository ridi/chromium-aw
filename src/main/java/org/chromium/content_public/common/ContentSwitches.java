// Copyright 2013 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.content_public.common;

/**
 * Contains all of the command line switches that are specific to the content/
 * portion of Chromium on Android.
 */
public final class ContentSwitches {
    // Tell Java to use the official command line, loaded from the
    // official-command-line.xml files.  WARNING this is not done
    // immediately on startup, so early running Java code will not see
    // these flags.
    public static final String ADD_OFFICIAL_COMMAND_LINE = "add-official-command-line";

    // Enables test intent handling.
    public static final String ENABLE_TEST_INTENTS = "enable-test-intents";

    // Dump frames-per-second to the log
    public static final String LOG_FPS = "log-fps";

    // Whether Chromium should use a mobile user agent.
    public static final String USE_MOBILE_UA = "use-mobile-user-agent";

    // Change the url of the JavaScript that gets injected when accessibility mode is enabled.
    public static final String ACCESSIBILITY_JAVASCRIPT_URL = "accessibility-js-url";

    // How much of the browser controls need to be shown before they will auto show.
    public static final String TOP_CONTROLS_SHOW_THRESHOLD = "top-controls-show-threshold";

    // How much of the browser controls need to be hidden before they will auto hide.
    public static final String TOP_CONTROLS_HIDE_THRESHOLD = "top-controls-hide-threshold";

    // Native switch - chrome_switches::kDisablePopupBlocking
    public static final String DISABLE_POPUP_BLOCKING = "disable-popup-blocking";

    // Native switch kRendererProcessLimit
    public static final String RENDER_PROCESS_LIMIT = "renderer-process-limit";

    // Native switch kProcessType
    public static final String SWITCH_PROCESS_TYPE = "type";

    // Native switch kRendererProcess
    public static final String SWITCH_RENDERER_PROCESS = "renderer";

    // Native switch kUtilityProcess
    public static final String SWITCH_UTILITY_PROCESS = "utility";

    // Native switch kGPUProcess
    public static final String SWITCH_GPU_PROCESS = "gpu-process";

    // Use fake device for Media Stream to replace actual camera and microphone.
    public static final String USE_FAKE_DEVICE_FOR_MEDIA_STREAM =
            "use-fake-device-for-media-stream";

    // Native switch kHostResolverRules
    public static final String HOST_RESOLVER_RULES = "host-resolver-rules";

    // Native switch kServiceSandboxType
    public static final String SWITCH_SERVICE_SANDBOX_TYPE = "service-sandbox-type";

    // Native switch value kNetworkSandbox
    public static final String NETWORK_SANDBOX_TYPE = "network";


    // This following string constants were inserted by
    //     java_cpp_strings.py
    // From
    //     ../../content/public/common/content_switches.cc
    // Into
    //     ../../content/common/android/java_templates/ContentSwitches.java.tmpl

    // The number of MSAA samples for canvas2D. Requires MSAA support by GPU to
    // have an effect. 0 disables MSAA.
    public static final String ACCELERATED_CANVAS2D_MSAA_SAMPLE_COUNT = "canvas-msaa-sample-count";

    // Allows processing of input before a frame has been committed.
    // TODO(schenney): crbug.com/987626. Used by headless. Look for a way not
    // involving a command line switch.
    public static final String ALLOW_PRE_COMMIT_INPUT = "allow-pre-commit-input";

    // By default, file:// URIs cannot read other file:// URIs. This is an
    // override for developers who need the old behavior for testing.
    public static final String ALLOW_FILE_ACCESS_FROM_FILES = "allow-file-access-from-files";

    // Enables TLS/SSL errors on localhost to be ignored (no interstitial,
    // no blocking of requests).
    public static final String ALLOW_INSECURE_LOCALHOST = "allow-insecure-localhost";

    // Allows loopback interface to be added in network list for peer connection.
    public static final String ALLOW_LOOPBACK_IN_PEER_CONNECTION = "allow-loopback-in-peer-connection";

    // Allow a page to show popups during its unloading.
    // TODO(https://crbug.com/937569): Remove this in Chrome 88.
    public static final String ALLOW_POPUPS_DURING_PAGE_UNLOAD = "allow-popups-during-page-unload";

    // Allow a page to send synchronus XHR during its unloading.
    // TODO(https://crbug.com/1003101): Remove this in Chrome 88.
    public static final String ALLOW_SYNC_XHR_IN_PAGE_DISMISSAL = "allow-sync-xhr-in-page-dimissal";

    // Uses the android SkFontManager on linux. The specified directory should
    // include the configuration xml file with the name "fonts.xml".
    // This is used in blimp to emulate android fonts on linux.
    public static final String ANDROID_FONTS_PATH = "android-fonts-path";

    // Set blink settings. Format is <name>[=<value],<name>[=<value>],...
    // The names are declared in Settings.json5. For boolean type, use "true",
    // "false", or omit '=<value>' part to set to true. For enum type, use the int
    // value of the enum value. Applied after other command line flags and prefs.
    public static final String BLINK_SETTINGS = "blink-settings";

    // Causes the browser process to crash on startup.
    public static final String BROWSER_CRASH_TEST = "crash-test";

    // Causes the browser process to display a dialog on launch.
    public static final String BROWSER_STARTUP_DIALOG = "browser-startup-dialog";

    // Path to the exe to run for the renderer and plugin subprocesses.
    public static final String BROWSER_SUBPROCESS_PATH = "browser-subprocess-path";

    // Tells whether the code is running browser tests (this changes the startup URL
    // used by the content shell and also disables features that can make tests
    // flaky [like monitoring of memory pressure]).
    public static final String BROWSER_TEST = "browser-test";

    // Sets the tile size used by composited layers.
    public static final String DEFAULT_TILE_WIDTH = "default-tile-width";


    public static final String DEFAULT_TILE_HEIGHT = "default-tile-height";

    // Sets the min tile height for GPU raster.
    public static final String MIN_HEIGHT_FOR_GPU_RASTER_TILE = "min-height-for-gpu-raster-tile";

    // Disable antialiasing on 2d canvas.
    public static final String DISABLE2D_CANVAS_ANTIALIASING = "disable-canvas-aa";

    // Disables Canvas2D rendering into a scanout buffer for overlay support.
    public static final String DISABLE2D_CANVAS_IMAGE_CHROMIUM = "disable-2d-canvas-image-chromium";

    // Disables client-visible 3D APIs, in particular WebGL and Pepper 3D.
    // This is controlled by policy and is kept separate from the other
    // enable/disable switches to avoid accidentally regressing the policy
    // support for controlling access to these APIs.
    public static final String DISABLE3DAP_IS = "disable-3d-apis";

    // Disable gpu-accelerated 2d canvas.
    public static final String DISABLE_ACCELERATED2D_CANVAS = "disable-accelerated-2d-canvas";

    // Disables hardware acceleration of video decode, where available.
    public static final String DISABLE_ACCELERATED_VIDEO_DECODE = "disable-accelerated-video-decode";

    // Disables hardware acceleration of video encode, where available.
    public static final String DISABLE_ACCELERATED_VIDEO_ENCODE = "disable-accelerated-video-encode";

    // Disable limits on the number of backing stores. Can prevent blinking for
    // users with many windows/tabs and lots of memory.
    public static final String DISABLE_BACKING_STORE_LIMIT = "disable-backing-store-limit";

    // Disable backgrounding renders for occluded windows. Done for tests to avoid
    // nondeterministic behavior.
    public static final String DISABLE_BACKGROUNDING_OCCLUDED_WINDOWS_FOR_TESTING = "disable-backgrounding-occluded-windows";

    // Disable task throttling of timer tasks from background pages.
    public static final String DISABLE_BACKGROUND_TIMER_THROTTLING = "disable-background-timer-throttling";

    // Disable one or more Blink runtime-enabled features.
    // Use names from runtime_enabled_features.json5, separated by commas.
    // Applied after kEnableBlinkFeatures, and after other flags that change these
    // features.
    public static final String DISABLE_BLINK_FEATURES = "disable-blink-features";

    // Disables HTML5 DB support.
    public static final String DISABLE_DATABASES = "disable-databases";

    // Disable the per-domain blocking for 3D APIs after GPU reset.
    // This switch is intended only for tests.
    public static final String DISABLE_DOMAIN_BLOCKING_FOR3DAP_IS = "disable-domain-blocking-for-3d-apis";

    // Disable all versions of WebGL.
    public static final String DISABLE_WEB_GL = "disable-webgl";

    // Disable WebGL2.
    public static final String DISABLE_WEB_GL2 = "disable-webgl2";

    // Disable FileSystem API.
    public static final String DISABLE_FILE_SYSTEM = "disable-file-system";

    // Disable 3D inside of flapper.
    public static final String DISABLE_FLASH3D = "disable-flash-3d";

    // Disable Stage3D inside of flapper.
    public static final String DISABLE_FLASH_STAGE3D = "disable-flash-stage3d";

    // Disable user gesture requirement for presentation.
    public static final String DISABLE_GESTURE_REQUIREMENT_FOR_PRESENTATION = "disable-gesture-requirement-for-presentation";

    // Disables GPU hardware acceleration.  If software renderer is not in place,
    // then the GPU process won't launch.
    public static final String DISABLE_GPU = "disable-gpu";

    // Prevent the compositor from using its GPU implementation.
    public static final String DISABLE_GPU_COMPOSITING = "disable-gpu-compositing";

    // Disable proactive early init of GPU process.
    public static final String DISABLE_GPU_EARLY_INIT = "disable-gpu-early-init";

    // Do not force that all compositor resources be backed by GPU memory buffers.
    public static final String DISABLE_GPU_MEMORY_BUFFER_COMPOSITOR_RESOURCES = "disable-gpu-memory-buffer-compositor-resources";

    // Disable GpuMemoryBuffer backed VideoFrames.
    public static final String DISABLE_GPU_MEMORY_BUFFER_VIDEO_FRAMES = "disable-gpu-memory-buffer-video-frames";

    // For tests, to disable the limit on the number of times the GPU process may be
    // restarted.
    public static final String DISABLE_GPU_PROCESS_CRASH_LIMIT = "disable-gpu-process-crash-limit";

    // For tests, to disable falling back to software compositing if the GPU Process
    // has crashed, and reached the GPU Process crash limit.
    public static final String DISABLE_SOFTWARE_COMPOSITING_FALLBACK = "disable-software-compositing-fallback";

    // When using CPU rasterizing disable low resolution tiling. This uses
    // less power, particularly during animations, but more white may be seen
    // during fast scrolling especially on slower devices.
    public static final String DISABLE_LOW_RES_TILING = "disable-low-res-tiling";

    // Disable the thread that crashes the GPU process if it stops responding to
    // messages.
    public static final String DISABLE_GPU_WATCHDOG = "disable-gpu-watchdog";

    // Disallow image animations to be reset to the beginning to avoid skipping
    // many frames. Only effective if compositor image animations are enabled.
    public static final String DISABLE_IMAGE_ANIMATION_RESYNC = "disable-image-animation-resync";

    // Disables the IPC flooding protection.
    // It is activated by default. Some javascript functions can be used to flood
    // the browser process with IPC. This protection limits the rate at which they
    // can be used.
    public static final String DISABLE_IPC_FLOODING_PROTECTION = "disable-ipc-flooding-protection";

    // Suppresses hang monitor dialogs in renderer processes.  This may allow slow
    // unload handlers on a page to prevent the tab from closing, but the Task
    // Manager can be used to terminate the offending process in this case.
    public static final String DISABLE_HANG_MONITOR = "disable-hang-monitor";

    // Disable the RenderThread's HistogramCustomizer.
    public static final String DISABLE_HISTOGRAM_CUSTOMIZER = "disable-histogram-customizer";

    // Don't kill a child process when it sends a bad IPC message.  Apart
    // from testing, it is a bad idea from a security perspective to enable
    // this switch.
    public static final String DISABLE_KILL_AFTER_BAD_IPC = "disable-kill-after-bad-ipc";

    // Disables LCD text.
    public static final String DISABLE_LCD_TEXT = "disable-lcd-text";

    // Disable LocalStorage.
    public static final String DISABLE_LOCAL_STORAGE = "disable-local-storage";

    // Force logging to be disabled.  Logging is enabled by default in debug
    // builds.
    public static final String DISABLE_LOGGING = "disable-logging";

    // Disables using CODECAPI_AVLowLatencyMode when creating DXVA decoders.
    public static final String DISABLE_LOW_LATENCY_DXVA = "disable-low-latency-dxva";

    // Disables clearing the rendering output of a renderer when it didn't commit
    // new output for a while after a top-frame navigation.
    public static final String DISABLE_NEW_CONTENT_RENDERING_TIMEOUT = "disable-new-content-rendering-timeout";

    // Disables the Web Notification and the Push APIs.
    public static final String DISABLE_NOTIFICATIONS = "disable-notifications";

    // Disable partial raster in the renderer. Disabling this switch also disables
    // the use of persistent gpu memory buffers.
    public static final String DISABLE_PARTIAL_RASTER = "disable-partial-raster";

    // Disable Pepper3D.
    public static final String DISABLE_PEPPER3D = "disable-pepper-3d";

    // Disables the Permissions API.
    public static final String DISABLE_PERMISSIONS_API = "disable-permissions-api";

    // Disable Image Chromium for Pepper 3d.
    public static final String DISABLE_PEPPER3D_IMAGE_CHROMIUM = "disable-pepper-3d-image-chromium";

    // Disables compositor-accelerated touch-screen pinch gestures.
    public static final String DISABLE_PINCH = "disable-pinch";

    // Disable the creation of compositing layers when it would prevent LCD text.
    public static final String DISABLE_PREFER_COMPOSITING_TO_LCD_TEXT = "disable-prefer-compositing-to-lcd-text";

    // Disables the Presentation API.
    public static final String DISABLE_PRESENTATION_API = "disable-presentation-api";

    // Disables throttling of history.pushState/replaceState calls.
    public static final String DISABLE_PUSH_STATE_THROTTLE = "disable-pushstate-throttle";

    // Disables RGBA_4444 textures.
    public static final String DISABLE_RGBA4444_TEXTURES = "disable-rgba-4444-textures";

    // Taints all <canvas> elements, regardless of origin.
    public static final String DISABLE_READING_FROM_CANVAS = "disable-reading-from-canvas";

    // Disables remote web font support. SVG font should always work whether this
    // option is specified or not.
    public static final String DISABLE_REMOTE_FONTS = "disable-remote-fonts";

    // Disables the RemotePlayback API.
    public static final String DISABLE_REMOTE_PLAYBACK_API = "disable-remote-playback-api";

    // Turns off the accessibility in the renderer.
    public static final String DISABLE_RENDERER_ACCESSIBILITY = "disable-renderer-accessibility";

    // Prevent renderer process backgrounding when set.
    public static final String DISABLE_RENDERER_BACKGROUNDING = "disable-renderer-backgrounding";

    // Whether the ResourceScheduler is disabled.  Note this is only useful for C++
    // Headless embedders who need to implement their own resource scheduling.
    public static final String DISABLE_RESOURCE_SCHEDULER = "disable-resource-scheduler";

    // Disable shared workers.
    public static final String DISABLE_SHARED_WORKERS = "disable-shared-workers";

    // Do not use runtime-detected high-end CPU optimizations in Skia.  This is
    // useful for forcing a baseline code path for e.g. web tests.
    public static final String DISABLE_SKIA_RUNTIME_OPTS = "disable-skia-runtime-opts";

    // Disable smooth scrolling for testing.
    public static final String DISABLE_SMOOTH_SCROLLING = "disable-smooth-scrolling";

    // Disables the use of a 3D software rasterizer.
    public static final String DISABLE_SOFTWARE_RASTERIZER = "disable-software-rasterizer";

    // Disables the Web Speech API (both speech recognition and synthesis).
    public static final String DISABLE_SPEECH_API = "disable-speech-api";

    // Disables the speech synthesis part of Web Speech API.
    public static final String DISABLE_SPEECH_SYNTHESIS_API = "disable-speech-synthesis-api";

    // Disables adding the test certs in the network process.
    public static final String DISABLE_TEST_CERTS = "disable-test-root-certs";

    // Disable multithreaded GPU compositing of web content.
    public static final String DISABLE_THREADED_COMPOSITING = "disable-threaded-compositing";

    // Disable multithreaded, compositor scrolling of web content.
    public static final String DISABLE_THREADED_SCROLLING = "disable-threaded-scrolling";

    // Disable V8 idle tasks.
    public static final String DISABLE_V8_IDLE_TASKS = "disable-v8-idle-tasks";

    // Disables WebGL rendering into a scanout buffer for overlay support.
    public static final String DISABLE_WEB_GL_IMAGE_CHROMIUM = "disable-webgl-image-chromium";

    // Don't enforce the same-origin policy. (Used by people testing their sites.)
    public static final String DISABLE_WEB_SECURITY = "disable-web-security";

    // Disable rasterizer that writes directly to GPU memory associated with tiles.
    public static final String DISABLE_ZERO_COPY = "disable-zero-copy";

    // Disable the video decoder from drawing directly to a texture.
    public static final String DISABLE_ZERO_COPY_DXGI_VIDEO = "disable-zero-copy-dxgi-video";

    // Specifies if the |DOMAutomationController| needs to be bound in the
    // renderer. This binding happens on per-frame basis and hence can potentially
    // be a performance bottleneck. One should only enable it when automating dom
    // based tests.
    public static final String DOM_AUTOMATION_CONTROLLER = "dom-automation";

    // Disable antialiasing on 2d canvas clips
    public static final String DISABLE2D_CANVAS_CLIP_ANTIALIASING = "disable-2d-canvas-clip-aa";

    // Disable YUV image decoding for those formats and cases where it's supported.
    // Has no effect unless GPU rasterization is enabled.
    public static final String DISABLE_YUV_IMAGE_DECODING = "disable-yuv-image-decoding";

    // Logs Runtime Call Stats for Blink. --single-process also needs to be
    // used along with this for the stats to be logged.
    public static final String DUMP_BLINK_RUNTIME_CALL_STATS = "dump-blink-runtime-call-stats";

    // Enables LCD text.
    public static final String ENABLE_LCD_TEXT = "enable-lcd-text";

    // Enable the creation of compositing layers when it would prevent LCD text.
    public static final String ENABLE_PREFER_COMPOSITING_TO_LCD_TEXT = "enable-prefer-compositing-to-lcd-text";

    // Enable one or more Blink runtime-enabled features.
    // Use names from runtime_enabled_features.json5, separated by commas.
    // Applied before kDisableBlinkFeatures, and after other flags that change these
    // features.
    public static final String ENABLE_BLINK_FEATURES = "enable-blink-features";

    // Enable native caret browsing, in which a moveable cursor is placed on a web
    // page, allowing a user to select and navigate through non-editable text using
    // just a keyboard. See https://crbug.com/977390 for links to i2i.
    public static final String ENABLE_CARET_BROWSING = "enable-caret-browsing";

    // Enables experimental WebAssembly features.
    public static final String ENABLE_EXPERIMENTAL_WEB_ASSEMBLY_FEATURES = "enable-experimental-webassembly-features";

    // Enables Web Platform features that are in development.
    public static final String ENABLE_EXPERIMENTAL_WEB_PLATFORM_FEATURES = "enable-experimental-web-platform-features";

    // Enables support for FTP URLs. See https://crbug.com/333943.
    public static final String ENABLE_FTP = "enable-ftp";

    // Disables all RuntimeEnabledFeatures that can be enabled via OriginTrials.
    public static final String DISABLE_ORIGIN_TRIAL_CONTROLLED_BLINK_FEATURES = "disable-origin-trial-controlled-blink-features";

    // Specify that all compositor resources should be backed by GPU memory buffers.
    public static final String ENABLE_GPU_MEMORY_BUFFER_COMPOSITOR_RESOURCES = "enable-gpu-memory-buffer-compositor-resources";

    // Enable GpuMemoryBuffer backed VideoFrames.
    public static final String ENABLE_GPU_MEMORY_BUFFER_VIDEO_FRAMES = "enable-gpu-memory-buffer-video-frames";

    // When using CPU rasterizing generate low resolution tiling. Low res
    // tiles may be displayed during fast scrolls especially on slower devices.
    public static final String ENABLE_LOW_RES_TILING = "enable-low-res-tiling";

    // Force logging to be enabled.  Logging is disabled by default in release
    // builds.
    public static final String ENABLE_LOGGING = "enable-logging";

    // Enables the type, downlinkMax attributes of the NetInfo API. Also, enables
    // triggering of change attribute of the NetInfo API when there is a change in
    // the connection type.
    public static final String ENABLE_NETWORK_INFORMATION_DOWNLINK_MAX = "enable-network-information-downlink-max";

    // Disables the video decoder from drawing to an NV12 textures instead of ARGB.
    public static final String DISABLE_NV12_DXGI_VIDEO = "disable-nv12-dxgi-video";

    // Enables testing features of the Plugin Placeholder. For internal use only.
    public static final String ENABLE_PLUGIN_PLACEHOLDER_TESTING = "enable-plugin-placeholder-testing";

    // Make the values returned to window.performance.memory more granular and more
    // up to date in shared worker. Without this flag, the memory information is
    // still available, but it is bucketized and updated less frequently. This flag
    // also applys to workers.
    public static final String ENABLE_PRECISE_MEMORY_INFO = "enable-precise-memory-info";

    // Enables PrintBrowser mode, in which everything renders as though printed.
    public static final String ENABLE_PRINT_BROWSER = "enable-print-browser";

    // Enables RGBA_4444 textures.
    public static final String ENABLE_RGBA4444_TEXTURES = "enable-rgba-4444-textures";

    // Set options to cache V8 data. (off, preparse data, or code)
    public static final String V8_CACHE_OPTIONS = "v8-cache-options";

    // If true the ServiceProcessLauncher is used to launch services. This allows
    // for service binaries to be loaded rather than using the utility process. This
    // is only useful for tests.
    public static final String ENABLE_SERVICE_BINARY_LAUNCHER = "enable-service-binary-launcher";

    // Enables the Skia benchmarking extension.
    public static final String ENABLE_SKIA_BENCHMARKING = "enable-skia-benchmarking";

    // On platforms that support it, enables smooth scroll animation.
    public static final String ENABLE_SMOOTH_SCROLLING = "enable-smooth-scrolling";

    // Enable spatial navigation
    public static final String ENABLE_SPATIAL_NAVIGATION = "enable-spatial-navigation";

    // Blocks all insecure requests from secure contexts, and prevents the user
    // from overriding that decision.
    public static final String ENABLE_STRICT_MIXED_CONTENT_CHECKING = "enable-strict-mixed-content-checking";

    // Blocks insecure usage of a number of powerful features (device orientation,
    // for example) that we haven't yet deprecated for the web at large.
    public static final String ENABLE_STRICT_POWERFUL_FEATURE_RESTRICTIONS = "enable-strict-powerful-feature-restrictions";

    // Enabled threaded compositing for web tests.
    public static final String ENABLE_THREADED_COMPOSITING = "enable-threaded-compositing";

    // Enable tracing during the execution of browser tests.
    public static final String ENABLE_TRACING = "enable-tracing";

    // The filename to write the output of the test tracing to.
    public static final String ENABLE_TRACING_OUTPUT = "enable-tracing-output";

    // Enable screen capturing support for MediaStream API.
    public static final String ENABLE_USER_MEDIA_SCREEN_CAPTURING = "enable-usermedia-screen-capturing";

    // Enable the mode that uses zooming to implment device scale factor behavior.
    public static final String ENABLE_USE_ZOOM_FOR_DSF = "enable-use-zoom-for-dsf";

    // Enables the use of the @viewport CSS rule, which allows
    // pages to control aspects of their own layout. This also turns on touch-screen
    // pinch gestures.
    public static final String ENABLE_VIEWPORT = "enable-viewport";

    // Enable the Vtune profiler support.
    public static final String ENABLE_VTUNE = "enable-vtune-support";

    // Enable the Web Authentication Testing API.
    // https://w3c.github.io/webauthn
    public static final String ENABLE_WEB_AUTH_TESTING_API = "enable-web-authentication-testing-api";

    // Enable WebGL2 Compute context.
    public static final String ENABLE_WEB_GL2_COMPUTE_CONTEXT = "enable-webgl2-compute-context";

    // Enables WebGL extensions not yet approved by the community.
    public static final String ENABLE_WEB_GL_DRAFT_EXTENSIONS = "enable-webgl-draft-extensions";

    // Enables WebGL rendering into a scanout buffer for overlay support.
    public static final String ENABLE_WEB_GL_IMAGE_CHROMIUM = "enable-webgl-image-chromium";

    // Enable rasterizer that writes directly to GPU memory associated with tiles.
    public static final String ENABLE_ZERO_COPY = "enable-zero-copy";

    // Handle to the shared memory segment containing field trial state that is to
    // be shared between processes. The argument to this switch is the handle id
    // (pointer on Windows) as a string, followed by a comma, then the size of the
    // shared memory segment as a string.
    public static final String FIELD_TRIAL_HANDLE = "field-trial-handle";

    // Define an alias root directory which is replaced with the replacement string
    // in file URLs. The format is "/alias=/replacement", which would turn
    // file:///alias/some/path.html into file:///replacement/some/path.html.
    public static final String FILE_URL_PATH_ALIAS = "file-url-path-alias";

    // Always use the Skia GPU backend for drawing layer tiles. Only valid with GPU
    // accelerated compositing + impl-side painting. Overrides the
    // kEnableGpuRasterization flag.
    public static final String FORCE_GPU_RASTERIZATION = "force-gpu-rasterization";

    // Disables OOP rasterization.  Takes precedence over the enable flag.
    public static final String DISABLE_OOP_RASTERIZATION = "disable-oop-rasterization";

    // Turns on out of process raster for the renderer whenever gpu raster
    // would have been used.  Enables the chromium_raster_transport extension.
    public static final String ENABLE_OOP_RASTERIZATION = "enable-oop-rasterization";

    // Turns on skia deferred display list for out of process raster.
    public static final String ENABLE_OOP_RASTERIZATION_DDL = "enable-oop-rasterization-ddl";

    // Pins the default referrer policy to the pre-M80 value of
    // no-referrer-when-downgrade.
    // TODO(crbug.com/1016541): After M82, remove when the corresponding
    // enterprise policy has been deleted.
    public static final String FORCE_LEGACY_DEFAULT_REFERRER_POLICY = "force-legacy-default-referrer-policy";

    // The number of multisample antialiasing samples for GPU rasterization.
    // Requires MSAA support on GPU to have an effect. 0 disables MSAA.
    public static final String GPU_RASTERIZATION_MSAA_SAMPLE_COUNT = "gpu-rasterization-msaa-sample-count";

    // Forces use of hardware overlay for fullscreen video playback. Useful for
    // testing the Android overlay fullscreen functionality on other platforms.
    public static final String FORCE_OVERLAY_FULLSCREEN_VIDEO = "force-overlay-fullscreen-video";

    // This forces pages to be loaded as presentation receivers.  Useful for testing
    // behavior specific to presentation receivers.
    // Spec: https://www.w3.org/TR/presentation-api/#interface-presentationreceiver
    public static final String FORCE_PRESENTATION_RECEIVER_FOR_TESTING = "force-presentation-receiver-for-testing";

    // Force renderer accessibility to be on instead of enabling it on demand when
    // a screen reader is detected. The disable-renderer-accessibility switch
    // overrides this if present.
    public static final String FORCE_RENDERER_ACCESSIBILITY = "force-renderer-accessibility";

    // For development / testing only. When running content_browsertests,
    // saves output of failing accessibility tests to their expectations files in
    // content/test/data/accessibility/, overwriting existing file content.
    public static final String GENERATE_ACCESSIBILITY_TEST_EXPECTATIONS = "generate-accessibility-test-expectations";

    // Extra command line options for launching the GPU process (normally used
    // for debugging). Use like renderer-cmd-prefix.
    public static final String GPU_LAUNCHER = "gpu-launcher";

    // Makes this process a GPU sub-process.
    public static final String GPU_PROCESS = "gpu-process";

    // Starts the GPU sandbox before creating a GL context.
    public static final String GPU_SANDBOX_START_EARLY = "gpu-sandbox-start-early";

    // Causes the GPU process to display a dialog on launch.
    public static final String GPU_STARTUP_DIALOG = "gpu-startup-dialog";

    // Start the renderer with an initial virtual time override specified in
    // seconds since the epoch.
    public static final String INITIAL_VIRTUAL_TIME = "initial-virtual-time";

    // Run the GPU process as a thread in the browser process.
    public static final String IN_PROCESS_GPU = "in-process-gpu";

    // Overrides the timeout, in seconds, that a child process waits for a
    // connection from the browser before killing itself.
    public static final String IPC_CONNECTION_TIMEOUT = "ipc-connection-timeout";

    // Require dedicated processes for a set of origins, specified as a
    // comma-separated list. For example:
    //   --isolate-origins=https://www.foo.com,https://www.bar.com
    public static final String ISOLATE_ORIGINS = "isolate-origins";

    // Disable latest shipping ECMAScript 6 features.
    public static final String DISABLE_JAVA_SCRIPT_HARMONY_SHIPPING = "disable-javascript-harmony-shipping";

    // Enables experimental Harmony (ECMAScript 6) features.
    public static final String JAVA_SCRIPT_HARMONY = "javascript-harmony";

    // Specifies the flags passed to JS engine.
    public static final String JAVA_SCRIPT_FLAGS = "js-flags";

    // Flag to launch tests in the browser process.
    public static final String LAUNCH_AS_BROWSER = "as-browser";

    // Logs GPU control list decisions when enforcing blacklist rules.
    public static final String LOG_GPU_CONTROL_LIST_DECISIONS = "log-gpu-control-list-decisions";

    // Sets the minimum log level. Valid values are from 0 to 3:
    // INFO = 0, WARNING = 1, LOG_ERROR = 2, LOG_FATAL = 3.
    public static final String LOGGING_LEVEL = "log-level";

    // Overrides the default file name to use for general-purpose logging (does not
    // affect which events are logged).
    public static final String LOG_FILE = "log-file";

    // Resizes of the main frame are caused by changing between landscape and
    // portrait mode (i.e. Android) so the page should be rescaled to fit.
    public static final String MAIN_FRAME_RESIZES_ARE_ORIENTATION_CHANGES = "main-frame-resizes-are-orientation-changes";

    // Allows user to override maximum number of active WebGL contexts per
    // renderer process.
    public static final String MAX_ACTIVE_WEB_GL_CONTEXTS = "max-active-webgl-contexts";

    // Sets the maximium decoded image size limitation.
    public static final String MAX_DECODED_IMAGE_SIZE_MB = "max-decoded-image-size-mb";

    // Sets the width and height above which a composited layer will get tiled.
    public static final String MAX_UNTILED_LAYER_HEIGHT = "max-untiled-layer-height";


    public static final String MAX_UNTILED_LAYER_WIDTH = "max-untiled-layer-width";

    // Indicates the utility process should run with a message loop type of UI.
    public static final String MESSAGE_LOOP_TYPE_UI = "message-loop-type-ui";

    // Set the default result for MockCertVerifier. This only works in test code.
    public static final String MOCK_CERT_VERIFIER_DEFAULT_RESULT_FOR_TESTING = "mock-cert-verifier-default-result-for-testing";

    // Use a Mojo-based LocalStorage implementation.
    public static final String MOJO_LOCAL_STORAGE = "mojo-local-storage";

    // Sets the timeout seconds of the network-quiet timers in IdlenessDetector.
    // Used by embedders who want to change the timeout time in order to run web
    // contents on various embedded devices and changeable network bandwidths in
    // different regions. For example, it's useful when using FirstMeaningfulPaint
    // signal to dismiss a splash screen.
    public static final String NETWORK_QUIET_TIMEOUT = "network-quiet-timeout";

    // Disables the use of a zygote process for forking child processes. Instead,
    // child processes will be forked and exec'd directly. Note that --no-sandbox
    // should also be used together with this flag because the sandbox needs the
    // zygote to work.
    public static final String NO_ZYGOTE = "no-zygote";

    // Disables V8 mitigations for executing untrusted code.
    public static final String NO_V8_UNTRUSTED_CODE_MITIGATIONS = "no-v8-untrusted-code-mitigations";

    // Number of worker threads used to rasterize content.
    public static final String NUM_RASTER_THREADS = "num-raster-threads";

    // Override the behavior of plugin throttling for testing.
    // By default the throttler is only enabled for a hard-coded list of plugins.
    // Set the value to 'always' to always throttle every plugin instance. Set the
    // value to 'never' to disable throttling.
    public static final String OVERRIDE_PLUGIN_POWER_SAVER_FOR_TESTING = "override-plugin-power-saver-for-testing";

    // Override the default value for the 'passive' field in javascript
    // addEventListener calls. Values are defined as:
    //  'documentonlytrue' to set the default be true only for document level nodes.
    //  'true' to set the default to be true on all nodes (when not specified).
    //  'forcealltrue' to force the value on all nodes.
    public static final String PASSIVE_LISTENERS_DEFAULT = "passive-listeners-default";

    // Argument to the process type that indicates a PPAPI broker process type.
    public static final String PPAPI_BROKER_PROCESS = "ppapi-broker";

    // "Command-line" arguments for the PPAPI Flash; used for debugging options.
    public static final String PPAPI_FLASH_ARGS = "ppapi-flash-args";

    // Runs PPAPI (Pepper) plugins in-process.
    public static final String PPAPI_IN_PROCESS = "ppapi-in-process";

    // Specifies a command that should be used to launch the ppapi plugin process.
    // Useful for running the plugin process through purify or quantify.  Ex:
    //   --ppapi-plugin-launcher="path\to\purify /Run=yes"
    public static final String PPAPI_PLUGIN_LAUNCHER = "ppapi-plugin-launcher";

    // Argument to the process type that indicates a PPAPI plugin process type.
    public static final String PPAPI_PLUGIN_PROCESS = "ppapi";

    // Causes the PPAPI sub process to display a dialog on launch. Be sure to use
    // --no-sandbox as well or the sandbox won't allow the dialog to display.
    public static final String PPAPI_STARTUP_DIALOG = "ppapi-startup-dialog";

    // IMPORTANT: This isn't to be confused with --site-per-process (which is about
    // isolation, not consolidation). You probably want the other one.
    public static final String PROCESS_PER_SITE = "process-per-site";

    // Runs each set of script-connected tabs (i.e., a BrowsingInstance) in its own
    // renderer process.  We default to using a renderer process for each
    // site instance (i.e., group of pages from the same registered domain with
    // script connections to each other).
    // TODO(creis): This flag is currently a no-op.  We should refactor it to avoid
    // "unnecessary" process swaps for cross-site navigations but still swap when
    // needed for security (e.g., isolated origins).
    public static final String PROCESS_PER_TAB = "process-per-tab";

    // The value of this switch determines whether the process is started as a
    // renderer or plugin host.  If it's empty, it's the browser.
    public static final String PROCESS_TYPE = "type";

    // Uses a specified proxy server, overrides system settings. This switch only
    // affects HTTP and HTTPS requests. ARC-apps use only HTTP proxy server with the
    // highest priority.
    // TODO(yzshen): Move this switch back to chrome/common/chrome_switches.{h,cc},
    // once the network service is able to access the corresponding setting via the
    // pref service.
    public static final String PROXY_SERVER = "proxy-server";

    // Enables or disables pull-to-refresh gesture in response to vertical
    // overscroll.
    // Set the value to '0' to disable the feature, set to '1' to enable it for both
    // touchpad and touchscreen, and set to '2' to enable it only for touchscreen.
    // Defaults to disabled.
    public static final String PULL_TO_REFRESH = "pull-to-refresh";

    // Register Pepper plugins (see pepper_plugin_list.cc for its format).
    public static final String REGISTER_PEPPER_PLUGINS = "register-pepper-plugins";

    // Enables remote debug over stdio pipes [in=3, out=4].
    // Optionally, specifies the format for the protocol messages, can be either
    // "JSON" (the default) or "CBOR".
    public static final String REMOTE_DEBUGGING_PIPE = "remote-debugging-pipe";

    // Enables remote debug over HTTP on the specified port.
    public static final String REMOTE_DEBUGGING_PORT = "remote-debugging-port";


    public static final String RENDERER_CLIENT_ID = "renderer-client-id";

    // The contents of this flag are prepended to the renderer command line.
    // Useful values might be "valgrind" or "xterm -e gdb --args".
    public static final String RENDERER_CMD_PREFIX = "renderer-cmd-prefix";

    // Causes the process to run as renderer instead of as browser.
    public static final String RENDERER_PROCESS = "renderer";

    // Overrides the default/calculated limit to the number of renderer processes.
    // Very high values for this setting can lead to high memory/resource usage
    // or instability.
    public static final String RENDERER_PROCESS_LIMIT = "renderer-process-limit";

    // Causes the renderer process to display a dialog on launch. Passing this flag
    // also adds service_manager::kNoSandbox on Windows non-official builds, since
    // that's needed to show a dialog.
    public static final String RENDERER_STARTUP_DIALOG = "renderer-startup-dialog";

    // Manual tests only run when --run-manual is specified. This allows writing
    // tests that don't run automatically but are still in the same test binary.
    // This is useful so that a team that wants to run a few tests doesn't have to
    // add a new binary that must be compiled on all builds.
    public static final String RUN_MANUAL_TESTS_FLAG = "run-manual";

    // Causes the process to run as a sandbox IPC subprocess.
    public static final String SANDBOX_IPC_PROCESS = "sandbox-ipc";

    // Visibly render a border around layout shift rects in the web page to help
    // debug and study layout shifts.
    public static final String SHOW_LAYOUT_SHIFT_REGIONS = "show-layout-shift-regions";

    // Visibly render a border around paint rects in the web page to help debug
    // and study painting behavior.
    public static final String SHOW_PAINT_RECTS = "show-paint-rects";

    // Runs the renderer and plugins in the same process as the browser
    public static final String SINGLE_PROCESS = "single-process";

    // IMPORTANT: this isn't to be confused with --process-per-site (which is about
    // process consolidation, not isolation). You probably want this one.
    public static final String SITE_PER_PROCESS = "site-per-process";

    // Note that for historic reasons the name of the switch misleadingly mentions
    // "trials", but the switch also disables the default site isolation that ships
    // on desktop since M67.  The name of the switch is preserved for
    // backcompatibility of chrome://flags.
    public static final String DISABLE_SITE_ISOLATION = "disable-site-isolation-trials";

    // Specifies if the browser should start in fullscreen mode, like if the user
    // had pressed F11 right after startup.
    public static final String START_FULLSCREEN = "start-fullscreen";

    // Specifies if the |StatsCollectionController| needs to be bound in the
    // renderer. This binding happens on per-frame basis and hence can potentially
    // be a performance bottleneck. One should only enable it when running a test
    // that needs to access the provided statistics.
    public static final String STATS_COLLECTION_CONTROLLER = "enable-stats-collection-bindings";

    // Specifies the max number of bytes that should be used by the skia font cache.
    // If the cache needs to allocate more, skia will purge previous entries.
    public static final String SKIA_FONT_CACHE_LIMIT_MB = "skia-font-cache-limit-mb";

    // Specifies the max number of bytes that should be used by the skia resource
    // cache. The previous entries are purged from the cache when the memory useage
    // exceeds this limit.
    public static final String SKIA_RESOURCE_CACHE_LIMIT_MB = "skia-resource-cache-limit-mb";

    // Type of the current test harness ("browser" or "ui").
    public static final String TEST_TYPE = "test-type";

    // Enable support for touch event feature detection.
    public static final String TOUCH_EVENT_FEATURE_DETECTION = "touch-events";

    // The values the kTouchEventFeatureDetection switch may have, as in
    // --touch-events=disabled.
    //   auto: enabled at startup when an attached touchscreen is present.
    public static final String TOUCH_EVENT_FEATURE_DETECTION_AUTO = "auto";

    //   enabled: touch events always enabled.
    public static final String TOUCH_EVENT_FEATURE_DETECTION_ENABLED = "enabled";

    //   disabled: touch events are disabled.
    public static final String TOUCH_EVENT_FEATURE_DETECTION_DISABLED = "disabled";

    // Controls how text selection granularity changes when touch text selection
    // handles are dragged. Should be "character" or "direction". If not specified,
    // the platform default is used.
    public static final String TOUCH_TEXT_SELECTION_STRATEGY = "touch-selection-strategy";

    // Accepts specified file URL of a trustable WebBundle file. This flag
    // should be used only for testing purpose.
    public static final String TRUSTABLE_WEB_BUNDLE_FILE_URL = "trustable-web-bundles-file-url";

    // Replaces the existing codecs supported in peer connection with a single fake
    // codec entry that create a fake video encoder and decoder.
    public static final String USE_FAKE_CODEC_FOR_PEER_CONNECTION = "use-fake-codec-for-peer-connection";

    // Bypass the media stream infobar by selecting the default device for media
    // streams (e.g. WebRTC). Works with --use-fake-device-for-media-stream.
    public static final String USE_FAKE_UI_FOR_MEDIA_STREAM = "use-fake-ui-for-media-stream";

    // Texture target for CHROMIUM_image backed video frame textures.
    public static final String VIDEO_IMAGE_TEXTURE_TARGET = "video-image-texture-target";

    // Set when Chromium should use a mobile user agent.
    public static final String USE_MOBILE_USER_AGENT = "use-mobile-user-agent";

    // Use the MockCertVerifier. This only works in test code.
    public static final String USE_MOCK_CERT_VERIFIER_FOR_TESTING = "use-mock-cert-verifier-for-testing";

    // The contents of this flag are prepended to the utility process command line.
    // Useful values might be "valgrind" or "xterm -e gdb --args".
    public static final String UTILITY_CMD_PREFIX = "utility-cmd-prefix";

    // Causes the process to run as a utility subprocess.
    public static final String UTILITY_PROCESS = "utility";

    // Causes the utility process to display a dialog on launch.
    public static final String UTILITY_STARTUP_DIALOG = "utility-startup-dialog";

    // In debug builds, asserts that the stream of input events is valid.
    public static final String VALIDATE_INPUT_EVENT_STREAM = "validate-input-event-stream";

    // Will add kWaitForDebugger to every child processes. If a value is passed, it
    // will be used as a filter to determine if the child process should have the
    // kWaitForDebugger flag passed on or not.
    public static final String WAIT_FOR_DEBUGGER_CHILDREN = "wait-for-debugger-children";

    // Flag used by WebUI test runners to wait for debugger to be attached.
    public static final String WAIT_FOR_DEBUGGER_WEB_UI = "wait-for-debugger-webui";

    // Set the antialiasing method used for webgl. (none, explicit, implicit)
    public static final String WEBGL_ANTIALIASING_MODE = "webgl-antialiasing-mode";

    // Set a default sample count for webgl if msaa is enabled.
    public static final String WEBGL_MSAA_SAMPLE_COUNT = "webgl-msaa-sample-count";

    // Disables encryption of RTP Media for WebRTC. When Chrome embeds Content, it
    // ignores this switch on its stable and beta channels.
    public static final String DISABLE_WEB_RTC_ENCRYPTION = "disable-webrtc-encryption";

    // Disables HW decode acceleration for WebRTC.
    public static final String DISABLE_WEB_RTC_HW_DECODING = "disable-webrtc-hw-decoding";

    // Disables HW encode acceleration for WebRTC.
    public static final String DISABLE_WEB_RTC_HW_ENCODING = "disable-webrtc-hw-encoding";

    // Enables negotiation of GCM cipher suites from RFC 7714 for SRTP in WebRTC.
    // See https://tools.ietf.org/html/rfc7714 for further information.
    public static final String ENABLE_WEB_RTC_SRTP_AES_GCM = "enable-webrtc-srtp-aes-gcm";

    // Enables negotiation of encrypted header extensions from RFC 6904 for SRTP
    // in WebRTC.
    // See https://tools.ietf.org/html/rfc6904 for further information.
    // TODO(https://crbug.com/954201): Remove this.
    public static final String ENABLE_WEB_RTC_SRTP_ENCRYPTED_HEADERS = "enable-webrtc-srtp-encrypted-headers";

    // Enables Origin header in Stun messages for WebRTC.
    public static final String ENABLE_WEB_RTC_STUN_ORIGIN = "enable-webrtc-stun-origin";

    // Enforce IP Permission check. TODO(guoweis): Remove this once the feature is
    // not under finch and becomes the default.
    public static final String ENFORCE_WEB_RTC_IP_PERMISSION_CHECK = "enforce-webrtc-ip-permission-check";

    // Override WebRTC IP handling policy to mimic the behavior when WebRTC IP
    // handling policy is specified in Preferences.
    public static final String FORCE_WEB_RTC_IP_HANDLING_POLICY = "force-webrtc-ip-handling-policy";

    // Override the maximum framerate as can be specified in calls to getUserMedia.
    // This flag expects a value.  Example: --max-gum-fps=17.5
    public static final String WEB_RTC_MAX_CAPTURE_FRAMERATE = "max-gum-fps";

    // Configure the maximum CPU time percentage of a single core that can be
    // consumed for desktop capturing. Default is 50. Set 100 to disable the
    // throttling of the capture.
    public static final String WEB_RTC_MAX_CPU_CONSUMPTION_PERCENTAGE = "webrtc-max-cpu-consumption-percentage";

    // Renderer process parameter for WebRTC Stun probe trial to determine the
    // interval. Please see SetupStunProbeTrial in
    // chrome_browser_field_trials_desktop.cc for more detail.
    public static final String WEB_RTC_STUN_PROBE_TRIAL_PARAMETER = "webrtc-stun-probe-trial";

    // Enable capture and local storage of WebRTC event logs without visiting
    // chrome://webrtc-internals. This is useful for automated testing. It accepts
    // the path to which the local logs would be stored. Disabling is not possible
    // without restarting the browser and relaunching without this flag.
    public static final String WEB_RTC_LOCAL_EVENT_LOGGING = "webrtc-event-logging";

    // Forcibly enable and select the specified runtime for webxr.
    // Note that this provides an alternative means of enabling a runtime, and will
    // also functionally disable all other runtimes.
    public static final String WEB_XR_FORCE_RUNTIME = "force-webxr-runtime";

    // Tell WebXr to assume that it does not support any runtimes.
    public static final String WEB_XR_RUNTIME_NONE = "no-vr-runtime";


    public static final String WEB_XR_RUNTIME_ORIENTATION_SENSORS = "orientation-sensors";

    // The following are the runtimes that WebXr supports.
    public static final String WEB_XR_RUNTIME_OCULUS = "oculus";


    public static final String WEB_XR_RUNTIME_OPEN_VR = "openvr";


    public static final String WEB_XR_RUNTIME_OPEN_XR = "openxr";


    public static final String WEB_XR_RUNTIME_WMR = "windows-mixed-reality";

    // This switch allows the Web Components v0 APIs to be re-enabled temporarily
    // from M80 through M84.
    // TODO(937746): Remove this after M84.
    public static final String WEB_COMPONENTS_V0_ENABLED = "web-components-v0-enabled";

    // Disable Media Session API
    public static final String DISABLE_MEDIA_SESSION_API = "disable-media-session-api";

    // Disable overscroll edge effects like those found in Android views.
    public static final String DISABLE_OVERSCROLL_EDGE_EFFECT = "disable-overscroll-edge-effect";

    // Disable the pull-to-refresh effect when vertically overscrolling content.
    public static final String DISABLE_PULL_TO_REFRESH_EFFECT = "disable-pull-to-refresh-effect";

    // Disable the locking feature of the screen orientation API.
    public static final String DISABLE_SCREEN_ORIENTATION_LOCK = "disable-screen-orientation-lock";

    // Just like kDisableSiteIsolation, but doesn't show the "stability and security
    // will suffer" butter bar warning.
    public static final String DISABLE_SITE_ISOLATION_FOR_POLICY = "disable-site-isolation-for-policy";

    // Disable timeouts that may cause the browser to die when running slowly. This
    // is useful if running with profiling (such as debug malloc).
    public static final String DISABLE_TIMEOUTS_FOR_PROFILING = "disable-timeouts-for-profiling";

    // Enable inverting of selection handles so that they are not clipped by the
    // viewport boundaries.
    public static final String ENABLE_ADAPTIVE_SELECTION_HANDLE_ORIENTATION = "enable-adaptive-selection-handle-orientation";

    // Enable drag manipulation of longpress-triggered text selections.
    public static final String ENABLE_LONGPRESS_DRAG_SELECTION = "enable-longpress-drag-selection";

    // The telephony region (ISO country code) to use in phone number detection.
    public static final String NETWORK_COUNTRY_ISO = "network-country-iso";

    // Enables remote debug over HTTP on the specified socket name.
    public static final String REMOTE_DEBUGGING_SOCKET_NAME = "remote-debugging-socket-name";

    // Block ChildProcessMain thread of the renderer's ChildProcessService until a
    // Java debugger is attached.
    public static final String RENDERER_WAIT_FOR_JAVA_DEBUGGER = "renderer-wait-for-java-debugger";

    // Enable the experimental Accessibility Object Model APIs in development.
    public static final String ENABLE_ACCESSIBILITY_OBJECT_MODEL = "enable-accessibility-object-model";

    // Enable the aggressive flushing of DOM Storage to minimize data loss.
    public static final String ENABLE_AGGRESSIVE_DOM_STORAGE_FLUSHING = "enable-aggressive-domstorage-flushing";

    // Enable indication that browser is controlled by automation.
    public static final String ENABLE_AUTOMATION = "enable-automation";

    // Allows sending text-to-speech requests to speech-dispatcher, a common
    // Linux speech service. Because it's buggy, the user must explicitly
    // enable it so that visiting a random webpage can't cause instability.
    public static final String ENABLE_SPEECH_DISPATCHER = "enable-speech-dispatcher";

    // /prefetch:# arguments to use when launching various process types. It has
    // been observed that when file reads are consistent for 3 process launches with
    // the same /prefetch:# argument, the Windows prefetcher starts issuing reads in
    // batch at process launch. Because reads depend on the process type, the
    // prefetcher wouldn't be able to observe consistent reads if no /prefetch:#
    // arguments were used. Note that the browser process has no /prefetch:#
    // argument; as such all other processes must have one in order to avoid
    // polluting its profile. Note: # must always be in [1, 8]; otherwise it is
    // ignored by the Windows prefetcher.
    public static final String PREFETCH_ARGUMENT_RENDERER = "/prefetch:1";


    public static final String PREFETCH_ARGUMENT_GPU = "/prefetch:2";


    public static final String PREFETCH_ARGUMENT_PPAPI = "/prefetch:3";


    public static final String PREFETCH_ARGUMENT_PPAPI_BROKER = "/prefetch:4";

    // /prefetch:# argument shared by all process types that don't have their own.
    // It is likely that the prefetcher won't work for these process types as it
    // won't be able to observe consistent file reads across launches. However,
    // having a valid prefetch argument for these process types is required to
    // prevent them from interfering with the prefetch profile of the browser
    // process.
    public static final String PREFETCH_ARGUMENT_OTHER = "/prefetch:8";

    // Device scale factor passed to certain processes like renderers, etc.
    public static final String DEVICE_SCALE_FACTOR = "device-scale-factor";

    // Disable the Legacy Window which corresponds to the size of the WebContents.
    public static final String DISABLE_LEGACY_INTERMEDIATE_WINDOW = "disable-legacy-window";

    // Enables H264 HW decode acceleration for WebRtc on Win 7.
    public static final String ENABLE_WIN7_WEB_RTC_HWH264_DECODING = "enable-win7-webrtc-hw-h264-decoding";

    // DirectWrite FontCache is shared by browser to renderers using shared memory.
    // This switch allows us to pass the shared memory handle to the renderer.
    public static final String FONT_CACHE_SHARED_HANDLE = "font-cache-shared-handle";

    // The boolean value (0/1) of FontRenderParams::antialiasing to be passed to
    // Ppapi processes.
    public static final String PPAPI_ANTIALIASED_TEXT_ENABLED = "ppapi-antialiased-text-enabled";

    // The enum value of FontRenderParams::subpixel_rendering to be passed to Ppapi
    // processes.
    public static final String PPAPI_SUBPIXEL_RENDERING_SETTING = "ppapi-subpixel-rendering-setting";

    // Causes the second GPU process used for gpu info collection to display a
    // dialog on launch.
    public static final String GPU2_STARTUP_DIALOG = "gpu2-startup-dialog";

    // Dumps IPC messages sent from renderer processes to the browser process to
    // the given directory. Used primarily to gather samples for IPC fuzzing.
    public static final String IPC_DUMP_DIRECTORY = "ipc-dump-directory";

    // Specifies the testcase used by the IPC fuzzer.
    public static final String IPC_FUZZER_TESTCASE = "ipc-fuzzer-testcase";

    // Prevent instantiation.
    private ContentSwitches() {}
}
