package org.chromium.net;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
class X509UtilJni implements X509Util.Natives {
  private static X509Util.Natives testInstance;

  public static final JniStaticTestMocker<X509Util.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.net.X509Util.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.net.X509Util.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void notifyKeyChainChanged() {
    GEN_JNI.org_chromium_net_X509Util_notifyKeyChainChanged();
  }

  public static X509Util.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.X509Util.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new X509UtilJni();
  }
}
