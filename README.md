# chromium-aw

[![Build Status](https://github.com/ridi/chromium-aw/workflows/Build/badge.svg?branch=master)](https://github.com/ridi/chromium-aw/actions)

[Chromium](https://www.chromium.org) based Android WebView engine to be embedded in Ridibooks-Android

## Getting started

This library is distributed by [GitHub Releases](https://github.com/ridi/chromium-aw/releases).

You should add [de.undercouch.download plugin](https://plugins.gradle.org/plugin/de.undercouch.download) to `build.gradle` file of your project.

Using the [plugins DSL](https://docs.gradle.org/current/userguide/plugins.html#sec:plugins_block):

```
plugins {
  id("de.undercouch.download") version "4.1.1"
}
```

Using [legacy plugin application](https://docs.gradle.org/current/userguide/plugins.html#sec:old_plugin_application):

```
buildscript {
  repositories {
    maven {
      url = uri("https://plugins.gradle.org/m2/")
    }
  }
  dependencies {
    classpath("de.undercouch:gradle-download-task:4.1.1")
  }
}

apply(plugin = "de.undercouch.download")
```

Then you can include this library by adding dependency script to `build.gradle` file of your project.

```
val version = "89.0.4389.100-1"
val fileName = "chromium-aw-release.aar"
val destPath = "../libs/${fileName}"
val downloadChromiumAwTaskName = "chromium-aw@aar"
tasks.register<de.undercouch.gradle.tasks.download.Download>(downloadChromiumAwTaskName) {
  src("https://github.com/ridi/chromium-aw/releases/download/${version}/${fileName}")
  dest(destPath)
  overwrite(true)
  onlyIfModified(true)
}
tasks.matching { it.name != downloadChromiumAwTaskName }
  .all { dependsOn(downloadChromiumAwTaskName) }
```

**IMPORTANT : Add following `aaptOptions` to prevent asset files being compressed.**

```
android {
  ...
  aaptOptions {
    noCompress("dat", "pak")
  }
  ...
}
```

## Chromium build information

Current version is based on [`89.0.4389.100`](https://chromium.googlesource.com/chromium/src.git/+/refs/tags/89.0.4389.100)

## Customizing

- Unix domain socket name prefix for Devtools is changed. (Patch files are [here](patches).)

## Build instructions

### References

- [Checking out and building Chromium for Android](https://chromium.googlesource.com/chromium/src/+/master/docs/android_build_instructions.md)
- [Build Instructions(Android WebView)](https://www.chromium.org/developers/how-tos/build-instructions-android-webview)
- [GN build configuration](https://www.chromium.org/developers/gn-build-configuration)
- [Runtime Enabled Features](https://chromium.googlesource.com/chromium/src/+/HEAD/third_party/blink/renderer/platform/RuntimeEnabledFeatures.md)

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

2. Clone chromium.

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

$ git checkout tags/$VERSION # ex) tags/89.0.4389.100

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

```sh
$ node ~/chromium-aw/copy.js ~/chromium . # tested on 61 ~ 89.
```

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
