package com.jaysinghtalreja.cinepop.ui.common

import com.jaysinghtalreja.cinepop.data.remote.Movie

/**
 * Created by JaySinghTalreja
 * Fakes are used to preview purpose only
 **/

object Fakes {
    fun getFakeMovie() = Movie(
        actors = mutableListOf<String>()
            .apply {
                repeat(4) {
                    add("Actor $it")
                }
            },
        desc = "Aw, addled breeze. you won't fight the freighter.Nuptia, ignigena, et cannabis.Place the celery in a soup pot, and whisk carefully with roasted tea.Aye, proud wave. you won't lead the pacific ocean.",
        directors = mutableListOf<String>()
            .apply {
                repeat(3) {
                    add("Director $it")
                }
            },
        genre = mutableListOf<String>()
            .apply {
                repeat(3) {
                    add("Genre $it")
                }
            },
        imageUrl = "",
        thumbUrl = "https://picsum.photos/id/234/400/600",
        imdbPath = "/title/tt0082096",
        title = "Ironman",
        rating = 8f,
        year = 0
    )
}