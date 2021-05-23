// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.base;

/**
 * Contains all of the command line switches that are specific to the base/
 * portion of Chromium on Android.
 */
public final class BaseSwitches {


    // This following string constants were inserted by
    //     java_cpp_strings.py
    // From
    //     ../../base/base_switches.cc
    // Into
    //     ../../base/android/java/src/org/chromium/base/BaseSwitches.java.tmpl

    // Delays execution of TaskPriority::BEST_EFFORT tasks until shutdown.
    public static final String DISABLE_BEST_EFFORT_TASKS = "disable-best-effort-tasks";

    // Disables the crash reporting.
    public static final String DISABLE_BREAKPAD = "disable-breakpad";

    // Comma-separated list of feature names to disable. See also kEnableFeatures.
    public static final String DISABLE_FEATURES = "disable-features";

    // Force disabling of low-end device mode when set.
    public static final String DISABLE_LOW_END_DEVICE_MODE = "disable-low-end-device-mode";

    // Indicates that crash reporting should be enabled. On platforms where helper
    // processes cannot access to files needed to make this decision, this flag is
    // generated internally.
    public static final String ENABLE_CRASH_REPORTER = "enable-crash-reporter";

    // Comma-separated list of feature names to enable. See also kDisableFeatures.
    public static final String ENABLE_FEATURES = "enable-features";

    // Force low-end device mode when set.
    public static final String ENABLE_LOW_END_DEVICE_MODE = "enable-low-end-device-mode";

    // Enable the use of background thread priorities for background tasks in the
    // ThreadPool even on systems where it is disabled by default, e.g. due to
    // concerns about priority inversions.
    public static final String ENABLE_BACKGROUND_THREAD_POOL = "enable-background-thread-pool";

    // This option can be used to force field trials when testing changes locally.
    // The argument is a list of name and value pairs, separated by slashes. If a
    // trial name is prefixed with an asterisk, that trial will start activated.
    // For example, the following argument defines two trials, with the second one
    // activated: "GoogleNow/Enable/*MaterialDesignNTP/Default/" This option can
    // also be used by the browser process to send the list of trials to a
    // non-browser process, using the same format. See
    // FieldTrialList::CreateTrialsFromString() in field_trial.h for details.
    public static final String FORCE_FIELD_TRIALS = "force-fieldtrials";

    // Generates full memory crash dump.
    public static final String FULL_MEMORY_CRASH_REPORT = "full-memory-crash-report";

    // Logs information about all tasks posted with TaskPriority::BEST_EFFORT. Use
    // this to diagnose issues that are thought to be caused by
    // TaskPriority::BEST_EFFORT execution fences. Note: Tasks posted to a
    // non-BEST_EFFORT UpdateableSequencedTaskRunner whose priority is later lowered
    // to BEST_EFFORT are not logged.
    public static final String LOG_BEST_EFFORT_TASKS = "log-best-effort-tasks";

    // Suppresses all error dialogs when present.
    public static final String NO_ERROR_DIALOGS = "noerrdialogs";

    // Starts the sampling based profiler for the browser process at startup. This
    // will only work if chrome has been built with the gn arg enable_profiling =
    // true. The output will go to the value of kProfilingFile.
    public static final String PROFILING_AT_START = "profiling-at-start";

    //   {pid} if present will be replaced by the pid of the process.
    //   {count} if present will be incremented each time a profile is generated
    //           for this process.
    // The default is chrome-profile-{pid} for the browser and test-profile-{pid}
    // for tests.
    public static final String PROFILING_FILE = "profiling-file";

    // Controls whether profile data is periodically flushed to a file. Normally
    // the data gets written on exit but cases exist where chromium doesn't exit
    // cleanly (especially when using single-process). A time in seconds can be
    // specified.
    public static final String PROFILING_FLUSH = "profiling-flush";

    // When running certain tests that spawn child processes, this switch indicates
    // to the test framework that the current process is a child process.
    public static final String TEST_CHILD_PROCESS = "test-child-process";

