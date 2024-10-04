package com.oasis.mykotlinbase

fun main() {

}

// kotlin语言的可空性特点
fun allowNull() {
    // 默认是不可以空的，不能随意给null
    var name: String = "Derry"
    // name = null 会报错，因为是非null类型

    // 声明时指定为可空类型
    var age: Int? = null
    // 可空类型调用时需要使用?的形式来调用
    age?.dec()
}

// let的安全调用
fun letFunc() {
    var name: String? = null
    var r = name?.let {

    } ?: ""
}

// 断言操作
fun assertFunc() {
    var name: String? = null
    name!!.let { } // 无论name是不是null，都会执行，会出现空异常
}

// if对可空类型的处理，处理起来和Java一致
fun ifFunc() {
    var name: String? = null
    if (name != null) {
        name.length
    }
}

//空合并
fun conbineFunc() {
    var name: String? = "hello"
    name = null
    // 如果name为null，就会执行冒号后面的内容
    println(name ?: "hello")
    // 和let结合使用
    println(name?.let { "it" } ?: "hello")
}