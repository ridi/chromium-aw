package org.chromium.base.library_loader;

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
class LibraryPrefetcherJni implements LibraryPrefetcher.Natives {
  private static LibraryPrefetcher.Natives testInstance;

  public static final JniStaticTestMocker<LibraryPrefetcher.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.library_loader.LibraryPrefetcher.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.base.library_loader.LibraryPrefetcher.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void forkAndPrefetchNativeLibrary() {
    GEN_JNI.org_chromium_base_library_1loader_LibraryPrefetcher_forkAndPrefetchNativeLibrary();
  }

  @Override
  public int percentageOfResidentNativeLibraryCode() {
    return (int)GEN_JNI.org_chromium_base_library_1loader_LibraryPrefetcher_percentageOfResidentNativeLibraryCode();
  }

  @Override
  public void periodicallyCollectResidency() {
    GEN_JNI.org_chromium_base_library_1loader_LibraryPrefetcher_periodicallyCollectResidency();
  }

  public static LibraryPrefetcher.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.library_loader.LibraryPrefetcher.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new LibraryPrefetcherJni();
  }
}
