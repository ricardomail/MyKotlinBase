package com.oasis.mykotlinbase

fun main() {
    stringFunc()
    // 函数的具名参数调用，更加清晰，灵活，自由控制参数位置
    action01(age = 11, name = "张三")
    action01("张三", 11)
}


// range表达式 从哪里到哪里
fun rangeFunc() {
    val number = 148
    if (number in 10..59) {
        print("xxxx")
    } else if (number in 0..9) {

    } else if (number in 60..100) {

    }
}

// when表达式
fun whenFunc(week: Int) {
    // java中的if是语句，kotlin中的是表达式，有返回值
    val info = when (week) {
        1 -> ""
        else -> {
            print("")
        }
    }
}

// 字符串模版
fun stringFunc() {
    val garden = "公园"
    val week = 1
    // 没有中文时不需要花括号，存在中文时，或者表达式/方法时需要有花括号
    print("今天是周${week}去${garden}玩")
}

// 函数的默认参数
private fun action01(name: String, age: Int, sex: String = "男") {

}

// 具名函数参数
private fun loginAction(username: String, userPwd: String, phone: String, age: Int) {
    //// 函数的具名参数调用，更加清晰，灵活，自由控制参数位置
    //    action01(age = 11, name = "张三")
}

// 返回值为Unit,表示为无返回类型，是一个类（可以省略），相当于Java中的void关键字
private fun unitFunc(): Unit{

}

// Nothing
private  fun show(number: Int) {
    when(number) {
        -1 ->  TODO("没有这种数字") // 这句话不是注释提示，会终止程序
        else -> print("")
    }
}

// ``的使用，在安卓中不被允许调用
// 第一种情况使用方法名
//private fun `登录功能 2024年测试用`(name: String, pwd: String) {
//    print("")
//}
// 第二种情况，类似于in is这种在kt中是关键字，但在Java中不是
private fun `is`(name: String, pwd: String) {

}

// 第三种情况
private fun `98712893719`(){
    // 写了很复杂的核心功能，通过私有文件对数字进行解释，解释这个函数的作用
}
