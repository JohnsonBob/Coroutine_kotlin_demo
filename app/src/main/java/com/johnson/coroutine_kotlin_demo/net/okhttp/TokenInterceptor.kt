package com.johnson.coroutine_kotlin_demo.net.okhttp

import android.text.TextUtils
import android.util.Log
import okhttp3.Interceptor
import okhttp3.Response

import java.io.IOException

/**
 * OkHttp Token拦截器
 */

class TokenInterceptor constructor(val getToken: () -> String) : Interceptor {
    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {

        val original = chain.request()
        val token = getToken()
        //String token = "Basic q35ZPlMeIpHhPYfnLXZVQSrlDZN0eCqNLmSvUpxDWBNb9kf49qXwoqW4z5BAFyxnhrq4JUYT";
        Log.v("token:", token)
        val request = original.newBuilder()
            .apply {
                if (TextUtils.isEmpty(token))
                header("Authorization", "Bearer $token")
            }
            .header("Accept", "application/json")
            .header("Content-Type", "application/json")
            .header("OCS-APIRequest", "true")
            .build()
        return chain.proceed(request)
    }
}
