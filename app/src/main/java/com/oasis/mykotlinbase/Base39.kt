package com.oasis.mykotlinbase

/**
 * 匿名类（对象表达式）
 */
fun interface Person2 { // 可以在接口声明前面添加fun关键字
    // 对于只存在一个抽象函数的接口，称为函数式接口或单一抽象方法(SAM)接口
    fun invoke(name: String)

    fun put() {}
}

abstract class Base39(var name: String) {

    abstract fun put()
}

// 当参数为函数式接口式，在本函数调用时更为简洁
fun print(person2: Person2) {
    person2.invoke("name")
}

fun main() {
    // 创建一个匿名类
    var obj = object {
        fun test() {}
        var age: Int = 0
    }

    // 也可以作为类的子类定义
    // 函数式接口更为简洁
    var obj2 = Person2 {
        println(it)
    }
//    obj2.invoke("hello")
//    var obj3 = object : Base39(name = "hello") {
//        override fun put() {
//
//        }
//    }

    print {
        println(it)
    }
}