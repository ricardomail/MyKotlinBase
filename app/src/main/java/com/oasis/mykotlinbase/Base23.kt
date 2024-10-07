package com.oasis.mykotlinbase

/***接口
 *接口没有构造
 * 实现类要实现函数于成员
 *
 * */

interface IUsb {
    var usbVersionInfo: String
    var usbInsertDevice: String

    fun insert(): String
}

interface IUsb2 {
    // 接口时var，也是不能给接口成员赋值
    var usbVersionInfo: String

    var usbInsertDevice: String

    fun insert(): String
}

class Mouse(override var usbInsertDevice: String, override var usbVersionInfo: String) : IUsb {
    override fun insert(): String {
        return "$usbInsertDevice $usbVersionInfo"
    }

}