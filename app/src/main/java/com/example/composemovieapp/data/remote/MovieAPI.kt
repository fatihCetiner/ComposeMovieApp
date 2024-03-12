package com.example.composemovieapp.data.remote

import com.example.composemovieapp.data.remote.dto.MovieDetailDto
import com.example.composemovieapp.data.remote.dto.MoviesDto
import com.example.composemovieapp.util.Constants.API_KEY
import com.google.gson.internal.GsonBuildConfig
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieAPI {

    // https://www.omdbapi.com/?apikey=31d72fc2&s=batman
    // https://www.omdbapi.com/?apikey=31d72fc2&i=tt0372784

    @GET(".")
    suspend fun getMovies(
        @Query("s") searchString : String,
        @Query("apikey") apiKey : String = API_KEY
    ) : MoviesDto

    @GET(".")
    suspend fun getMovieDetail(
        @Query("i") imdbId : String,
        @Query("apikey") apiKey : String = API_KEY
    ) : MovieDetailDto
}