// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.blink_public.common;

/**
 * Constants for the names of Blink Features.
 */
public final class BlinkFeatures {


    // This following string constants were inserted by
    //     java_cpp_features.py
    // From
    //     ../../third_party/blink/common/features.cc
    // Into
    //     ../../third_party/blink/public/common/android/java_templates/BlinkFeatures.java.tmpl

    // Enable intervention for download that was initiated from or occurred in an ad
    // frame without user activation.
    public static final String BLOCKING_DOWNLOADS_IN_AD_FRAME_WITHOUT_USER_ACTIVATION = "BlockingDownloadsInAdFrameWithoutUserActivation";

    // Enable defer commits to avoid flash of unstyled content, for same origin
    // navigation only.
    public static final String PAINT_HOLDING = "PaintHolding";

    // Enable defer commits to avoid flash of unstyled content, for all navigation.
    public static final String PAINT_HOLDING_CROSS_ORIGIN = "PaintHoldingCrossOrigin";

    // Enable eagerly setting up a CacheStorage interface pointer and
    // passing it to service workers on startup as an optimization.
    // TODO(crbug/1077916): Re-enable once the issue with COOP/COEP is fixed.
    public static final String EAGER_CACHE_STORAGE_SETUP_FOR_SERVICE_WORKERS = "EagerCacheStorageSetupForServiceWorkers";

    // Controls script streaming.
    public static final String SCRIPT_STREAMING = "ScriptStreaming";

    // Allow streaming small (<30kB) scripts.
    public static final String SMALL_SCRIPT_STREAMING = "SmallScriptStreaming";

    // Enables user level memory pressure signal generation on Android.
    public static final String USER_LEVEL_MEMORY_PRESSURE_SIGNAL = "UserLevelMemoryPressureSignal";

    // Perform memory purges after freezing only if all pages are frozen.
    public static final String FREEZE_PURGE_MEMORY_ALL_PAGES_FROZEN = "FreezePurgeMemoryAllPagesFrozen";

    // Freezes the user-agent as part of https://github.com/WICG/ua-client-hints.
    public static final String FREEZE_USER_AGENT = "FreezeUserAgent";

    // Enables support for FTP URLs. When disabled FTP URLs will behave the same as
    // any other URL scheme that's unknown to the UA. See https://crbug.com/333943
    public static final String FTP_PROTOCOL = "FtpProtocol";

    // Enable Display Locking JavaScript APIs.
    public static final String DISPLAY_LOCKING = "DisplayLocking";


    public static final String JSON_MODULES = "JSONModules";


    public static final String FORCE_SYNCHRONOUS_HTML_PARSING = "ForceSynchronousHTMLParsing";

    // Enables top-level await in modules.
    public static final String TOP_LEVEL_AWAIT = "TopLevelAwait";

    // Enable EditingNG by default. This feature is for a kill switch.
    public static final String EDITING_NG = "EditingNG";

    // Enable LayoutNG.
    public static final String LAYOUT_NG = "LayoutNG";

    // Enable LayoutNGFieldset by default. This feature is for a kill switch.
    public static final String LAYOUT_NG_FIELDSET = "LayoutNGFieldset";


    public static final String FRAGMENT_ITEM = "FragmentItem";


    public static final String MIXED_CONTENT_AUTOUPGRADE = "AutoupgradeMixedContent";

    // Used to control the collection of anchor element metrics (crbug.com/856683).
    // If kNavigationPredictor is enabled, then metrics of anchor elements
    // in the first viewport after the page load and the metrics of the clicked
    // anchor element will be extracted and recorded. Additionally, navigation
    // predictor may preconnect/prefetch to resources/origins to make the
    // future navigations faster.
    public static final String NAVIGATION_PREDICTOR = "NavigationPredictor";


    public static final String PARENT_NODE_REPLACE_CHILDREN = "ParentNodeReplaceChildren";

    // Enable browser-initiated dedicated worker script loading
    // (PlzDedicatedWorker). https://crbug.com/906991
    public static final String PLZ_DEDICATED_WORKER = "PlzDedicatedWorker";

    // Enable Portals. https://crbug.com/865123.
    // Note that default enabling this does not expose the portal
    // element on its own, but does allow its use with an origin trial. This was the
    // case for the M85 Android only origin trial (https://crbug.com/1040212).
    public static final String PORTALS = "Portals";

    // https://crbug.com/1013389
    public static final String PORTALS_CROSS_ORIGIN = "PortalsCrossOrigin";

