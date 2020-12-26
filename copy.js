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

const args = process.argv.slice(2);
const [from, to] = args;
const targets = [Target.X86, Target.X64, Target.ARM, Target.ARM64];
const [delegateTarget] = targets;

if (!from || !to) {
  throw new Error('Invalid arguments.');
}

if (!fs.existsSync(from)) {
  throw new Error(`No such diectory: ${from}`);
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
      ['src/android_webview/test/shell/java/src/org/chromium/android_webview', 'shell'],
      [
        'src/android_webview/test/shell/java/src/org/chromium/android_webview',
        [
          'AwTestContainerView.java', 
          'NullContentsClient.java',
        ],
      ],
      `src/out/${delegateTarget}/gen/android_webview/browser_java/generated_java/annotation_processor_outputs/org/chromium/android_webview`,
      `src/out/${delegateTarget}/gen/android_webview/browser_java/generated_java/input_srcjars/org/chromium/android_webview`,
      `src/out/${delegateTarget}/gen/android_webview/common_aidl_java/generated_java/input_srcjars/org/chromium/android_webview`,
      `src/out/${delegateTarget}/gen/android_webview/common_java/generated_java/input_srcjars/org/chromium/android_webview`,
      `src/out/${delegateTarget}/gen/android_webview/proto/aw_variations_seed_proto_java/generated_java/input_srcjars/org/chromium`,
      `src/out/${delegateTarget}/gen/android_webview/proto/metrics_bridge_records_proto_java/generated_java/input_srcjars/org/chromium`,
    ],
    dest: 'src/main/java/org/chromium/android_webview',
  },
  {
    name: 'android_webview',
    action: Action.REMOVE,
    src: [
      'src/main/java/org/chromium/android_webview',
    ],
    target: '*.aidl',
  },
  {
    name: 'base',
    action: Action.COPY,
    src: [
      [
        `src/out/${delegateTarget}/gen/base/base_java/generated_java/annotation_processor_outputs/org/chromium/base`,
        { recursive: false },
      ],
      [`src/out/${delegateTarget}/gen/base/base_java/generated_java/annotation_processor_outputs/org/chromium/base`, 'library_loader'],
      [`src/out/${delegateTarget}/gen/base/base_java/generated_java/annotation_processor_outputs/org/chromium/base`, 'metrics'],
      [`src/out/${delegateTarget}/gen/base/base_java/generated_java/annotation_processor_outputs/org/chromium/base`, 'process_launcher'],
      [`src/out/${delegateTarget}/gen/base/base_java/generated_java/annotation_processor_outputs/org/chromium/base`, 'task'],
      'src/base/android/java/src/org/chromium/base',
      [
        `src/out/${delegateTarget}/gen/base/base_java/generated_java/input_srcjars/org/chromium/base`,
        { recursive: false },
      ],
      [
        `src/out/${delegateTarget}/gen/base/base_java/generated_java/input_srcjars/org/chromium/base`,
        [
          'LibraryLoaderJni.java',
          'LibraryPrefetcherJni.java',
          'LibraryProcessType.java',
        ],
      ],
      [`src/out/${delegateTarget}/gen/base/base_java/generated_java/input_srcjars/org/chromium/base`, 'metrics'],
      [`src/out/${delegateTarget}/gen/base/base_java/generated_java/input_srcjars/org/chromium/base`, 'process_launcher'],
      [`src/out/${delegateTarget}/gen/base/base_java/generated_java/input_srcjars/org/chromium/base`, 'task'],
    ],
    dest: 'src/main/java/org/chromium/base',
  },
  {
    name: 'base',
    action: Action.REMOVE,
    src: [
      'src/main/java/org/chromium/base',
    ],
    target: '*.aidl',
  },
  {
    name: 'blink/mojom',
    action: Action.COPY,
    src: [
      [
        `src/out/${delegateTarget}/gen/third_party/blink/public/mojom/android_mojo_bindings_java/generated_java/input_srcjars/org/chromium/blink/mojom`,
        [
          'AuthenticatorStatus.java',
          'Blob.java',
          'Blob_Internal.java',
          'BlobReaderClient.java',
          'BlobReaderClient_Internal.java',
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
          'EventType.java',
          'FeaturePolicyFeature.java',
          'FocusType.java',
          'NativeFileSystemDragDropToken.java',
          'NativeFileSystemTransferToken.java',
          'NativeFileSystemTransferToken_Internal.java',
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
    src: `src/out/${delegateTarget}/gen/third_party/blink/public/blink_headers_java/generated_java/input_srcjars/org/chromium/blink_public`,
    dest: 'src/main/java/org/chromium/blink_public',
  },
  {
    name: 'components/autofill',
    action: Action.COPY,
    src: [
      'src/components/autofill/android/java/src/org/chromium/components/autofill',
      'src/components/autofill/android/provider/src/org/chromium/components/autofill',
      [
        `src/out/${delegateTarget}/gen/components/autofill/android/autofill_java/generated_java/input_srcjars/org/chromium/components/autofill`,
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
    name: 'components/background_task_scheduler',
    action: Action.COPY,
    src: `src/out/${delegateTarget}/gen/components/background_task_scheduler/generated_java/input_srcjars/org/chromium/components/background_task_scheduler`,
    dest: 'src/main/java/org/chromium/components/background_task_scheduler',
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
      [`src/out/${delegateTarget}/gen/components/crash/android/handler_java/generated_java/annotation_processor_outputs/org/chromium/components/crash`, 'browser'],
      [`src/out/${delegateTarget}/gen/components/crash/android/handler_java/generated_java/input_srcjars/org/chromium/components/crash`, 'browser'],
      `src/out/${delegateTarget}/gen/components/crash/android/java/generated_java/annotation_processor_outputs/org/chromium/components/crash`,
      `src/out/${delegateTarget}/gen/components/crash/android/java/generated_java/input_srcjars/org/chromium/components/crash`,
    ],
    dest: 'src/main/java/org/chromium/components/crash',
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
    name: 'components/safe_browsing',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/android_webview/browser_java/generated_java/input_srcjars/org/chromium/components/safe_browsing`,
    ],
    dest: 'src/main/java/org/chromium/components/safe_browsing',
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
    name: 'content/app',
    action: Action.COPY,
    src: [
      'src/content/public/android/java/src/org/chromium/content/app',
      `src/out/${delegateTarget}/gen/content/public/android/content_java/generated_java/annotation_processor_outputs/org/chromium/content/app`,
      `src/out/${delegateTarget}/gen/content/public/android/content_java/generated_java/input_srcjars/org/chromium/content/app`,
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
    ],
    dest: 'src/main/java/org/chromium/content/browser',
  },
  {
    name: 'content/browser',
    action: Action.REMOVE,
    src: [
      'src/main/java/org/chromium/content/app/sms',
    ],
  },
  {
    name: 'content/common',
    action: Action.COPY,
    src: [
      'src/content/public/android/java/src/org/chromium/content/common',
      `src/out/${delegateTarget}/gen/content/public/android/content_java/generated_java/annotation_processor_outputs/org/chromium/content/common`,
      `src/out/${delegateTarget}/gen/content/public/android/content_java/generated_java/input_srcjars/org/chromium/content/common`,
    ],
    dest: 'src/main/java/org/chromium/content/common',
  },
  {
    name: 'content/common',
    action: Action.REMOVE,
    src: [
      'src/main/java/org/chromium/content/common',
    ],
    target: '*.aidl',
  },
  {
    name: 'content_public/app',
    action: Action.COPY,
    src: [
      'src/content/public/android/java/src/org/chromium/content_public/app',
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
      [`src/out/${delegateTarget}/gen/content/public/android/content_java/generated_java/input_srcjars/org/chromium/content_public/browser`, 'navigation_controller'],
    ],
    dest: 'src/main/java/org/chromium/content_public/browser',
  },
  {
    name: 'content_public/common',
    action: Action.COPY,
    src: [
      'src/content/public/android/java/src/org/chromium/content_public/common',
      `src/out/${delegateTarget}/gen/content/public/android/content_java/generated_java/annotation_processor_outputs/org/chromium/content_public/common`,
      `src/out/${delegateTarget}/gen/content/public/android/content_java/generated_java/input_srcjars/org/chromium/content_public/common`,
    ],
    dest: 'src/main/java/org/chromium/content_public/common',
  },
  {
    name: 'device',
    action: Action.COPY,
    src: [
      ['src/services/device/battery/android/java/src/org/chromium/device', 'battery'],
      ['src/device/bluetooth/android/java/src/org/chromium/device', 'bluetooth'],
      [`src/out/${delegateTarget}/gen/device/bluetooth/java/generated_java/annotation_processor_outputs/org/chromium/device`, 'bluetooth'],
      [`src/out/${delegateTarget}/gen/device/bluetooth/java/generated_java/input_srcjars/org/chromium/device`, 'bluetooth'],
      ['src/device/gamepad/android/java/src/org/chromium/device', 'gamepad'],
      [`src/out/${delegateTarget}/gen/device/gamepad/java/generated_java/annotation_processor_outputs/org/chromium/device`, 'gamepad'],
      [`src/out/${delegateTarget}/gen/device/gamepad/java/generated_java/input_srcjars/org/chromium/device`, 'gamepad'],
      ['src/services/device/geolocation/android/java/src/org/chromium/device', 'geolocation'],
      ['src/services/device/public/java/src/org/chromium/device', 'geolocation'],
      [`src/out/${delegateTarget}/gen/services/device/geolocation/geolocation_java/generated_java/annotation_processor_outputs/org/chromium/device`, 'geolocation'],
      [`src/out/${delegateTarget}/gen/services/device/geolocation/geolocation_java/generated_java/input_srcjars/org/chromium/device`, 'geolocation'],
      [`src/out/${delegateTarget}/gen/services/device/public/mojom/mojom_java/generated_java/input_srcjars/org/chromium/device`, 'mojom'],
      ['src/services/device/nfc/android/java/src/org/chromium/device', 'nfc'],
      ['src/services/device/public/java/src/org/chromium/device', 'nfc'],
      ['src/services/device/wake_lock/power_save_blocker/android/java/src/org/chromium/device', 'power_save_blocker'],
      ['src/services/device/time_zone_monitor/android/java/src/org/chromium/device', 'time_zone_monitor'],
      [`src/out/${delegateTarget}/gen/services/device/time_zone_monitor/java/generated_java/annotation_processor_outputs/org/chromium/device`, 'time_zone_monitor'],
      [`src/out/${delegateTarget}/gen/services/device/time_zone_monitor/java/generated_java/input_srcjars/org/chromium/device`, 'time_zone_monitor'],
      ['src/services/device/usb/android/java/src/org/chromium/device', 'usb'],
      [`src/out/${delegateTarget}/gen/services/device/usb/java/generated_java/annotation_processor_outputs/org/chromium/device`, 'usb'],
      [`src/out/${delegateTarget}/gen/services/device/usb/java/generated_java/input_srcjars/org/chromium/device`, 'usb'],
      ['src/services/device/vibration/android/java/src/org/chromium/device', 'vibration'],
    ],
    dest: 'src/main/java/org/chromium/device',
  },
  {
    name: 'gfx/mojom',
    action: Action.COPY,
    src: [
      `src/out/${delegateTarget}/gen/ui/gfx/geometry/mojom/mojom_java/generated_java/input_srcjars/org/chromium/gfx/mojom`,
      `src/out/${delegateTarget}/gen/ui/gfx/mojom/mojom_java/generated_java/input_srcjars/org/chromium/gfx/mojom`,
      `src/out/${delegateTarget}/gen/ui/gfx/range/mojom/mojom_java/generated_java/input_srcjars/org/chromium/gfx/mojom`,
    ],
    dest: 'src/main/java/org/chromium/gfx/mojom',
  },
  {
    name: 'gpu',
    action: Action.COPY,
    src: `src/out/${delegateTarget}/gen/gpu/config/config_java/generated_java/input_srcjars/org/chromium/gpu`,
    dest: 'src/main/java/org/chromium/gpu',
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
      [`src/out/${delegateTarget}/gen/media/capture/video/mojom/video_capture_java/generated_java/input_srcjars/org/chromium/media`, 'mojom'],
    ],
    dest: 'src/main/java/org/chromium/media',
  },
  {
    name: 'media/mojom',
    action: Action.COPY,
    src: [
      [
        `src/out/${delegateTarget}/gen/media/mojo/mojom/mojom_java/generated_java/input_srcjars/org/chromium/media/mojom`,
        ['AndroidOverlay*.java'],
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
      [`src/out/${delegateTarget}/gen/mojo/public/mojom/base/base_java/generated_java/input_srcjars/org/chromium/mojo_base`, 'mojom'],
    ],
    dest: 'src/main/java/org/chromium/mojo_base',
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
        [
          `src/out/${delegateTarget}/gen/services/network/public/mojom/data_pipe_interfaces_java/generated_java/input_srcjars/org/chromium/network/mojom`,
          [
            'DataPipeGetter.java',
            'DataPipeGetter_Internal.java',
          ],
        ],
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
          'CspSource.java',
          'CspSourceList.java',
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
        `src/out/${delegateTarget}/gen/services/network/public/mojom/mutable_network_traffic_annotation_interface_java/generated_java/input_srcjars/org/chromium/network/mojom`,
        [
          'MutablePartialNetworkTrafficAnnotationTag.java',
        ],
      ],
      [
        `src/out/${delegateTarget}/gen/services/network/public/mojom/websocket_mojom_java/generated_java/input_srcjars/org/chromium/network/mojom`,
        [
          'AuthChallengeInfo.java',
          'SslInfo.java',
        ],
      ],
    ],
    dest: 'src/main/java/org/chromium/network/mojom',
  },
  {
    name: 'payments',
    action: Action.COPY,
    src: `src/out/${delegateTarget}/gen/components/payments/mojom/mojom_java/generated_java/input_srcjars/org/chromium/payments/mojom`,
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
    dest: 'src/main/java/org/chromium//policy',
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
    src: `src/out/${delegateTarget}/gen/services/service_manager/public/mojom/mojom_java/generated_java/input_srcjars/org/chromium/service_manager`,
    dest: 'src/main/java/org/chromium/service_manager',
  },
  {
    name: 'services',
    action: Action.COPY,
    src: [
      ['src/services/device/android/java/src/org/chromium/services', 'device'],
      ['src/services/media_session/public/cpp/android/java/src/org/chromium/services', 'media_session'],
      ['src/services/service_manager/public/java/src/org/chromium/services', 'service_manager'],
    ],
    dest: 'src/main/java/org/chromium/services',
  },
  {
    name: 'shape_detection',
    action: Action.COPY,
    src: [
      'src/services/shape_detection/android/java/src/org/chromium/shape_detection',
      [`src/out/${delegateTarget}/gen/services/shape_detection/public/mojom/mojom_java/generated_java/input_srcjars/org/chromium/shape_detection`, 'mojom'],
    ],
    dest: 'src/main/java/org/chromium/shape_detection',
  },
  {
    name: 'skia/mojom',
    action: Action.COPY,
    src: `src/out/${delegateTarget}/gen/skia/public/mojom/mojom_java/generated_java/input_srcjars/org/chromium/skia/mojom`,
    dest: 'src/main/java/org/chromium/skia/mojom',
  },
  {
    name: 'ui',
    action: Action.COPY,
    src: [
      [
        'src/ui/android/java/src/org/chromium/ui',
        { recursive: false },
      ],
      ['src/ui/android/java/src/org/chromium/ui', 'base'],
      ['src/ui/android/java/src/org/chromium/ui', 'display'],
      ['src/ui/android/java/src/org/chromium/ui', 'events'],
      ['src/ui/android/java/src/org/chromium/ui', 'gfx'],
      ['src/ui/android/java/src/org/chromium/ui', 'gl'],
      ['src/ui/android/java/src/org/chromium/ui', 'interpolators'],
      ['src/ui/android/java/src/org/chromium/ui', 'modaldialog'],
      ['src/ui/android/java/src/org/chromium/ui', 'modelutil'],
      ['src/ui/android/java/src/org/chromium/ui', 'resources'],
      ['src/ui/android/java/src/org/chromium/ui', 'text'],
      ['src/ui/android/java/src/org/chromium/ui', 'touchless'],
      ['src/ui/android/java/src/org/chromium/ui', 'util'],
      ['src/ui/android/java/src/org/chromium/ui', 'widget'],
      `src/out/${delegateTarget}/gen/ui/android/ui_full_java/generated_java/annotation_processor_outputs/org/chromium/ui`,
      `src/out/${delegateTarget}/gen/ui/android/ui_full_java/generated_java/input_srcjars/org/chromium/ui`,
      [`src/out/${delegateTarget}/gen/ui/base/ime/mojom/mojom_java/generated_java/input_srcjars/org/chromium/ui`, 'mojom'],
      [`src/out/${delegateTarget}/gen/ui/base/cursor/mojom/cursor_type_java/generated_java/input_srcjars/org/chromium/ui`, 'mojom'],
      [`src/out/${delegateTarget}/gen/ui/latency/mojom/mojom_java/generated_java/input_srcjars/org/chromium/ui`, 'mojom'],
      [`src/out/${delegateTarget}/gen/content/public/android/content_java/generated_java/input_srcjars/org/chromium/ui`, 'touch_selection'],
    ],
    dest: 'src/main/java/org/chromium/ui',
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
      'url/android/java/src/org/chromium/url',
      `src/out/${delegateTarget}/gen/url/gurl_java/generated_java/input_srcjars/org/chromium/url`,
      [`src/out/${delegateTarget}/gen/url/mojom/url_mojom_gurl_java/generated_java/input_srcjars/org/chromium/url`, 'mojom'],
      [`src/out/${delegateTarget}/gen/url/mojom/url_mojom_origin_java/generated_java/input_srcjars/org/chromium/url`, 'mojom'],
    ],
    dest: 'src/main/java/org/chromium/url',
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
  ...((targets) => {
    return targets.map((target) => {
      return {
        name: 'libstandalonelibchromiumwebview_so',
        src: [
          `src/out/${target}/libstandalonelibchromiumwebview.so`,
        ],
        dest: `src/main/jniLibs/${Arch[Target]}`,
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
];

function getPathes(from, recursive = true, filter = []) {
  if (fs.lstatSync(from).isFile()) return [{ isDirectory: false, fullPath: from }];
  return fs.readdirSync(from).reduce((subpathes, subpath) => {
    const fullPath = path.join(from, subpath);
    const isDirectory = fs.statSync(fullPath).isDirectory();
    return subpathes.concat(
      isDirectory && recursive 
        ? getPathes({ isDirectory, subpath, fullPath }) 
        : [{ isDirectory, subpath, fullPath }]
    );
  }, []);
}

function _executeCopy(items, dest, prefix) {
  items.forEach((item) => {
    const { isDirectory, subpath, fullPath } = item;
    if (isDirectory) {
      const workingPath = path.join(dest, subpath);
      if (!fs.existsSync(workingPath)) {
        fs.mkdirSync(workingPath, { recursive: true });
        console.log(`${prefix} Directory created: ${workingPath}`);
      }
    } else {
      fs.copyFileSync(fullPath, dest);
      console.log(`${prefix} File copied: ${fullPath} -> ${dest}`);
    }
  });
}

function executeCopy(task, prefix) {
  if (!task.src) {
    console.error(`${prefix} 'src' must be required.`);
    return;
  }

  if (!Array.isArray(task.src)) {
    console.error(`${prefix}: 'src' must be array.`);
    return;
  }

  if (!task.dest) {
    console.error(`${prefix} 'dest' must be required.`);
    return;
  }

  if (typeof task.dest === 'string') {
    console.error(`${prefix}: 'src' must be string.`);
    return;
  }

  const src = task.src.map(item => path.join(from, item));
  const dest = path.join(to, task.dest);

  if (!fs.existsSync(dest)) {
    fs.mkdirSync(dest, { recursive: true });
    console.log(`${prefix} Directory created: ${dest}`);
  }

  src.forEach((item) => {
    if (fs.lstatSync(item).isFile()) {
      if (fs.lstatSync(dest).isFile()) {
        console.error(`${prefix}: '${dest}' must be directory.`);
      } else {
        _executeCopy(getPathes(item), dest, prefix);
      }
    } else if (Array.isArray(item)) {
      const [targetPath, extra] = item;
      const filter = Array.isArray(extra) ? extra : (typeof extra === 'string' ? [extra] : []);
      const recursive = !Array.isArray(extra) && typeof extra === 'object' ? extra.recursive : true;
      _executeCopy(getPathes(targetPath, recursive, filter), dest, prefix);
    } else if (!fs.existsSync(item)) {
      console.error(`${prefix} No such path: ${path}`);
    } else {
      _executeCopy(getPathes(item), dest, prefix);
    }
  });
}

function executeDelete(task, prefix) {
}

tasks.forEach((task) => {
  const { name, action } = task;
  const prefix = `[${name}:${action}]`;
  if (action === Action.COPY) {
    executeCopy(task, prefix);
  } else if (action === Action.REMOVE) {
    executeDelete(task, prefix);
  } else {
    console.error(`${prefix}: Invalid action.`);
  }
});
