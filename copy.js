const fs = require('fs');
const path = require('path');

const Action = {
  COPY: 'COPY',
  REMOVE: 'REMOVE',
};

const Target = {
  X86: 'x86',
  X64: 'x64',
  ARM: 'arm',
  ARM64: 'arm64',
};

const Arch = {
  [Target.X86]: 'x86',
  [Target.X64]: 'x86_64',
  [Target.ARM]: 'armeabi-v7a',
  [Target.ARM64]: 'arm64-v8a',
};

const SnapshotSuffix = {
  [Target.X86]: '86',
  [Target.X64]: '86_64',
  [Target.ARM]: '32',
  [Target.ARM64]: '64',
};

const args = process.argv.slice(2);
const [from, to] = args;
const targets = [Target.X86, Target.X64, Target.ARM, Target.ARM64];

if (!from || !to) {
  throw new Error('Invalid arguments.');
}

if (!fs.existsSync(from)) {
  throw new Error(`No such diectory: ${from}`);
}

const delegateTarget = (() => targets.find(target => fs.existsSync(path.join(from, `src/out/${target}`))))();
if (!delegateTarget) {
  throw new Error('No such out diectory.');
}

if (!fs.existsSync(to)) {
  fs.mkdirSync(to, { recursive: true });
}

const tasks = [
  {
    name: 'android_webview',
    action: Action.COPY,
    src: [
      'src/android_webview/java/src/org/chromium/android_webview',
      `src/out/${delegateTarget}/gen/android_webview/browser_java/generated_java/annotation_processor_outputs/org/chromium/android_webview`,
      `src/out/${delegateTarget}/gen/android_webview/browser_java/generated_java/input_srcjars/org/chromium/android_webview`,
      `src/out/${delegateTarget}/gen/android_webview/common_aidl_java/generated_java/input_srcjars/org/chromium/android_webview`,
      `src/out/${delegateTarget}/gen/android_webview/common_java/generated_java/input_srcjars/org/chromium/android_webview`,
      `src/out/${delegateTarget}/gen/android_webview/proto/aw_variations_seed_proto_java/generated_java/input_srcjars/org/chromium/android_webview`,
      `src/out/${delegateTarget}/gen/android_webview/proto/metrics_bridge_records_proto_java/generated_java/input_srcjars/org/chromium/android_webview`,
    ],
    dest: 'src/main/java/org/chromium/android_webview',
  },
  {
    name: 'android_webview/shell',
    action: Action.COPY,
    src: [
      'src/android_webview/test/shell/java/src/org/chromium/android_webview/shell',
      'src/android_webview/test/shell/src/org/chromium/android_webview/shell',
    ],
    dest: 'src/main/java/org/chromium/android_webview/shell',
  },
  {
    name: 'android_webview/test',
    action: Action.COPY,
    src: [
      [
        'src/android_webview/test/shell/java/src/org/chromium/android_webview/test',
        [
          'AwTestContainerView.java', 
          'NullContentsClient.java',
        ],
      ],
      [
        'src/android_webview/test/shell/src/org/chromium/android_webview/test',
        [
          'AwTestContainerView.java', 
          'NullContentsClient.java',
        ],
      ],
    ],
    dest: 'src/main/java/org/chromium/android_webview/test',
  },
  {
    name: 'android_webview/test/util',
    action: Action.COPY,
    src: [
      'src/android_webview/test/shell/java/src/org/chromium/android_webview/test/util',
      'src/android_webview/test/shell/src/org/chromium/android_webview/test/util',
    ],
    dest: 'src/main/java/org/chromium/android_webview/test/util',
  },
  {
    name: 'android_webview',
    action: Action.REMOVE,
    src: [
      'src/main/java/org/chromium/android_webview',
    ],
    target: '.aidl',
  },
  {
    name: 'base',
    action: Action.COPY,
    src: [
      'src/base/android/java/src/org/chromium/base',
      [
        `src/out/${delegateTarget}/gen/base/base_java/generated_java/annotation_processor_outputs/org/chromium/base`,
        { recursive: false },
      ],
      [
        `src/out/${delegateTarget}/gen/base/base_java/generated_java/input_srcjars/org/chromium/base`,
        { recursive: false },
      ],
    ],
    dest: 'src/main/java/org/chromium/base',
  },
  {
    name: 'base/jank_tracker',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/base/base_java/generated_java/input_srcjars/org/chromium/base/jank_tracker`,
    ],
    dest: 'src/main/java/org/chromium/base/jank_tracker',
  },
  {
    name: 'base/library_loader',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/base/base_java/generated_java/annotation_processor_outputs/org/chromium/base/library_loader`,
      [
        `src/out/${delegateTarget}/gen/base/base_java/generated_java/input_srcjars/org/chromium/base/library_loader`,
        [
          'LibraryLoaderJni.java',
          'LibraryPrefetcherJni.java',
          'LibraryProcessType.java',
          'RelroSharingStatus.java',
        ],
      ],
    ],
    dest: 'src/main/java/org/chromium/base/library_loader',
  },
  {
    name: 'base/metrics',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/base/base_java/generated_java/annotation_processor_outputs/org/chromium/base/metrics`,
      `src/out/${delegateTarget}/gen/base/base_java/generated_java/input_srcjars/org/chromium/base/metrics`,
    ],
    dest: 'src/main/java/org/chromium/base/metrics',
  },
  {
    name: 'base/process_launcher',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/base/base_java/generated_java/annotation_processor_outputs/org/chromium/base/process_launcher`,
      `src/out/${delegateTarget}/gen/base/base_java/generated_java/input_srcjars/org/chromium/base/process_launcher`,
    ],
    dest: 'src/main/java/org/chromium/base/process_launcher',
  },
  {
    name: 'base/task',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/base/base_java/generated_java/annotation_processor_outputs/org/chromium/base/task`,
      `src/out/${delegateTarget}/gen/base/base_java/generated_java/input_srcjars/org/chromium/base/task`,
    ],
    dest: 'src/main/java/org/chromium/base/task',
  },
  {
    name: 'base',
    action: Action.REMOVE,
    src: [
      'src/main/java/org/chromium/base',
    ],
    target: '.aidl',
  },
  {
    name: 'blink/mojom',
    action: Action.COPY,
    src: [
      [
        `src/out/${delegateTarget}/gen/third_party/blink/public/mojom/android_mojo_bindings_java/generated_java/input_srcjars/org/chromium/blink/mojom`,
        [
          'AndroidFontLookup.java',
          'AndroidFontLookup_Internal.java',
          'AuthenticatorStatus.java',
          'Blob.java',
          'Blob_Internal.java',
          'BlobReaderClient.java',
          'BlobReaderClient_Internal.java',
          'ContactIconBlob.java',
          'PaymentOptions.java',
          'RemoteArrayType.java',
          'RemoteInvocationArgument.java',
          'RemoteInvocationError.java',
          'RemoteInvocationResult.java',
          'RemoteInvocationResultValue.java',
          'RemoteObject.java',
          'RemoteObject_Internal.java',
          'RemoteObjectGateway.java',
          'RemoteObjectGateway_Internal.java',
          'RemoteObjectGatewayFactory.java',
          'RemoteObjectGatewayFactory_Internal.java',
          'RemoteObjectHost.java',
          'RemoteObjectHost_Internal.java',
          'RemoteTypedArray.java',
          'SerializedBlob.java',
          'SingletonJavaScriptValue.java',
        ],
      ],
      [
        `src/out/${delegateTarget}/gen/third_party/blink/public/mojom/mojom_core_java/generated_java/input_srcjars/org/chromium/blink/mojom`,
        [
          'CloneableMessage.java',
          'MessagePortDescriptor.java',
          'TransferableMessage.java',
          'UserActivationSnapshot.java',
        ],
      ],
      [
        `src/out/${delegateTarget}/gen/third_party/blink/public/mojom/mojom_platform_java/generated_java/input_srcjars/org/chromium/blink/mojom`,
        [
          'ContactIconBlob.java',
          'DisplayMode.java',
          'EventType.java',
          'FeaturePolicyFeature.java',
          'FileSystemAccessTransferToken.java',
          'FileSystemAccessTransferToken_Internal.java',
          'FocusType.java',
          'Impression.java',
          'NativeFileSystemDragDropToken.java',
          'NativeFileSystemDragDropToken_Internal.java',
          'NativeFileSystemTransferToken.java',
          'NativeFileSystemTransferToken_Internal.java',
          'PermissionsPolicyFeature.java',
          'SerializedArrayBufferContents.java',
          'SpeechAudioErrorDetails.java',
          'SpeechRecognitionError.java',
          'SpeechRecognitionErrorCode.java',
          'ViewportFit.java',
        ],
      ],
    ],
    dest: 'src/main/java/org/chromium/blink/mojom',
  },
  {
    name: 'blink_public',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/third_party/blink/public/blink_headers_java/generated_java/input_srcjars/org/chromium/blink_public`,
    ],
    dest: 'src/main/java/org/chromium/blink_public',
  },
  {
    name: 'blink_public/common',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/third_party/blink/public/common/common_java/generated_java/input_srcjars/org/chromium/blink_public/common`,
    ],
    dest: 'src/main/java/org/chromium/blink_public/common',
  },
  {
    name: 'build',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/android_webview/test/webview_instrumentation_apk/generated_java/input_srcjars/org/chromium/build`,
    ],
    dest: 'src/main/java/org/chromium/build',
  },
  {
    name: 'cc',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/cc/base/cc_base_java/generated_java/input_srcjars/org/chromium/cc/base`,
    ],
    dest: 'src/main/java/org/chromium/cc/base',
  },
  {
    name: 'components/autofill',
    action: Action.COPY,
    src: [
      'src/components/android_autofill/android/java/src/org/chromium/components/autofill',
      'src/components/android_autofill/browser/java/src/org/chromium/components/autofill',
      `src/out/${delegateTarget}/gen/components/android_autofill/android/java/generated_java/input_srcjars/org/chromium/components/autofill`,
      `src/out/${delegateTarget}/gen/components/android_autofill/browser/java/generated_java/input_srcjars/org/chromium/components/autofill`,
      'src/components/autofill/android/java/src/org/chromium/components/autofill',
      'src/components/autofill/android/provider/java/src/org/chromium/components/autofill',
      'src/components/autofill/android/provider/src/org/chromium/components/autofill',
      [
        `src/out/${delegateTarget}/gen/components/autofill/android/autofill_java/generated_java/input_srcjars/org/chromium/components/autofill`,
        [
          'PopupItemId.java',
        ],
      ],
      [
        `src/out/${delegateTarget}/gen/components/autofill/android/full_autofill_java/generated_java/input_srcjars/org/chromium/components/autofill`,
        [
          'PopupItemId.java',
        ],
      ],
      `src/out/${delegateTarget}/gen/components/autofill/android/provider/java/generated_java/input_srcjars/org/chromium/components/autofill`,
      `src/out/${delegateTarget}/gen/components/autofill/android/provider_java/java/generated_java/annotation_processor_outputs/org/chromium/components/autofill`,
      `src/out/${delegateTarget}/gen/components/autofill/core/common/mojom/mojo_types_java/generated_java/input_srcjars/org/chromium/components/autofill`,
    ],
    dest: 'src/main/java/org/chromium/components/autofill',
  },
  {
    name: 'components/autofill/mojom',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/components/autofill/core/common/mojom/mojo_types_java/generated_java/input_srcjars/org/chromium/autofill/mojom`,
    ],
    dest: 'src/main/java/org/chromium/components/autofill/mojom',
  },
  {
    name: 'components/autofill_public',
    action: Action.COPY,
    src: [
      'src/components/android_autofill/android/java/src/org/chromium/components/autofill_public',
      'src/components/android_autofill/browser/java/src/org/chromium/components/autofill_public',
      'src/components/autofill/android/provider/java/src/org/chromium/components/autofill_public',
      'src/components/autofill/android/provider/src/org/chromium/components/autofill_public',
      `src/out/${delegateTarget}/gen/components/android_autofill/android/java/generated_java/input_srcjars/org/chromium/components/autofill_public`,
      `src/out/${delegateTarget}/gen/components/android_autofill/browser/java/generated_java/input_srcjars/org/chromium/components/autofill_public`,
      `src/out/${delegateTarget}/gen/components/autofill/android/provider/java/generated_java/input_srcjars/org/chromium/components/autofill_public`,
    ],
    dest: 'src/main/java/org/chromium/components/autofill_public',
  },
  {
    name: 'components/autofill_public',
    action: Action.REMOVE,
    src: [
      'src/main/java/org/chromium/components/autofill_public',
    ],
    target: '.aidl',
  },
  {
    name: 'components/background_task_scheduler',
    action: Action.COPY,
    src: [
      [
        'src/components/background_task_scheduler/android/java/src/org/chromium/components/background_task_scheduler',
        [
          'BackgroundTask.java',
          'BackgroundTaskFactory.java',
          'BackgroundTaskScheduler.java',
          'TaskInfo.java',
          'TaskParameters.java',
        ],
      ],
      `src/out/${delegateTarget}/gen/components/background_task_scheduler/generated_java/input_srcjars/org/chromium/components/background_task_scheduler`,
      `src/out/${delegateTarget}/gen/components/background_task_scheduler/background_task_scheduler_task_ids_java/generated_java/input_srcjars/org/chromium/components/background_task_scheduler`,
    ],
    dest: 'src/main/java/org/chromium/components/background_task_scheduler',
  },
  {
    name: 'components/component_updater',
    action: Action.COPY,
    src: [
      [
        'src/components/component_updater/android/java/src/org/chromium/components/component_updater',
        [
          'ComponentLoaderPolicyBridge.java',
          'EmbeddedComponentLoader.java',
        ],
      ],
      `src/out/${delegateTarget}/gen/components/component_updater/android/component_provider_service_aidl_java/generated_java/input_srcjars/org/chromium/components/component_updater`,
      `src/out/${delegateTarget}/gen/components/component_updater/android/embedded_component_loader_java/generated_java/input_srcjars/org/chromium/components/component_updater`,
    ],
    dest: 'src/main/java/org/chromium/components/component_updater',
  },
  {
    name: 'components/content_capture',
    action: Action.COPY,
    src: [
      'src/components/content_capture/android/java/src/org/chromium/components/content_capture',
      `src/out/${delegateTarget}/gen/components/content_capture/android/java/generated_java/annotation_processor_outputs/org/chromium/components/content_capture`,
      `src/out/${delegateTarget}/gen/components/content_capture/android/java/generated_java/input_srcjars/org/chromium/components/content_capture`,
    ],
    dest: 'src/main/java/org/chromium/components/content_capture',
  },
  {
    name: 'components/crash',
    action: Action.COPY,
    src: [
      'src/components/crash/android/java/src/org/chromium/components/crash',
      `src/out/${delegateTarget}/gen/components/crash/android/java/generated_java/annotation_processor_outputs/org/chromium/components/crash`,
      `src/out/${delegateTarget}/gen/components/crash/android/java/generated_java/input_srcjars/org/chromium/components/crash`,
    ],
    dest: 'src/main/java/org/chromium/components/crash',
  },
  {
    name: 'components/crash/browser',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/components/crash/android/handler_java/generated_java/annotation_processor_outputs/org/chromium/components/crash/browser`,
      `src/out/${delegateTarget}/gen/components/crash/android/handler_java/generated_java/input_srcjars/org/chromium/components/crash/browser`,
    ],
    dest: 'src/main/java/org/chromium/components/crash/browser',
  },
  {
    name: 'components/embedder_support/delegate',
    action: Action.COPY,
    src: [
      'src/components/embedder_support/android/java/src/org/chromium/components/embedder_support/delegate',
      `src/out/${delegateTarget}/gen/components/embedder_support/android/web_contents_delegate_java/generated_java/input_srcjars/org/chromium/components/embedder_support/delegate`,
    ],
    dest: 'src/main/java/org/chromium/components/embedder_support/delegate',
  },
  {
    name: 'components/embedder_support/util',
    action: Action.COPY,
    src: [
      'src/components/embedder_support/android/java/src/org/chromium/components/embedder_support/util',
      `src/out/${delegateTarget}/gen/components/embedder_support/android/util_java/generated_java/input_srcjars/org/chromium/components/embedder_support/util`,
    ],
    dest: 'src/main/java/org/chromium/components/embedder_support/util',
  },
  {
    name: 'components/location',
    action: Action.COPY,
    src: [
      'src/components/location/android/java/src/org/chromium/components/location',
      `src/out/${delegateTarget}/gen/components/location/android/location_java/generated_java/input_srcjars/org/chromium/components/location`,
      `src/out/${delegateTarget}/gen/components/location/android/settings_java/generated_java/input_srcjars/org/chromium/components/location`,
    ],
    dest: 'src/main/java/org/chromium/components/location',
  },
  {
    name: 'components/metrics',
    action: Action.COPY,
    src: [
      'src/components/embedder_support/android/metrics/java/src/org/chromium/components/metrics',
      `src/out/${delegateTarget}/gen/components/metrics/metrics_java/generated_java/input_srcjars/org/chromium/components/metrics`,
      `src/out/${delegateTarget}/gen/third_party/metrics_proto/metrics_proto_java/generated_java/input_srcjars/org/chromium/components/metrics`,
    ],
    dest: 'src/main/java/org/chromium/components/metrics',
  },
  {
    name: 'components/minidump_uploader',
    action: Action.COPY,
    src: [
      'src/components/minidump_uploader/android/java/src/org/chromium/components/minidump_uploader',
      `src/out/${delegateTarget}/gen/components/minidump_uploader/minidump_uploader_java/generated_java/annotation_processor_outputs/org/chromium/components/minidump_uploader`,
      `src/out/${delegateTarget}/gen/components/minidump_uploader/minidump_uploader_java/generated_java/input_srcjars/org/chromium/components/minidump_uploader`,
    ],
    dest: 'src/main/java/org/chromium/components/minidump_uploader',
  },
  {
    name: 'components/navigation_interception',
    action: Action.COPY,
    src: [
      'src/components/navigation_interception/android/java/src/org/chromium/components/navigation_interception',
    ],
    dest: 'src/main/java/org/chromium/components/navigation_interception',
  },
  {
    name: 'components/policy',
    action: Action.COPY,
    src: [
      'src/components/policy/android/java/src/org/chromium/components/policy',
      `src/out/${delegateTarget}/gen/components/policy/android/policy_java/generated_java/input_srcjars/org/chromium/components/policy`,
    ],
    dest: 'src/main/java/org/chromium/components/policy',
  },
  {
    name: 'power_scheduler',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/components/power_scheduler/power_scheduler_java/generated_java/input_srcjars/org/chromium/components/power_scheduler`,
    ],
    dest: 'src/main/java/org/chromium/components/power_scheduler',
  },
  {
    name: 'components/safe_browsing',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/android_webview/browser_java/generated_java/input_srcjars/org/chromium/components/safe_browsing`,
    ],
    dest: 'src/main/java/org/chromium/components/safe_browsing',
  },
  {
    name: 'components/url_formatter',
    action: Action.COPY,
    src: [
      'src/components/url_formatter/android/java/src/org/chromium/components/url_formatter',
      `src/out/${delegateTarget}/gen/components/url_formatter/android/url_formatter_java/generated_java/input_srcjars/org/chromium/components/url_formatter`,
      `src/out/${delegateTarget}/gen/components/url_formatter/url_formatter_java/generated_java/input_srcjars/org/chromium/components/url_formatter`,
    ],
    dest: 'src/main/java/org/chromium/components/url_formatter',
  },
  {
    name: 'components/variations',
    action: Action.COPY,
    src: [
      'src/components/variations/android/java/src/org/chromium/components/variations',
      `src/out/${delegateTarget}/gen/components/variations/android/variations_java/generated_java/input_srcjars/org/chromium/components/variations`,
      `src/out/${delegateTarget}/gen/components/variations/load_seed_result_enum_java/generated_java/input_srcjars/org/chromium/components/variations`,
    ],
    dest: 'src/main/java/org/chromium/components/variations',
  },
  {
    name: 'components/version_info',
    action: Action.COPY,
    src: [
      'src/components/version_info/android/java/src/org/chromium/components/version_info',
      `src/out/${delegateTarget}/gen/components/version_info/android/version_constants_java/generated_java/input_srcjars/org/chromium/components/version_info`,
      `src/out/${delegateTarget}/gen/components/version_info/android/java/org/chromium/components/version_info`,
    ],
    dest: 'src/main/java/org/chromium/components/version_info',
  },
  {
    name: 'components/viz',
    action: Action.COPY,
    src: [
      'src/components/viz/service/java/src/org/chromium/components/viz',
      `src/out/${delegateTarget}/gen/components/viz/service/service_java/generated_java/annotation_processor_outputs/org/chromium/components/viz`,
      `src/out/${delegateTarget}/gen/components/viz/service/service_java/generated_java/input_srcjars/org/chromium/components/viz`,
    ],
    dest: 'src/main/java/org/chromium/components/viz',
  },
  {
    name: 'components/viz/common',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/components/viz/viz_java/generated_java/input_srcjars/org/chromium/components/viz/common`,
    ],
    dest: 'src/main/java/org/chromium/components/viz/common',
  },
  {
    name: 'content/app',
    action: Action.COPY,
    src: [
      'src/content/public/android/java/src/org/chromium/content/app',
      `src/out/${delegateTarget}/gen/content/public/android/content_java/generated_java/annotation_processor_outputs/org/chromium/content/app`,
      `src/out/${delegateTarget}/gen/content/public/android/content_java/generated_java/input_srcjars/org/chromium/content/app`,
      `src/out/${delegateTarget}/gen/content/public/android/content_full_java/generated_java/input_srcjars/org/chromium/content/app`,
      `src/out/${delegateTarget}/gen/content/public/android/content_main_dex_java/generated_java/input_srcjars/org/chromium/content/app`,
    ],
    dest: 'src/main/java/org/chromium/content/app',
  },
  {
    name: 'content/browser',
    action: Action.COPY,
    src: [
      'src/content/public/android/java/src/org/chromium/content/browser',
      `src/out/${delegateTarget}/gen/content/public/android/content_java/generated_java/annotation_processor_outputs/org/chromium/content/browser`,
      `src/out/${delegateTarget}/gen/content/public/android/content_java/generated_java/input_srcjars/org/chromium/content/browser`,
      `src/out/${delegateTarget}/gen/content/public/android/content_full_java/generated_java/input_srcjars/org/chromium/content/browser`,
      `src/out/${delegateTarget}/gen/content/public/android/content_main_dex_java/generated_java/input_srcjars/org/chromium/content/browser`,
    ],
    dest: 'src/main/java/org/chromium/content/browser',
  },
  {
    name: 'content/browser',
    action: Action.REMOVE,
    src: [
      'src/main/java/org/chromium/content/browser/sms',
    ],
  },
  {
    name: 'content/common',
    action: Action.COPY,
    src: [
      'src/content/public/android/java/src/org/chromium/content/common',
      `src/out/${delegateTarget}/gen/content/public/android/content_java/generated_java/annotation_processor_outputs/org/chromium/content/common`,
      `src/out/${delegateTarget}/gen/content/public/android/content_java/generated_java/input_srcjars/org/chromium/content/common`,
      `src/out/${delegateTarget}/gen/content/public/android/content_full_java/generated_java/input_srcjars/org/chromium/content/common`,
      `src/out/${delegateTarget}/gen/content/public/android/content_main_dex_java/generated_java/input_srcjars/org/chromium/content/common`,
    ],
    dest: 'src/main/java/org/chromium/content/common',
  },
  {
    name: 'content/mojom',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/content/public/common/trust_tokens_mojo_bindings_java/generated_java/input_srcjars/org/chromium/content/mojom`,
    ],
    dest: 'src/main/java/org/chromium/content/common/mojom',
  },
  {
    name: 'content/common',
    action: Action.REMOVE,
    src: [
      'src/main/java/org/chromium/content/common',
    ],
    target: '.aidl',
  },
  {
    name: 'content_public/app',
    action: Action.COPY,
    src: [
      'src/content/public/android/java/src/org/chromium/content_public/app',
      `src/out/${delegateTarget}/gen/content/public/android/content_full_java/generated_java/input_srcjars/org/chromium/content_public/app`,
      `src/out/${delegateTarget}/gen/content/public/android/content_main_dex_java/generated_java/input_srcjars/org/chromium/content_public/app`,
    ],
    dest: 'src/main/java/org/chromium/content_public/app',
  },
  {
    name: 'content_public/browser',
    action: Action.COPY,
    src: [
      'src/content/public/android/java/src/org/chromium/content_public/browser',
      `src/out/${delegateTarget}/gen/content/public/android/content_java/generated_java/annotation_processor_outputs/org/chromium/content_public/browser`,
      [
        `src/out/${delegateTarget}/gen/content/public/android/content_java/generated_java/input_srcjars/org/chromium/content_public/browser`,
        { recursive: false },
      ],
      `src/out/${delegateTarget}/gen/content/public/android/content_full_java/generated_java/input_srcjars/org/chromium/content_public/browser`,
      `src/out/${delegateTarget}/gen/content/public/android/content_main_dex_java/generated_java/input_srcjars/org/chromium/content_public/browser`,
    ],
    dest: 'src/main/java/org/chromium/content_public/browser',
  },
  {
    name: 'content_public/browser/navigation_controller',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/content/public/android/content_java/generated_java/input_srcjars/org/chromium/content_public/browser/navigation_controller`,
    ],
    dest: 'src/main/java/org/chromium/content_public/browser/navigation_controller',
  },
  {
    name: 'content_public/common',
    action: Action.COPY,
    src: [
      'src/content/public/android/java/src/org/chromium/content_public/common',
      `src/out/${delegateTarget}/gen/content/public/android/content_java/generated_java/annotation_processor_outputs/org/chromium/content_public/common`,
      `src/out/${delegateTarget}/gen/content/public/android/content_java/generated_java/input_srcjars/org/chromium/content_public/common`,
      `src/out/${delegateTarget}/gen/content/public/android/content_full_java/generated_java/input_srcjars/org/chromium/content_public/common`,
      `src/out/${delegateTarget}/gen/content/public/android/content_main_dex_java/generated_java/input_srcjars/org/chromium/content_public/common`,
    ],
    dest: 'src/main/java/org/chromium/content_public/common',
  },
  {
    name: 'device/battery',
    action: Action.COPY,
    src: [
      'src/services/device/battery/android/java/src/org/chromium/device/battery',
    ],
    dest: 'src/main/java/org/chromium/device/battery',
  },
  {
    name: 'device/bluetooth',
    action: Action.COPY,
    src: [
      'src/device/bluetooth/android/java/src/org/chromium/device/bluetooth',
      `src/out/${delegateTarget}/gen/device/bluetooth/java/generated_java/annotation_processor_outputs/org/chromium/device/bluetooth`,
      `src/out/${delegateTarget}/gen/device/bluetooth/java/generated_java/input_srcjars/org/chromium/device/bluetooth`,
    ],
    dest: 'src/main/java/org/chromium/device/bluetooth',
  },
  {
    name: 'device/gamepad',
    action: Action.COPY,
    src: [
      'src/device/gamepad/android/java/src/org/chromium/device/gamepad',
      `src/out/${delegateTarget}/gen/device/gamepad/java/generated_java/annotation_processor_outputs/org/chromium/device/gamepad`,
      `src/out/${delegateTarget}/gen/device/gamepad/java/generated_java/input_srcjars/org/chromium/device/gamepad`,
    ],
    dest: 'src/main/java/org/chromium/device/gamepad',
  },
  {
    name: 'device/geolocation',
    action: Action.COPY,
    src: [
      'src/services/device/geolocation/android/java/src/org/chromium/device/geolocation',
      'src/services/device/public/java/src/org/chromium/device/geolocation',
      `src/out/${delegateTarget}/gen/services/device/geolocation/geolocation_java/generated_java/annotation_processor_outputs/org/chromium/device/geolocation`,
      `src/out/${delegateTarget}/gen/services/device/geolocation/geolocation_java/generated_java/input_srcjars/org/chromium/device/geolocation`,
    ],
    dest: 'src/main/java/org/chromium/device/geolocation',
  },
  {
    name: 'device/mojom',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/services/device/public/mojom/mojom_java/generated_java/input_srcjars/org/chromium/device/mojom`,
    ],
    dest: 'src/main/java/org/chromium/device/mojom',
  },
  {
    name: 'device/nfc',
    action: Action.COPY,
    src: [
      'src/services/device/nfc/android/java/src/org/chromium/device/nfc',
      'src/services/device/public/java/src/org/chromium/device/nfc',
    ],
    dest: 'src/main/java/org/chromium/device/nfc',
  },
  {
    name: 'device/power_save_blocker',
    action: Action.COPY,
    src: [
      'src/services/device/wake_lock/power_save_blocker/android/java/src/org/chromium/device/power_save_blocker',
    ],
    dest: 'src/main/java/org/chromium/device/power_save_blocker',
  },
  {
    name: 'device/sensors',
    action: Action.COPY,
    src: [
      'src/services/device/generic_sensor/android/java/src/org/chromium/device/sensors',
      `src/out/${delegateTarget}/gen/services/device/generic_sensor/java/generated_java/input_srcjars/org/chromium/device/sensors`,
      [
        `src/out/${delegateTarget}/gen/services/device/public/mojom/generic_sensor_java/generated_java/input_srcjars/org/chromium/device/mojom`,
        [
          'ReportingMode.java',
          'SensorType.java',
        ],
      ],
    ],
    dest: 'src/main/java/org/chromium/device/sensors',
  },
  {
    name: 'device/time_zone_monitor',
    action: Action.COPY,
    src: [
      'src/services/device/time_zone_monitor/android/java/src/org/chromium/device/time_zone_monitor',
      `src/out/${delegateTarget}/gen/services/device/time_zone_monitor/java/generated_java/annotation_processor_outputs/org/chromium/device/time_zone_monitor`,
      `src/out/${delegateTarget}/gen/services/device/time_zone_monitor/java/generated_java/input_srcjars/org/chromium/device/time_zone_monitor`,
    ],
    dest: 'src/main/java/org/chromium/device/time_zone_monitor',
  },
  {
    name: 'device/usb',
    action: Action.COPY,
    src: [
      'src/services/device/usb/android/java/src/org/chromium/device/usb',
      `src/out/${delegateTarget}/gen/services/device/usb/java/generated_java/annotation_processor_outputs/org/chromium/device/usb`,
      `src/out/${delegateTarget}/gen/services/device/usb/java/generated_java/input_srcjars/org/chromium/device/usb`,
    ],
    dest: 'src/main/java/org/chromium/device/usb',
  },
  {
    name: 'device/vibration',
    action: Action.COPY,
    src: [
      'src/services/device/vibration/android/java/src/org/chromium/device/vibration',
    ],
    dest: 'src/main/java/org/chromium/device/vibration',
  },
  {
    name: 'gfx/mojom',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/ui/gfx/geometry/mojom/mojom_java/generated_java/input_srcjars/org/chromium/gfx/mojom`,
      `src/out/${delegateTarget}/gen/ui/gfx/mojom/mojom_java/generated_java/input_srcjars/org/chromium/gfx/mojom`,
      `src/out/${delegateTarget}/gen/ui/gfx/mojom/native_handle_types_java/generated_java/input_srcjars/org/chromium/gfx/mojom`,
      `src/out/${delegateTarget}/gen/ui/gfx/range/mojom/mojom_java/generated_java/input_srcjars/org/chromium/gfx/mojom`,
    ],
    dest: 'src/main/java/org/chromium/gfx/mojom',
  },
  {
    name: 'gms',
    action: Action.COPY,
    src: [
      [
        'src/third_party/android_deps/util/org/chromium/gms',
        [
          'ChromiumPlayServicesAvailability.java',
        ]
      ],
    ],
    dest: 'src/main/java/org/chromium/gms',
  },
  {
    name: 'gpu',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/gpu/config/config_java/generated_java/input_srcjars/org/chromium/gpu`,
    ],
    dest: 'src/main/java/org/chromium/gpu',
  },
  {
    name: 'gpu/mojom',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/gpu/ipc/common/interface_java/generated_java/input_srcjars/org/chromium/gpu/mojom`,
      `src/out/${delegateTarget}/gen/gpu/ipc/common/interfaces_java/generated_java/input_srcjars/org/chromium/gpu/mojom`,
      `src/out/${delegateTarget}/gen/gpu/ipc/common/vulkan_interface_java/generated_java/input_srcjars/org/chromium/gpu/mojom`,
    ],
    dest: 'src/main/java/org/chromium/gpu/mojom',
  },
  {
    name: 'media',
    action: Action.COPY,
    src: [
      'src/media/base/android/java/src/org/chromium/media',
      'src/media/capture/content/android/java/src/org/chromium/media',
      'src/media/capture/video/android/java/src/org/chromium/media',
      `src/out/${delegateTarget}/gen/media/base/android/media_java/generated_java/annotation_processor_outputs/org/chromium/media`,
      `src/out/${delegateTarget}/gen/media/base/android/media_java/generated_java/input_srcjars/org/chromium/media`,
      `src/out/${delegateTarget}/gen/media/capture/content/android/screen_capture_java/annotation_processor_outputs/input_srcjars/org/chromium/media`,
      `src/out/${delegateTarget}/gen/media/capture/content/android/screen_capture_java/generated_java/input_srcjars/org/chromium/media`,
      `src/out/${delegateTarget}/gen/media/capture/video/android/capture_java/generated_java/annotation_processor_outputs/org/chromium/media`,
      `src/out/${delegateTarget}/gen/media/capture/video/android/capture_java/generated_java/input_srcjars/org/chromium/media`,
    ],
    dest: 'src/main/java/org/chromium/media',
  },
  {
    name: 'media/mojom',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/media/capture/video/mojom/video_capture_java/generated_java/input_srcjars/org/chromium/media/mojom`,
      `src/out/${delegateTarget}/gen/media/capture/mojom/video_capture_buffer_java/generated_java/input_srcjars/org/chromium/media/mojom`,
      `src/out/${delegateTarget}/gen/media/capture/mojom/video_capture_java/generated_java/input_srcjars/org/chromium/media/mojom`,
      `src/out/${delegateTarget}/gen/media/capture/mojom/video_capture_types_java/generated_java/input_srcjars/org/chromium/media/mojom`,
      [
        `src/out/${delegateTarget}/gen/media/mojo/mojom/mojom_java/generated_java/input_srcjars/org/chromium/media/mojom`,
        [
          'AndroidOverlay.java',
          'AndroidOverlay_Internal.java',
          'AndroidOverlayClient.java',
          'AndroidOverlayClient_Internal.java',
          'AndroidOverlayConfig.java',
          'AndroidOverlayProvider.java',
          'AndroidOverlayProvider_Internal.java',
          'CopyMode.java',
          'VideoFrameMetadata.java',
          'VideoRotation.java',
          'VideoTransformation.java',
        ],
      ],
    ],
    dest: 'src/main/java/org/chromium/media/mojom',
  },
  {
    name: 'midi',
    action: Action.COPY,
    src: [
      'src/media/midi/java/src/org/chromium/midi',
      `src/out/${delegateTarget}/gen/media/midi_java/generated_java/annotation_processor_outputs/org/chromium/midi`,
      `src/out/${delegateTarget}/gen/media/midi_java/generated_java/input_srcjars/org/chromium/midi`,
      `src/out/${delegateTarget}/gen/media/midi/midi_java/generated_java/input_srcjars/org/chromium/midi`,
    ],
    dest: 'src/main/java/org/chromium/midi',
  },
  {
    name: 'mojo',
    action: Action.COPY,
    src: [
      'src/mojo/public/java/bindings/src/org/chromium/mojo',
      'src/mojo/public/java/system/src/org/chromium/mojo',
      `src/out/${delegateTarget}/gen/mojo/public/java/bindings_java/generated_java/input_srcjars/org/chromium/mojo`,
      `src/out/${delegateTarget}/gen/mojo/public/java/system/system_impl_java/generated_java/annotation_processor_outputs/org/chromium/mojo`,
      `src/out/${delegateTarget}/gen/mojo/public/java/system/system_impl_java/generated_java/input_srcjars/org/chromium/mojo`,
    ],
    dest: 'src/main/java/org/chromium/mojo',
  },
  {
    name: 'mojo_base',
    action: Action.COPY,
    src: [
      'src/mojo/public/java/base/src/org/chromium/mojo_base',
    ],
    dest: 'src/main/java/org/chromium/mojo_base',
  },
  {
    name: 'mojo_base/mojom',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/mojo/public/mojom/base/base_java/generated_java/input_srcjars/org/chromium/mojo_base/mojom`,
    ],
    dest: 'src/main/java/org/chromium/mojo_base/mojom',
  },
  {
    name: 'net',
    action: Action.COPY,
    src: [
      'src/net/android/java/src/org/chromium/net',
      `src/out/${delegateTarget}/gen/net/android/net_java/generated_java/annotation_processor_outputs/org/chromium/net`,
      `src/out/${delegateTarget}/gen/net/android/net_java/generated_java/input_srcjars/org/chromium/net`,
    ],
    dest: 'src/main/java/org/chromium/net',
  },
  {
    name: 'network',
    action: Action.COPY,
    src: [
      [
        `src/out/${delegateTarget}/gen/services/network/public/mojom/data_pipe_interfaces_java/generated_java/input_srcjars/org/chromium/network/mojom`,
        [
          'DataPipeGetter.java',
          'DataPipeGetter_Internal.java',
        ],
      ],
      [
        `src/out/${delegateTarget}/gen/services/network/public/mojom/mojom_java/generated_java/input_srcjars/org/chromium/network/mojom`,
        [
          'AllowCspFromHeaderValue.java',
          'ContentSecurityPolicy.java',
          'ContentSecurityPolicyHeader.java',
          'ContentSecurityPolicySource.java',
          'ContentSecurityPolicyType.java',
          'ConnectionInfo.java',
          'CoopAccessReportType.java',
          'CrossOriginEmbedderPolicy.java',
          'CrossOriginEmbedderPolicyReporter.java',
          'CrossOriginEmbedderPolicyReporter_Internal.java',
          'CrossOriginEmbedderPolicyValue.java',
          'CrossOriginOpenerPolicy.java',
          'CrossOriginOpenerPolicyReporter.java',
          'CrossOriginOpenerPolicyReporter_Internal.java',
          'CrossOriginOpenerPolicyValue.java',
          'CspDirectiveName.java',
          'CspDisposition.java',
          'CspHashAlgorithm.java',
          'CspHashSource.java',
          'CspRequireTrustedTypesFor.java',
          'CspSource.java',
          'CspSourceList.java',
          'CspTrustedTypes.java',
          'CspViolation.java',
          'CtPolicyCompliance.java',
          'FetchResponseSource.java',
          'HttpRawHeaderPair.java',
          'HttpRawRequestResponseInfo.java',
          'HttpRequestHeaderKeyValuePair.java',
          'HttpRequestHeaders.java',
          'HttpResponseHeaders.java',
          'LoadTimingInfo.java',
          'LoadTimingInfoConnectTiming.java',
          'OriginPolicy.java',
          'ParsedHeaders.java',
          'ReferrerPolicy.java',
          'RequestPriority.java',
          'SourceLocation.java',
          'UrlLoader.java',
          'UrlLoader_Internal.java',
          'UrlLoaderClient.java',
          'UrlLoaderClient_Internal.java',
          'UrlLoaderCompletionStatus.java',
          'UrlRequestRedirectInfo.java',
          'UrlResponseHead.java',
          'WebClientHintsType.java',
          'WebSandboxFlags.java',
          'XFrameOptionsValue.java',
        ],
      ],
      [
        `src/out/${delegateTarget}/gen/services/network/public/mojom/mojom_ip_address_java/generated_java/input_srcjars/org/chromium/network/mojom`,
        [
          'IpAddress.java',
          'IpEndPoint.java',
        ],
      ],
      [
        `src/out/${delegateTarget}/gen/services/network/public/mojom/mojom_network_param_java/generated_java/input_srcjars/org/chromium/network/mojom`,
        [
          'AuthChallengeInfo.java',
          'HttpResponseHeaders.java',
          'SslInfo.java',
        ],
      ],
      [
        `src/out/${delegateTarget}/gen/services/network/public/mojom/mutable_network_traffic_annotation_interface_java/generated_java/input_srcjars/org/chromium/network/mojom`,
        [
          'MutablePartialNetworkTrafficAnnotationTag.java',
        ],
      ],
      [
        `src/out/${delegateTarget}/gen/services/network/public/mojom/url_loader_base_java/generated_java/input_srcjars/org/chromium/network/mojom`,
        [
          'AllowCspFromHeaderValue.java',
          'ConnectionInfo.java',
          'ContentSecurityPolicy.java',
          'ContentSecurityPolicyHeader.java',
          'ContentSecurityPolicySource.java',
          'ContentSecurityPolicyType.java',
          'CoopAccessReportType.java',
          'CrossOriginAttribute.java',
          'CrossOriginEmbedderPolicy.java',
          'CrossOriginEmbedderPolicyReporter.java',
          'CrossOriginEmbedderPolicyReporter_Internal.java',
          'CrossOriginEmbedderPolicyValue.java',
          'CrossOriginOpenerPolicy.java',
          'CrossOriginOpenerPolicyReporter.java',
          'CrossOriginOpenerPolicyReporter_Internal.java',
          'CrossOriginOpenerPolicyValue.java',
          'CspDirectiveName.java',
          'CspDisposition.java',
          'CspHashAlgorithm.java',
          'CspHashSource.java',
          'CspRequireTrustedTypesFor.java',
          'CspSource.java',
          'CspSourceList.java',
          'CspTrustedTypes.java',
          'CspViolation.java',
          'CtPolicyCompliance.java',
          'DataPipeGetter.java',
          'DataPipeGetter_Internal.java',
          'EarlyHints.java',
          'FetchResponseSource.java',
          'FetchResponseType.java',
          'FulfillTrustTokenIssuanceAnswer.java',
          'FulfillTrustTokenIssuanceRequest.java',
          'HttpRawHeaderPair.java',
          'HttpRawRequestResponseInfo.java',
          'HttpRequestHeaderKeyValuePair.java',
          'HttpRequestHeaders.java',
          'IpAddressSpace.java',
          'LinkAsAttribute.java',
          'LinkHeader.java',
          'LinkRelAttribute.java',
          'LoadTimingInfo.java',
          'LoadTimingInfoConnectTiming.java',
          'MutableNetworkTrafficAnnotationTag.java',
          'MutablePartialNetworkTrafficAnnotationTag.java',
          'OriginPolicy.java',
          'ParsedHeaders.java',
          'ReferrerPolicy.java',
          'RequestDestination.java',
          'RequestPriority.java',
          'SourceLocation.java',
          'TimingAllowOrigin.java',
          'UrlLoader.java',
          'UrlLoader_Internal.java',
          'UrlLoaderClient.java',
          'UrlLoaderClient_Internal.java',
          'UrlLoaderCompletionStatus.java',
          'UrlRequestRedirectInfo.java',
          'UrlResponseHead.java',
          'WebClientHintsType.java',
          'WebSandboxFlags.java',
          'XFrameOptionsValue.java',
        ],
      ],
      [
        `src/out/${delegateTarget}/gen/services/network/public/mojom/websocket_mojom_java/generated_java/input_srcjars/org/chromium/network/mojom`,
        [
          'AuthChallengeInfo.java',
          'HttpResponseHeaders.java',
          'SslInfo.java',
        ],
      ],
    ],
    dest: 'src/main/java/org/chromium/network/mojom',
  },
  {
    name: 'payments',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/components/payments/mojom/mojom_java/generated_java/input_srcjars/org/chromium/payments/mojom`,
      [
        `src/out/${delegateTarget}/gen/third_party/blink/public/mojom/android_mojo_bindings_java/generated_java/input_srcjars/org/chromium/payments/mojom`,
        [
          'PaymentCredentialInstrument.java',
        ],
      ],
    ],
    dest: 'src/main/java/org/chromium/payments/mojom',
  },
  {
    name: 'policy',
    action: Action.COPY,
    src: [
      'src/components/policy/androidjava/src/org/chromium/policy',
      `src/out/${delegateTarget}/gen/components/policy/android/policy_java/generated_java/annotation_processor_outputs/org/chromium/policy`,
      `src/out/${delegateTarget}/gen/components/policy/android/policy_java/generated_java/input_srcjars/org/chromium/policy`,
    ],
    dest: 'src/main/java/org/chromium/policy',
  },
  {
    name: 'proxy_resolver',
    action: Action.COPY,
    src: [
      [
        `src/out/${delegateTarget}/gen/services/proxy_resolver/public/mojom/mojom_java/generated_java/input_srcjars/org/chromium/proxy_resolver/mojom`,
        [
          'ProxyScheme.java',
          'ProxyServer.java',
        ],
      ],
    ],
    dest: 'src/main/java/org/chromium/proxy_resolver/mojom',
  },
  {
    name: 'service_manager',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/services/service_manager/public/mojom/mojom_java/generated_java/input_srcjars/org/chromium/service_manager`,
    ],
    dest: 'src/main/java/org/chromium/service_manager',
  },
  {
    name: 'services/device',
    action: Action.COPY,
    src: [
      'src/services/device/android/java/src/org/chromium/services/device',
    ],
    dest: 'src/main/java/org/chromium/services/device',
  },
  {
    name: 'services/media_session',
    action: Action.COPY,
    src: [
      'src/services/media_session/public/cpp/android/java/src/org/chromium/services/media_session',
    ],
    dest: 'src/main/java/org/chromium/services/media_session',
  },
  {
    name: 'services/network',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/services/network/public/features_java/generated_java/input_srcjars/org/chromium/services/network`,
    ],
    dest: 'src/main/java/org/chromium/services/network',
  },
  {
    name: 'services/service_manager',
    action: Action.COPY,
    src: [
      'src/services/service_manager/public/java/src/org/chromium/services/service_manager',
    ],
    dest: 'src/main/java/org/chromium/services/service_manager',
  },
  {
    name: 'shape_detection',
    action: Action.COPY,
    src: [
      'src/services/shape_detection/android/java/src/org/chromium/shape_detection',
    ],
    dest: 'src/main/java/org/chromium/shape_detection',
  },
  {
    name: 'shape_detection/mojom',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/services/shape_detection/public/mojom/mojom_java/generated_java/input_srcjars/org/chromium/shape_detection/mojom`,
    ],
    dest: 'src/main/java/org/chromium/shape_detection/mojom',
  },
  {
    name: 'skia/mojom',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/skia/public/mojom/mojom_java/generated_java/input_srcjars/org/chromium/skia/mojom`,
    ],
    dest: 'src/main/java/org/chromium/skia/mojom',
  },
  {
    name: 'ui',
    action: Action.COPY,
    src: [
      'src/ui/android/java/src/org/chromium/ui',
      `src/out/${delegateTarget}/gen/ui/android/ui_full_java/generated_java/annotation_processor_outputs/org/chromium/ui`,
      `src/out/${delegateTarget}/gen/ui/android/ui_full_java/generated_java/input_srcjars/org/chromium/ui`,
      `src/out/${delegateTarget}/gen/ui/android/ui_full_java/generated_java/input_srcjars/org/chromium/ui`,
      `src/out/${delegateTarget}/gen/ui/android/ui_no_recycler_view_java/generated_java/input_srcjars/org/chromium/ui`,
    ],
    dest: 'src/main/java/org/chromium/ui',
  },
  {
    name: 'ui/base',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/ui/android/ui_features_java/generated_java/annotation_processor_outputs/org/chromium/ui/base`,
      `src/out/${delegateTarget}/gen/ui/android/ui_features_java/generated_java/input_srcjars/org/chromium/ui/base`,
    ],
    dest: 'src/main/java/org/chromium/ui/base',
  },
  {
    name: 'ui/mojom',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/ui/base/ime/mojom/mojom_java/generated_java/input_srcjars/org/chromium/ui/mojom`,
      `src/out/${delegateTarget}/gen/ui/base/cursor/mojom/cursor_type_java/generated_java/input_srcjars/org/chromium/ui/mojom`,
      `src/out/${delegateTarget}/gen/ui/latency/mojom/mojom_java/generated_java/input_srcjars/org/chromium/ui/mojom`,
    ],
    dest: 'src/main/java/org/chromium/ui/mojom',
  },
  {
    name: 'ui/touch_selection',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/content/public/android/content_java/generated_java/input_srcjars/org/chromium/ui/touch_selection`,
      `src/out/${delegateTarget}/gen/content/public/android/content_full_java/generated_java/input_srcjars/org/chromium/ui/touch_selection`,
    ],
    dest: 'src/main/java/org/chromium/ui/touch_selection',
  },
  {
    name: 'ui',
    action: Action.REMOVE,
    src: [
      'src/main/java/org/chromium/ui/vr',
    ],
  },
  {
    name: 'ui_base',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/ui/android/ui_full_java/generated_java/input_srcjars/org/chromium/ui_base/web`,
    ],
    dest: 'src/main/java/org/chromium/ui_base/web',
  },
  {
    name: 'url',
    action: Action.COPY,
    src: [
      'src/url/android/java/src/org/chromium/url',
      `src/out/${delegateTarget}/gen/url/gurl_java/generated_java/input_srcjars/org/chromium/url`,
    ],
    dest: 'src/main/java/org/chromium/url',
  },
  {
    name: 'url/mojom',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/url/mojom/url_mojom_gurl_java/generated_java/input_srcjars/org/chromium/url/mojom`,
      `src/out/${delegateTarget}/gen/url/mojom/url_mojom_origin_java/generated_java/input_srcjars/org/chromium/url/mojom`,
      `src/out/${delegateTarget}/gen/url/mojom/url_mojom_origin_java/generated_java/input_srcjars/org/chromium/url/mojom`,
    ],
    dest: 'src/main/java/org/chromium/url/mojom',
  },
  {
    name: 'url/internal/mojom',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/url/mojom/url_mojom_origin_java/generated_java/input_srcjars/org/chromium/url/internal/mojom`,
    ],
    dest: 'src/main/java/org/chromium/url/internal/mojom',
  },
  {
    name: 'weblayer_private',
    action: Action.COPY,
    src: [
      [
        'src/weblayer/browser/java/src/org/chromium/weblayer_private',
        [
          'WebViewCompatibilityHelperImpl.java'
        ],
      ],
      [
        'src/weblayer/browser/java/org/chromium/weblayer_private',
        [
          'WebViewCompatibilityHelperImpl.java'
        ],
      ],
      [
        'src/weblayer/browser/src/org/chromium/weblayer_private',
        [
          'WebViewCompatibilityHelperImpl.java'
        ],
      ],
      [
        'src/weblayer/browser/org/chromium/weblayer_private',
        [
          'WebViewCompatibilityHelperImpl.java'
        ],
      ],
    ],
    dest: 'src/main/java/org/chromium/weblayer_private',
  },
  {
    name: 'BuildConfig_java',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/android_webview/test/webview_instrumentation_apk/generated_java/input_srcjars/org/chromium/base/BuildConfig.java`,
    ],
    dest: 'src/main/java/org/chromium/base',
  },
  {
    name: 'GEN_JNI_java',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/android_webview/test/webview_instrumentation_apk/generated_java/input_srcjars/org/chromium/base/natives/GEN_JNI.java`,
    ],
    dest: 'src/main/java/org/chromium/base/natives',
  },
  {
    name: 'icudtl_dat',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/icudtl.dat`,
      `src/out/${delegateTarget}/icudtl.dat`,
    ],
    dest: 'src/main/assets',
  },
  {
    name: 'N_java',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/android_webview/test/webview_instrumentation_apk/generated_java/input_srcjars/J/N.java`,
    ],
    dest: 'src/main/java/J',
  },
  {
    name: 'NativeLibraries.java',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/android_webview/test/webview_instrumentation_apk/generated_java/input_srcjars/org/chromium/base/library_loader/NativeLibraries.java`,
    ],
    dest: 'src/main/java/org/chromium/base/library_loader',
  },
  {
    name: 'ProductConfig_java',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/android_webview/test/webview_instrumentation_apk/generated_java/input_srcjars/org/chromium/android_webview/ProductConfig.java`,
    ],
    dest: 'src/main/java/org/chromium/android_webview',
  },
  ...(targets => {
    return targets.map(target => {
      return {
        name: `libstandalonelibchromiumwebview_so-${target}`,
        action: Action.COPY,
        src: [
          `src/out/${target}/libstandalonelibchromiumwebview.so`,
          `src/out/${target}/libstandalonelibwebviewchromium.so`,
        ],
        dest: `src/main/jniLibs/${Arch[target]}`,
      };
    });
  })(targets),
  {
    name: 'locale_pak',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/android_webview/locale/en-US.pak`,
    ],
    dest: 'src/main/assets/fallback-locales',
  },
  {
    name: 'resources_pak',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/android_webview/chrome_100_percent.pak`,
      `src/out/${delegateTarget}/gen/android_webview/resources.pak`,
    ],
    dest: 'src/main/assets',
  },
  {
    name: 'R.java',
    action: Action.REMOVE,
    src: [
      'src/main/java/org/chromium',
    ],
    target: '/R.java',
  },
  {
    name: 'OWNERS',
    action: Action.REMOVE,
    src: [
      'src/main/java/org/chromium',
    ],
    target: '/OWNERS',
  },
  {
    name: 'DIR_METADATA',
    action: Action.REMOVE,
    src: [
      'src/main/java/org/chromium',
    ],
    target: '/DIR_METADATA',
  },
  ...(targets => {
    return targets.map(target => {
      return {
        name: `snapshot_blob_bin-${target}`,
        action: Action.COPY,
        src: [
          `src/out/${target}/snapshot_blob.bin`,
        ],
        dest: `src/main/assets/snapshot_blob_${SnapshotSuffix[target]}.bin`,
      };
    });
  })(targets),
];

const logger = {
  prefix(task) {
    return task ? `[${task.name}:${task.action}]` : '[Runner]';
  },
  info(message, task) {
    console.log(this.prefix(task), message);
  },
  warn(message, task) {
    console.warn(`\x1b[33m${this.prefix(task)} ${message}\x1b[0m`);
  },
  error(message, task) {
    console.error(`\x1b[31m${this.prefix(task)} ${message}\x1b[0m`);
    throw new Error(`${this.prefix(task)} ${message}`);
  },
};

function isArray(any) {
  return Array.isArray(any);
}

function isString(any) {
  return typeof any === 'string';
}

function isBoolean(any) {
  return typeof any === 'boolean';
}

function isObject(any) {
  return typeof any === 'object';
}

function validate(task) {
  logger.info('Validating...', task);

  const { name, action, src, dest, target = '', pass } = task;
  const isCopyAction = action === Action.COPY;

  if (!name) {
    logger.error('\'name\' must be required.', task);
  } else if (!isString(name)) {
    logger.error('\'name\' must be string.', task);
  }

  if (!action) {
    logger.error('\'action\' must be required.', task);
  } else if (!isString(action)) {
    logger.error('\'action\' must be string.', task);
  } else if (![Action.COPY, Action.REMOVE].includes(action)) {
    logger.error(`Invalid action type. (action: ${action})`, task);
  }

  if (!src) {
    logger.error('\'src\' must be required.', task);
  } else if (!isArray(src)) {
    logger.error('\'src\' must be array.', task);
  }

  src.forEach(item => {
    if (isString(item)) {
      if (!item.includes('/')) {
        logger.error(`Please include the path. (item: ${item})`, task);
      }
    } else if (isArray(item)) {
      const itemString = JSON.stringify(item);
      if (item.length === 2) {
        const [subpath, extra] = item;
        if (!isCopyAction) {
          logger.error(`The array type can only be used in copy action. (item: ${itemString})`, task);
        } else if (!isString(subpath)) {
          logger.error(`The first element must be a string. (item: ${itemString})`, task);
        } else if (!isArray(extra)) {
          if (isObject(extra)) {
            const { recursive } = extra;
            if (recursive === undefined) {
              logger.error(`\'recursive\' must be required. (item: ${itemString})`, task);
            } else if (!isBoolean(recursive)) {
              logger.error(`\'recursive\' must be boolean. (item: ${itemString})`, task);
            }
          } else {
            logger.error(`The second element must be an array or object. (item: ${itemString})`, task);
          }
        } else if (!subpath.includes('/')) {
          logger.error(`Please include the path. (item: ${itemString})`, task);
        }
        if (isArray(extra)) {
          extra.forEach(item => {
            if (!isString(item)) {
              logger.error(`'src[N][1]' must consist of string elements. (item: ${itemString})`, task);
            }
          });
        }
      } else {
        logger.error(`The array type must consist of two elements. (item: ${itemString})`, task);
      }
    } else {
      logger.error('\'src\' must consist of string or array elements.', task);
    }
  });

  if (isCopyAction) {
    if (!dest) {
      logger.error('\'dest\' must be required.', task);
    } else if (!isString(dest)) {
      logger.error('\'dest\' must be string.', task);
    }
  } else {
    if (!isString(target)) {
      logger.error('\'target\' must be string.', task);
    } else {
      try {
        new RegExp(target);
      } catch (error) {
        logger.error(`Invalid regular expression. (target: ${target})`, task);
      }
    }
  }
}