    // Enable the prerender V2. https://crbug.com/1126305.
    public static final String PRERENDER2 = "Prerender2";

    // Enable limiting previews loading hints to specific resource types.
    public static final String PREVIEWS_RESOURCE_LOADING_HINTS_SPECIFIC_RESOURCE_TYPES = "PreviewsResourceLoadingHintsSpecificResourceTypes";

    // TODO(https://crbug.com/926186): Disabled by default on Android for historical
    // reasons. Consider enabling by default if experiment results are positive.
    public static final String PURGE_RENDERER_MEMORY_WHEN_BACKGROUNDED = "PurgeRendererMemoryWhenBackgrounded";

    // Enable Implicit Root Scroller. https://crbug.com/903260.
    // TODO(bokan): Temporarily disabled on desktop platforms to address issues
    // with non-overlay scrollbars. https://crbug.com/948059.
    public static final String IMPLICIT_ROOT_SCROLLER = "ImplicitRootScroller";

    // Enables toggling overwrite mode when insert key is pressed.
    // https://crbug.com/1030231.
    public static final String INSERT_KEY_TOGGLE_MODE = "InsertKeyToggleMode";

    // Enables Raw Clipboard. https://crbug.com/897289.
    public static final String RAW_CLIPBOARD = "RawClipboard";

    // Enables usage of getCurrentBrowsingContextMedia() that allows capturing of
    // web content from the tab from which it is called. (crbug.com/1136940)
    public static final String RTC_GET_CURRENT_BROWSING_CONTEXT_MEDIA = "RTCGetCurrentBrowsingContextMedia";

    // Changes the default RTCPeerConnection constructor behavior to use Unified
    // Plan as the SDP semantics. When the feature is enabled, Unified Plan is used
    // unless the default is overridden (by passing {sdpSemantics:'plan-b'} as the
    // argument).
    public static final String RTC_UNIFIED_PLAN_BY_DEFAULT = "RTCUnifiedPlanByDefault";

    // Determines if the SDP attrbute extmap-allow-mixed should be offered by
    // default or not. The default value can be overridden by passing
    // {offerExtmapAllowMixed:true} as an argument to the RTCPeerConnection
    // constructor.
    public static final String RTC_OFFER_EXTMAP_ALLOW_MIXED = "RTCOfferExtmapAllowMixed";

    // Enables waiting for codec support status notification from GPU factory in RTC
    // codec factories.
    public static final String RTC_GPU_CODEC_SUPPORT_WAITER = "kRTCGpuCodecSupportWaiter";

    // Prevents workers from sending IsolateInBackgroundNotification to V8
    // and thus instructs V8 to favor performance over memory on workers.
    public static final String V8_OPTIMIZE_WORKERS_FOR_PERFORMANCE = "V8OptimizeWorkersForPerformance";

    // Controls whether the implementation of the performance.measureMemory
    // web API uses PerformanceManager or not.
    public static final String WEB_MEASURE_MEMORY_VIA_PERFORMANCE_MANAGER = "WebMeasureMemoryViaPerformanceManager";

    // Enables negotiation of experimental multiplex codec in SDP.
    public static final String WEB_RTC_MULTIPLEX_CODEC = "WebRTC-MultiplexCodec";

    // Causes WebRTC to replace host ICE candidate IP addresses with generated
    // names ending in ".local" and resolve them using mDNS.
    // http://crbug.com/878465
    public static final String WEB_RTC_HIDE_LOCAL_IPS_WITH_MDNS = "WebRtcHideLocalIpsWithMdns";

    // Note that the base::Feature should not be read from;
    // rather the provided accessors should be used, which also take into account
    // the managed policy override of the feature.
    public static final String INTENSIVE_WAKE_UP_THROTTLING = "IntensiveWakeUpThrottling";

    // When enabled, timers with timeout=0 are not throttled.
    public static final String OPT_OUT_ZERO_TIMEOUT_TIMERS_FROM_THROTTLING = "OptOutZeroTimeoutTimersFromThrottling";

    // Run-time feature for the |rtc_use_h264| encoder/decoder.
    public static final String WEB_RTC_H264_WITH_OPEN_H264F_FMPEG = "WebRTC-H264WithOpenH264FFmpeg";

    // Experiment of the delay from navigation to starting an update of a service
    // worker's script.
    public static final String SERVICE_WORKER_UPDATE_DELAY = "ServiceWorkerUpdateDelay";

