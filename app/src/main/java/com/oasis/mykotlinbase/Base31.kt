package com.oasis.mykotlinbase

/**
 * 空值和空类型
 * 所有的类型在默认情况下都是非空类型，不能被赋值为null
 *
 * 解构声明, 让参数获取更加方便，不需要某个参数的时候直接使用_代替
 *
 *
 * 访问空值权限
 * private(私有，在类中只能被当前类使用，文件中只能本文件使用)
 * protected(允许子类使用)
 * internal(同一模块可见，限制在当前的项目内，同一个项目和public一致)
 * public(默认)
 */

class Base31(val name: String, val age: Int) {
    operator fun component1() = name

    operator fun component2() = age

    fun b(){
        prtest()
    }
    private fun prtest() {

    }
}



fun main() {
    val (a, b) = Base31("aaa", 18)
    println("$a $b")
    // 同样解构也可以用在lambda表达式中
    val func: (Base31) -> Unit = {
        (a, b) ->
    }
}