package com.oasis.mykotlinbase
/*超类Any
kt中所有类都隐式继承Any
*/
class Base15 {

}
/// 改成object后，既是单例的实例，也是类名,只有一个创建
object Single{
    /**
     * 内部的Java实现：
     *
     * public static final Single INSTANCE = new Single();
     *
     * private Single() {}
     * */

    init {
        // 初始化代码块会生成一个静态代码块
        /*
        * static {
                    System.out.println();
            }
        * */
        println()
    }

    val info = ""
}

fun main() {
    Single
}