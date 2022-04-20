package com.slowmotion.movieapp.service


import com.slowmotion.movieapp.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/3/movie/popular?api_key=baa161faebed847f9584b60da4f1b057")
    fun getMovieList(): Call<MovieResponse>
}