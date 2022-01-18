package org.chromium.components.embedder_support.util;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.url.GURL;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public class UrlUtilitiesJni implements UrlUtilities.Natives {
  private static UrlUtilities.Natives testInstance;

  public static final JniStaticTestMocker<UrlUtilities.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.embedder_support.util.UrlUtilities.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.embedder_support.util.UrlUtilities.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean sameDomainOrHost(String primaryUrl, String secondaryUrl,
      boolean includePrivateRegistries) {
    return (boolean)GEN_JNI.org_chromium_components_embedder_1support_util_UrlUtilities_sameDomainOrHost(primaryUrl, secondaryUrl, includePrivateRegistries);
  }

  @Override
  public String getDomainAndRegistry(String url, boolean includePrivateRegistries) {
    return (String)GEN_JNI.org_chromium_components_embedder_1support_util_UrlUtilities_getDomainAndRegistry(url, includePrivateRegistries);
  }

  @Override
  public boolean isGoogleDomainUrl(String url, boolean allowNonStandardPort) {
    return (boolean)GEN_JNI.org_chromium_components_embedder_1support_util_UrlUtilities_isGoogleDomainUrl(url, allowNonStandardPort);
  }

  @Override
  public boolean isGoogleSubDomainUrl(String url) {
    return (boolean)GEN_JNI.org_chromium_components_embedder_1support_util_UrlUtilities_isGoogleSubDomainUrl(url);
  }

  @Override
  public boolean isGoogleSearchUrl(String url) {
    return (boolean)GEN_JNI.org_chromium_components_embedder_1support_util_UrlUtilities_isGoogleSearchUrl(url);
  }

  @Override
  public boolean isGoogleHomePageUrl(String url) {
    return (boolean)GEN_JNI.org_chromium_components_embedder_1support_util_UrlUtilities_isGoogleHomePageUrl(url);
  }

  @Override
  public boolean isUrlWithinScope(String url, String scopeUrl) {
    return (boolean)GEN_JNI.org_chromium_components_embedder_1support_util_UrlUtilities_isUrlWithinScope(url, scopeUrl);
  }

  @Override
  public boolean urlsMatchIgnoringFragments(String url, String url2) {
    return (boolean)GEN_JNI.org_chromium_components_embedder_1support_util_UrlUtilities_urlsMatchIgnoringFragments(url, url2);
  }

  @Override
  public boolean urlsFragmentsDiffer(String url, String url2) {
    return (boolean)GEN_JNI.org_chromium_components_embedder_1support_util_UrlUtilities_urlsFragmentsDiffer(url, url2);
  }

  @Override
  public String escapeQueryParamValue(String url, boolean usePlus) {
    return (String)GEN_JNI.org_chromium_components_embedder_1support_util_UrlUtilities_escapeQueryParamValue(url, usePlus);
  }

  @Override
  public String getValueForKeyInQuery(GURL url, String key) {
    return (String)GEN_JNI.org_chromium_components_embedder_1support_util_UrlUtilities_getValueForKeyInQuery(url, key);
  }

  @Override
  public GURL clearPort(GURL url) {
    return (GURL)GEN_JNI.org_chromium_components_embedder_1support_util_UrlUtilities_clearPort(url);
  }

  public static UrlUtilities.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.embedder_support.util.UrlUtilities.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new UrlUtilitiesJni();
  }
}
