package org.chromium.base;

import java.lang.Override;
import java.lang.String;
import java.lang.Throwable;
import javax.annotation.Generated;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
class JavaExceptionReporterJni implements JavaExceptionReporter.Natives {
  private static JavaExceptionReporter.Natives testInstance;

  public static final JniStaticTestMocker<JavaExceptionReporter.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.JavaExceptionReporter.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.base.JavaExceptionReporter.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void reportJavaException(boolean crashAfterReport, Throwable e) {
    GEN_JNI.org_chromium_base_JavaExceptionReporter_reportJavaException(crashAfterReport, e);
  }

  @Override
  public void reportJavaStackTrace(String stackTrace) {
    GEN_JNI.org_chromium_base_JavaExceptionReporter_reportJavaStackTrace(stackTrace);
  }

  public static JavaExceptionReporter.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.JavaExceptionReporter.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new JavaExceptionReporterJni();
  }
}
