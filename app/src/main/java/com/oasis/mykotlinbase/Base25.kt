package com.oasis.mykotlinbase

/**
 * 范性类
 */

class Base25<T>(private val obj: T) {

    fun show() = println("$obj")

}

data class Student1(val name: String, val age: Int, val sex: Char)
data class Teacher2(val name: String, val age: Int, val sex: Char)

fun main() {
    val stu1 = Student1("张三", 18, '男')
    val stu2 = Student1("张三", 18, '男')
    val tea1 = Teacher2("张三", 18, '男')
    val tea2 = Teacher2("张三", 18, '男')

    Base25(stu1).show()
}