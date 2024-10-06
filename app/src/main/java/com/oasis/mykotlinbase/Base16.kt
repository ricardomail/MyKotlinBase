package com.oasis.mykotlinbase
/// 对象表达式
open class Base16 {
    open fun add(info: String) = println("Base16 add: $info")
    open fun del(info: String) = println("Base16 del: $info")
}

fun main() {
    /*匿名对象表达式*/
    val p = object : Base16(){
        override fun add(info: String) {
            println("匿名 add: $info")
        }

        override fun del(info: String) {
            println("匿名 del: $info")
        }
    }
    p.add("hello")
    p.add("oasis")
    val c = Child()
    c.add("hello")
    c.add("oasis")

    // 用对象表达式处理Java接口
    val r = object : Runnable{
        override fun run() {

        }
    }
    // java的方式
    Runnable {

    }
}

class Child: Base16(){
    override fun add(info: String) {
        println("具名 add: $info")
    }

    override fun del(info: String) {
        println("具名 del: $info")
    }
}