package org.chromium.components.url_formatter;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.url.GURL;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
public class UrlFormatterJni implements UrlFormatter.Natives {
  private static UrlFormatter.Natives testInstance;

  public static final JniStaticTestMocker<UrlFormatter.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.url_formatter.UrlFormatter.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.url_formatter.UrlFormatter.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public GURL fixupUrl(String url) {
    return (GURL)GEN_JNI.org_chromium_components_url_1formatter_UrlFormatter_fixupUrl(url);
  }

  @Override
  public String formatUrlForDisplayOmitScheme(String url) {
    return (String)GEN_JNI.org_chromium_components_url_1formatter_UrlFormatter_formatUrlForDisplayOmitScheme(url);
  }

  @Override
  public String formatUrlForDisplayOmitHTTPScheme(String url) {
    return (String)GEN_JNI.org_chromium_components_url_1formatter_UrlFormatter_formatUrlForDisplayOmitHTTPScheme(url);
  }

  @Override
  public String formatUrlForDisplayOmitSchemeOmitTrivialSubdomains(String url) {
    return (String)GEN_JNI.org_chromium_components_url_1formatter_UrlFormatter_formatUrlForDisplayOmitSchemeOmitTrivialSubdomains(url);
  }

  @Override
  public String formatUrlForDisplayOmitSchemePathAndTrivialSubdomains(GURL url) {
    return (String)GEN_JNI.org_chromium_components_url_1formatter_UrlFormatter_formatUrlForDisplayOmitSchemePathAndTrivialSubdomains(url);
  }

  @Override
  public String formatUrlForDisplayOmitUsernamePassword(String url) {
    return (String)GEN_JNI.org_chromium_components_url_1formatter_UrlFormatter_formatUrlForDisplayOmitUsernamePassword(url);
  }

  @Override
  public String formatUrlForCopy(String url) {
    return (String)GEN_JNI.org_chromium_components_url_1formatter_UrlFormatter_formatUrlForCopy(url);
  }

  @Override
  public String formatUrlForSecurityDisplay(GURL url, int schemeDisplay) {
    return (String)GEN_JNI.org_chromium_components_url_1formatter_UrlFormatter_formatUrlForSecurityDisplay(url, schemeDisplay);
  }

  @Override
  public String formatStringUrlForSecurityDisplay(String url, int schemeDisplay) {
    return (String)GEN_JNI.org_chromium_components_url_1formatter_UrlFormatter_formatStringUrlForSecurityDisplay(url, schemeDisplay);
  }

  public static UrlFormatter.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.url_formatter.UrlFormatter.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new UrlFormatterJni();
  }
}
