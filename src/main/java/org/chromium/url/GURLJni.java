package org.chromium.url;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
class GURLJni implements GURL.Natives {
  private static GURL.Natives testInstance;

  public static final JniStaticTestMocker<GURL.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.url.GURL.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.url.GURL.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void init(String uri, GURL target) {
    GEN_JNI.org_chromium_url_GURL_init(uri, target);
  }

  @Override
  public void getOrigin(String spec, boolean isValid, long nativeParsed, GURL target) {
    GEN_JNI.org_chromium_url_GURL_getOrigin(spec, isValid, nativeParsed, target);
  }

  @Override
  public boolean domainIs(String spec, boolean isValid, long nativeParsed, String domain) {
    return (boolean)GEN_JNI.org_chromium_url_GURL_domainIs(spec, isValid, nativeParsed, domain);
  }

  @Override
  public long createNative(String spec, boolean isValid, long nativeParsed) {
    return (long)GEN_JNI.org_chromium_url_GURL_createNative(spec, isValid, nativeParsed);
  }

  public static GURL.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.url.GURL.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new GURLJni();
  }
}
