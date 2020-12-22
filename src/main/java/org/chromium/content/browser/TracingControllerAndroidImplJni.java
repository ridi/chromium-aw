package org.chromium.content.browser;

import J.N;
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

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TracingControllerAndroidImplJni implements TracingControllerAndroidImpl.Natives {
  private static TracingControllerAndroidImpl.Natives testInstance;

  public static final JniStaticTestMocker<TracingControllerAndroidImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.TracingControllerAndroidImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.TracingControllerAndroidImpl.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(TracingControllerAndroidImpl caller) {
    return (long)N.MWlLnA$6(caller);
  }

  @Override
  public void destroy(long nativeTracingControllerAndroid, TracingControllerAndroidImpl caller) {
    N.MLYQdwUF(nativeTracingControllerAndroid, caller);
  }

  @Override
  public boolean startTracing(long nativeTracingControllerAndroid,
      TracingControllerAndroidImpl caller, String categories, String traceOptions) {
    return (boolean)N.MZYMIGWv(nativeTracingControllerAndroid, caller, categories, traceOptions);
  }

  @Override
  public void stopTracing(long nativeTracingControllerAndroid, TracingControllerAndroidImpl caller,
      String filename, boolean compressFile, Callback<Void> callback) {
    N.M$HKWu8q(nativeTracingControllerAndroid, caller, filename, compressFile, callback);
  }

  @Override
  public boolean getKnownCategoriesAsync(long nativeTracingControllerAndroid,
      TracingControllerAndroidImpl caller, Callback<String[]> callback) {
    return (boolean)N.MdRNuqnW(nativeTracingControllerAndroid, caller, callback);
  }

  @Override
  public String getDefaultCategories(TracingControllerAndroidImpl caller) {
    return (String)N.My9pNx9O(caller);
  }

  @Override
  public boolean getTraceBufferUsageAsync(long nativeTracingControllerAndroid,
      TracingControllerAndroidImpl caller, Callback<Pair<Float, Long>> callback) {
    return (boolean)N.MkLMghix(nativeTracingControllerAndroid, caller, callback);
  }

  public static TracingControllerAndroidImpl.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.TracingControllerAndroidImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TracingControllerAndroidImplJni();
  }
}