    // Freeze scheduler task queues in background after allowed grace time.
    // "stop" is a legacy name.
    public static final String STOP_IN_BACKGROUND = "stop-in-background";

    // Freeze scheduler task queues in background on network idle.
    // This feature only works if stop-in-background is enabled.
    public static final String FREEZE_BACKGROUND_TAB_ON_NETWORK_IDLE = "freeze-background-tab-on-network-idle";

    // Freeze non-timer task queues in background, after allowed grace time.
    // "stop" is a legacy name.
    public static final String STOP_NON_TIMERS_IN_BACKGROUND = "stop-non-timers-in-background";

    // Enable the Storage Access API. https://crbug.com/989663.
    public static final String STORAGE_ACCESS_API = "StorageAccessAPI";

    // Enable text snippets in URL fragments. https://crbug.com/919204.
    public static final String TEXT_FRAGMENT_ANCHOR = "TextFragmentAnchor";

    // File handling integration. https://crbug.com/829689
    public static final String FILE_HANDLING_API = "FileHandlingAPI";

    // Allows for synchronous XHR requests during page dismissal
    public static final String ALLOW_SYNC_XHR_IN_PAGE_DISMISSAL = "AllowSyncXHRInPageDismissal";

    // Font enumeration and data access. https://crbug.com/535764
    public static final String FONT_ACCESS = "FontAccess";

    // Font access using a chooser interface. https://crbug.com/1138621
    public static final String FONT_ACCESS_CHOOSER = "FontAccessChooser";

    // Prefetch request properties are updated to be privacy-preserving. See
    // crbug.com/988956.
    public static final String PREFETCH_PRIVACY_CHANGES = "PrefetchPrivacyChanges";

    // Decodes jpeg 4:2:0 formatted images to YUV instead of RGBX and stores in this
    // format in the image decode cache. See crbug.com/919627 for details on the
    // feature.
    public static final String DECODE_JPEG420_IMAGES_TO_YUV = "DecodeJpeg420ImagesToYUV";

    // Decodes lossy WebP images to YUV instead of RGBX and stores in this format
    // in the image decode cache. See crbug.com/900264 for details on the feature.
    public static final String DECODE_LOSSY_WEB_P_IMAGES_TO_YUV = "DecodeLossyWebPImagesToYUV";

    // Enables cache-aware WebFonts loading. See https://crbug.com/570205.
    // The feature is disabled on Android for WebView API issue discussed at
    // https://crbug.com/942440.
    public static final String WEB_FONTS_CACHE_AWARE_TIMEOUT_ADAPTION = "WebFontsCacheAwareTimeoutAdaption";

    // Enabled to block programmatic focus in subframes when not triggered by user
    // activation (see htpps://crbug.com/954349).
    public static final String BLOCKING_FOCUS_WITHOUT_USER_ACTIVATION = "BlockingFocusWithoutUserActivation";


    public static final String AUDIO_WORKLET_REALTIME_THREAD = "AudioWorkletRealtimeThread";

    // A server-side switch for the REALTIME_AUDIO thread priority of
    // RealtimeAudioWorkletThread object. When disabled, it will use the NORMAL
    // priority thread.
    public static final String AUDIO_WORKLET_THREAD_REALTIME_PRIORITY = "AudioWorkletThreadRealtimePriority";

    // A feature to reduce the set of resources fetched by No-State Prefetch.
    public static final String LIGHTWEIGHT_NO_STATE_PREFETCH = "LightweightNoStatePrefetch";

    // Automatically convert light-themed pages to use a Blink-generated dark theme
    public static final String FORCE_WEB_CONTENTS_DARK_MODE = "WebContentsForceDark";

    // A feature to enable using the smallest image specified within image srcset
    // for users with Save Data enabled.
    public static final String SAVE_DATA_IMG_SRCSET = "SaveDataImgSrcset";

    // Instructs WebRTC to honor the Min/Max Video Encode Accelerator dimensions.
    public static final String WEB_RTC_USE_MIN_MAX_VEA_DIMENSIONS = "WebRtcUseMinMaxVEADimensions";

    // Blink garbage collection.
    // Enables compaction of backing stores on Blink's heap.
    public static final String BLINK_HEAP_COMPACTION = "BlinkHeapCompaction";

    // Enables concurrently marking Blink's heap.
    public static final String BLINK_HEAP_CONCURRENT_MARKING = "BlinkHeapConcurrentMarking";

    // Enables concurrently sweeping Blink's heap.
    public static final String BLINK_HEAP_CONCURRENT_SWEEPING = "BlinkHeapConcurrentSweeping";

