package com.oasis.mykotlinbase

/**
 * 类的扩展
 * 由于类的扩展是静态的，因此在编译出现歧义时，只会取决于型参的函数
 * 如果类本身就有同名函数，扩展将失效
 * 如果是重载的形式是可以的，因为参数列表不一样
 *
 * 可以在顶层进行扩展，也可以在类中定义别的类的扩展
 *
 * 命名发生冲突时
 * class A {
 *     fun hello() = "hello"
 * }
 *
 * class B(private val a: A) {
 *     private fun A.test(){
 *         hello() // A
 *         this.hello() // A
 *         this@B.hello() // 调用B中的hello
 *     }
 *
 *     private fun hello() = ""
 * }
 *
 *
 */
open class Base33 {
    fun hello() {
        println("hello world")
    }
}
class Child3: Base33()
fun Child3.test(){
    println("child3")
}



fun Base33.test() {
    // this表示当前对象(Base33)
//    this.hello()
    println("base33")
}

var Base33.sex: Boolean
    get() = true
    set(value) {

    }

fun process(base: Base33) {
    base.test()
}



fun main() {
    process(Child3())
}