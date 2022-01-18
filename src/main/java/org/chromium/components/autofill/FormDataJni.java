package org.chromium.components.autofill;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class FormDataJni implements FormData.Natives {
  private static FormData.Natives testInstance;

  public static final JniStaticTestMocker<FormData.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.autofill.FormData.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.components.autofill.FormData.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public FormFieldData getNextFormFieldData(long nativeFormDataAndroid) {
    return (FormFieldData)GEN_JNI.org_chromium_components_autofill_FormData_getNextFormFieldData(nativeFormDataAndroid);
  }

  public static FormData.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.autofill.FormData.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new FormDataJni();
  }
}
