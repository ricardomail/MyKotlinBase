package com.oasis.mykotlinbase

// 中缀 infix 必须是一个成员函数，只能有一个参数，参数不能有默认值
// 中缀函数调用优先级低于算数运算符，类型转换和rangeTo 高于&& || is in

class Base29 {
    infix fun test(name: String): String = "name: $name"

    fun build() {
        this test "build"
    }
}

fun main() {
    val base = Base29()
    println(base test "hello")
}
