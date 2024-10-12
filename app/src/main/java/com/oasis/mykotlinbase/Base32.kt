package com.oasis.mykotlinbase

/**
 * 封装
 *  1. 为了保证变量的安全性，使用者不必在一具体实现细节，
 *  只是通过外部接口即可访问成员，如果不进行封装，类中的实例变量可以直接查看和修改
 *  默认属性为private，但会提供setter getter方法，手动添加private后，取消setter getter方法
 *
 * 继承
 *  1. 使用open关键字
 *  2. 单继承
 * 多态
 */

class Base32(private var name: String, age: Int){
    var age: Int = age
        private set(value) {
            field = value
        }
        get() = age

//    fun getName(): String = name
}




