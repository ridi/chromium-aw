package org.chromium.net;
import androidx.annotation.IntDef;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@IntDef({
NetError.ERR_IO_PENDING,
NetError.ERR_FAILED,
NetError.ERR_ABORTED,
NetError.ERR_INVALID_ARGUMENT,
NetError.ERR_INVALID_HANDLE,
NetError.ERR_FILE_NOT_FOUND,
NetError.ERR_TIMED_OUT,
NetError.ERR_FILE_TOO_BIG,
NetError.ERR_UNEXPECTED,
NetError.ERR_ACCESS_DENIED,
NetError.ERR_NOT_IMPLEMENTED,
NetError.ERR_INSUFFICIENT_RESOURCES,
NetError.ERR_OUT_OF_MEMORY,
NetError.ERR_UPLOAD_FILE_CHANGED,
NetError.ERR_SOCKET_NOT_CONNECTED,
NetError.ERR_FILE_EXISTS,
NetError.ERR_FILE_PATH_TOO_LONG,
NetError.ERR_FILE_NO_SPACE,
NetError.ERR_FILE_VIRUS_INFECTED,
NetError.ERR_BLOCKED_BY_CLIENT,
NetError.ERR_NETWORK_CHANGED,
NetError.ERR_BLOCKED_BY_ADMINISTRATOR,
NetError.ERR_SOCKET_IS_CONNECTED,
NetError.ERR_BLOCKED_ENROLLMENT_CHECK_PENDING,
NetError.ERR_UPLOAD_STREAM_REWIND_NOT_SUPPORTED,
NetError.ERR_CONTEXT_SHUT_DOWN,
NetError.ERR_BLOCKED_BY_RESPONSE,
NetError.ERR_CLEARTEXT_NOT_PERMITTED,
NetError.ERR_BLOCKED_BY_CSP,
NetError.ERR_H2_OR_QUIC_REQUIRED,
NetError.ERR_INSECURE_PRIVATE_NETWORK_REQUEST,
NetError.ERR_CONNECTION_CLOSED,
NetError.ERR_CONNECTION_RESET,
NetError.ERR_CONNECTION_REFUSED,
NetError.ERR_CONNECTION_ABORTED,
NetError.ERR_CONNECTION_FAILED,
NetError.ERR_NAME_NOT_RESOLVED,
NetError.ERR_INTERNET_DISCONNECTED,
NetError.ERR_SSL_PROTOCOL_ERROR,
NetError.ERR_ADDRESS_INVALID,
NetError.ERR_ADDRESS_UNREACHABLE,
NetError.ERR_SSL_CLIENT_AUTH_CERT_NEEDED,
NetError.ERR_TUNNEL_CONNECTION_FAILED,
NetError.ERR_NO_SSL_VERSIONS_ENABLED,
NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH,
NetError.ERR_SSL_RENEGOTIATION_REQUESTED,
NetError.ERR_PROXY_AUTH_UNSUPPORTED,
NetError.ERR_CERT_ERROR_IN_SSL_RENEGOTIATION,
NetError.ERR_BAD_SSL_CLIENT_AUTH_CERT,
NetError.ERR_CONNECTION_TIMED_OUT,
NetError.ERR_HOST_RESOLVER_QUEUE_TOO_LARGE,
NetError.ERR_SOCKS_CONNECTION_FAILED,
NetError.ERR_SOCKS_CONNECTION_HOST_UNREACHABLE,
NetError.ERR_ALPN_NEGOTIATION_FAILED,
NetError.ERR_SSL_NO_RENEGOTIATION,
NetError.ERR_WINSOCK_UNEXPECTED_WRITTEN_BYTES,
NetError.ERR_SSL_DECOMPRESSION_FAILURE_ALERT,
NetError.ERR_SSL_BAD_RECORD_MAC_ALERT,
NetError.ERR_PROXY_AUTH_REQUESTED,
NetError.ERR_PROXY_CONNECTION_FAILED,
NetError.ERR_MANDATORY_PROXY_CONFIGURATION_FAILED,
NetError.ERR_PRECONNECT_MAX_SOCKET_LIMIT,
NetError.ERR_SSL_CLIENT_AUTH_PRIVATE_KEY_ACCESS_DENIED,
NetError.ERR_SSL_CLIENT_AUTH_CERT_NO_PRIVATE_KEY,
NetError.ERR_PROXY_CERTIFICATE_INVALID,
NetError.ERR_NAME_RESOLUTION_FAILED,
NetError.ERR_NETWORK_ACCESS_DENIED,
NetError.ERR_TEMPORARILY_THROTTLED,
NetError.ERR_HTTPS_PROXY_TUNNEL_RESPONSE_REDIRECT,
NetError.ERR_SSL_CLIENT_AUTH_SIGNATURE_FAILED,
NetError.ERR_MSG_TOO_BIG,
NetError.ERR_WS_PROTOCOL_ERROR,
NetError.ERR_ADDRESS_IN_USE,
NetError.ERR_SSL_HANDSHAKE_NOT_COMPLETED,
NetError.ERR_SSL_BAD_PEER_PUBLIC_KEY,
NetError.ERR_SSL_PINNED_KEY_NOT_IN_CERT_CHAIN,
NetError.ERR_CLIENT_AUTH_CERT_TYPE_UNSUPPORTED,
NetError.ERR_SSL_DECRYPT_ERROR_ALERT,
NetError.ERR_WS_THROTTLE_QUEUE_TOO_LARGE,
NetError.ERR_SSL_SERVER_CERT_CHANGED,
NetError.ERR_SSL_UNRECOGNIZED_NAME_ALERT,
NetError.ERR_SOCKET_SET_RECEIVE_BUFFER_SIZE_ERROR,
NetError.ERR_SOCKET_SET_SEND_BUFFER_SIZE_ERROR,
NetError.ERR_SOCKET_RECEIVE_BUFFER_SIZE_UNCHANGEABLE,
NetError.ERR_SOCKET_SEND_BUFFER_SIZE_UNCHANGEABLE,
NetError.ERR_SSL_CLIENT_AUTH_CERT_BAD_FORMAT,
NetError.ERR_ICANN_NAME_COLLISION,
NetError.ERR_SSL_SERVER_CERT_BAD_FORMAT,
NetError.ERR_CT_STH_PARSING_FAILED,
NetError.ERR_CT_STH_INCOMPLETE,
NetError.ERR_UNABLE_TO_REUSE_CONNECTION_FOR_PROXY_AUTH,
NetError.ERR_CT_CONSISTENCY_PROOF_PARSING_FAILED,
NetError.ERR_SSL_OBSOLETE_CIPHER,
NetError.ERR_WS_UPGRADE,
NetError.ERR_READ_IF_READY_NOT_IMPLEMENTED,
NetError.ERR_NO_BUFFER_SPACE,
NetError.ERR_SSL_CLIENT_AUTH_NO_COMMON_ALGORITHMS,
NetError.ERR_EARLY_DATA_REJECTED,
NetError.ERR_WRONG_VERSION_ON_EARLY_DATA,
NetError.ERR_TLS13_DOWNGRADE_DETECTED,
NetError.ERR_SSL_KEY_USAGE_INCOMPATIBLE,
NetError.ERR_CERT_COMMON_NAME_INVALID,
NetError.ERR_CERT_DATE_INVALID,
NetError.ERR_CERT_AUTHORITY_INVALID,
NetError.ERR_CERT_CONTAINS_ERRORS,
NetError.ERR_CERT_NO_REVOCATION_MECHANISM,
NetError.ERR_CERT_UNABLE_TO_CHECK_REVOCATION,
NetError.ERR_CERT_REVOKED,
NetError.ERR_CERT_INVALID,
NetError.ERR_CERT_WEAK_SIGNATURE_ALGORITHM,
NetError.ERR_CERT_NON_UNIQUE_NAME,
NetError.ERR_CERT_WEAK_KEY,
NetError.ERR_CERT_NAME_CONSTRAINT_VIOLATION,
NetError.ERR_CERT_VALIDITY_TOO_LONG,
NetError.ERR_CERTIFICATE_TRANSPARENCY_REQUIRED,
NetError.ERR_CERT_SYMANTEC_LEGACY,
NetError.ERR_CERT_KNOWN_INTERCEPTION_BLOCKED,
NetError.ERR_SSL_OBSOLETE_VERSION,
NetError.ERR_CERT_END,
NetError.ERR_INVALID_URL,
NetError.ERR_DISALLOWED_URL_SCHEME,
NetError.ERR_UNKNOWN_URL_SCHEME,
NetError.ERR_INVALID_REDIRECT,
NetError.ERR_TOO_MANY_REDIRECTS,
NetError.ERR_UNSAFE_REDIRECT,
NetError.ERR_UNSAFE_PORT,
NetError.ERR_INVALID_RESPONSE,
NetError.ERR_INVALID_CHUNKED_ENCODING,
NetError.ERR_METHOD_NOT_SUPPORTED,
NetError.ERR_UNEXPECTED_PROXY_AUTH,
NetError.ERR_EMPTY_RESPONSE,
NetError.ERR_RESPONSE_HEADERS_TOO_BIG,
NetError.ERR_PAC_SCRIPT_FAILED,
NetError.ERR_REQUEST_RANGE_NOT_SATISFIABLE,
NetError.ERR_MALFORMED_IDENTITY,
NetError.ERR_CONTENT_DECODING_FAILED,
NetError.ERR_NETWORK_IO_SUSPENDED,
NetError.ERR_SYN_REPLY_NOT_RECEIVED,
NetError.ERR_ENCODING_CONVERSION_FAILED,
NetError.ERR_UNRECOGNIZED_FTP_DIRECTORY_LISTING_FORMAT,
NetError.ERR_NO_SUPPORTED_PROXIES,
NetError.ERR_HTTP2_PROTOCOL_ERROR,
NetError.ERR_INVALID_AUTH_CREDENTIALS,
NetError.ERR_UNSUPPORTED_AUTH_SCHEME,
NetError.ERR_ENCODING_DETECTION_FAILED,
NetError.ERR_MISSING_AUTH_CREDENTIALS,
NetError.ERR_UNEXPECTED_SECURITY_LIBRARY_STATUS,
NetError.ERR_MISCONFIGURED_AUTH_ENVIRONMENT,
NetError.ERR_UNDOCUMENTED_SECURITY_LIBRARY_STATUS,
NetError.ERR_RESPONSE_BODY_TOO_BIG_TO_DRAIN,
NetError.ERR_RESPONSE_HEADERS_MULTIPLE_CONTENT_LENGTH,
NetError.ERR_INCOMPLETE_HTTP2_HEADERS,
NetError.ERR_PAC_NOT_IN_DHCP,
NetError.ERR_RESPONSE_HEADERS_MULTIPLE_CONTENT_DISPOSITION,
NetError.ERR_RESPONSE_HEADERS_MULTIPLE_LOCATION,
NetError.ERR_HTTP2_SERVER_REFUSED_STREAM,
NetError.ERR_HTTP2_PING_FAILED,
NetError.ERR_CONTENT_LENGTH_MISMATCH,
NetError.ERR_INCOMPLETE_CHUNKED_ENCODING,
NetError.ERR_QUIC_PROTOCOL_ERROR,
NetError.ERR_RESPONSE_HEADERS_TRUNCATED,
NetError.ERR_QUIC_HANDSHAKE_FAILED,
NetError.ERR_HTTP2_INADEQUATE_TRANSPORT_SECURITY,
NetError.ERR_HTTP2_FLOW_CONTROL_ERROR,
NetError.ERR_HTTP2_FRAME_SIZE_ERROR,
NetError.ERR_HTTP2_COMPRESSION_ERROR,
NetError.ERR_PROXY_AUTH_REQUESTED_WITH_NO_CONNECTION,
NetError.ERR_HTTP_1_1_REQUIRED,
NetError.ERR_PROXY_HTTP_1_1_REQUIRED,
NetError.ERR_PAC_SCRIPT_TERMINATED,
NetError.ERR_INVALID_HTTP_RESPONSE,
NetError.ERR_CONTENT_DECODING_INIT_FAILED,
NetError.ERR_HTTP2_RST_STREAM_NO_ERROR_RECEIVED,
NetError.ERR_HTTP2_PUSHED_STREAM_NOT_AVAILABLE,
NetError.ERR_HTTP2_CLAIMED_PUSHED_STREAM_RESET_BY_SERVER,
NetError.ERR_TOO_MANY_RETRIES,
NetError.ERR_HTTP2_STREAM_CLOSED,
NetError.ERR_HTTP2_CLIENT_REFUSED_STREAM,
NetError.ERR_HTTP2_PUSHED_RESPONSE_DOES_NOT_MATCH,
NetError.ERR_HTTP_RESPONSE_CODE_FAILURE,
NetError.ERR_QUIC_CERT_ROOT_NOT_KNOWN,
NetError.ERR_CACHE_MISS,
NetError.ERR_CACHE_READ_FAILURE,
NetError.ERR_CACHE_WRITE_FAILURE,
NetError.ERR_CACHE_OPERATION_NOT_SUPPORTED,
NetError.ERR_CACHE_OPEN_FAILURE,
NetError.ERR_CACHE_CREATE_FAILURE,
NetError.ERR_CACHE_RACE,
NetError.ERR_CACHE_CHECKSUM_READ_FAILURE,
NetError.ERR_CACHE_CHECKSUM_MISMATCH,
NetError.ERR_CACHE_LOCK_TIMEOUT,
NetError.ERR_CACHE_AUTH_FAILURE_AFTER_READ,
NetError.ERR_CACHE_ENTRY_NOT_SUITABLE,
NetError.ERR_CACHE_DOOM_FAILURE,
NetError.ERR_CACHE_OPEN_OR_CREATE_FAILURE,
NetError.ERR_INSECURE_RESPONSE,
NetError.ERR_NO_PRIVATE_KEY_FOR_CERT,
NetError.ERR_ADD_USER_CERT_FAILED,
NetError.ERR_INVALID_SIGNED_EXCHANGE,
NetError.ERR_INVALID_WEB_BUNDLE,
NetError.ERR_TRUST_TOKEN_OPERATION_FAILED,
NetError.ERR_TRUST_TOKEN_OPERATION_CACHE_HIT,
NetError.ERR_FTP_FAILED,
NetError.ERR_FTP_SERVICE_UNAVAILABLE,
NetError.ERR_FTP_TRANSFER_ABORTED,
NetError.ERR_FTP_FILE_BUSY,
NetError.ERR_FTP_SYNTAX_ERROR,
NetError.ERR_FTP_COMMAND_NOT_SUPPORTED,
NetError.ERR_FTP_BAD_COMMAND_SEQUENCE,
NetError.ERR_PKCS12_IMPORT_BAD_PASSWORD,
NetError.ERR_PKCS12_IMPORT_FAILED,
NetError.ERR_IMPORT_CA_CERT_NOT_CA,
NetError.ERR_IMPORT_CERT_ALREADY_EXISTS,
NetError.ERR_IMPORT_CA_CERT_FAILED,
NetError.ERR_IMPORT_SERVER_CERT_FAILED,
NetError.ERR_PKCS12_IMPORT_INVALID_MAC,
NetError.ERR_PKCS12_IMPORT_INVALID_FILE,
NetError.ERR_PKCS12_IMPORT_UNSUPPORTED,
NetError.ERR_KEY_GENERATION_FAILED,
NetError.ERR_PRIVATE_KEY_EXPORT_FAILED,
NetError.ERR_SELF_SIGNED_CERT_GENERATION_FAILED,
NetError.ERR_CERT_DATABASE_CHANGED,
NetError.ERR_DNS_MALFORMED_RESPONSE,
NetError.ERR_DNS_SERVER_REQUIRES_TCP,
NetError.ERR_DNS_SERVER_FAILED,
NetError.ERR_DNS_TIMED_OUT,
NetError.ERR_DNS_CACHE_MISS,
NetError.ERR_DNS_SEARCH_EMPTY,
NetError.ERR_DNS_SORT_ERROR,
NetError.ERR_DNS_SECURE_RESOLVER_HOSTNAME_RESOLUTION_FAILED,
NetError.OK
})
@Retention(RetentionPolicy.SOURCE)
public @interface NetError {
int OK = 0;
int ERR_IO_PENDING = -1;
int ERR_FAILED = -2;
int ERR_ABORTED = -3;
int ERR_INVALID_ARGUMENT = -4;
int ERR_INVALID_HANDLE = -5;
int ERR_FILE_NOT_FOUND = -6;
int ERR_TIMED_OUT = -7;
int ERR_FILE_TOO_BIG = -8;
int ERR_UNEXPECTED = -9;
int ERR_ACCESS_DENIED = -10;
int ERR_NOT_IMPLEMENTED = -11;
int ERR_INSUFFICIENT_RESOURCES = -12;
int ERR_OUT_OF_MEMORY = -13;
int ERR_UPLOAD_FILE_CHANGED = -14;
int ERR_SOCKET_NOT_CONNECTED = -15;
int ERR_FILE_EXISTS = -16;
int ERR_FILE_PATH_TOO_LONG = -17;
int ERR_FILE_NO_SPACE = -18;
int ERR_FILE_VIRUS_INFECTED = -19;
int ERR_BLOCKED_BY_CLIENT = -20;
int ERR_NETWORK_CHANGED = -21;
int ERR_BLOCKED_BY_ADMINISTRATOR = -22;
int ERR_SOCKET_IS_CONNECTED = -23;
int ERR_BLOCKED_ENROLLMENT_CHECK_PENDING = -24;
int ERR_UPLOAD_STREAM_REWIND_NOT_SUPPORTED = -25;
int ERR_CONTEXT_SHUT_DOWN = -26;
int ERR_BLOCKED_BY_RESPONSE = -27;
int ERR_CLEARTEXT_NOT_PERMITTED = -29;
int ERR_BLOCKED_BY_CSP = -30;
int ERR_H2_OR_QUIC_REQUIRED = -31;
int ERR_INSECURE_PRIVATE_NETWORK_REQUEST = -32;
int ERR_CONNECTION_CLOSED = -100;
int ERR_CONNECTION_RESET = -101;
int ERR_CONNECTION_REFUSED = -102;
int ERR_CONNECTION_ABORTED = -103;
int ERR_CONNECTION_FAILED = -104;
int ERR_NAME_NOT_RESOLVED = -105;
int ERR_INTERNET_DISCONNECTED = -106;
int ERR_SSL_PROTOCOL_ERROR = -107;
int ERR_ADDRESS_INVALID = -108;
int ERR_ADDRESS_UNREACHABLE = -109;
int ERR_SSL_CLIENT_AUTH_CERT_NEEDED = -110;
int ERR_TUNNEL_CONNECTION_FAILED = -111;
int ERR_NO_SSL_VERSIONS_ENABLED = -112;
int ERR_SSL_VERSION_OR_CIPHER_MISMATCH = -113;
int ERR_SSL_RENEGOTIATION_REQUESTED = -114;
int ERR_PROXY_AUTH_UNSUPPORTED = -115;
int ERR_CERT_ERROR_IN_SSL_RENEGOTIATION = -116;
int ERR_BAD_SSL_CLIENT_AUTH_CERT = -117;
int ERR_CONNECTION_TIMED_OUT = -118;
int ERR_HOST_RESOLVER_QUEUE_TOO_LARGE = -119;
int ERR_SOCKS_CONNECTION_FAILED = -120;
int ERR_SOCKS_CONNECTION_HOST_UNREACHABLE = -121;
int ERR_ALPN_NEGOTIATION_FAILED = -122;
int ERR_SSL_NO_RENEGOTIATION = -123;
int ERR_WINSOCK_UNEXPECTED_WRITTEN_BYTES = -124;
int ERR_SSL_DECOMPRESSION_FAILURE_ALERT = -125;
int ERR_SSL_BAD_RECORD_MAC_ALERT = -126;
int ERR_PROXY_AUTH_REQUESTED = -127;
int ERR_PROXY_CONNECTION_FAILED = -130;
int ERR_MANDATORY_PROXY_CONFIGURATION_FAILED = -131;
int ERR_PRECONNECT_MAX_SOCKET_LIMIT = -133;
int ERR_SSL_CLIENT_AUTH_PRIVATE_KEY_ACCESS_DENIED = -134;
int ERR_SSL_CLIENT_AUTH_CERT_NO_PRIVATE_KEY = -135;
int ERR_PROXY_CERTIFICATE_INVALID = -136;
int ERR_NAME_RESOLUTION_FAILED = -137;
int ERR_NETWORK_ACCESS_DENIED = -138;
int ERR_TEMPORARILY_THROTTLED = -139;
int ERR_HTTPS_PROXY_TUNNEL_RESPONSE_REDIRECT = -140;
int ERR_SSL_CLIENT_AUTH_SIGNATURE_FAILED = -141;
int ERR_MSG_TOO_BIG = -142;
int ERR_WS_PROTOCOL_ERROR = -145;
int ERR_ADDRESS_IN_USE = -147;
int ERR_SSL_HANDSHAKE_NOT_COMPLETED = -148;
int ERR_SSL_BAD_PEER_PUBLIC_KEY = -149;
int ERR_SSL_PINNED_KEY_NOT_IN_CERT_CHAIN = -150;
int ERR_CLIENT_AUTH_CERT_TYPE_UNSUPPORTED = -151;
int ERR_SSL_DECRYPT_ERROR_ALERT = -153;
int ERR_WS_THROTTLE_QUEUE_TOO_LARGE = -154;
int ERR_SSL_SERVER_CERT_CHANGED = -156;
int ERR_SSL_UNRECOGNIZED_NAME_ALERT = -159;
int ERR_SOCKET_SET_RECEIVE_BUFFER_SIZE_ERROR = -160;
int ERR_SOCKET_SET_SEND_BUFFER_SIZE_ERROR = -161;
int ERR_SOCKET_RECEIVE_BUFFER_SIZE_UNCHANGEABLE = -162;
int ERR_SOCKET_SEND_BUFFER_SIZE_UNCHANGEABLE = -163;
int ERR_SSL_CLIENT_AUTH_CERT_BAD_FORMAT = -164;
int ERR_ICANN_NAME_COLLISION = -166;
int ERR_SSL_SERVER_CERT_BAD_FORMAT = -167;
int ERR_CT_STH_PARSING_FAILED = -168;
int ERR_CT_STH_INCOMPLETE = -169;
int ERR_UNABLE_TO_REUSE_CONNECTION_FOR_PROXY_AUTH = -170;
int ERR_CT_CONSISTENCY_PROOF_PARSING_FAILED = -171;
int ERR_SSL_OBSOLETE_CIPHER = -172;
int ERR_WS_UPGRADE = -173;
int ERR_READ_IF_READY_NOT_IMPLEMENTED = -174;
int ERR_NO_BUFFER_SPACE = -176;
int ERR_SSL_CLIENT_AUTH_NO_COMMON_ALGORITHMS = -177;
int ERR_EARLY_DATA_REJECTED = -178;
int ERR_WRONG_VERSION_ON_EARLY_DATA = -179;
int ERR_TLS13_DOWNGRADE_DETECTED = -180;
int ERR_SSL_KEY_USAGE_INCOMPATIBLE = -181;
int ERR_CERT_COMMON_NAME_INVALID = -200;
int ERR_CERT_DATE_INVALID = -201;
int ERR_CERT_AUTHORITY_INVALID = -202;
int ERR_CERT_CONTAINS_ERRORS = -203;
int ERR_CERT_NO_REVOCATION_MECHANISM = -204;
int ERR_CERT_UNABLE_TO_CHECK_REVOCATION = -205;
int ERR_CERT_REVOKED = -206;
int ERR_CERT_INVALID = -207;
int ERR_CERT_WEAK_SIGNATURE_ALGORITHM = -208;
int ERR_CERT_NON_UNIQUE_NAME = -210;
int ERR_CERT_WEAK_KEY = -211;
int ERR_CERT_NAME_CONSTRAINT_VIOLATION = -212;
int ERR_CERT_VALIDITY_TOO_LONG = -213;
int ERR_CERTIFICATE_TRANSPARENCY_REQUIRED = -214;
int ERR_CERT_SYMANTEC_LEGACY = -215;
int ERR_CERT_KNOWN_INTERCEPTION_BLOCKED = -217;
int ERR_SSL_OBSOLETE_VERSION = -218;
int ERR_CERT_END = -219;
int ERR_INVALID_URL = -300;
int ERR_DISALLOWED_URL_SCHEME = -301;
int ERR_UNKNOWN_URL_SCHEME = -302;
int ERR_INVALID_REDIRECT = -303;
int ERR_TOO_MANY_REDIRECTS = -310;
int ERR_UNSAFE_REDIRECT = -311;
int ERR_UNSAFE_PORT = -312;
int ERR_INVALID_RESPONSE = -320;
int ERR_INVALID_CHUNKED_ENCODING = -321;
int ERR_METHOD_NOT_SUPPORTED = -322;
int ERR_UNEXPECTED_PROXY_AUTH = -323;
int ERR_EMPTY_RESPONSE = -324;
int ERR_RESPONSE_HEADERS_TOO_BIG = -325;
int ERR_PAC_SCRIPT_FAILED = -327;
int ERR_REQUEST_RANGE_NOT_SATISFIABLE = -328;
int ERR_MALFORMED_IDENTITY = -329;
int ERR_CONTENT_DECODING_FAILED = -330;
int ERR_NETWORK_IO_SUSPENDED = -331;
int ERR_SYN_REPLY_NOT_RECEIVED = -332;
int ERR_ENCODING_CONVERSION_FAILED = -333;
int ERR_UNRECOGNIZED_FTP_DIRECTORY_LISTING_FORMAT = -334;
int ERR_NO_SUPPORTED_PROXIES = -336;
int ERR_HTTP2_PROTOCOL_ERROR = -337;
int ERR_INVALID_AUTH_CREDENTIALS = -338;
int ERR_UNSUPPORTED_AUTH_SCHEME = -339;
int ERR_ENCODING_DETECTION_FAILED = -340;
int ERR_MISSING_AUTH_CREDENTIALS = -341;
int ERR_UNEXPECTED_SECURITY_LIBRARY_STATUS = -342;
int ERR_MISCONFIGURED_AUTH_ENVIRONMENT = -343;
int ERR_UNDOCUMENTED_SECURITY_LIBRARY_STATUS = -344;
int ERR_RESPONSE_BODY_TOO_BIG_TO_DRAIN = -345;
int ERR_RESPONSE_HEADERS_MULTIPLE_CONTENT_LENGTH = -346;
int ERR_INCOMPLETE_HTTP2_HEADERS = -347;
int ERR_PAC_NOT_IN_DHCP = -348;
int ERR_RESPONSE_HEADERS_MULTIPLE_CONTENT_DISPOSITION = -349;
int ERR_RESPONSE_HEADERS_MULTIPLE_LOCATION = -350;
int ERR_HTTP2_SERVER_REFUSED_STREAM = -351;
int ERR_HTTP2_PING_FAILED = -352;
int ERR_CONTENT_LENGTH_MISMATCH = -354;
int ERR_INCOMPLETE_CHUNKED_ENCODING = -355;
int ERR_QUIC_PROTOCOL_ERROR = -356;
int ERR_RESPONSE_HEADERS_TRUNCATED = -357;
int ERR_QUIC_HANDSHAKE_FAILED = -358;
int ERR_HTTP2_INADEQUATE_TRANSPORT_SECURITY = -360;
int ERR_HTTP2_FLOW_CONTROL_ERROR = -361;
int ERR_HTTP2_FRAME_SIZE_ERROR = -362;
int ERR_HTTP2_COMPRESSION_ERROR = -363;
int ERR_PROXY_AUTH_REQUESTED_WITH_NO_CONNECTION = -364;
int ERR_HTTP_1_1_REQUIRED = -365;
int ERR_PROXY_HTTP_1_1_REQUIRED = -366;
int ERR_PAC_SCRIPT_TERMINATED = -367;
int ERR_INVALID_HTTP_RESPONSE = -370;
int ERR_CONTENT_DECODING_INIT_FAILED = -371;
int ERR_HTTP2_RST_STREAM_NO_ERROR_RECEIVED = -372;
int ERR_HTTP2_PUSHED_STREAM_NOT_AVAILABLE = -373;
int ERR_HTTP2_CLAIMED_PUSHED_STREAM_RESET_BY_SERVER = -374;
int ERR_TOO_MANY_RETRIES = -375;
int ERR_HTTP2_STREAM_CLOSED = -376;
int ERR_HTTP2_CLIENT_REFUSED_STREAM = -377;
int ERR_HTTP2_PUSHED_RESPONSE_DOES_NOT_MATCH = -378;
int ERR_HTTP_RESPONSE_CODE_FAILURE = -379;
int ERR_QUIC_CERT_ROOT_NOT_KNOWN = -380;
int ERR_CACHE_MISS = -400;
int ERR_CACHE_READ_FAILURE = -401;
int ERR_CACHE_WRITE_FAILURE = -402;
int ERR_CACHE_OPERATION_NOT_SUPPORTED = -403;
int ERR_CACHE_OPEN_FAILURE = -404;
int ERR_CACHE_CREATE_FAILURE = -405;
int ERR_CACHE_RACE = -406;
int ERR_CACHE_CHECKSUM_READ_FAILURE = -407;
int ERR_CACHE_CHECKSUM_MISMATCH = -408;
int ERR_CACHE_LOCK_TIMEOUT = -409;
int ERR_CACHE_AUTH_FAILURE_AFTER_READ = -410;
int ERR_CACHE_ENTRY_NOT_SUITABLE = -411;
int ERR_CACHE_DOOM_FAILURE = -412;
int ERR_CACHE_OPEN_OR_CREATE_FAILURE = -413;
int ERR_INSECURE_RESPONSE = -501;
int ERR_NO_PRIVATE_KEY_FOR_CERT = -502;
int ERR_ADD_USER_CERT_FAILED = -503;
int ERR_INVALID_SIGNED_EXCHANGE = -504;
int ERR_INVALID_WEB_BUNDLE = -505;
int ERR_TRUST_TOKEN_OPERATION_FAILED = -506;
int ERR_TRUST_TOKEN_OPERATION_CACHE_HIT = -507;
int ERR_FTP_FAILED = -601;
int ERR_FTP_SERVICE_UNAVAILABLE = -602;
int ERR_FTP_TRANSFER_ABORTED = -603;
int ERR_FTP_FILE_BUSY = -604;
int ERR_FTP_SYNTAX_ERROR = -605;
int ERR_FTP_COMMAND_NOT_SUPPORTED = -606;
int ERR_FTP_BAD_COMMAND_SEQUENCE = -607;
int ERR_PKCS12_IMPORT_BAD_PASSWORD = -701;
int ERR_PKCS12_IMPORT_FAILED = -702;
int ERR_IMPORT_CA_CERT_NOT_CA = -703;
int ERR_IMPORT_CERT_ALREADY_EXISTS = -704;
int ERR_IMPORT_CA_CERT_FAILED = -705;
int ERR_IMPORT_SERVER_CERT_FAILED = -706;
int ERR_PKCS12_IMPORT_INVALID_MAC = -707;
int ERR_PKCS12_IMPORT_INVALID_FILE = -708;
int ERR_PKCS12_IMPORT_UNSUPPORTED = -709;
int ERR_KEY_GENERATION_FAILED = -710;
int ERR_PRIVATE_KEY_EXPORT_FAILED = -712;
int ERR_SELF_SIGNED_CERT_GENERATION_FAILED = -713;
int ERR_CERT_DATABASE_CHANGED = -714;
int ERR_DNS_MALFORMED_RESPONSE = -800;
int ERR_DNS_SERVER_REQUIRES_TCP = -801;
int ERR_DNS_SERVER_FAILED = -802;
int ERR_DNS_TIMED_OUT = -803;
int ERR_DNS_CACHE_MISS = -804;
int ERR_DNS_SEARCH_EMPTY = -805;
int ERR_DNS_SORT_ERROR = -806;
int ERR_DNS_SECURE_RESOLVER_HOSTNAME_RESOLUTION_FAILED = -808;
}
