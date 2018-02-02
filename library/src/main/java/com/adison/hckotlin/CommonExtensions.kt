package com.adison.hckotlin

import android.os.Build

/**
 * 指定最低系统版本执行函数
 * @param version 最低系统版本
 * @param function 需要执行的函数
 */
inline fun ifAtLeast(version: Int, function: () -> Unit) {
    if (Build.VERSION.SDK_INT >= version) {
        function()
    }
}

fun <T> lazyFast(operation: () -> T): Lazy<T> = lazy(LazyThreadSafetyMode.NONE) {
    operation()
}



