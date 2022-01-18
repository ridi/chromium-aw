package org.chromium.base;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class ImportantFileWriterAndroidJni implements ImportantFileWriterAndroid.Natives {
  private static ImportantFileWriterAndroid.Natives testInstance;

  public static final JniStaticTestMocker<ImportantFileWriterAndroid.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.ImportantFileWriterAndroid.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.base.ImportantFileWriterAndroid.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean writeFileAtomically(String fileName, byte[] data) {
    return (boolean)GEN_JNI.org_chromium_base_ImportantFileWriterAndroid_writeFileAtomically(fileName, data);
  }

  public static ImportantFileWriterAndroid.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.ImportantFileWriterAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ImportantFileWriterAndroidJni();
  }
}
