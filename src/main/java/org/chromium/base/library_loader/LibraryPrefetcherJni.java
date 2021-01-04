package org.chromium.base.library_loader;

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
final class LibraryPrefetcherJni implements LibraryPrefetcher.Natives {
  private static LibraryPrefetcher.Natives testInstance;

  public static final JniStaticTestMocker<LibraryPrefetcher.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.library_loader.LibraryPrefetcher.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.base.library_loader.LibraryPrefetcher.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void forkAndPrefetchNativeLibrary() {
    N.MUjpxN8d();
  }

  @Override
  public int percentageOfResidentNativeLibraryCode() {
    return (int)N.MdFgVRJJ();
  }

  @Override
  public void periodicallyCollectResidency() {
    N.MLXZo1U6();
  }

  public static LibraryPrefetcher.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.library_loader.LibraryPrefetcher.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new LibraryPrefetcherJni();
  }
}
