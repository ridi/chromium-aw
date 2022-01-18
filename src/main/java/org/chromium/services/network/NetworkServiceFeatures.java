// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.services.network;

/**
 * Contains features that are specific to Network Service.
 */
public final class NetworkServiceFeatures {


    // This following string constants were inserted by
    //     java_cpp_features.py
    // From
    //     ../../services/network/public/cpp/features.cc
    // Into
    //     ../../services/network/public/java/src/org/chromium/services/network/public/NetworkServiceFeatures.java.tmpl

    // Enables Expect CT reporting, which sends reports for opted-in sites
    // that don't serve sufficient Certificate Transparency information.
    public static final String EXPECT_CT_REPORTING = "ExpectCTReporting";


    public static final String NETWORK_ERROR_LOGGING = "NetworkErrorLogging";


    public static final String REPORTING = "Reporting";

    // Based on the field trial parameters, this feature will override the value of
    // the maximum number of delayable requests allowed in flight. The number of
    // delayable requests allowed in flight will be based on the network's
    // effective connection type ranges and the
    // corresponding number of delayable requests in flight specified in the
    // experiment configuration. Based on field trial parameters, this experiment
    // may also throttle delayable requests based on the number of non-delayable
    // requests in-flight times a weighting factor.
    public static final String THROTTLE_DELAYABLE = "ThrottleDelayable";

    // When kPriorityRequestsDelayableOnSlowConnections is enabled, HTTP
    // requests fetched from a SPDY/QUIC/H2 proxies can be delayed by the
    // ResourceScheduler just as HTTP/1.1 resources are. However, requests from such
    // servers are not subject to kMaxNumDelayableRequestsPerHostPerClient limit.
    public static final String DELAY_REQUESTS_ON_MULTIPLEXED_CONNECTIONS = "DelayRequestsOnMultiplexedConnections";

    // When kPauseBrowserInitiatedHeavyTrafficForP2P is enabled, then a subset of
    // the browser initiated traffic may be paused if there is at least one active
    // P2P connection and the network is estimated to be congested. This feature is
    // intended to throttle only the browser initiated traffic that is expected to
    // be heavy (has large request/response sizes) when real time content might be
    // streaming over an active P2P connection.
    public static final String PAUSE_BROWSER_INITIATED_HEAVY_TRAFFIC_FOR_P2P = "PauseBrowserInitiatedHeavyTrafficForP2P";

    // When kPauseLowPriorityBrowserRequestsOnWeakSignal is enabled, then a subset
    // of the browser initiated requests may be deferred if the device is using
    // cellular connection and the signal quality is low. Android only.
    public static final String PAUSE_LOW_PRIORITY_BROWSER_REQUESTS_ON_WEAK_SIGNAL = "PauseLowPriorityBrowserRequestsOnWeakSignal";

    // When kCORBProtectionSniffing is enabled CORB sniffs additional same-origin
    // resources if they look sensitive.
    public static final String CORB_PROTECTION_SNIFFING = "CORBProtectionSniffing";

    // When kProactivelyThrottleLowPriorityRequests is enabled,
    // resource scheduler proactively throttles low priority requests to avoid
    // network contention with high priority requests that may arrive soon.
    public static final String PROACTIVELY_THROTTLE_LOW_PRIORITY_REQUESTS = "ProactivelyThrottleLowPriorityRequests";

    // Enables Cross-Origin-Embedder-Policy credentialless origin trial. It will be
    // used as a kill switch during the experiment.
    // Intent-to-experiment:
    // https://groups.google.com/a/chromium.org/g/blink-dev/c/Sdc0G1bvKr0/m/YHR8RuWyAAAJ
    public static final String CROSS_ORIGIN_EMBEDDER_POLICY_CREDENTIALLESS_ORIGIN_TRIAL = "CrossOriginEmbedderPolicyCredentiallessOriginTrial";

