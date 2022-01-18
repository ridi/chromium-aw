package org.chromium.content.browser;

import android.util.Pair;
import java.lang.Float;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.Void;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class TracingControllerAndroidImplJni implements TracingControllerAndroidImpl.Natives {
  private static TracingControllerAndroidImpl.Natives testInstance;

  public static final JniStaticTestMocker<TracingControllerAndroidImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.TracingControllerAndroidImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.TracingControllerAndroidImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(TracingControllerAndroidImpl caller) {
    return (long)GEN_JNI.org_chromium_content_browser_TracingControllerAndroidImpl_init(caller);
  }

  @Override
  public void destroy(long nativeTracingControllerAndroid, TracingControllerAndroidImpl caller) {
    GEN_JNI.org_chromium_content_browser_TracingControllerAndroidImpl_destroy(nativeTracingControllerAndroid, caller);
  }

  @Override
  public boolean startTracing(long nativeTracingControllerAndroid,
      TracingControllerAndroidImpl caller, String categories, String traceOptions,
      boolean useProtobuf) {
    return (boolean)GEN_JNI.org_chromium_content_browser_TracingControllerAndroidImpl_startTracing(nativeTracingControllerAndroid, caller, categories, traceOptions, useProtobuf);
  }

  @Override
  public void stopTracing(long nativeTracingControllerAndroid, TracingControllerAndroidImpl caller,
      String filename, boolean compressFile, boolean useProtobuf, Callback<Void> callback) {
    GEN_JNI.org_chromium_content_browser_TracingControllerAndroidImpl_stopTracing(nativeTracingControllerAndroid, caller, filename, compressFile, useProtobuf, callback);
  }

  @Override
  public boolean getKnownCategoriesAsync(long nativeTracingControllerAndroid,
      TracingControllerAndroidImpl caller, Callback<String[]> callback) {
    return (boolean)GEN_JNI.org_chromium_content_browser_TracingControllerAndroidImpl_getKnownCategoriesAsync(nativeTracingControllerAndroid, caller, callback);
  }

  @Override
  public String getDefaultCategories(TracingControllerAndroidImpl caller) {
    return (String)GEN_JNI.org_chromium_content_browser_TracingControllerAndroidImpl_getDefaultCategories(caller);
  }

  @Override
  public boolean getTraceBufferUsageAsync(long nativeTracingControllerAndroid,
      TracingControllerAndroidImpl caller, Callback<Pair<Float, Long>> callback) {
    return (boolean)GEN_JNI.org_chromium_content_browser_TracingControllerAndroidImpl_getTraceBufferUsageAsync(nativeTracingControllerAndroid, caller, callback);
  }

  public static TracingControllerAndroidImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.TracingControllerAndroidImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TracingControllerAndroidImplJni();
  }
}
