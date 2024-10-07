package com.oasis.mykotlinbase

/**
 * 范型函数
 */

// 范性允许传null当作参数
fun <T, R> show(obj: T, block: T.() -> R) {
    println(obj)
    println(obj?.block() ?: "hello")
}

fun main() {
    val l = show(null) {
        println("show")
    }

    println(l)
}