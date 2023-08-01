package com.example.composemovieapp.domain.use_case.get_movies

import com.example.composemovieapp.data.remote.dto.toMovieList
import com.example.composemovieapp.domain.model.Movie
import com.example.composemovieapp.domain.repository.MovieRepository
import com.example.composemovieapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOError
import javax.inject.Inject

class GetMovieUseCase @Inject constructor(
    private val repository: MovieRepository
) {
    fun executeGetMovies(search: String): Flow<Resource<List<Movie>>> = flow {
        try {
            emit(Resource.Loading())
            val movieList = repository.getMovies(search)
            if (movieList.Response == "True") {
                emit(Resource.Success(movieList.toMovieList()))
            } else {
                emit(Resource.Error(message = "No Movie Found! "))
            }
        } catch (e: IOError) {
            emit(Resource.Error(message = "No Internet Connection!"))
        } catch (e: HttpException) {
            emit(Resource.Error(message = e.localizedMessage ?: "Error!"))
        }
    }
}