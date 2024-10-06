package com.oasis.mykotlinbase

class Base11(
    var params: String,
    val sex: Char,
    var info: String = "info",
    age: Int
)/*可以在主构造函数直接定义好属性，接下来就不需要临时变量来接收*/ {

    // 初始化代码块存在于主构造函数中，并且初始化代码块也可以使用主构造函数中的临时参数（age）
    init {
        println("hello init $age")
    }
    var age: Int = 0

    /*次构造函数，必须要调用主构造函数，次构造函数不允许创建属性
    * 调用次构造函数之前会先执行主构造函数
    * */
    constructor(params: String, sex: Char, _age: Int) : this(params, sex, age = 0) {
        println("hello second init")
        this.age = _age
    }
}


fun main() {

}