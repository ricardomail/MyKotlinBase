package com.oasis.mykotlinbase

class Base19 {
}

// 数据类
// 会自动生成解构，equals, copy, toString hashcode
// 默认生成的toString,hashCode, equals只管主构造函数，如果存在其他重要信息，需要自己重写
// 数据类至少有一个参数的主构造函数，必须有var val的参数，不能被继承
// 使用条件 1. 服务器请求返回响应 2. 需要进行比较，copy，toString，解构等这些功能时可以使用
data class Response(val name: String, val age: Int) {
    var info: String = ""

    constructor(name: String, age: Int, info: String) : this(name, age) {
        this.info = info
    }

    // 解构函数
    operator fun component3() = this.info
}

fun main() {
    val (name, age, info) = Response("张三", 11, "1231")
    println(info)
    println(Response("张三", 11) == Response("张三", 11))
}