package co.novu.dto

data class Credential(
    var apiKey: String? = null,
    var user: String? = null,
    var secretKey: String? = null,
    var domain: String? = null,
    var password: String? = null,
    var host: String? = null,
    var port: String? = null,
    var secure: Boolean = false,
    var region: String? = null,
    var accountSid: String? = null,
    var messageProfileId: String? = null,
    var token: String? = null,
    var from: String? = null,
    var senderName: String? = null,
    var projectName: String? = null,
    var applicationId: String? = null,
    var clientId: String? = null,
    var requireTls: Boolean = false,
    var ignoreTls: Boolean = false,
    var baseUrl: String? = null,
    var webhookUrl: String? = null,
    var redirectUrl: String? = null,
    var hmac: Boolean = false,
    var serviceAccount: String? = null,
    var ipPoolName: String? = null
)
