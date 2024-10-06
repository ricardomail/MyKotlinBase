package com.oasis.mykotlinbase

// 密封类

sealed class Exams{
    object Fraction1: Exams()
    object Fraction2: Exams()
    object Fraction3: Exams()
    class Fraction4(val studentName: String): Exams()
}

class Teacher(private val exams: Exams) {
    fun show() = when(exams) {
        is Exams.Fraction1 -> "1"
        is Exams.Fraction2 -> "2"
        is Exams.Fraction3 -> "3"
        is Exams.Fraction4 -> exams.studentName
    }
}

fun main() {
    println(Teacher(Exams.Fraction1).show())
    println(Teacher(Exams.Fraction2).show())
    println(Teacher(Exams.Fraction3).show())
    println(Teacher(Exams.Fraction4("张三")).show())
}

