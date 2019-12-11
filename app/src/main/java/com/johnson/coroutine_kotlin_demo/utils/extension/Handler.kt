package com.johnson.coroutine_kotlin_demo.utils.extension

import android.os.Handler
import android.os.Looper

/**
 * @ClassName Handler
 * @Description TODO
 * @Author WangShunYi
 * @Date 2019-12-11 11:09
 */
fun runUIHandler(function: () -> Unit){
    Handler(Looper.getMainLooper()).post {
        function.invoke()
    }
}