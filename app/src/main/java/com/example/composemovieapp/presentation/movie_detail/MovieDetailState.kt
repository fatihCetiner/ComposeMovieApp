package com.example.composemovieapp.presentation.movie_detail

import com.example.composemovieapp.domain.model.MovieDetail

data class MovieDetailState(
    val isLoading: Boolean = false,
    val movie: MovieDetail? = null,
    val error: String = ""
)