package com.oasis.mykotlinbase

fun main() {
//    applyFunc()
//    println(runFunc2("`12å"))
//    withFunc()
//    alsoFunc()
}

// apply 内置函数
fun applyFunc() {
    val info = "Oasis hello"
    // apply始终返回调用对象本身，所以可以进行链式调用
    info.apply {
        // 内部持有调用对象本身
        println(length)
    }.apply { println(this[length - 1]) }.apply { }
}

// let函数，返回最后一行的值，内部保持有it，为调用者本身
private fun letFunc(value: String?) = value?.let { "this is $value" } ?: "it null"

// run函数 返回最后一行，内部保持有this，为调用者本身, 可以使用具名函数代替匿名函数，
// run函数也可以链式调用，只不过每次调用run时，调用者会称为上一次的返回值类型
private fun runFunc(value: String?) = value?.run { "this is $this" } ?: "it null"
private fun runFunc2(value: String?) = value?.run(::print2) ?: "it null"
private fun print2(value: String) = "this is $value"


///with函数，内部持有receiver的this引用，返回值是最后一行，和run函数类似，但调用方式不一样，并且没有null判断
private fun withFunc() {
    with("hello") {

    }
    with("hello", ::print3)
}

private fun <T> print3(value: T) {
    println(value)
}

/// also 内部持有it参数，返回调用者本身，和apply类似，但内部持有为it和this的区别
private fun alsoFunc() {
    val content = "hellooaa".also { 123 }
    println(content)
}

// takeIf函数，如果为true，返回本身，否则返回null，可以配合空合并操作符一起使用
fun permissionSystem(username: String, pwd: String) = username.takeIf {
    username == "hello" && pwd == "123"
}?:"login failed"

/// takeUnless 和 takeIf相反，通常配合isNullOrBlank()一起使用
fun takeUnlessFunc(username: String?) {
    username.takeUnless { it.isNullOrBlank() } ?: "not init"
    username.takeIf { !it.isNullOrBlank() } ?: "not init"
}