# chromium-aw

[![Build Status](https://travis-ci.com/ridi/chromium-aw.svg?token=ksQ7RJPHGHiCZLukAhKW&branch=master)](https://travis-ci.com/ridi/chromium-aw)

[Chromium](https://www.chromium.org) based Android WebView engine to be embedded in Ridibooks-Android

## Getting started

This library is distributed by [jitpack](https://jitpack.io).

You should add jitpack maven repository to build.gradle file of your project.

```
repositories {
    ...
    maven { url 'https://jitpack.io' }
    ...
}
```

Then you can include this library by adding dependency script to build.gradle file of your project.

```
dependencies {
    ...
    compile 'com.github.ridi:chromium-aw:<version>'
    ...
}
```

**IMPORTANT : Add following `aaptOptions` to prevent asset files being compressed.**

```
android {
    ...
    aaptOptions {
        noCompress 'dat', 'pak'
    }
    ...
}
```

## Chromium build information

Current version is based on [`85.0.4183.162`](https://chromium.googlesource.com/chromium/src.git/+/refs/tags/85.0.4183.162)

## Customizing

- Unix domain socket name prefix for Devtools is changed. (Patch files are [here](patches).)

## Build instructions

### References

- [Checking out and building Chromium for Android](https://chromium.googlesource.com/chromium/src/+/master/docs/android_build_instructions.md)
- [Build Instructions(Android WebView)](https://www.chromium.org/developers/how-tos/build-instructions-android-webview)
- [GN build configuration](https://www.chromium.org/developers/gn-build-configuration)

### Environment install steps

- A 64-bit Intel machine running Linux with at least 8GB of RAM. More than 16GB is highly recommended.
- At least 100GB of free disk space.
- You must have Git and Python installed already.
- It takes about 2 hours.

1. Clone depot_tools.

```sh
$ cd ~
$ git clone https://chromium.googlesource.com/chromium/tools/depot_tools.git

$ export PATH="$PATH:$HOME/depot_tools"
```

1. Clone chromium.

```sh
$ mkdir ~/chromium && cd ~/chromium
$ fetch --nohooks android

$ cd src
$ gclient sync
```

3. Iinstall additional build dependencies.

```sh
$ build/install-build-deps-android.sh

$ gclient runhooks
```

4. \[Optional\] Install [ccache](https://github.com/ccache/ccache).

Improves build speed by ccache when building multiple times.

```sh
$ sudo apt install ccache

$ export CCACHE_CPP2=yes
$ export CCACHE_SLOPPINESS=time_macros

$ sed -i -e 's/^max_size = 1.0G/max_size = 10.0G/g' ~/.ccache/ccache.conf
```

5. \[Optional\] Install [icecc](https://github.com/icecc/icecream).

Improves build speed by combine icecc with ccache.

```sh
$ sudo apt install icecc

$ mkdir -p /opt/ccache/bin
$ ln -s /usr/bin/ccache /opt/ccache/bin/gcc
$ ln -s /usr/bin/ccache /opt/ccache/bin/g++

$ export CCACHE_PREFIX=icecc
$ export ICECC_CLANG_REMOTE_CPP=1
$ export PATH=$PATH:/opt/ccache/bin

$ sudo sed -i -e 's/^ICECC_MAX_JOBS=""/ICECC_MAX_JOBS="$JOBS"/g' /etc/icecc/icecc.conf # CPU cores * 2 is recommended for $JOBS.
$ sudo service iceccd restart
```

### Build steps

1. Checkout.

```sh
$ cd ~/chromium/src

$ git checkout tags/$VERSION # ex) tags/85.0.4183.162

$ gclient sync
```

2. Customizing.

Apply [patch files](patches).

3. Generate target and build.

In this project `$TARGET` must be one of `arm`, `arm64`, `x86`, and `x64`.

```sh
$ gn gen --args='target_os="android" target_cpu="$TARGET" is_debug=false cc_wrapper="ccache" symbol_level=0 blink_symbol_level=0 enable_nacl=false use_debug_fission=false clang_use_chrome_plugins=false v8_use_external_startup_data=false' out/$TARGET

# It takes about 3 hours. (Intel i5-10400, RAM 16GB, WSL2, no-cache, local parallel build, x86 target)
$ ninja -C out/$TARGET webview_instrumentation_apk
```

4. Copy build result and sources to chromium-aw.

**IMPORTANT : It may be different depending on Chromium version.**

$TARGET | $DEST
---|---
arm | armeabi-v7a
arm64 | arm64-v8a
x86 | x86
x64 | x86_64

<details><summary>Commands</summary>
<p>

```sh
# binary
$ cd ~/chromium/src/out/$TARGET
$ \cp -f libstandalonelibchromiumwebview.so ~/chromium-aw/src/main/jniLibs/$DEST
$ \cp -f icudtl.dat ~/chromium-aw/src/main/assets # Only once, regardless of $TARGET.

# pak (gen)
$ cd ~/chromium/src/out/$TARGET/gen
$ \cp -f android_webview/locale/en-US.pak ~/chromium-aw/src/main/assets/fallback-locales
$ \cp -f android_webview/chrome_100_percent.pak ~/chromium-aw/src/main/assets
$ \cp -f android_webview/resources.pak ~/chromium-aw/src/main/assets

# natives (gen)
$ cd ~/chromium/src/out/$TARGET/gen/android_webview/test/webview_instrumentation_apk/generated_java/input_srcjars
$ \cp -f J/N.java ~/chromium-aw/src/main/java/J
$ \cp -f org/chromium/android_webview/ProductConfig.java ~/chromium-aw/src/main/java/org/chromium/android_webview
$ \cp -f org/chromium/base/library_loader/NativeLibraries.java ~/chromium-aw/src/main/java/org/chromium/base/library_loader
$ \cp -f org/chromium/base/natives/GEN_JNI.java ~/chromium-aw/src/main/java/org/chromium/base/natives
$ \cp -f org/chromium/base/BuildConfig.java ~/chromium-aw/src/main/java/org/chromium/base

# android_webview (gen)
$ cd ~/chromium/src/out/$TARGET/gen/android_webview/browser_java/generated_java/input_srcjars
$ \cp -rf org/chromium/android_webview ~/chromium-aw/src/main/java/org/chromium

# android_webview/common (gen)
$ cd ~/chromium/src/out/$TARGET/gen/android_webview/common_aidl_java/generated_java/input_srcjars/org/chromium
$ \cp -rf android_webview ~/chromium-aw/src/main/java/org/chromium

$ cd ~/chromium/src/out/$TARGET/gen/android_webview/common_java/generated_java/input_srcjars/org/chromium
$ \cp -rf android_webview ~/chromium-aw/src/main/java/org/chromium

# android_webview/proto (gen)
$ cd ~/chromium/src/out/$TARGET/gen/android_webview/proto/aw_variations_seed_proto_java/generated_java/input_srcjars/org/chromium
$ \cp -rf android_webview ~/chromium-aw/src/main/java/org/chromium
$ cd ~/chromium/src/out/$TARGET/gen/android_webview/proto/metrics_bridge_records_proto_java/generated_java/input_srcjars/org/chromium
$ \cp -rf android_webview ~/chromium-aw/src/main/java/org/chromium

# android_webview
$ cd ~/chromium/src/android_webview/java/src/org/chromium
$ \cp -rf android_webview ~/chromium-aw/src/main/java/org/chromium
$ \rm -rf ~/chromium-aw/src/main/java/org/chromium/android_webview/**/*.aidl

# android_webview/shell
$ cd ~/chromium/src/android_webview/test/shell/java/src/org/chromium/android_webview
$ \cp -rf shell ~/chromium-aw/src/main/java/org/chromium/android_webview

# android_webview/test
$ cd ~/chromium/src/android_webview/test/shell/java/src/org/chromium/android_webview/test
$ \cp -f AwTestContainerView.java ~/chromium-aw/src/main/java/org/chromium/android_webview/test
$ \cp -f NullContentsClient.java ~/chromium-aw/src/main/java/org/chromium/android_webview/test

# android_webview (res)
$ cd ~/chromium/src/android_webview/java
$ \cp -rf res ~/chromium-aw/src/main

# base (gen)
$ cd ~/chromium/src/out/$TARGET/gen/base/base_java/generated_java/input_srcjars/org/chromium/base
$ \cp -f *.java ~/chromium-aw/src/main/java/org/chromium/base

# base/library_loader (gen)
$ cd ~/chromium/src/out/$TARGET/gen/base/base_java/generated_java/input_srcjars/org/chromium/base/library_loader
$ \cp -f LibraryLoaderJni.java ~/chromium-aw/src/main/java/org/chromium/base/library_loader
$ \cp -f LibraryPrefetcherJni.java ~/chromium-aw/src/main/java/org/chromium/base/library_loader
$ \cp -f LibraryProcessType.java ~/chromium-aw/src/main/java/org/chromium/base/library_loader

# base/metrics (gen)
$ cd ~/chromium/src/out/$TARGET/gen/base/base_java/generated_java/input_srcjars/org/chromium/base
$ \cp -rf metrics ~/chromium-aw/src/main/java/org/chromium/base

# base/process_launcher (gen)
$ cd ~/chromium/src/out/$TARGET/gen/base/base_java/generated_java/input_srcjars/org/chromium/base
$ \cp -rf process_launcher ~/chromium-aw/src/main/java/org/chromium/base

# base/task (gen)
$ cd ~/chromium/src/out/$TARGET/gen/base/base_java/generated_java/input_srcjars/org/chromium/base
$ \cp -rf task ~/chromium-aw/src/main/java/org/chromium/base

# base
$ cd ~/chromium/src/base/android/java/src/org/chromium
$ \cp -rf base ~/chromium-aw/src/main/java/org/chromium
$ \rm -r ~/chromium-aw/src/main/java/org/chromium/base/**/*.aidl

# blink (gen)
$ cd ~/chromium/src/out/$TARGET/gen/third_party/blink/public/mojom/android_mojo_bindings_java/generated_java/input_srcjars/org/chromium/blink/mojom
$ \cp -f AuthenticatorStatus.java ~/chromium-aw/src/main/java/org/chromium/blink/mojom
$ \cp -f Blob.java ~/chromium-aw/src/main/java/org/chromium/blink/mojom
$ \cp -f Blob_Internal.java ~/chromium-aw/src/main/java/org/chromium/blink/mojom
$ \cp -f BlobReaderClient.java ~/chromium-aw/src/main/java/org/chromium/blink/mojom
$ \cp -f BlobReaderClient_Internal.java ~/chromium-aw/src/main/java/org/chromium/blink/mojom
$ \cp -f RemoteInvocationArgument.java ~/chromium-aw/src/main/java/org/chromium/blink/mojom
$ \cp -f RemoteInvocationError.java ~/chromium-aw/src/main/java/org/chromium/blink/mojom
$ \cp -f RemoteInvocationResult.java ~/chromium-aw/src/main/java/org/chromium/blink/mojom
$ \cp -f RemoteInvocationResultValue.java ~/chromium-aw/src/main/java/org/chromium/blink/mojom
$ \cp -f RemoteObject.java ~/chromium-aw/src/main/java/org/chromium/blink/mojom
$ \cp -f RemoteObject_Internal.java ~/chromium-aw/src/main/java/org/chromium/blink/mojom
$ \cp -f RemoteObjectGateway.java ~/chromium-aw/src/main/java/org/chromium/blink/mojom
$ \cp -f RemoteObjectGateway_Internal.java ~/chromium-aw/src/main/java/org/chromium/blink/mojom
$ \cp -f RemoteObjectGatewayFactory.java ~/chromium-aw/src/main/java/org/chromium/blink/mojom
$ \cp -f RemoteObjectGatewayFactory_Internal.java ~/chromium-aw/src/main/java/org/chromium/blink/mojom
$ \cp -f RemoteObjectHost.java ~/chromium-aw/src/main/java/org/chromium/blink/mojom
$ \cp -f RemoteObjectHost_Internal.java ~/chromium-aw/src/main/java/org/chromium/blink/mojom
$ \cp -f SerializedBlob.java ~/chromium-aw/src/main/java/org/chromium/blink/mojom
$ \cp -f SingletonJavaScriptValue.java ~/chromium-aw/src/main/java/org/chromium/blink/mojom
$ cd ~/chromium/src/out/$TARGET/gen/third_party/blink/public/mojom/mojom_platform_java/generated_java/input_srcjars/org/chromium/blink/mojom
$ \cp -f ContactIconBlob.java ~/chromium-aw/src/main/java/org/chromium/blink/mojom
$ \cp -f EventType.java ~/chromium-aw/src/main/java/org/chromium/blink/mojom
$ \cp -f FeaturePolicyFeature.java ~/chromium-aw/src/main/java/org/chromium/blink/mojom
FocusType.java
$ \cp -f NativeFileSystemDragDropToken.java ~/chromium-aw/src/main/java/org/chromium/blink/mojom
$ \cp -f NativeFileSystemTransferToken.java ~/chromium-aw/src/main/java/org/chromium/blink/mojom
$ \cp -f NativeFileSystemTransferToken_Internal.java ~/chromium-aw/src/main/java/org/chromium/blink/mojom
SerializedArrayBufferContents.java
SpeechAudioErrorDetails.java
SpeechRecognitionError.java
$ \cp -f SpeechRecognitionErrorCode.java ~/chromium-aw/src/main/java/org/chromium/blink/mojom
ViewportFit.java
$ cd ~/chromium/src/out/$TARGET/gen/third_party/blink/public/mojom/mojom_core_java/generated_java/input_srcjars/org/chromium/blink/mojom
$ \cp -f CloneableMessage.java ~/chromium-aw/src/main/java/org/chromium/blink/mojom
MessagePortDescriptor.java
TransferableMessage.java
UserActivationSnapshot.java

# blink_public (gen)
$ cd ~/chromium/src/out/$TARGET/gen/third_party/blink/public/blink_headers_java/generated_java/input_srcjars/org/chromium
$ \cp -rf blink_public ~/chromium-aw/src/main/java/org/chromium

# components/autofill
$ cd ~/chromium/src/components/autofill/android/java/src/org/chromium/components
$ \cp -rf autofill ~/chromium-aw/src/main/java/org/chromium/components
$ cd ~/chromium/src/components/autofill/android/provider/src/org/chromium/components
$ \cp -rf autofill ~/chromium-aw/src/main/java/org/chromium/components

# components/autofill (res)
$ cd ~/chromium/src/components/autofill/android/java
$ \cp -rf res ~/chromium-aw/src/main

# components/autofill (gen)
$ cd ~/chromium/src/out/$TARGET/gen/components/autofill/android/provider/java/generated_java/input_srcjars/org/chromium/components
$ \cp -rf autofill ~/chromium-aw/src/main/java/org/chromium/components
$ cd ~/chromium/src/out/$TARGET/gen/components/autofill/android/autofill_java/generated_java/input_srcjars/org/chromium/components
$ \cp -f autofill/PopupItemId.java ~/chromium-aw/src/main/java/org/chromium/components/autofill
$ cd ~/chromium/src/out/$TARGET/gen/components/autofill/core/common/mojom/mojo_types_java/generated_java/input_srcjars/org/chromium/components
$ \cp -rf autofill ~/chromium-aw/src/main/java/org/chromium/components

# components/background_task_scheduler (gen)
$ cd ~/chromium/src/out/$TARGET/gen/components/background_task_scheduler/generated_java/input_srcjars/org/chromium/components
$ \cp -rf background_task_scheduler ~/chromium-aw/src/main/java/org/chromium/components

# components/content_capture
$ cd ~/chromium/src/components/content_capture/android/java/src/org/chromium/components
$ \cp -rf content_capture ~/chromium-aw/src/main/java/org/chromium/components

# components/content_capture (gen)
$ cd ~/chromium/src/out/$TARGET/gen/components/content_capture/android/java/generated_java/input_srcjars/org/chromium/components
$ \cp -rf content_capture ~/chromium-aw/src/main/java/org/chromium/components

# components/crash
$ cd ~/chromium/src/components/crash/android/java/src/org/chromium/components
$ \cp -rf crash ~/chromium-aw/src/main/java/org/chromium/components

# components/crash (gen)
$ cd ~/chromium/src/out/$TARGET/gen/components/crash/android/java/generated_java/input_srcjars/org/chromium/components
$ \cp -rf crash ~/chromium-aw/src/main/java/org/chromium/components
$ cd ~/chromium/src/out/$TARGET/gen/components/crash/android/handler_java/generated_java/input_srcjars/org/chromium/components
$ \cp -rf crash ~/chromium-aw/src/main/java/org/chromium/components

# components/embedder_support/delegate
$ cd ~/chromium/src/components/embedder_support/android/java/src/org/chromium/components
$ \cp -rf embedder_support/delegate ~/chromium-aw/src/main/java/org/chromium/components

# components/embedder_support/delegate (res)
$ cd ~/chromium/src/components/embedder_support/android/java
$ \cp -rf res ~/chromium-aw/src/main

# components/embedder_support/delegate (gen)
$ cd ~/chromium/src/out/$TARGET/gen/components/embedder_support/android/web_contents_delegate_java/generated_java/input_srcjars/org/chromium/components
$ \cp -rf embedder_support ~/chromium-aw/src/main/java/org/chromium/components

# components/embedder_support/util
$ cd ~/chromium/src/components/embedder_support/android/java/src/org/chromium/components
$ \cp -rf embedder_support/util ~/chromium-aw/src/main/java/org/chromium/components

# components/embedder_support/util (gen)
$ cd ~/chromium/src/out/$TARGET/gen/components/embedder_support/android/util_java/generated_java/input_srcjars/org/chromium/components
$ \cp -rf embedder_support ~/chromium-aw/src/main/java/org/chromium/components

# components/location
$ cd ~/chromium/src/components/location/android/java/src/org/chromium/components
$ \cp -rf location ~/chromium-aw/src/main/java/org/chromium/components

# components/location (gen)
$ cd ~/chromium/src/out/$TARGET/gen/components/location/android/location_java/generated_java/input_srcjars/org/chromium/components
$ \cp -rf location ~/chromium-aw/src/main/java/org/chromium/components
$ cd ~/chromium/src/out/$TARGET/gen/components/location/android/settings_java/generated_java/input_srcjars/org/chromium/components
$ \cp -rf location ~/chromium-aw/src/main/java/org/chromium/components

# components/metrics
$ cd ~/chromium/src/components/embedder_support/android/metrics/java/src/org/chromium/components
$ \cp -rf metrics ~/chromium-aw/src/main/java/org/chromium/components

# components/metrics (gen)
$ cd ~/chromium/src/out/$TARGET/gen/components/metrics/metrics_java/generated_java/input_srcjars/org/chromium/components
$ \cp -rf metrics ~/chromium-aw/src/main/java/org/chromium/components

# components/minidump_uploader
$ cd ~/chromium/src/components/minidump_uploader/android/java/src/org/chromium/components
$ \cp -rf minidump_uploader ~/chromium-aw/src/main/java/org/chromium/components

# components/minidump_uploader (gen)
$ cd ~/chromium/src/out/$TARGET/gen/components/minidump_uploader/minidump_uploader_java/generated_java/input_srcjars/org/chromium/components
$ \cp -rf minidump_uploader ~/chromium-aw/src/main/java/org/chromium/components

# components/navigation_interception
$ cd ~/chromium/src/components/navigation_interception/android/java/src/org/chromium/components
$ \cp -rf navigation_interception ~/chromium-aw/src/main/java/org/chromium/components

# components/safe_browsing (gen)
$ cd ~/chromium/src/out/$TARGET/gen/android_webview/browser_java/generated_java/input_srcjars/org/chromium/components
$ \cp -rf safe_browsing ~/chromium-aw/src/main/java/org/chromium/components

# components/variations
$ cd ~/chromium/src/components/variations/android/java/src/org/chromium/components
$ \cp -rf variations ~/chromium-aw/src/main/java/org/chromium/components

# components/variations (gen)
$ cd ~/chromium/src/out/$TARGET/gen/components/variations/load_seed_result_enum_java/generated_java/input_srcjars/org/chromium/components
$ \cp -rf variations ~/chromium-aw/src/main/java/org/chromium/components
$ cd ~/chromium/src/out/$TARGET/gen/components/variations/android/variations_java/generated_java/input_srcjars/org/chromium/components
$ \cp -rf variations ~/chromium-aw/src/main/java/org/chromium/components

# components/version_info
$ cd ~/chromium/src/components/version_info/android/java/src/org/chromium/components
$ \cp -rf version_info ~/chromium-aw/src/main/java/org/chromium/components

# components/version_info (gen)
$ cd ~/chromium/src/out/$TARGET/gen/components/version_info/android/version_constants_java/generated_java/input_srcjars/org/chromium/components
$ \cp -rf version_info ~/chromium-aw/src/main/java/org/chromium/components
$ cd ~/chromium/src/out/$TARGET/gen/components/version_info/android/java/org/chromium/components
$ \cp -rf version_info ~/chromium-aw/src/main/java/org/chromium/components

# components/viz
$ cd ~/chromium/src/components/viz/service/java/src/org/chromium/components
$ \cp -rf viz ~/chromium-aw/src/main/java/org/chromium/components

# components/viz (gen)
$ cd ~/chromium/src/out/$TARGET/gen/components/viz/service/service_java/generated_java/input_srcjars/org/chromium/components
$ \cp -rf viz ~/chromium-aw/src/main/java/org/chromium/components

# content/app
$ cd ~/chromium/src/content/public/android/java/src/org/chromium/content
$ \cp -rf app ~/chromium-aw/src/main/java/org/chromium/content

# content/app (gen)
$ cd ~/chromium/src/out/$TARGET/gen/content/public/android/content_java/generated_java/input_srcjars/org/chromium/content
$ \cp -rf app ~/chromium-aw/src/main/java/org/chromium/content

# content/browser
$ cd ~/chromium/src/content/public/android/java/src/org/chromium/content
$ \cp -rf browser ~/chromium-aw/src/main/java/org/chromium/content
$ \rm -rf ~/chromium-aw/src/main/java/org/chromium/content/browser/sms

# content/browser (gen)
$ cd ~/chromium/src/out/$TARGET/gen/content/public/android/content_java/generated_java/input_srcjars/org/chromium/content
$ \cp -rf browser ~/chromium-aw/src/main/java/org/chromium/content
$ \rm -rf ~/chromium-aw/src/main/java/org/chromium/content/app/sms

# content/common
$ cd ~/chromium/src/content/public/android/java/src/org/chromium/content
$ \cp -rf common ~/chromium-aw/src/main/java/org/chromium/content
$ \rm -r ~/chromium-aw/src/main/java/org/chromium/common/*.aidl

# content/common (gen)
$ cd ~/chromium/src/out/$TARGET/gen/content/public/android/content_java/generated_java/input_srcjars/org/chromium/content
$ \cp -rf common ~/chromium-aw/src/main/java/org/chromium/content

# content_public/app
$ cd ~/chromium/src/content/public/android/java/src/org/chromium/content_public
$ \cp -rf app ~/chromium-aw/src/main/java/org/chromium/content_public

# content_public/browser
$ cd ~/chromium/src/content/public/android/java/src/org/chromium/content_public
$ \cp -rf browser ~/chromium-aw/src/main/java/org/chromium/content_public

# content_public/browser (gen)
$ cd ~/chromium/src/out/$TARGET/gen/content/public/android/content_java/generated_java/input_srcjars/org/chromium/content_public/browser
$ \cp -rf *.java ~/chromium-aw/src/main/java/org/chromium/content_public/browser
$ \cp -rf navigation_controller ~/chromium-aw/src/main/java/org/chromium/content_public/browser

# content_public/common
$ cd ~/chromium/src/content/public/android/java/src/org/chromium/content_public
$ \cp -rf common ~/chromium-aw/src/main/java/org/chromium/content_public

# content_public/common (gen)
$ cd ~/chromium/src/out/$TARGET/gen/content/public/android/content_java/generated_java/input_srcjars/org/chromium/content_public
$ \cp -rf common ~/chromium-aw/src/main/java/org/chromium/content_public

# device (gen)
$ cd ~/chromium/src/out/$TARGET/gen/services/device/java/device_feature_list_java/generated_java/input_srcjars/org/chromium
$ \cp -rf device ~/chromium-aw/src/main/java/org/chromium

# device/bluetooth
$ cd ~/chromium/src/device/bluetooth/android/java/src/org/chromium/device
$ \cp -rf bluetooth ~/chromium-aw/src/main/java/org/chromium/device

# device/bluetooth (gen)
$ cd ~/chromium/src/out/$TARGET/gen/device/bluetooth/java/generated_java/input_srcjars/org/chromium/device
$ \cp -rf bluetooth ~/chromium-aw/src/main/java/org/chromium/device

# device/gamepad
$ cd ~/chromium/src/device/gamepad/android/java/src/org/chromium/device
$ \cp -rf gamepad ~/chromium-aw/src/main/java/org/chromium/device

# device/gamepad (gen)
$ cd ~/chromium/src/out/$TARGET/gen/device/gamepad/java/generated_java/input_srcjars/org/chromium/device
$ \cp -rf gamepad ~/chromium-aw/src/main/java/org/chromium/device

# device/battery
$ cd ~/chromium/src/services/device/battery/android/java/src/org/chromium/device
$ \cp -rf battery ~/chromium-aw/src/main/java/org/chromium/device

# device/geolocation
$ cd ~/chromium/src/services/device/geolocation/android/java/src/org/chromium/device
$ \cp -rf geolocation ~/chromium-aw/src/main/java/org/chromium/device
$ cd ~/chromium/src/services/device/public/java/src/org/chromium/device
$ \cp -rf geolocation ~/chromium-aw/src/main/java/org/chromium/device

# device/geolocation (gen)
$ cd ~/chromium/src/out/$TARGET/gen/services/device/geolocation/geolocation_java/input_srcjars/org/chromium/device
$ \cp -rf geolocation ~/chromium-aw/src/main/java/org/chromium/device

# device/mojom (gen)
$ cd ~/chromium/src/out/$TARGET/gen/services/device/public/mojom/mojom_java/generated_java/input_srcjars/org/chromium/device
$ \cp -rf mojom ~/chromium-aw/src/main/java/org/chromium/device

# device/nfc
$ cd ~/chromium/src/services/device/nfc/android/java/src/org/chromium/device
$ \cp -rf nfc ~/chromium-aw/src/main/java/org/chromium/device
$ cd ~/chromium/src/services/device/public/java/src/org/chromium/device
$ \cp -rf nfc ~/chromium-aw/src/main/java/org/chromium/device

# device/power_save_blocker
$ cd ~/chromium/src/services/device/wake_lock/power_save_blocker/android/java/src/org/chromium/device
$ \cp -rf power_save_blocker ~/chromium-aw/src/main/java/org/chromium/device

# device/time_zone_monitor
$ cd ~/chromium/src/services/device/time_zone_monitor/android/java/src/org/chromium/device
$ \cp -rf time_zone_monitor ~/chromium-aw/src/main/java/org/chromium/device

# device/time_zone_monitor (gen)
$ cd ~/chromium/src/out/$TARGET/gen/services/device/time_zone_monitor/java/generated_java/input_srcjars/org/chromium/device
$ \cp -rf time_zone_monitor ~/chromium-aw/src/main/java/org/chromium/device

# device/usb
$ cd ~/chromium/src/services/device/usb/android/java/src/org/chromium/device
$ \cp -rf usb ~/chromium-aw/src/main/java/org/chromium/device

# device/usb (gen)
$ cd ~/chromium/src/out/$TARGET/gen/services/device/usb/java/generated_java/input_srcjars/org/chromium/device
$ \cp -rf usb ~/chromium-aw/src/main/java/org/chromium/device

# device/vibration
$ cd ~/chromium/src/services/device/vibration/android/java/src/org/chromium/device
$ \cp -rf vibration ~/chromium-aw/src/main/java/org/chromium/device

# gfx/mojom (gen)
$ cd ~/chromium/src/out/$TARGET/gen/ui/gfx/geometry/mojom/mojom_java/generated_java/input_srcjars/org/chromium
$ \cp -rf gfx ~/chromium-aw/src/main/java/org/chromium
$ cd ~/chromium/src/out/$TARGET/gen/ui/gfx/range/mojom/mojom_java/generated_java/input_srcjars/org/chromium
$ \cp -rf gfx ~/chromium-aw/src/main/java/org/chromium

# gpu (gen)
$ cd ~/chromium/src/out/$TARGET/gen/gpu/config/config_java/generated_java/input_srcjars/org/chromium
$ \cp -rf gpu ~/chromium-aw/src/main/java/org/chromium

# media
$ cd ~/chromium/src/media/base/android/java/src/org/chromium
$ \cp -rf media ~/chromium-aw/src/main/java/org/chromium
$ cd ~/chromium/src/media/capture/content/android/java/src/org/chromium
$ \cp -rf media ~/chromium-aw/src/main/java/org/chromium
$ cd ~/chromium/src/media/capture/video/android/java/src/org/chromium
$ \cp -rf media ~/chromium-aw/src/main/java/org/chromium

# media (gen)
$ cd ~/chromium/src/out/$TARGET/gen/media/base/android/media_java/generated_java/input_srcjars/org/chromium
$ \cp -rf media ~/chromium-aw/src/main/java/org/chromium
$ cd ~/chromium/src/out/$TARGET/gen/media/capture/video/android/capture_java/generated_java/input_srcjars/org/chromium
$ \cp -rf media ~/chromium-aw/src/main/java/org/chromium
$ cd ~/chromium/src/out/$TARGET/gen/media/capture/content/android/screen_capture_java/generated_java/input_srcjars/org/chromium
$ \cp -rf media ~/chromium-aw/src/main/java/org/chromium

# media/mojom (gen)
$ cd ~/chromium/src/out/$TARGET/gen/media/moj/mojom/mojom_java/generated_java/input_srcjars/org/chromium/media/mojom
$ find . -name "AndroidOverlay*.java" -exec \cp -f ~/chromium-aw/src/main/java/org/chromium/media/mojom "{}" \;

# midi
$ cd ~/chromium/src/media/midi/java/src/org/chromium
$ \cp -rf midi ~/chromium-aw/src/main/java/org/chromium

# midi (gen)
$ cd ~/chromium/src/out/$TARGET/gen/media/midi_java/generated_java/input_srcjars/org/chromium
$ \cp -rf midi ~/chromium-aw/src/main/java/org/chromium

# mojo
$ cd ~/chromium/src/mojo/public/java/bindings/src/org/chromium
$ \cp -rf mojo ~/chromium-aw/src/main/java/org/chromium
$ cd ~/chromium/src/mojo/public/java/system/src/org/chromium
$ \cp -rf mojo ~/chromium-aw/src/main/java/org/chromium

# mojo (gen)
$ cd ~/chromium/src/out/$TARGET/gen/mojo/public/java/bindings_java/generated_java/input_srcjars/org/chromium
$ \cp -rf mojo ~/chromium-aw/src/main/java/org/chromium
$ cd ~/chromium/src/out/$TARGET/gen/mojo/public/java/system/system_impl_java/generated_java/input_srcjars/org/chromium
$ \cp -rf mojo ~/chromium-aw/src/main/java/org/chromium

# mojo_base
$ cd ~/chromium/src/mojo/public/java/base/src/org/chromium
$ \cp -rf mojo_base ~/chromium-aw/src/main/java/org/chromium

# mojo_base/mojom (gen)
$ cd ~/chromium/src/out/$TARGET/gen/mojo/public/mojom/base/base_java/generated_java/input_srcjars/org/chromium
$ \cp -rf mojo_base ~/chromium-aw/src/main/java/org/chromium

# net
$ cd ~/chromium/src/net/android/java/src/org/chromium
$ \cp -rf net ~/chromium-aw/src/main/java/org/chromium

# net (gen)
$ cd ~/chromium/src/out/$TARGET/gen/net/android/net_java/generated_java/input_srcjars/org/chromium
$ \cp -rf net ~/chromium-aw/src/main/java/org/chromium

# network (gen)
$ cd ~/chromium/src/out/$TARGET/gen/services/network/public/mojom/mojom_java/generated_java/input_srcjars/org/chromium/network/mojom
$ \cp -f AllowCspFromHeaderValue.java ~/chromium-aw/src/main/java/org/chromium/network/mojom
$ \cp -f ContentSecurityPolicy.java ~/chromium-aw/src/main/java/org/chromium/network/mojom
ContentSecurityPolicyHeader.java
ContentSecurityPolicySource.java
ContentSecurityPolicyType.java
ConnectionInfo.java
$ \cp -f CoopAccessReportType.java ~/chromium-aw/src/main/java/org/chromium/network/mojom
CrossOriginEmbedderPolicy.java
$ \cp -f CrossOriginEmbedderPolicyReporter.java ~/chromium-aw/src/main/java/org/chromium/network/mojom
CrossOriginEmbedderPolicyReporter_Internal
CrossOriginEmbedderPolicyValue.java
CrossOriginOpenerPolicy.java
$ \cp -f CrossOriginOpenerPolicyReporter.java ~/chromium-aw/src/main/java/org/chromium/network/mojom
CrossOriginOpenerPolicyReporter_Internal.java
$ \cp -f CrossOriginOpenerPolicyValue.java ~/chromium-aw/src/main/java/org/chromium/network/mojom
$ \cp -f CspDirectiveName.java ~/chromium-aw/src/main/java/org/chromium/network/mojom
$ \cp -f CspSource.java ~/chromium-aw/src/main/java/org/chromium/network/mojom
$ \cp -f CspSourceList.java ~/chromium-aw/src/main/java/org/chromium/network/mojom
$ \cp -f CspViolation.java ~/chromium-aw/src/main/java/org/chromium/network/mojom
CtPolicyCompliance.java
FetchResponseSource.java
HttpRawHeaderPair.java
HttpRawRequestResponseInfo.java
HttpRequestHeaderKeyValuePair.java
HttpRequestHeaders.java
HttpResponseHeaders.java
$ \cp -f LoadTimingInfo.java ~/chromium-aw/src/main/java/org/chromium/network/mojom
$ \cp -f LoadTimingInfoConnectTiming.java ~/chromium-aw/src/main/java/org/chromium/network/mojom
OriginPolicy.java
$ \cp -f ParsedHeaders.java ~/chromium-aw/src/main/java/org/chromium/network/mojom
$ \cp -f ReferrerPolicy.java ~/chromium-aw/src/main/java/org/chromium/network/mojom
RequestPriority.java
SourceLocation.java
$ \cp -f UrlLoader.java ~/chromium-aw/src/main/java/org/chromium/network/mojom
$ \cp -f UrlLoader_Internal.java ~/chromium-aw/src/main/java/org/chromium/network/mojom
$ \cp -f UrlLoaderClient.java ~/chromium-aw/src/main/java/org/chromium/network/mojom
$ \cp -f UrlLoaderClient_Internal.java ~/chromium-aw/src/main/java/org/chromium/network/mojom
$ \cp -f UrlLoaderCompletionStatus.java ~/chromium-aw/src/main/java/org/chromium/network/mojom
$ \cp -f UrlRequestRedirectInfo.java ~/chromium-aw/src/main/java/org/chromium/network/mojom
$ \cp -f UrlResponseHead.java ~/chromium-aw/src/main/java/org/chromium/network/mojom
$ \cp -f WebClientHintsType.java ~/chromium-aw/src/main/java/org/chromium/network/mojom
$ \cp -f WebSandboxFlags.java ~/chromium-aw/src/main/java/org/chromium/network/mojom
$ cd ~/chromium/src/out/$TARGET/gen/services/network/public/mojom/data_pipe_interfaces_java/generated_java/input_srcjars/org/chromium/network/mojom
$ \cp -f DataPipeGetter.java ~/chromium-aw/src/main/java/org/chromium/network/mojom
DataPipeGetter_Internal.java
$ cd ~/chromium/src/out/$TARGET/gen/services/network/public/mojom/mojom_ip_address_java/generated_java/input_srcjars/org/chromium/network/mojom
IpAddress.java
IpEndPoint.java
$ cd ~/chromium/src/out/$TARGET/gen/services/network/public/mojom/websocket_mojom_java/generated_java/input_srcjars/org/chromium/network/mojom
AuthChallengeInfo.java
SslInfo.java
$ cd ~/chromium/src/out/$TARGET/gen/services/network/public/mojom/mutable_network_traffic_annotation_interface_java/generated_java/input_srcjars/org/chromium/network/mojom
MutablePartialNetworkTrafficAnnotationTag.java

# payments (gen)
$ cd ~/chromium/src/out/$TARGET/gen/components/payments/mojom/mojom_java/generated_java/input_srcjars/org/chromium
$ \cp -rf payments ~/chromium-aw/src/main/java/org/chromium

# policy
$ cd ~/chromium/src/components/policy/androidjava/src/org/chromium
$ \cp -rf policy ~/chromium-aw/src/main/java/org/chromium

# policy (gen)
$ cd ~/chromium/src/out/$TARGET/gen/components/policy/android/policy_java/generated_java/input_srcjars/org/chromium
$ \cp -rf policy ~/chromium-aw/src/main/java/org/chromium

# proxy_resolver (gen)
$ cd ~/chromium/src/out/$TARGET/gen/services/proxy_resolver/public/mojom/mojom_java/generated_java/input_srcjars/org/chromium/proxy_resolver/mojom
$ \cp -f ProxyScheme.java ~/chromium-aw/src/main/java/org/chromium/proxy_resolver/mojom
$ \cp -f ProxyServer.java ~/chromium-aw/src/main/java/org/chromium/proxy_resolver/mojom

# service_manager (gen)
$ cd ~/chromium/src/out/$TARGET/gen/services/service_manager/public/mojom/mojom_java/generated_java/input_srcjars/org/chromium
$ \cp -rf service_manager ~/chromium-aw/src/main/java/org/chromium

# services/device
$ cd ~/chromium/src/services/device/android/java/src/org/chromium/services
$ \cp -rf device ~/chromium-aw/src/main/java/org/chromium/services

# services/media_session
$ cd ~/chromium/src/services/media_session/public/cpp/android/java/src/org/chromium/services
$ \cp -rf media_session ~/chromium-aw/src/main/java/org/chromium/services

# services/service_manager
$ cd ~/chromium/src/services/service_manager/public/java/src/org/chromium/services
$ \cp -rf service_manager ~/chromium-aw/src/main/java/org/chromium/services

# shape_detection
$ cd ~/chromium/src/services/shape_detection/android/java/src/org/chromium
$ \cp -rf shape_detection ~/chromium-aw/src/main/java/org/chromium

# shape_detection/mojom (gen)
$ cd ~/chromium/src/out/$TARGET/gen/services/shape_detection/public/mojom/mojom_java/generated_java/input_srcjars/org/chromium
$ \cp -rf shape_detection ~/chromium-aw/src/main/java/org/chromium

# skia/mojom (gen)
$ cd ~/chromium/src/out/$TARGET/gen/skia/public/mojom/mojom_java/generated_java/input_srcjars/org/chromium
$ \cp -rf skia ~/chromium-aw/src/main/java/org/chromium

# ui
$ cd ~/chromium/src/ui/android/java/src/org/chromium/ui
$ \cp -rf *.java ~/chromium-aw/src/main/java/org/chromium/ui
$ \cp rf base ~/chromium-aw/src/main/java/org/chromium/ui
$ \cp rf display ~/chromium-aw/src/main/java/org/chromium/ui
$ \cp rf events ~/chromium-aw/src/main/java/org/chromium/ui
$ \cp rf gfx ~/chromium-aw/src/main/java/org/chromium/ui
$ \cp rf gl ~/chromium-aw/src/main/java/org/chromium/ui
$ \cp rf interpolators ~/chromium-aw/src/main/java/org/chromium/ui
$ \cp rf modaldialog ~/chromium-aw/src/main/java/org/chromium/ui
$ \cp rf modelutil ~/chromium-aw/src/main/java/org/chromium/ui
$ \cp rf resources ~/chromium-aw/src/main/java/org/chromium/ui
$ \cp rf text ~/chromium-aw/src/main/java/org/chromium/ui
$ \cp rf util ~/chromium-aw/src/main/java/org/chromium/ui
$ \cp rf widget ~/chromium-aw/src/main/java/org/chromium/ui

# ui (gen)
$ cd ~/chromium/src/out/$TARGET/gen/ui/android/ui_full_java/generated_java/input_srcjars/org/chromium
$ \cp -rf ui ~/chromium-aw/src/main/java/org/chromium

# ui/ime (gen)
$ cd ~/chromium/src/out/$TARGET/gen/ui/base/ime/mojom/mojom_java/generated_java/input_srcjars/org/chromium
$ \cp -rf ui ~/chromium-aw/src/main/java/org/chromium

# ui/mojom (gen)
$ cd ~/chromium/src/out/$TARGET/gen/ui/base/cursor/mojom/cursor_type_java/generated_java/input_srcjars/org/chromium
$ \cp -rf ui ~/chromium-aw/src/main/java/org/chromium
$ cd ~/chromium/src/out/$TARGET/gen/ui/latency/mojom/mojom_java/generated_java/input_srcjars/org/chromium
$ \cp -rf ui ~/chromium-aw/src/main/java/org/chromium

# ui/touch_selection (gen)
$ cd ~/chromium/src/out/$TARGET/gen/content/public/android/content_java/generated_java/input_srcjars/org/chromium
$ \cp -rf ui ~/chromium-aw/src/main/java/org/chromium

# url
$ cd ~/chromium/src/url/android/java/src/org/chromium
$ \cp -rf url ~/chromium-aw/src/main/java/org/chromium

# url (gen)
$ cd ~/chromium/src/out/$TARGET/gen/url/gurl_java/generated_java/input_srcjars/org/chromium
$ \cp -rf url ~/chromium-aw/src/main/java/org/chromium

# url/mojom (gen)
$ cd ~/chromium/src/out/$TARGET/gen/url/mojom/url_mojom_gurl_java/generated_java/input_srcjars/org/chromium
$ \cp -rf url ~/chromium-aw/src/main/java/org/chromium
$ cd ~/chromium/src/out/$TARGET/gen/url/mojom/url_mojom_origin_java/generated_java/input_srcjars/org/chromium
$ \cp -rf url ~/chromium-aw/src/main/java/org/chromium

# weblayer_private
$ cd ~/chromium/src/weblayer/browser/java/src/org/chromium/weblayer_private
$ \cp -rf WebViewCompatibilityHelperImpl.java ~/chromium-aw/src/main/java/org/chromium/weblayer_private

# Remove files
$ cd ~/chromium-aw
$ find . -name "R.java" -exec rm "{}" \;
$ find . -name "*Tests.java" -exec rm "{}" \;
$ find . -name "delegate/*Test.java" -exec rm "{}" \;
$ find . -name "mojom/*Test.java" -exec rm "{}" \;
```

</p>
</details>

## Crash dump decoding instructions

### References

- [Decoding Crash Dumps](https://www.chromium.org/developers/decoding-crash-dumps)

### Environment install steps

```sh
$ cd ~
$ mkdir breakpad && cd breakpad
$ fetch breakpad

$ cd src
$ ./configure && make
```

### Decoding steps

1. Generate symbols file.

```sh
$ cp ~/breakpad/src/src/tools/linux/dump_syms ~/chromium/src/out/$TARGET
$ sudo chmod +x ~/chromium/src/out/$TARGET/dump_syms

$ cd ~/chromium/src
$ components/crash/content/tools/generate_breakpad_symbols.py --build-dir=out/$TARGET --symbols-dir=/tmp/chromium --binary=out/$TARGET/lib.unstripped/libstandalonelibwebviewchromium.so --clear --verbose
```

2. Decoding minidump file.

```sh
$ cp ~/breakpad/src/src/processor/minidump_stackwalk ~/chromium
$ sudo chmod +x ~/chromium/minidump_stackwalk

$ cd ~/chromium
$ ./minidump_stackwalk $DMP_FILE_PATH /tmp/chromium > /tmp/decoded_dmp_file.crash
```

# License

See [LICENSE](LICENSE) file from Chromium project.
