package com.jaysinghtalreja.cinepop.utils.flow

import kotlinx.coroutines.flow.MutableSharedFlow

/**
 * Created by JaySinghTalreja
 */
fun <T> mutableEventFlow(): MutableSharedFlow<T> {
    return MutableSharedFlow(
        replay = 0,
        extraBufferCapacity = 1
    )
}
