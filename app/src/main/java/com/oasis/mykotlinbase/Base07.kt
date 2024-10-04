package com.oasis.mykotlinbase

fun main() {
    listFunc4()
}

// list
private fun listFunc() {
    val list: List<String> = listOf("123", "1321", "123")
    println(list[0])
    // 防止出现数组越界
    println(list.getOrElse(3) { "index out of" })
    println(list.getOrNull(3) ?: "")
}

// 可变集合
private fun listFunc2() {
    val list = mutableListOf("", "lis", "wangwu")
    list.add("zhaoliu")
    // 条件删除
    list.removeIf {
        it == "lis"
    }
    println(list)
}

// mutator

// list遍历
private fun listFunc3() {
    val list = mutableListOf("", "lis", "wangwu")
    list.forEachIndexed { index, value ->
        println("index: $index value: $value")
    }
}

// 解构语法
private fun listFunc4() {
    val list = mutableListOf("", "lis", "wangwu")
    val (_, value2, value3) = list
    println("value2: $value2 value3: $value3")

}
