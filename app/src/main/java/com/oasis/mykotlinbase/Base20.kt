package com.oasis.mykotlinbase
/*运算符重载*/

data class AddClass2(val number1: Int, val number2: Int) {
    operator fun plus(p: AddClass2): Int{
        return number1 + p.number1 + number2 + p.number2
    }
}

fun main() {
    println(AddClass2(1, 2) + AddClass2(1, 2))
}