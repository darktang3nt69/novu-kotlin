package co.novu.api

import co.novu.dto.request.IntegrationRequest
import co.novu.dto.response.IntegrationReponse
import co.novu.dto.response.ResponseWrapper
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface IntegrationsApi {
    @GET("integrations")
    suspend fun getIntegrations(): Response<ResponseWrapper<List<IntegrationReponse>>>

    @POST("integrations")
    suspend fun createIntegration(@Body request: IntegrationRequest): Response<ResponseWrapper<IntegrationReponse>>

    @GET("integrations/active")
    suspend fun getActiveIntegrations(): Response<ResponseWrapper<List<IntegrationReponse>>>

    @GET("integrations/webhook/provider/{providerId}/status")
    suspend fun getProviderWebhook(@Path("providerId") providerId: String): Response<ResponseWrapper<Boolean>>

    @PUT("integrations/{integrationId}")
    suspend fun updateIntegration(@Path("integrationId") integrationId: String, @Body request: IntegrationRequest): Response<ResponseWrapper<IntegrationReponse>>

    @DELETE("integrations/{integrationId}")
    suspend fun deleteIntegration(@Path("integrationId") integrationId: String): Response<ResponseWrapper<List<IntegrationReponse>>>
}
