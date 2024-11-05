package org.iesharia.coroutineszerotohero

import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiServices {

    @GET("/api/14c14f8b4a12f4c1cd4098a5ea8092cb/search/{name}")
    suspend fun getSuperheroes(@Path("name") superheroName:String): Response<SuperHeroDataResponse>
}

data class SuperHeroDataResponse(
    @SerializedName("response") val response:String,
    @SerializedName("results-for") val resultsFor:String,
    @SerializedName("results") val results:List<SuperHeroItemResponse>

)

data class SuperHeroItemResponse(
    @SerializedName("id") val id:String,
    @SerializedName("name") val name:String
)