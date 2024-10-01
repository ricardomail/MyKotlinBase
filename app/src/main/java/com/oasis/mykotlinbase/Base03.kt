package com.oasis.mykotlinbase


fun main() {
    funcParams()
}

// 匿名函数


// 函数类型&隐式返回
private fun niMing() {
    // 函数的输入输出声明
    val methodAction: (Int) -> String

    // 对函数的实现
    methodAction = { age ->
        "$age"
        // 匿名函数不需要写return，最后一行就是返回值
    }
    // 调用函数
    println(methodAction(11))
}

// 函数参数
private fun funcParams() {
    val methodAction: (Int, Int, Int) -> String = { a, b, _ ->
        println("$a, $b")
        ""
    }

    methodAction(1, 2, 3)
    // 等价
//    methodAction.invoke(1, 2, 3)

    val methodAction2: (Int) -> String = {
        // 如果只有一个参数，默认会增加it作为参数的调用
        println("$it")
        "$it"
    }
}