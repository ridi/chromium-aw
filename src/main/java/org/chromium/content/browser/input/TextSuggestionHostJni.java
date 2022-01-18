package org.chromium.content.browser.input;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class TextSuggestionHostJni implements TextSuggestionHost.Natives {
  private static TextSuggestionHost.Natives testInstance;

  public static final JniStaticTestMocker<TextSuggestionHost.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.input.TextSuggestionHost.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.input.TextSuggestionHost.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void applySpellCheckSuggestion(long nativeTextSuggestionHostAndroid,
      TextSuggestionHost caller, String suggestion) {
    GEN_JNI.org_chromium_content_browser_input_TextSuggestionHost_applySpellCheckSuggestion(nativeTextSuggestionHostAndroid, caller, suggestion);
  }

  @Override
  public void applyTextSuggestion(long nativeTextSuggestionHostAndroid, TextSuggestionHost caller,
      int markerTag, int suggestionIndex) {
    GEN_JNI.org_chromium_content_browser_input_TextSuggestionHost_applyTextSuggestion(nativeTextSuggestionHostAndroid, caller, markerTag, suggestionIndex);
  }

  @Override
  public void deleteActiveSuggestionRange(long nativeTextSuggestionHostAndroid,
      TextSuggestionHost caller) {
    GEN_JNI.org_chromium_content_browser_input_TextSuggestionHost_deleteActiveSuggestionRange(nativeTextSuggestionHostAndroid, caller);
  }

  @Override
  public void onNewWordAddedToDictionary(long nativeTextSuggestionHostAndroid,
      TextSuggestionHost caller, String word) {
    GEN_JNI.org_chromium_content_browser_input_TextSuggestionHost_onNewWordAddedToDictionary(nativeTextSuggestionHostAndroid, caller, word);
  }

  @Override
  public void onSuggestionMenuClosed(long nativeTextSuggestionHostAndroid,
      TextSuggestionHost caller) {
    GEN_JNI.org_chromium_content_browser_input_TextSuggestionHost_onSuggestionMenuClosed(nativeTextSuggestionHostAndroid, caller);
  }

  public static TextSuggestionHost.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.input.TextSuggestionHost.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TextSuggestionHostJni();
  }
}
