package com.oasis.mykotlinbase

/*
* 内部类能访问外部类，外部类能访问内部类
* */
class Base18 {

    var name: String = "oasis"
    inner class Inner{

        fun run() = println(name)
    }
    // 不加inner默认情况下就是嵌套类，不能访问外部
    // 外部类能访问内部类
    class Insert {
        fun run() = println()
    }
}

fun main() {
    // 内部类初始化
    Base18().Inner()
    // 嵌套类初始化
    Base18.Insert()
}