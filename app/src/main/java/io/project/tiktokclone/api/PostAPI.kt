package io.project.tiktokclone.api

import io.project.tiktokclone.models.PostResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PostAPI {

    @GET("videos")
    suspend fun getVideos(
        @Query("page")
        pageNumber: Int = 0
    ): Response<PostResponse>
}