function getCount(target) {
  return fs.readdirSync(target)
    .reduce((count, subpath) => {
      const fullPath = path.join(target, subpath);
      const isDirectory = fs.statSync(fullPath).isDirectory();
      return count + (isDirectory ? getCount(fullPath) : 1);
    }, 1);
}

function getPathes(task, target, recursive = true, filter = []) {
  const lFilter = filter.map(item => item.toLowerCase());
  if (!fs.existsSync(target)) {
    logger.warn(`No such diectory or file: ${target}`, task);
    return [];
  }
  if (fs.lstatSync(target).isFile()) {
    return [{ isDirectory: false, subpath: path.basename(target), fullPath: target }];
  }
  return fs.readdirSync(target)
    .filter(item => {
      const lItem = item.toLowerCase();
      if (lFilter.length === 0) {
        return true;
      }
      return !!lFilter.find(filterItem => lItem === filterItem);
    })
    .reduce((subpathes, subpath) => {
      const fullPath = path.join(target, subpath);
      const isDirectory = fs.statSync(fullPath).isDirectory();
      return subpathes.concat(
        isDirectory && recursive
          ? [{ isDirectory, subpath, fullPath }].concat(getPathes(task, fullPath, recursive, filter).map(item => {
            item.subpath = path.join(subpath, item.subpath);
            return item;
          })) : [{ isDirectory, subpath, fullPath }]
      );
    }, []);
}

