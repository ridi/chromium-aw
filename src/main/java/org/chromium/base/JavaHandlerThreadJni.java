package org.chromium.base;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
final class JavaHandlerThreadJni implements JavaHandlerThread.Natives {
  private static JavaHandlerThread.Natives testInstance;

  public static final JniStaticTestMocker<JavaHandlerThread.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.JavaHandlerThread.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.base.JavaHandlerThread.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void initializeThread(long nativeJavaHandlerThread, long nativeEvent) {
    N.MJcct7gJ(nativeJavaHandlerThread, nativeEvent);
  }

  @Override
  public void onLooperStopped(long nativeJavaHandlerThread) {
    N.MYwg$x8E(nativeJavaHandlerThread);
  }

  public static JavaHandlerThread.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.JavaHandlerThread.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new JavaHandlerThreadJni();
  }
}
