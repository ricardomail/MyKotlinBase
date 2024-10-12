package com.oasis.mykotlinbase

/**
 * 序列，用的时候才会生成元素，可以优化处理流程，执行次数减少，并且，使用序列后只有我们从序列读取数据的时候才会执行我们定义
 * 好的工序
 * 数据量庞大的情况下，使用序列会优化处理
 *
 */

fun main() {
    val sequence: Sequence<Int> = generateSequence {
        10
    }
}