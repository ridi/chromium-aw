package org.chromium.net;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class ProxyChangeListenerJni implements ProxyChangeListener.Natives {
  private static ProxyChangeListener.Natives testInstance;

  public static final JniStaticTestMocker<ProxyChangeListener.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.net.ProxyChangeListener.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.net.ProxyChangeListener.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void proxySettingsChangedTo(long nativePtr, ProxyChangeListener caller, String host,
      int port, String pacUrl, String[] exclusionList) {
    GEN_JNI.org_chromium_net_ProxyChangeListener_proxySettingsChangedTo(nativePtr, caller, host, port, pacUrl, exclusionList);
  }

  @Override
  public void proxySettingsChanged(long nativePtr, ProxyChangeListener caller) {
    GEN_JNI.org_chromium_net_ProxyChangeListener_proxySettingsChanged(nativePtr, caller);
  }

  public static ProxyChangeListener.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.ProxyChangeListener.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ProxyChangeListenerJni();
  }
}
