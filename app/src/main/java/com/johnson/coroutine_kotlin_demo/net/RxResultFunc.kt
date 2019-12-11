package com.johnson.coroutine_kotlin_demo.net


import cn_rt.ids.net.BaseResponse
import io.reactivex.functions.Function

/**
 * Created by Anonymous on 2017/4/6.
 */

class RxResultFunc<T> : Function<BaseResponse<T>, T> {

    @Throws(Exception::class)
    override fun apply(tBaseResponse: BaseResponse<T>): T {
        if (tBaseResponse.code != "0") {
            throw RxApiException(tBaseResponse.code, tBaseResponse.message)
        }
        return tBaseResponse.data
    }
}

