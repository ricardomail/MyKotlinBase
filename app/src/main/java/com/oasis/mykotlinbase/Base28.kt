package com.oasis.mykotlinbase

import java.util.Objects

/**
 * 范型类型约束
 */
class Base28<T>(vararg objects: T?) {
    // out只读
    val objectArray: Array<out T?> = objects

    fun showObj(index: Int): T? {
        return objectArray[index]
    }

    /**
     * 运算符重载
     */
    operator fun get(index: Int): T? {
        return objectArray[index]
    }

    fun getR(index: Int): Any ? = objectArray[index].takeIf { true } ?: "AAA" ?: 123 ?: 456 ?: null
}

fun main() {
    println(Base28(1, "2ada", 3, null).showObj(3))
    println( Base28(1, "2ada", 3, null)[2])
}