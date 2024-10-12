package com.oasis.mykotlinbase

/**
 * 范型
 * 创建对象时再来明确具体使用什么类型，如果明确使用类型，就不需要使用范型
 * 可以一次性指定多个范型参数
 * 接口，抽象类，函数都支持范型
 *
 */
class Base34 {
}

open class Score<T>(val name: String, val value: T) {

    fun test() {
        val v: Any? = value
    }
}

// 子类可以指定具体类型，也可以继续使用范型来代替
class A(name: String, value: Int): Score<Int>(name, value)
class B<V>(name: String, value: V): Score<V>(name, value)

private fun <T> match(t: T): T = t

private fun <T> catch(content: T, block: T.() -> Unit) {
    content.block()
}

fun main() {
    val score = Score("math", 110)
    val score2 = Score<String>("math", "well")

    score2.run {  }
    println(score.value)
    println(score2.value)
    catch<Int>(1) {
        println(this)
    }
    catch<Int>(2) {
        println(this)
    }

}