package org.chromium.net;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
final class X509UtilJni implements X509Util.Natives {
  private static X509Util.Natives testInstance;

  public static final JniStaticTestMocker<X509Util.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.net.X509Util.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.net.X509Util.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void notifyKeyChainChanged() {
    N.MGVAvp19();
  }

  public static X509Util.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.X509Util.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new X509UtilJni();
  }
}
