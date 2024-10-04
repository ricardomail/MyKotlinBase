package com.oasis.mykotlinbase

import kotlin.math.roundToInt

fun main() {
//    exceptionAction()
//    splitFunc()
//    replaceFunc()
    transferFunc2()
}

// 异常处理于自定义异常
fun exceptionAction() {
    try {
        var info: String? = null
//        checkException(info)
        info!!.length
    } catch (e: Exception) {
        println(e)
    }
}

fun checkException(info: String?) {
    info ?: throw CommonException()
}

// 自定义异常
class CommonException : NullPointerException("空指针异常")


// 先决条件函数
fun action1() {
    var value1: String? = null
    var value2: Boolean = false
    // 如果为null则抛出异常
    checkNotNull(value1)
    requireNotNull(value1)
    // 如果为false，则抛出异常
    require(value2)
}

// substring函数
fun subFunc() {
    val indexOf = "alkjdlkfjalkdsfj"
    println(indexOf.substring(1..3))
    println(indexOf.substring(1 until 3))
}

// split
fun splitFunc() {
    val indexOf = "al kj dl kf ja lk dsfj"
    val list = indexOf.split(" ")
    // 解构操作
    val (v1, v2, v3, v4, v5) = indexOf.split(" ")
    println(v5)
}

// replace
fun replaceFunc() {
    val indexOf = "alkjdlkfjalkdsfj"
    val info = indexOf.replace(Regex("[a]")) {
        "1"
    }
    println(info)
}

// == 值的比较(equals) === 引用的比较

// String to Int
fun transferFunc() {
    val number: Int = "666".toInt()

    // 字符串里面是double类型，无法转换为Int
    val number2: Int = "666.6".toInt()
    // 解决方式，如果转换失败转化为null
    val number3: Int = "666.6".toIntOrNull() ?: 0

}

// double to int
fun transferFunc2() {
    val number: Int = 666.6.toInt()

    // roundToInt持有四舍五入效果
    val number2: Int = 666.61234.roundToInt() // 四舍五入

    // 保留小数点
    val r = "%.3f".format(65.33333) // 字符串类型，double保留三位小数并转为String
    println(r)

}
