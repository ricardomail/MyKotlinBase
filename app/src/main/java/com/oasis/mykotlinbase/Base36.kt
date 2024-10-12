package com.oasis.mykotlinbase

/**
 * 数组
 */
class Base36 : Comparable<Base36>{
    // 支持排序操作
    override fun compareTo(other: Base36): Int {
        return 0
    }
}

fun main() {
    val array1: Array<Int> = arrayOf(1, 2, 3, 3, 4) // 生成一个长度为5的数组
    array1[0] = 2
    println(array1)
    // 数组遍历
    for (element in array1) {
        println(element)
    }
    // 遍历索引
    for (index in array1.indices) {
    }
    // 同时遍历
    for ((index, value) in array1.withIndex()) {
    }
    // 扩展函数
    array1.forEachIndexed { index, i ->

    }


    // 构造方法
    val arr: Array<String> = Array(5) {
        "$it head"
    }
    // 转为字符串
    println(arr.joinToString("-", "<", ">"))
    // 创建元素可以为空的数组
    val arrayOfNulls = arrayOfNulls<String>(10)

    // 比较数组里内容是否相等
    arr.contentEquals(array1)
    // 拷贝数组
    arr.copyOf()
    // 拼接数组 +
    // 是否包含 contain
    // 查找元素下标 indexOf
    // 二分搜索 binarySearch
    // arr.any()判断是否为空数组
    // shuffle() 洗牌
    // fill数组快速填充

}