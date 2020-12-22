package org.chromium.base;

import J.N;
import java.lang.Override;
import java.lang.String;
import java.lang.Throwable;
import javax.annotation.Generated;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
final class JavaExceptionReporterJni implements JavaExceptionReporter.Natives {
  private static JavaExceptionReporter.Natives testInstance;

  public static final JniStaticTestMocker<JavaExceptionReporter.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.JavaExceptionReporter.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.base.JavaExceptionReporter.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void reportJavaException(boolean crashAfterReport, Throwable e) {
    N.MLlibBXh(crashAfterReport, e);
  }

  @Override
  public void reportJavaStackTrace(String stackTrace) {
    N.MmS4zlEt(stackTrace);
  }

  public static JavaExceptionReporter.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.JavaExceptionReporter.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new JavaExceptionReporterJni();
  }
}
