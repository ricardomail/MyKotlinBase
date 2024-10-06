package com.oasis.mykotlinbase

/*继承与重载
* kt中所有的类默认都是final类型的，默认不允许被继承
* */

class Base14 {
}

open class Person(val name: String) {

    private fun showName() {

    }

    /*
    所有的函数默认也无法被重写
    * */
    open fun myPrintln() = println(showName())
}

class Student(private val subName: String) : Person(subName) {

    override fun myPrintln() {
        println("子类： $subName")
    }
}