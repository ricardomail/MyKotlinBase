package com.oasis.mykotlinbase.internal

sealed class Inter {
    data class C(var number: Number): Inter()
}
data class A(var number: Number): Inter()
data class B(var number: Number): Inter()

fun main() {
    val a: Inter = A(123)
    when(a) {
        is A -> {}
        is B -> {}
        is Inter.C -> {}
    }
}