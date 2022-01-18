package org.chromium.content.browser;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class BackgroundSyncNetworkObserverJni implements BackgroundSyncNetworkObserver.Natives {
  private static BackgroundSyncNetworkObserver.Natives testInstance;

  public static final JniStaticTestMocker<BackgroundSyncNetworkObserver.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.BackgroundSyncNetworkObserver.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.BackgroundSyncNetworkObserver.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void notifyConnectionTypeChanged(long nativePtr, BackgroundSyncNetworkObserver caller,
      int newConnectionType) {
    GEN_JNI.org_chromium_content_browser_BackgroundSyncNetworkObserver_notifyConnectionTypeChanged(nativePtr, caller, newConnectionType);
  }

  public static BackgroundSyncNetworkObserver.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.BackgroundSyncNetworkObserver.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new BackgroundSyncNetworkObserverJni();
  }
}
