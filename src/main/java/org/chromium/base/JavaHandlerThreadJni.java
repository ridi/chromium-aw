package org.chromium.base;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
class JavaHandlerThreadJni implements JavaHandlerThread.Natives {
  private static JavaHandlerThread.Natives testInstance;

  public static final JniStaticTestMocker<JavaHandlerThread.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.JavaHandlerThread.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.base.JavaHandlerThread.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void initializeThread(long nativeJavaHandlerThread, long nativeEvent) {
    GEN_JNI.org_chromium_base_JavaHandlerThread_initializeThread(nativeJavaHandlerThread, nativeEvent);
  }

  @Override
  public void onLooperStopped(long nativeJavaHandlerThread) {
    GEN_JNI.org_chromium_base_JavaHandlerThread_onLooperStopped(nativeJavaHandlerThread);
  }

  public static JavaHandlerThread.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.JavaHandlerThread.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new JavaHandlerThreadJni();
  }
}
