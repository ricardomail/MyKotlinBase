package com.oasis.mykotlinbase

/**
 * 运算符重载
 */

class Base30 (private var value: Int){

    operator fun plusAssign(value: Base30) {
        this.value += value.value
    }

    override fun toString(): String {
        return "value $value"
    }

    operator fun inc(): Base30{
        return Base30(this.value++)
    }

    operator fun contains(value: String): Boolean{
        return true
    }

    /**
     * 比较运算符
     */
    operator fun compareTo(base: Base30) : Int{
        return this.value - base.value
    }

    operator fun invoke(){

    }

}

fun main(){
    val base = Base30(20)
    base += Base30(19)
    println(base.toString())
}