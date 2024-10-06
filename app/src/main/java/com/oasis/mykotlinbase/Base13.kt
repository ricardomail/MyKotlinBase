package com.oasis.mykotlinbase

/*延时初始化*/
// lateinit在使用的时候需要手动设置
// by lazy 在使用的时候自动加载
class Base13 {
    lateinit var name: String
    val databaseData by lazy { readSql() }

    private fun readSql(): Any {
        println("开始获取数据")
        return "data"
    }

    fun request() {
        if (::name.isInitialized) {
            println(name)
        }else {
            println("123")
        }

    }
}


fun main() {
    Thread.sleep(3000)
    println(Base13().databaseData)
}