    // Enables incrementally marking Blink's heap.
    public static final String BLINK_HEAP_INCREMENTAL_MARKING = "BlinkHeapIncrementalMarking";

    // Enables a marking stress mode that schedules more garbage collections and
    // also adds additional verification passes.
    public static final String BLINK_HEAP_INCREMENTAL_MARKING_STRESS = "BlinkHeapIncrementalMarkingStress";

    // Enables removing AppCache delays when triggering requests when the HTML was
    // not fetched from AppCache.
    public static final String VERIFY_HTML_FETCHED_FROM_APP_CACHE_BEFORE_DELAY = "VerifyHTMLFetchedFromAppCacheBeforeDelay";

    // Controls whether we use ThreadPriority::DISPLAY for renderer
    // compositor & IO threads.
    public static final String BLINK_COMPOSITOR_USE_DISPLAY_THREAD_PRIORITY = "BlinkCompositorUseDisplayThreadPriority";

    // Ignores cross origin windows in the named property interceptor of Window.
    // https://crbug.com/538562
    public static final String IGNORE_CROSS_ORIGIN_WINDOW_WHEN_NAMED_ACCESS_ON_WINDOW = "IgnoreCrossOriginWindowWhenNamedAccessOnWindow";

    // When enabled, loading priority of JavaScript requests is lowered when they
    // are force deferred by the intervention.
    public static final String LOWER_JAVA_SCRIPT_PRIORITY_WHEN_FORCE_DEFERRED = "LowerJavaScriptPriorityWhenForceDeferred";

    // When enabled, scripts in iframes are not force deferred by the DeferAllScript
    // intervention.
    public static final String DISABLE_FORCE_DEFER_IN_CHILD_FRAMES = "DisableForceDeferInChildFrames";

    // Enables redirecting subresources in the page to better compressed and
    // optimized versions to provide data savings.
    public static final String SUBRESOURCE_REDIRECT = "SubresourceRedirect";

    // When 'enabled', all cross-origin iframes will get a compositing layer.
    public static final String COMPOSITE_CROSS_ORIGIN_IFRAMES = "CompositeCrossOriginIframes";

    // When enabled, enforces new interoperable semantics for 3D transforms.
    // See crbug.com/1008483.
    public static final String TRANSFORM_INTEROP = "TransformInterop";

    // When enabled, beacons (and friends) have ResourceLoadPriority::kLow,
    // not ResourceLoadPriority::kVeryLow.
    public static final String SET_LOW_PRIORITY_FOR_BEACON = "SetLowPriorityForBeacon";

    // When enabled allows the header name used in the blink
    // CacheStorageCodeCacheHint runtime feature to be modified.  This runtime
    // feature disables generating full code cache for responses stored in
    // cache_storage during a service worker install event.  The runtime feature
    // must be enabled via the blink runtime feature mechanism, however.
    public static final String CACHE_STORAGE_CODE_CACHE_HINT_HEADER = "CacheStorageCodeCacheHintHeader";

    // When enabled, the beforeunload handler is dispatched when a frame is frozen.
    // This allows the browser to know whether discarding the frame could result in
    // lost user data, at the cost of extra CPU usage. The feature will be removed
    // once we have determine whether the CPU cost is acceptable.
    public static final String DISPATCH_BEFORE_UNLOAD_ON_FREEZE = "DispatchBeforeUnloadOnFreeze";

    // Enables the use of GpuMemoryBuffer images for low latency 2d canvas.
    // TODO(khushalsagar): Enable this if we're using SurfaceControl and GMBs allow
    // us to overlay these resources.
    public static final String LOW_LATENCY_CANVAS2D_IMAGE_CHROMIUM = "LowLatencyCanvas2dImageChromium";

    // Enables the use of shared image swap chains for low latency 2d canvas.
    public static final String LOW_LATENCY_CANVAS2D_SWAP_CHAIN = "LowLatencyCanvas2dSwapChain";

    // Enables the use of shared image swap chains for low latency webgl canvas.
    public static final String LOW_LATENCY_WEB_GL_SWAP_CHAIN = "LowLatencyWebGLSwapChain";

    // Enables Dawn-accelerated 2D canvas.
    public static final String DAWN2D_CANVAS = "Dawn2dCanvas";

    // Enables small accelerated canvases for webview (crbug.com/1004304)
    public static final String WEBVIEW_ACCELERATE_SMALL_CANVASES = "WebviewAccelerateSmallCanvases";