function executeCopy(items, dest, task) {
  const components = dest.split('/');
  const isFileToFile = components[components.length - 1].indexOf('.') !== -1;
  if (!isFileToFile && !fs.existsSync(dest)) {
    fs.mkdirSync(dest, { recursive: true });
    logger.info(`Directory created: ${dest}`, task);
  }
  items.forEach(item => {
    const { isDirectory, subpath, fullPath } = item;
    if (isDirectory) {
      const workingPath = path.join(dest, subpath);
      if (!fs.existsSync(workingPath)) {
        fs.mkdirSync(workingPath, { recursive: true });
        logger.info(`Directory created: ${workingPath}`, task);
      }
    } else if (isFileToFile) {
      fs.copyFileSync(fullPath, dest);
      logger.info(`File copied: ${fullPath} -> ${dest}`, task);
    } else {
      fs.copyFileSync(fullPath, path.join(dest, subpath));
      logger.info(`File copied: ${fullPath} -> ${dest}, ${subpath}`, task);
    }
  });
}

function copy(task) {
  const src = task.src;
  const dest = path.join(to, task.dest);

  src.forEach(item => {
    if (isString(item)) {
      const target = path.join(from, item);
      if (fs.existsSync(target)) {
        executeCopy(getPathes(task, target), dest, task);
      } else {
        logger.warn(`No such diectory: ${target}`, task);
      }
    } else if (Array.isArray(item)) {
      const [subpath, extra] = item;
      const target = path.join(from, subpath);
      if (fs.existsSync(target)) {
        const filter = isArray(extra) ? extra : [];
        const recursive = !isArray(extra) && isObject(extra) ? extra.recursive : true;
        executeCopy(
          getPathes(task, target, recursive, filter), 
          isString(extra) ? path.join(dest, extra) : dest, 
          task,
        );
      } else {
        logger.warn(`No such diectory: ${target}`, task);
      }
    }
  });
}

function executeRemove(items, task) {
  items.forEach(item => {
    const { isDirectory, fullPath } = item;
    if (!isDirectory) {
      fs.unlinkSync(fullPath);
      logger.info(`File removed: ${fullPath}`, task);
    }
  });
}

function remove(task) {
  const { src, target } = task;

  src.forEach(item => {
    item = path.join(to, item);
    if (fs.existsSync(item)) {
      const pathes = getPathes(task, item)
        .filter(pathInfo => new RegExp(target).test(pathInfo.subpath));
      executeRemove(pathes, task);
    } else {
      logger.warn(`No such diectory: ${item}`, task);
    }
  });
}

function run() {
  const start = new Date().getTime();
  logger.info(`${tasks.length} tasks detection.`);
  tasks.forEach(task => validate(task));
  logger.info(`${tasks.length} tasks validated.`);
  tasks.forEach(task => {
    if (task.action === Action.COPY) {
      copy(task);
    } else if (task.action === Action.REMOVE) {
      remove(task);
    }
  });
  const end = new Date().getTime();
  logger.info(`Finished. copied (copied: ${getCount(to)} files, time: ${(end - start) / 1000}s)`);
}

run();
