package org.chromium.url;

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
class ParsedJni implements Parsed.Natives {
  private static Parsed.Natives testInstance;

  public static final JniStaticTestMocker<Parsed.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.url.Parsed.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.url.Parsed.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long createNative(int schemeBegin, int schemeLength, int usernameBegin, int usernameLength,
      int passwordBegin, int passwordLength, int hostBegin, int hostLength, int portBegin,
      int portLength, int pathBegin, int pathLength, int queryBegin, int queryLength, int refBegin,
      int refLength, boolean potentiallyDanglingMarkup, long innerUrl) {
    return (long)GEN_JNI.org_chromium_url_Parsed_createNative(schemeBegin, schemeLength, usernameBegin, usernameLength, passwordBegin, passwordLength, hostBegin, hostLength, portBegin, portLength, pathBegin, pathLength, queryBegin, queryLength, refBegin, refLength, potentiallyDanglingMarkup, innerUrl);
  }

  public static Parsed.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.url.Parsed.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new ParsedJni();
  }
}