    // Enables Cross-Origin Opener Policy (COOP).
    // https://gist.github.com/annevk/6f2dd8c79c77123f39797f6bdac43f3e
    // https://html.spec.whatwg.org/#cross-origin-opener-policy
    // Currently this feature is enabled for all platforms except WebView.
    public static final String CROSS_ORIGIN_OPENER_POLICY = "CrossOriginOpenerPolicy";

    // Enables Cross-Origin-Opener-Policy reporting API origin trial. It will be
    // used as a kill switch during the experiment.
    public static final String CROSS_ORIGIN_OPENER_POLICY_REPORTING_ORIGIN_TRIAL = "CrossOriginOpenerPolicyReportingOriginTrial";

    // Enables Cross-Origin Opener Policy (COOP) reporting.
    // https://gist.github.com/annevk/6f2dd8c79c77123f39797f6bdac43f3e
    public static final String CROSS_ORIGIN_OPENER_POLICY_REPORTING = "CrossOriginOpenerPolicyReporting";

    // Enables Cross-Origin Opener Policy (COOP) access reporting.
    // https://github.com/camillelamy/explainers/blob/master/coop_reporting.md#report-blocked-accesses-to-other-windows
    public static final String CROSS_ORIGIN_OPENER_POLICY_ACCESS_REPORTING = "CrossOriginOpenerPolicyAccessReporting";

    // Shift's COOP's default from `unsafe-none` to `same-origin-allow-popups`.
    // https://github.com/mikewest/coop-by-default/
    public static final String CROSS_ORIGIN_OPENER_POLICY_BY_DEFAULT = "CrossOriginOpenerPolicyByDefault";

    // Enables or defaults splittup up server (not proxy) entries in the
    // HttpAuthCache.
    public static final String SPLIT_AUTH_CACHE_BY_NETWORK_ISOLATION_KEY = "SplitAuthCacheByNetworkIsolationKey";

    // Enable usage of hardcoded DoH upgrade mapping for use in automatic mode.
    public static final String DNS_OVER_HTTPS_UPGRADE = "DnsOverHttpsUpgrade";

    // If this feature is enabled, the mDNS responder service responds to queries
    // for TXT records associated with
    // "Generated-Names._mdns_name_generator._udp.local" with a list of generated
    // mDNS names (random UUIDs) in the TXT record data.
    public static final String MDNS_RESPONDER_GENERATED_NAME_LISTING = "MdnsResponderGeneratedNameListing";

    // Disable special treatment on requests with keepalive set (see
    // https://fetch.spec.whatwg.org/#request-keepalive-flag). This is introduced
    // for investigation on the memory usage, and should not be enabled widely.
    public static final String DISABLE_KEEPALIVE_FETCH = "DisableKeepaliveFetch";

    // Enables preprocessing requests with the Trust Tokens API Fetch flags set,
    // and handling their responses, according to the protocol.
    // (See https://github.com/WICG/trust-token-api.)
    public static final String TRUST_TOKENS = "TrustTokens";


    public static final String WEB_SOCKET_REASSEMBLE_SHORT_MESSAGES = "WebSocketReassembleShortMessages";

    // Enable support for ACCEPT_CH H2/3 frame as part of Client Hint Reliability.
    // See:
    // https://tools.ietf.org/html/draft-davidben-http-client-hint-reliability-02#section-4.3
    public static final String ACCEPT_CH_FRAME = "AcceptCHFrame";

    // Enables support for FTP URLs. When disabled FTP URLs will behave the same as
    // any other URL scheme that's unknown to the UA. See https://crbug.com/333943
    public static final String FTP_PROTOCOL = "FtpProtocol";


    public static final String SCT_AUDITING_RETRY_AND_PERSIST_REPORTS = "SCTAuditingRetryAndPersistReports";

    // This feature is used for tuning several loading-related data pipe
    // parameters. See crbug.com/1041006.
    public static final String LOADER_DATA_PIPE_TUNING_FEATURE = "LoaderDataPipeTuning";

    // Do not instantiate this class.
    private NetworkServiceFeatures() {}
}
