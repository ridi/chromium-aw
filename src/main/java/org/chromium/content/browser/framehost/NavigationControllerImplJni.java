package org.chromium.content.browser.framehost;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.NavigationEntry;
import org.chromium.content_public.browser.NavigationHistory;
import org.chromium.content_public.common.ResourceRequestBody;
import org.chromium.url.Origin;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class NavigationControllerImplJni implements NavigationControllerImpl.Natives {
  private static NavigationControllerImpl.Natives testInstance;

  public static final JniStaticTestMocker<NavigationControllerImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.framehost.NavigationControllerImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.framehost.NavigationControllerImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean canGoBack(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller) {
    return (boolean)GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_canGoBack(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public boolean canGoForward(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller) {
    return (boolean)GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_canGoForward(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public boolean isInitialNavigation(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller) {
    return (boolean)GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_isInitialNavigation(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public void loadIfNecessary(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller) {
    GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_loadIfNecessary(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public boolean needsReload(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller) {
    return (boolean)GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_needsReload(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public void setNeedsReload(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller) {
    GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_setNeedsReload(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public boolean canGoToOffset(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller, int offset) {
    return (boolean)GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_canGoToOffset(nativeNavigationControllerAndroid, caller, offset);
  }

  @Override
  public void goBack(long nativeNavigationControllerAndroid, NavigationControllerImpl caller) {
    GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_goBack(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public void goForward(long nativeNavigationControllerAndroid, NavigationControllerImpl caller) {
    GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_goForward(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public void goToOffset(long nativeNavigationControllerAndroid, NavigationControllerImpl caller,
      int offset) {
    GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_goToOffset(nativeNavigationControllerAndroid, caller, offset);
  }

  @Override
  public void goToNavigationIndex(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller, int index) {
    GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_goToNavigationIndex(nativeNavigationControllerAndroid, caller, index);
  }

  @Override
  public void cancelPendingReload(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller) {
    GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_cancelPendingReload(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public void continuePendingReload(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller) {
    GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_continuePendingReload(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public void reload(long nativeNavigationControllerAndroid, NavigationControllerImpl caller,
      boolean checkForRepost) {
    GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_reload(nativeNavigationControllerAndroid, caller, checkForRepost);
  }

  @Override
  public void reloadBypassingCache(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller, boolean checkForRepost) {
    GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_reloadBypassingCache(nativeNavigationControllerAndroid, caller, checkForRepost);
  }

  @Override
  public void loadUrl(long nativeNavigationControllerAndroid, NavigationControllerImpl caller,
      String url, int loadUrlType, int transitionType, String referrerUrl, int referrerPolicy,
      int uaOverrideOption, String extraHeaders, ResourceRequestBody postData,
      String baseUrlForDataUrl, String virtualUrlForDataUrl, String dataUrlAsString,
      boolean canLoadLocalResources, boolean isRendererInitiated, boolean shouldReplaceCurrentEntry,
      Origin initiatorOrigin, boolean hasUserGesture, boolean shouldClearHistoryList,
      long inputStart, String sourcePackageName, String attributionSourceEventId,
      String attributionDestination, String attributionReportTo, long attributionExpiry) {
    GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_loadUrl(nativeNavigationControllerAndroid, caller, url, loadUrlType, transitionType, referrerUrl, referrerPolicy, uaOverrideOption, extraHeaders, postData, baseUrlForDataUrl, virtualUrlForDataUrl, dataUrlAsString, canLoadLocalResources, isRendererInitiated, shouldReplaceCurrentEntry, initiatorOrigin, hasUserGesture, shouldClearHistoryList, inputStart, sourcePackageName, attributionSourceEventId, attributionDestination, attributionReportTo, attributionExpiry);
  }

  @Override
  public void clearHistory(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller) {
    GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_clearHistory(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public int getNavigationHistory(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller, Object history) {
    return (int)GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_getNavigationHistory(nativeNavigationControllerAndroid, caller, history);
  }

  @Override
  public void getDirectedNavigationHistory(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller, NavigationHistory history, boolean isForward,
      int itemLimit) {
    GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_getDirectedNavigationHistory(nativeNavigationControllerAndroid, caller, history, isForward, itemLimit);
  }

  @Override
  public void clearSslPreferences(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller) {
    GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_clearSslPreferences(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public boolean getUseDesktopUserAgent(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller) {
    return (boolean)GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_getUseDesktopUserAgent(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public void setUseDesktopUserAgent(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller, boolean override, boolean reloadOnChange) {
    GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_setUseDesktopUserAgent(nativeNavigationControllerAndroid, caller, override, reloadOnChange);
  }

  @Override
  public NavigationEntry getEntryAtIndex(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller, int index) {
    return (NavigationEntry)GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_getEntryAtIndex(nativeNavigationControllerAndroid, caller, index);
  }

  @Override
  public NavigationEntry getVisibleEntry(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller) {
    return (NavigationEntry)GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_getVisibleEntry(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public NavigationEntry getPendingEntry(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller) {
    return (NavigationEntry)GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_getPendingEntry(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public int getLastCommittedEntryIndex(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller) {
    return (int)GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_getLastCommittedEntryIndex(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public boolean removeEntryAtIndex(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller, int index) {
    return (boolean)GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_removeEntryAtIndex(nativeNavigationControllerAndroid, caller, index);
  }

  @Override
  public void pruneForwardEntries(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller) {
    GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_pruneForwardEntries(nativeNavigationControllerAndroid, caller);
  }

  @Override
  public String getEntryExtraData(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller, int index, String key) {
    return (String)GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_getEntryExtraData(nativeNavigationControllerAndroid, caller, index, key);
  }

  @Override
  public void setEntryExtraData(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller, int index, String key, String value) {
    GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_setEntryExtraData(nativeNavigationControllerAndroid, caller, index, key, value);
  }

  @Override
  public boolean isEntryMarkedToBeSkipped(long nativeNavigationControllerAndroid,
      NavigationControllerImpl caller, int index) {
    return (boolean)GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_isEntryMarkedToBeSkipped(nativeNavigationControllerAndroid, caller, index);
  }

  public static NavigationControllerImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.framehost.NavigationControllerImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new NavigationControllerImplJni();
  }
}
