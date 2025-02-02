package co.novu.api

import co.novu.dto.ExecutionDetails
import co.novu.dto.response.ResponseWrapper
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ExecutionDetailsApi {
    @GET("execution-details")
    suspend fun getExecutionDetails(
        @Query("notificationId") notificationId: String,
        @Query("subscriberId") subscriberId: String
    ): Response<ResponseWrapper<List<ExecutionDetails>>>
}
