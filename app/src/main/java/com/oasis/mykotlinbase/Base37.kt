package com.oasis.mykotlinbase

/**
 * 可变长参数 varags
 * 通过数组前加*号的形式，将数组作为参数放到可变参数中
 */
class Base37(var name: String, vararg str: String) {
    init {
        str.forEach {

        }
    }
}

fun main() {
    val array: Array<String> = arrayOf("zaa", "adfk")
    // 迭代器将不同的遍历方式进行统一
    array.iterator()
    Base37(name = "hhh", "123", *array)
    // 原生类型数组
    val arr1: IntArray = intArrayOf(1,2,3)
}