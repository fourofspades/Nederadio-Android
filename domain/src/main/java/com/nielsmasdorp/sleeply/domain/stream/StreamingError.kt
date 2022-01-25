package com.nielsmasdorp.sleeply.domain.stream

/**
 * @author Niels Masdorp (NielsMasdorp)
 *
 * Note: only used in [Flow]s
 */
sealed class StreamingError {

    data class Filled(val error: String) : StreamingError() {
        override fun equals(other: Any?): Boolean =
            false // never equal, so duplicate values are accepted by [Flow]

        override fun hashCode(): Int = error.hashCode()
    }

    object Empty : StreamingError()
}