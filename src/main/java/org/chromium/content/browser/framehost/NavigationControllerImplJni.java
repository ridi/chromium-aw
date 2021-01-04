package org.chromium.content.browser.framehost;

import J.N;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.NavigationEntry;
import org.chromium.content_public.browser.NavigationHistory;
import org.chromium.content_public.common.ResourceRequestBody;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class NavigationControllerImplJni implements NavigationControllerImpl.Natives {
  private static NavigationControllerImpl.Natives testInstance;

  public static final JniStaticTestMocker<NavigationControllerImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.framehost.NavigationControllerImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.framehost.NavigationControllerImpl.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean canGoBack(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller) {
    return (boolean)N.MgAw5sIR(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public boolean canGoForward(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller) {
    return (boolean)N.MCUxt83x(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public boolean isInitialNavigation(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller) {
    return (boolean)N.MEOFE6aD(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public void loadIfNecessary(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller) {
    N.MWJb9aa$(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public boolean needsReload(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller) {
    return (boolean)N.MsUTH_HQ(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public void setNeedsReload(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller) {
    N.MQgIP2q9(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public boolean canGoToOffset(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller, int offset) {
    return (boolean)N.M4jjW0jG(nativeNavigationControllerAndroid, caller, offset);
  }

  @Override
  public void goBack(long nativeNavigationControllerAndroid, NavigationControllerImpl caller) {
    N.Mdhd0AR3(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public void goForward(long nativeNavigationControllerAndroid, NavigationControllerImpl caller) {
    N.MEEEhNfT(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public void goToOffset(long nativeNavigationControllerAndroid, NavigationControllerImpl caller,
      int offset) {
    N.ML_uBbdi(nativeNavigationControllerAndroid, caller, offset);
  }

  @Override
  public void goToNavigationIndex(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller, int index) {
    N.MuxwAbEo(nativeNavigationControllerAndroid, caller, index);
  }

  @Override
  public void cancelPendingReload(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller) {
    N.MNF4lMMb(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public void continuePendingReload(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller) {
    N.Mp5SLq_N(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public void reload(long nativeNavigationControllerAndroid, NavigationControllerImpl caller,
      boolean checkForRepost) {
    N.M81h$w2r(nativeNavigationControllerAndroid, caller, checkForRepost);
  }

  @Override
  public void reloadBypassingCache(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller, boolean checkForRepost) {
    N.My0bMgld(nativeNavigationControllerAndroid, caller, checkForRepost);
  }

  @Override
  public void loadUrl(long nativeNavigationControllerAndroid, NavigationControllerImpl caller,
      String url, int loadUrlType, int transitionType, String referrerUrl, int referrerPolicy,
      int uaOverrideOption, String extraHeaders, ResourceRequestBody postData,
      String baseUrlForDataUrl, String virtualUrlForDataUrl, String dataUrlAsString,
      boolean canLoadLocalResources, boolean isRendererInitiated,
      boolean shouldReplaceCurrentEntry) {
    N.MAqmDh4t(nativeNavigationControllerAndroid, caller, url, loadUrlType, transitionType, referrerUrl, referrerPolicy, uaOverrideOption, extraHeaders, postData, baseUrlForDataUrl, virtualUrlForDataUrl, dataUrlAsString, canLoadLocalResources, isRendererInitiated, shouldReplaceCurrentEntry);
  }

  @Override
  public void clearHistory(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller) {
    N.MK2ttcH1(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public int getNavigationHistory(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller, Object history) {
    return (int)N.MUZRDUOx(nativeNavigationControllerAndroid, caller, history);
  }

  @Override
  public void getDirectedNavigationHistory(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller, NavigationHistory history, boolean isForward,
      int itemLimit) {
    N.Mx5VuK3_(nativeNavigationControllerAndroid, caller, history, isForward, itemLimit);
  }

  @Override
  public void clearSslPreferences(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller) {
    N.MpKIKzer(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public boolean getUseDesktopUserAgent(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller) {
    return (boolean)N.MCIN9$qH(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public void setUseDesktopUserAgent(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller, boolean override, boolean reloadOnChange) {
    N.MrilyCK6(nativeNavigationControllerAndroid, caller, override, reloadOnChange);
  }

  @Override
  public NavigationEntry getEntryAtIndex(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller, int index) {
    return (NavigationEntry)N.MLcS2$Fy(nativeNavigationControllerAndroid, caller, index);
  }

  @Override
  public NavigationEntry getVisibleEntry(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller) {
    return (NavigationEntry)N.MHqMy8sY(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public NavigationEntry getPendingEntry(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller) {
    return (NavigationEntry)N.Mgxh2WfC(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public int getLastCommittedEntryIndex(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller) {
    return (int)N.Mil0WqAo(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public boolean removeEntryAtIndex(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller, int index) {
    return (boolean)N.MVbDeBRx(nativeNavigationControllerAndroid, caller, index);
  }

  @Override
  public void pruneForwardEntries(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller) {
    N.M2mQucXv(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public String getEntryExtraData(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller, int index, String key) {
    return (String)N.McQE1GI8(nativeNavigationControllerAndroid, caller, index, key);
  }

  @Override
  public void setEntryExtraData(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller, int index, String key, String value) {
    N.Mw19wBW8(nativeNavigationControllerAndroid, caller, index, key, value);
  }

  @Override
  public boolean isEntryMarkedToBeSkipped(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller, int index) {
    return (boolean)N.MVjP87pN(nativeNavigationControllerAndroid, caller, index);
  }

  public static NavigationControllerImpl.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.framehost.NavigationControllerImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new NavigationControllerImplJni();
  }
}
