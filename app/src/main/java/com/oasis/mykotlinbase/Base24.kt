package com.oasis.mykotlinbase

/**
 * 抽象类
 */
abstract class BaseActivity() {
    fun create() {
        setContentView()
    }

    abstract fun setContentView()
}

class Child2(): BaseActivity(){

    override fun setContentView() {

    }
}