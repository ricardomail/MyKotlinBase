package com.oasis.mykotlinbase
const val PI = 3.1415 // 定义编译时常量

fun main() {
    // 声明变量
    // var 可读可改
    // val/var是变量的声明方式，val是只读的，创建之后无法修改，var没有要求
    var name: String = "hello"
    // val 只读变量 String这个类型可以通过类型推断来表达，可以去掉
    val info = "不可改变的"
    print(name)
    // 数据类型
    // String Char Boolean Int Double List Set(无重复元素集合) Map

    //编译时常量
    // val 是只读的变量，并不是常量
    // 编译时常量只能是基本数据类型(String Double Int Float Long Short Byte Char Boolean)
    // const 不适用于局部变量，如果定义在函数之内，就必须在运行时才能调用函数赋值，何来编译时一说
    //    const val PI = 45 // 不被允许

    // Java中的数据类型在kt中是以引用类型的形式存在的，编译器会自动转换为Java的基本数据类型，不需要担心性能

}