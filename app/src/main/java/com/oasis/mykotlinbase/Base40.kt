package com.oasis.mykotlinbase

import com.oasis.mykotlinbase.internal.Inter
import kotlin.properties.Delegates

/**
 * 委托模式
 * 除了类可以委托给其他对象之外，类的成员属性也可以委托给其他对象
 */

fun interface Base {
    fun print()
}

class BaseImpl: Base{
    override fun print() = println("hello")
}
// 类的委托
class BaseChild(b: Base): Base by b {

    /**
     * 对成员属性使用观察者模式
     */
    var p: String by Delegates.observable("init") {
        property, oldValue, newValue ->
        println("property $property old: $oldValue, new $newValue")
    }
}

fun main() {
    val base: Base = BaseImpl()
    val child = BaseChild(base)
    child.p = "hahah"
}
