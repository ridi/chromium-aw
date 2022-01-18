// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.gpu.config;

/**
 * Contains all of the command line switches that are specific to the gpu/ layer.
 */
public final class GpuSwitches {


    // This following string constants were inserted by
    //     java_cpp_strings.py
    // From
    //     ../../gpu/config/gpu_switches.cc
    // Into
    //     ../../gpu/config/android/java/src/org/chromium/gpu/config/GpuSwitches.java.tmpl

    // Disable GPU rasterization, i.e. rasterize on the CPU only.
    // Overrides the kEnableGpuRasterization flag.
    public static final String DISABLE_GPU_RASTERIZATION = "disable-gpu-rasterization";

    // Disables mipmap generation in Skia. Used a workaround for select low memory
    // devices, see https://crbug.com/1138979 for details.
    public static final String DISABLE_MIPMAP_GENERATION = "disable-mipmap-generation";

    // Allow heuristics to determine when a layer tile should be drawn with the
    // Skia GPU backend. Only valid with GPU accelerated compositing.
    public static final String ENABLE_GPU_RASTERIZATION = "enable-gpu-rasterization";

    // Select a different set of GPU blocklist entries with the specified
    // test_group ID.
    public static final String GPU_BLOCKLIST_TEST_GROUP = "gpu-blocklist-test-group";

    // Enable an extra set of GPU driver bug list entries with the specified
    // test_group ID. Note the default test group (group 0) is still active.
    public static final String GPU_DRIVER_BUG_LIST_TEST_GROUP = "gpu-driver-bug-list-test-group";

    // Passes encoded GpuPreferences to GPU process.
    public static final String GPU_PREFERENCES = "gpu-preferences";

    // Ignores GPU blocklist.
    public static final String IGNORE_GPU_BLOCKLIST = "ignore-gpu-blocklist";

    // Allows explicitly specifying the shader disk cache size for embedded devices.
    // Default value is 6MB. On Android, 2MB is default and 128KB for low-end
    // devices.
    public static final String SHADER_DISK_CACHE_SIZE_KB = "shader-disk-cache-size-kb";

    // Disables the non-sandboxed GPU process for DX12 info collection
    public static final String DISABLE_GPU_PROCESS_FOR_DX12_INFO_COLLECTION = "disable-gpu-process-for-dx12-info-collection";


    public static final String ENABLE_UNSAFE_WEB_GPU = "enable-unsafe-webgpu";


    public static final String ENABLE_UNSAFE_WEB_GPU_SERVICE = "enable-unsafe-webgpu-service";

    // Enable validation layers in Dawn backends.
    public static final String ENABLE_DAWN_BACKEND_VALIDATION = "enable-dawn-backend-validation";

    // Force all WebGPU content to run on the WebGPU/Compat (GLES) backend.
    public static final String FORCE_WEB_GPU_COMPAT = "force-webgpu-compat";

    // Set the Dawn features(toggles) enabled on the creation of Dawn devices.
    public static final String ENABLE_DAWN_FEATURES = "enable-dawn-features";

    // Set the Dawn features(toggles) disabled on the creation of Dawn devices.
    public static final String DISABLE_DAWN_FEATURES = "disable-dawn-features";

    // Increases the priority (to REALTIME_AUDIO) of gpu process and compositor
    // thread.
    // This is only to be used for perf tests on macOS for more reliable values.
    public static final String USE_HIGH_GPU_THREAD_PRIORITY_FOR_PERF_TESTS = "use-gpu-high-thread-priority-for-perf-tests";

    // Start the non-sandboxed GPU process for DX12 and Vulkan info collection
    // immediately after the browser starts. The default is to delay for 120
    // seconds.
    public static final String NO_DELAY_FOR_DX12_VULKAN_INFO_COLLECTION = "no-delay-for-dx12-vulkan-info-collection";

    // Enables measures of how long GPU Main Thread was blocked between SwapBuffers
    public static final String ENABLE_GPU_BLOCKED_TIME = "enable-gpu-blocked-time";

    // Passes the active graphics vendor id from browser process to info collection
    // GPU process.
    public static final String GPU_VENDOR_ID = "gpu-vendor-id";

    // Passes the active graphics device id from browser process to info collection
    // GPU process.
    public static final String GPU_DEVICE_ID = "gpu-device-id";

    // Passes the active graphics sub system id from browser process to info
    // collection GPU process.
    public static final String GPU_SUB_SYSTEM_ID = "gpu-sub-system-id";

    // Passes the active graphics revision info from browser process to info
    // collection GPU process.
    public static final String GPU_REVISION = "gpu-revision";

    // Passes the active graphics driver version from browser process to info
    // collection GPU process.
    public static final String GPU_DRIVER_VERSION = "gpu-driver-version";

    // Indicate that the this is being used by Android WebView and its draw functor
    // is using vulkan.
    public static final String WEBVIEW_DRAW_FUNCTOR_USES_VULKAN = "webview-draw-functor-uses-vulkan";

    // Enables using protected memory for vulkan resources.
    public static final String ENABLE_VULKAN_PROTECTED_MEMORY = "enable-vulkan-protected-memory";

    // Disables falling back to GL based hardware rendering if initializing Vulkan
    // fails. This is to allow tests to catch regressions in Vulkan.
    public static final String DISABLE_VULKAN_FALLBACK_TO_GL_FOR_TESTING = "disable-vulkan-fallback-to-gl-for-testing";

    // Specifies the heap limit for Vulkan memory.
    // TODO(crbug/1158000): Remove this switch.
    public static final String VULKAN_HEAP_MEMORY_LIMIT_MB = "vulkan-heap-memory-limit-mb";

    // Specifies the sync CPU limit for total Vulkan memory.
    // TODO(crbug/1158000): Remove this switch.
    public static final String VULKAN_SYNC_CPU_MEMORY_LIMIT_MB = "vulkan-sync-cpu-memory-limit-mb";

    // Crash Chrome if GPU process crashes. This is to force a test to fail when
    // GPU process crashes unexpectedly.
    public static final String FORCE_BROWSER_CRASH_ON_GPU_CRASH = "force-browser-crash-on-gpu-crash";

    // Override value for the GPU watchdog timeout in seconds.
    public static final String GPU_WATCHDOG_TIMEOUT_SECONDS = "gpu-watchdog-timeout-seconds";

    // Prevent instantiation.
    private GpuSwitches() {}
}
