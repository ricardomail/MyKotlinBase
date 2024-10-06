package com.oasis.mykotlinbase

class Base10(_params1: String, _params2: String)/*主构造函数，内部可以包含临时的参数，但需要变量接收*/ {
    private var params1 = _params1
        private set(value) {
            field = value
        }
        get() = "$field " // get方法不允许被私有化
    var params2 = _params2




    /**
     * 默认会提供一个get方法和set方法，对象会私有
     */
    var info = "akjhakjhd"
        get() = field
        set(value) {
            field = value + ""
        }

    // val 默认会增加final关键字和get函数，不会生成set函数
    val num = 10

    // 计算属性，不会创建num2属性，但会创建getNum2方法
    val num2: Int
        get() = (1..1000).shuffled().first()

    // 防范竞态条件，当你调用成员，这个成员可能为null，可能为空值，就必须采用防范竞态条件，这是规范
    var info2: String? = ""
    fun getShowInfo(): String {
        return info2?.run {
            ifEmpty {
                "null"
            }
        } ?: "null"
    }
}

fun main() {
}