package com.illiouchine.jm.extensions

fun <T> Iterable<T>.reversedIf(shouldReverse: Boolean): Iterable<T> {
    if (shouldReverse) {
        return this.reversed()
    }

    return this
}
