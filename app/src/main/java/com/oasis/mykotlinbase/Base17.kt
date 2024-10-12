package com.oasis.mykotlinbase

class Base17(val name: String) {
    // kt中用伴生来代替Java中的静态成员
    // 如果一个类既想当普通类使用，又想当单例使用就用伴生对象
    companion object {
        val info = "info"

        fun showInfo() = println(info)
    }
}

fun main() {
    Base17.info
    Base17.Companion.info
    Base17.Companion.showInfo()
}