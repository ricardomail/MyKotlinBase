package com.oasis.mykotlinbase

/**
 * 范型变化操作
 */
class Base27<T>(val isMap: Boolean = false, val inputType: T) {

    inline fun <R> map(mapAction: (T) -> R): R? {
        return mapAction(inputType).takeIf { isMap }
    }
}

fun main() {
    val r: Int = Base27(false, "hello").map {
        it.length
    } ?: 0
    println(r)
}