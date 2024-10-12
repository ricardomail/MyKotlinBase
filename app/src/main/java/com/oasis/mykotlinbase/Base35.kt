package com.oasis.mykotlinbase

/**
 * 协变和逆变
 * 默认抗变类型 Test<Int>和Test<Number>没有关系
 *
 * 协变(out)： 因为Int时Number的子类，所以Test<Int>同样是Test<Number>的子类，可以直接转换
 * 逆变(in)： 和上面相反，Test<Number>可以直接转换为Test<Int>前者是后者的父类
 *
 *
 * 范型界限
 * 类型擦除
 *  范型的类型检查只存在于编译阶段，编译成源代码后不会被保留
 *  内联函数编译时会使用当时用的具体类型，内联函数还有一个功能是可以使用具化的类型参数(reified) 允许在函数体内部检测范型类型
 *
 */

class Base35<T>(var data: T)

fun main() {
    // 不允许setter/当作参数，生产者
    val test1: Base35<Int> = Base35(10)
    val test2: Base35<out Number> = test1 // ? extend Number
    // 不允许getter/返回值，消费者
    val test3: Base35<Any> = Base35(10)
    val test4: Base35<in Number> = test3 // ? super Number

    // 协变使用时
    val v1: Number = test2.data
    // 逆变使用时
    val v2: Any? = test4.data

    val score = Score2("", 123)
    val score2 = Score2("", 123.33)
    val score3 = Score3("", 123.33)

    println(isType<Number>(123))
}

/**
 * 范型界限
 */
class Score2<T: Number>(val name: String, val value: T)
// 设置多个上界
class Score3<T>(val name: String, val value: T) where T: Number, T: Comparable<T>

// 也可以在定义类的时候直接将类型参数指定为out/in来使其协变或逆变
interface Inter1<out T>{
    fun test(): T // T类型只能作为返回值
}

interface Inter2<in T>{
    fun test2(t: T) // T类型只能作为参数
}

inline fun <reified T> isType(value: Any?) : Boolean{
    return value is T
}