    public static final String CSS_REDUCED_FONT_LOADING_LAYOUT_INVALIDATIONS = "CSSReducedFontLoadingLayoutInvalidations";

    // When enabled, frees up CachedMetadata after consumption by script resources
    // and modules. Needed for the experiment in http://crbug.com/1045052.
    public static final String DISCARD_CODE_CACHE_AFTER_FIRST_USE = "DiscardCodeCacheAfterFirstUse";


    public static final String BLOCK_HTML_PARSER_ON_STYLE_SHEETS = "BlockHTMLParserOnStyleSheets";

    // Kill switch for the new <link disabled> behavior.
    // TODO(crbug.com/1087043): Remove this once the feature has
    // landed and no compat issues are reported.
    public static final String LINK_DISABLED_NEW_SPEC_BEHAVIOR = "LinkDisabledNewSpecBehavior";

    // Slightly delays rendering if there are fonts being preloaded, so that
    // they don't miss the first paint if they can be loaded fast enough (e.g.,
    // from the disk cache)
    public static final String FONT_PRELOADING_DELAYS_RENDERING = "FontPreloadingDelaysRendering";


    public static final String FLEX_ASPECT_RATIO = "FlexAspectRatio";


    public static final String KEEP_SCRIPT_RESOURCE_ALIVE = "KeepScriptResourceAlive";


    public static final String DELAY_ASYNC_SCRIPT_EXECUTION = "DelayAsyncScriptExecution";

    // Feature and parameters for delaying low priority requests behind "important"
    // (either high or medium priority requests). There are two parameters
    // highlighted below.
    public static final String DELAY_COMPETING_LOW_PRIORITY_REQUESTS = "DelayCompetingLowPriorityRequests";

    // The AppCache feature is a kill-switch for the entire AppCache feature,
    // both backend and API.  If disabled, then it will turn off the backend and
    // api, regardless of the presence of valid origin trial tokens.  Disabling
    // AppCache will also delete any AppCache data from the profile directory.
    public static final String APP_CACHE = "AppCache";

    // If AppCacheRequireOriginTrial is enabled, then the AppCache backend in the
    // browser will require origin trial tokens in order to load or store manifests
    // and their contents.
    public static final String APP_CACHE_REQUIRE_ORIGIN_TRIAL = "AppCacheRequireOriginTrial";

    // Enables the AV1 Image File Format (AVIF).
    public static final String AVIF = "AVIF";

    // Make all pending 'display: auto' web fonts enter the swap or failure period
    // immediately before reaching the LCP time limit (~2500ms), so that web fonts
    // do not become a source of bad LCP.
    public static final String ALIGN_FONT_DISPLAY_AUTO_TIMEOUT_WITH_LCP_GOAL = "AlignFontDisplayAutoTimeoutWithLCPGoal";

    // Enable throttling of fetch() requests from service workers in the
    // installing state.  The limit of 3 was chosen to match the limit
    // in background main frames.  In addition, trials showed that this
    // did not cause excessive install delays or timeouts.
    public static final String THROTTLE_INSTALLING_SERVICE_WORKER = "ThrottleInstallingServiceWorker";

    // Enables storing and loading security policies (for now, referrer policy) in
    // the policy container. The policy container for the current document is
    // attached to the RenderFrameHost and mirrored to the LocalFrame in Blink.
    public static final String POLICY_CONTAINER = "PolicyContainer";


    public static final String INPUT_PREDICTOR_TYPE_CHOICE = "InputPredictorTypeChoice";


    public static final String RESAMPLING_INPUT_EVENTS = "ResamplingInputEvents";


    public static final String RESAMPLING_SCROLL_EVENTS = "ResamplingScrollEvents";

    // Enables the device-memory, resource-width, viewport-width and DPR client
    // hints to be sent to third-party origins if the first-party has opted in to
    // receiving client hints, regardless of Feature Policy.
    public static final String ALLOW_CLIENT_HINTS_TO_THIRD_PARTY = "AllowClientHintsToThirdParty";


    public static final String FILTERING_SCROLL_PREDICTION = "FilteringScrollPrediction";


    public static final String KALMAN_HEURISTICS = "KalmanHeuristics";


    public static final String KALMAN_DIRECTION_CUT_OFF = "KalmanDirectionCutOff";


    public static final String SKIP_TOUCH_EVENT_FILTER = "SkipTouchEventFilter";

    // Improves support for WebXR on computers with multiple GPUs.
    public static final String WEB_XR_MULTI_GPU = "WebXRMultiGpu";

