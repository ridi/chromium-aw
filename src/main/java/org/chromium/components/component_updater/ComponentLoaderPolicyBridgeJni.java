package org.chromium.components.component_updater;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class ComponentLoaderPolicyBridgeJni implements ComponentLoaderPolicyBridge.Natives {
  private static ComponentLoaderPolicyBridge.Natives testInstance;

  public static final JniStaticTestMocker<ComponentLoaderPolicyBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.component_updater.ComponentLoaderPolicyBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.component_updater.ComponentLoaderPolicyBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void componentLoaded(long nativeAndroidComponentLoaderPolicy, String[] fileNames,
      int[] fds) {
    GEN_JNI.org_chromium_components_component_1updater_ComponentLoaderPolicyBridge_componentLoaded(nativeAndroidComponentLoaderPolicy, fileNames, fds);
  }

  @Override
  public void componentLoadFailed(long nativeAndroidComponentLoaderPolicy, int errorCode) {
    GEN_JNI.org_chromium_components_component_1updater_ComponentLoaderPolicyBridge_componentLoadFailed(nativeAndroidComponentLoaderPolicy, errorCode);
  }

  @Override
  public String getComponentId(long nativeAndroidComponentLoaderPolicy) {
    return (String)GEN_JNI.org_chromium_components_component_1updater_ComponentLoaderPolicyBridge_getComponentId(nativeAndroidComponentLoaderPolicy);
  }

  public static ComponentLoaderPolicyBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.component_updater.ComponentLoaderPolicyBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ComponentLoaderPolicyBridgeJni();
  }
}
