package com.johnson.coroutine_kotlin_demo.net

/**
 * @ClassName HandleErrorSubscriber
 * @Description TODO
 * @Author Johnson
 * @Date 2019-08-23 12:48
 */

import android.util.Log
import android.widget.Toast
import com.johnson.coroutine_kotlin_demo.MyApplication
import com.johnson.coroutine_kotlin_demo.R
import io.reactivex.observers.DisposableObserver
import java.net.SocketTimeoutException

/**
 * @ClassName HandleErrorSubscriber
 * @Description TODO
 * @Author WangShunYi
 * @Date 2019/6/22 14:07
 */
abstract class HandleErrorSubscriber<T> : DisposableObserver<T>() {
    override fun onComplete() {
    }

    override fun onNext(response: T) {
        /*(response as BaseResponse<T>)?.run {
            Log.d("---", "网络请求返回码$code")
            Log.d("---", "网络请求返回data" + response.data)
        }*/
        onSuccess(response)
    }

    override fun onError(e: Throwable) {
        when (e) {
            is SocketTimeoutException -> {
                runUIHandler{
                    Toast.makeText(MyApplication.context, R.string.timeout, Toast.LENGTH_SHORT).show()
                }
                println("---------->"+ e.message)
            }
            else -> {
                runUIHandler{
                    Toast.makeText(MyApplication.context, e.message, Toast.LENGTH_SHORT).show()
                }
                Log.v("TAG", "灵异事件：" + e.message)
                println("---------->" + e.message)
            }
        }
    }

    abstract fun runUIHandler(any: Any)


    abstract fun onSuccess(response: T)

}