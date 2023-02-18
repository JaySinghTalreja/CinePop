package com.jaysinghtalreja.cinepop.model

import com.jaysinghtalreja.cinepop.data.remote.Movie


data class Category(
    val id: Long,
    val genre: String,
    val movies: List<Movie>
)
