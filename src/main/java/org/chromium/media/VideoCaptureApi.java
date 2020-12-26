
// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../media/capture/video/video_capture_device_descriptor.h

package org.chromium.media;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    VideoCaptureApi.LINUX_V4L2_SINGLE_PLANE, VideoCaptureApi.WIN_MEDIA_FOUNDATION,
    VideoCaptureApi.WIN_MEDIA_FOUNDATION_SENSOR, VideoCaptureApi.WIN_DIRECT_SHOW,
    VideoCaptureApi.MACOSX_AVFOUNDATION, VideoCaptureApi.MACOSX_DECKLINK,
    VideoCaptureApi.ANDROID_API1, VideoCaptureApi.ANDROID_API2_LEGACY,
    VideoCaptureApi.ANDROID_API2_FULL, VideoCaptureApi.ANDROID_API2_LIMITED,
    VideoCaptureApi.VIRTUAL_DEVICE, VideoCaptureApi.UNKNOWN
})
@Retention(RetentionPolicy.SOURCE)
public @interface VideoCaptureApi {
  int LINUX_V4L2_SINGLE_PLANE = 0;
  int WIN_MEDIA_FOUNDATION = 1;
  int WIN_MEDIA_FOUNDATION_SENSOR = 2;
  int WIN_DIRECT_SHOW = 3;
  int MACOSX_AVFOUNDATION = 4;
  int MACOSX_DECKLINK = 5;
  int ANDROID_API1 = 6;
  int ANDROID_API2_LEGACY = 7;
  int ANDROID_API2_FULL = 8;
  int ANDROID_API2_LIMITED = 9;
  int VIRTUAL_DEVICE = 10;
  int UNKNOWN = 11;
}
