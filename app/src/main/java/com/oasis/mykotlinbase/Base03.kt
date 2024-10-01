package com.oasis.mykotlinbase


fun main() {
//    funcParams()
//    loginApi("zhangsan", "") { error, code ->
//        println("$error $code")
//    }
    // 也可以这么写，但是函数参数在最后时可以放到括号外面
//    loginApi("zhangsan", "123", { error, code ->
//        println("$error $code")
//    })

    // 函数引用 ::会将函数变成函数类型的对象
    login("", "", ::responseMethod)
    var anonymous = action03()
    anonymous.invoke("hello")
    anonymous.invoke("123")
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

// 匿名函数的类型推断
private fun funcAnonymous() {
    // 不需要指定匿名函数的参数类型和返回值类型，会根据方法内的参数和返回值自动推断

    val methodAction = { a: Int, b: Int ->
        println("$a, $b")
        ""
    } // 相当于函数(Int, Int)->String

    methodAction(1, 2)
}

// lambda
private fun funcLambda() {
    // 匿名函数等价于lambda表达式
}

// 函数的参数为函数
inline fun loginApi(username: String, pwd: String, response: (String, Int) -> Unit) {
    if (username.isEmpty() || pwd.isEmpty()) {
        println("error")
        response.invoke("error", 500)
        return
    }
    response.invoke("success", 200)
}

// 内联 函数使用lambda函数最好声明称内联，如果未使用内联，在调用端会生成多个对象，造成性能损耗
// 内联会讲代码替换到调用处，减少性能损耗


//函数引用
inline fun login(name: String, pwd: String, response: (String, Int) -> Unit) {

}

fun responseMethod(message: String, code: Int) {

}

// 函数作为返回值
private fun action03(): (String) -> Unit {
    val num = 100
    return { result ->
        println(num)
        println(result)
    }
}
