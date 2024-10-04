package com.oasis.mykotlinbase

// Set
fun main() {
    transform()
}

private fun setFunc() {
    val set: Set<String> = setOf("lisi", "wangwu", "zhaoliu")
    println(set.elementAt(0))
    println(set.elementAtOrElse(4) { "li" })
    println(set.elementAtOrNull(4) ?: "")
    val mutableSet = set.toMutableSet()
    mutableSet.add("z")
}


// 集合转换
private fun transform(){
    val list = mutableListOf("", "lis", "wangwu")
    // list去重
    list.toSet().toList()
    list.distinct()
    val toTypedArray = list.toTypedArray()
    println(toTypedArray)

}

// 数组
private fun arrayFunc() {
    val intArrayOf = intArrayOf(1, 2, 3, 4)

    arrayOf<String>("", "", "123")
}