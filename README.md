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

Current version is based on [`62.0.3202.101`](https://chromium.googlesource.com/chromium/src.git/+/0971c880c3f82e5fdbc6d65d1fc4d8ae9aa47ddc)

### Customizing

#### Native libraries

Patch files are [here](patches).

- Unix domain socket name prefix for Devtools is changed.
- V8 snapshot is disabled.
  - File names of snapshot binary might be same across architectures.

#### Java

- Browser process' private data directory suffix is changed [here](src/main/java/org/chromium/android_webview/AwBrowserProcess.java#L49).

### Build instructions

#### References

- [Checking out and building Chromium for Android](https://chromium.googlesource.com/chromium/src/+/master/docs/android_build_instructions.md)
- [Build Instructions(Android WebView)](https://www.chromium.org/developers/how-tos/build-instructions-android-webview)
- [GN build configuration](https://www.chromium.org/developers/gn-build-configuration)

#### Build steps

```sh
$ git checkout ...

$ gclient sync

$ gn gen --args='target_os="android" target_cpu="$TARGET" is_debug=false' out/$TARGET

$ ninja -C out/$TARGET webview_instrumentation_apk
```

In this project `$TARGET` must be one of `arm`, `arm64`, `x86`.

After building, there will be `out/$TARGET/libstandalonelibchromiumwebview.so`, `out/$TARGET/libdrawgl.so`.

## License

See [LICENSE](LICENSE) file from Chromium project.
