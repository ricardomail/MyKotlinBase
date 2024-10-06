package com.oasis.mykotlinbase

/*构造函数初始化顺序*/
class Base12(_name: String, val sex: Char)/* 第一步 */{
    init {
        /* 第二步 */
        println("init")
    }
    // 属性接收于初始化代码块存在先后顺序关系，看那个写在上面
    /* 第三步 */
    var name = _name
    var age: Int = 0
    constructor(_name: String, _sex: Char, _age: Int) : this(_name, _sex) {
        /* 第五步 */
        age = _age
        println("次构造参数运行")
    }
    /* 第四步 */
    var temp = "temp"

}

fun main() {
    Base12("hello", 'C', 11)
}