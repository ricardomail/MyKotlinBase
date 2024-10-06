package com.oasis.mykotlinbase

// 枚举
enum class Week {
    星期1, 星期2, 星期3, 星期4, 星期5, 星期6, 星期7,
}

class LimbsInfo(val limbsInfo: String, val length: Int) {
    fun show() {
        println("${limbsInfo}的长度是:${length}")
    }
}

// 主构造参数必须和枚举的参数保持一致
enum class Limbs(private val limbsInfo: LimbsInfo) {
    LEFT_HAND(LimbsInfo("左手", 88)), RIGHT_HAND(LimbsInfo("右手", 88)), LEFT_FOOT(
        LimbsInfo(
            "左脚", 140
        )
    ),
    RIGHT_FOOT(LimbsInfo("右脚", 140));

    fun show() {
        println("${limbsInfo.limbsInfo}的长度是:${limbsInfo.length}")
    }
}

fun main() {
    println(Week.星期1.ordinal)
    Limbs.LEFT_FOOT.show()
}