    // Enables dependency support in blink::MatchedPropertiesCache, which allows
    // caching of previously uncachable objects.
    public static final String CSS_MATCHED_PROPERTIES_CACHE_DEPENDENCIES = "CSSMatchedPropertiesCacheDependencies";

    // Disabling this will cause parkable strings to never be compressed.
    // This is useful for headless mode + virtual time. Since virtual time advances
    // quickly, strings may be parked too eagerly in that mode.
    public static final String COMPRESS_PARKABLE_STRINGS = "CompressParkableStrings";

    // Whether ParkableStrings can be written out to disk.
    // Depends on compression above.
    public static final String PARKABLE_STRINGS_TO_DISK = "ParkableStringsToDisk";

    // Controls whether to auto select on contextual menu click in Chrome OS.
    public static final String CR_OS_AUTO_SELECT = "CrOSAutoSelect";


    public static final String COMPOSITING_OPTIMIZATIONS = "CompositingOptimizations";

    // Reduce the amount of information in the default 'referer' header for
    // cross-origin requests.
    public static final String REDUCED_REFERRER_GRANULARITY = "ReducedReferrerGranularity";

    // Enables the constant streaming in the ContentCapture task.
    public static final String CONTENT_CAPTURE_CONSTANT_STREAMING = "ContentCaptureConstantStreaming";

    // Enables the user activated exponential delay in the ContentCapture task.
    public static final String CONTENT_CAPTURE_USER_ACTIVATED_DELAY = "ContentCaptureUserActivatedDelay";

    // Dispatches a fake fetch event to a service worker to check the offline
    // capability of the site before promoting installation.
    // See https://crbug.com/965802 for more details.
    public static final String CHECK_OFFLINE_CAPABILITY = "CheckOfflineCapability";

    // The "BackForwardCacheABExperimentControl" feature indicates the state of the
    // same-site BackForwardCache experiment. This information is used when sending
    // the "Sec-bfcache-experiment" HTTP Header on resource requests. The header
    // value is determined by the value of the "experiment_group_for_http_header"
    // feature parameter.
    public static final String BACK_FORWARD_CACHE_AB_EXPERIMENT_CONTROL = "BackForwardCacheABExperimentControl";

    // Whether we should composite a PLSA (paint layer scrollable area) even if it
    // means losing lcd text.
    public static final String PREFER_COMPOSITING_TO_LCD_TEXT = "PreferCompositingToLCDText";


    public static final String LOG_UNEXPECTED_IPC_POSTED_TO_BACK_FORWARD_CACHED_DOCUMENTS = "LogUnexpectedIPCPostedToBackForwardCachedDocuments";

    // Controls URL handling feature in web apps. Controls parsing of "url_handlers"
    // field in web app manifests. See explainer for more information:
    // https://github.com/WICG/pwa-url-handler/blob/master/explainer.md
    public static final String WEB_APP_ENABLE_URL_HANDLERS = "WebAppEnableUrlHandlers";

    // Enables Protocol handling feature in web apps. Controls parsing of
    // "protocol_handlers" field in web app manifests. See explainer for more
    // information:
    // https://github.com/MicrosoftEdge/MSEdgeExplainers/blob/main/URLProtocolHandler/explainer.md
    public static final String WEB_APP_ENABLE_PROTOCOL_HANDLERS = "WebAppEnableProtocolHandlers";

    // When enabled NV12 frames on a GPU will be forwarded to libvpx encoders
    // without conversion to I420.
    public static final String WEB_RTC_LIBVPX_ENCODE_NV12 = "WebRtcLibvpxEncodeNV12";

    // Makes network loading tasks unfreezable so that they can be processed while
    // the page is frozen.
    public static final String LOADING_TASKS_UNFREEZABLE = "LoadingTasksUnfreezable";

    // Kill switch for the new behavior whereby anchors with target=_blank get
    // noopener behavior by default. TODO(crbug.com/898942): Remove in Chrome 95.
    public static final String TARGET_BLANK_IMPLIES_NO_OPENER = "TargetBlankImpliesNoOpener";

    // Controls how max frame rates are enforced in MediaStreamTracks.
    // TODO(crbug.com/1152307): Remove in M91.
    public static final String MEDIA_STREAM_TRACK_USE_CONFIG_MAX_FRAME_RATE = "MediaStreamTrackUseConfigMaxFrameRate";

    // Do not instantiate this class.
    private BlinkFeatures() {}
}
