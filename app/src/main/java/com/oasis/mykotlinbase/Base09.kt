package com.oasis.mykotlinbase

fun main() {

}

// map
fun mapFunc() {
    val pair: Pair<Int, Int> = 1 to 1 // 键值对类型
    val map: Map<String, Double> = mapOf("hello" to 131.4)
    val map2: Map<String, Double> = mapOf(Pair("hello", 123.3))
    val map3: MutableMap<String, Double> = mutableMapOf()
    map3["hello"] = 321.0
    map.forEach{
        it.key
        it.value
    }

    map.forEach { (s, d) ->

    }

//    map3.getOrPut() 如果map中没有先添加，然后再拿取

    // val old = map.pt(10003, Student("","")) put的返回值如果没有覆盖元素则返回null，否则返回被覆盖的元素
    // 可以通过key移除 map.remove(key)
    // 可以批量移除 map -= key map -= listOf(key1, key2)
    // 可以通过values移除 map.values.remove(value) 整个key value都会被移除，如果重写了hashCode,equals，则会按顺序移除第一个

}