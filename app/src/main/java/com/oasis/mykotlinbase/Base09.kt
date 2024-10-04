package com.oasis.mykotlinbase

fun main() {

}

// map
fun mapFunc() {
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

}