    // When running certain tests that spawn child processes, this switch indicates
    // to the test framework that the current process should not initialize ICU to
    // avoid creating any scoped handles too early in startup.
    public static final String TEST_DO_NOT_INITIALIZE_ICU = "test-do-not-initialize-icu";

    // Sends trace events from these categories to a file.
    // --trace-to-file on its own sends to default categories.
    public static final String TRACE_TO_FILE = "trace-to-file";

    // Specifies the file name for --trace-to-file. If unspecified, it will
    // go to a default file name.
    public static final String TRACE_TO_FILE_NAME = "trace-to-file-name";

    // Gives the default maximal active V-logging level; 0 is the default.
    // Normally positive values are used for V-logging levels.
    public static final String V = "v";

    // Any pattern containing a forward or backward slash will be tested
    // against the whole pathname and not just the module.  E.g.,
    // "*/foo/bar/*=2" would change the logging level for all code in
    // source files under a "foo/bar" directory.
    public static final String V_MODULE = "vmodule";

    // Will wait for 60 seconds for a debugger to come to attach to the process.
    public static final String WAIT_FOR_DEBUGGER = "wait-for-debugger";

    // Disable high-resolution timer on Windows.
    public static final String DISABLE_HIGH_RES_TIMER = "disable-highres-timer";

    // Disables the USB keyboard detection for blocking the OSK on Win8+.
    public static final String DISABLE_USB_KEYBOARD_DETECT = "disable-usb-keyboard-detect";

    // The /dev/shm partition is too small in certain VM environments, causing
    // Chrome to fail or crash (see http://crbug.com/715363). Use this flag to
    // work-around this issue (a temporary directory will always be used to create
    // anonymous shared memory files).
    public static final String DISABLE_DEV_SHM_USAGE = "disable-dev-shm-usage";

    // Used for turning on Breakpad crash reporting in a debug environment where
    // crash reporting is typically compiled but disabled.
    public static final String ENABLE_CRASH_REPORTER_FOR_TESTING = "enable-crash-reporter-for-testing";

    // Enables the reached code profiler that samples all threads in all processes
    // to determine which functions are almost never executed.
    public static final String ENABLE_REACHED_CODE_PROFILER = "enable-reached-code-profiler";

    // Specifies the profiling interval in microseconds for reached code profiler.
    public static final String REACHED_CODE_SAMPLING_INTERVAL_US = "reached-code-sampling-interval-us";

    // Default country code to be used for search engine localization.
    public static final String DEFAULT_COUNTRY_CODE_AT_INSTALL = "default-country-code";

    // Adds additional thread idle time information into the trace event output.
    public static final String ENABLE_IDLE_TRACING = "enable-idle-tracing";

    // The field trial parameters and their values when testing changes locally.
    public static final String FORCE_FIELD_TRIAL_PARAMS = "force-fieldtrial-params";

    // This flag requires the BPF sandbox to be disabled.
    public static final String ENABLE_THREAD_INSTRUCTION_COUNT = "enable-thread-instruction-count";

    // Override the default scheduling boosting value for urgent tasks.
    // This can be adjusted if a specific chromeos device shows better perf/power
    // ratio (e.g. by running video conference tests).
    // Currently, this values directs to linux scheduler's utilization min clamp.
    // Range is 0(no biased load) ~ 100(mamximum load value).
    public static final String SCHEDULER_BOOST_URGENT = "scheduler-boost-urgent";

    // Prefer CommonSwitches.RENDERER_WAIT_FOR_JAVA_DEBUGGER where possible.
    // Block ChildProcessMain thread of render process service until a Java debugger
    // is attached. To pause even earlier: am set-debug-app
    // org.chromium.chrome:sandbox_process0 However, this flag is convenient when
    // you don't know the process number, or want all renderers to pause
    // (set-debug-app applies to only one process at a time).
    public static final String RENDERER_WAIT_FOR_JAVA_DEBUGGER = "renderer-wait-for-java-debugger";

    // Prevent instantiation.
    private BaseSwitches() {}
}
