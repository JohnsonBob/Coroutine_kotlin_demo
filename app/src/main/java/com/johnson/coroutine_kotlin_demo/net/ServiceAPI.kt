package com.johnson.coroutine_kotlin_demo.net

import com.johnson.coroutine_kotlin_demo.net.https.SSLSocketClient
import cn_rt.ids.net.okhttp.LogInterceptor
import com.johnson.coroutine_kotlin_demo.net.okhttp.TokenInterceptor
import com.johnson.coroutine_kotlin_demo.utils.Global
import com.facebook.stetho.okhttp3.StethoInterceptor
import com.google.gson.Gson
import com.johnson.coroutine_kotlin_demo.BuildConfig
import com.johnson.coroutine_kotlin_demo.utils.PrefUtils
import com.johnson.coroutine_kotlin_demo.utils.extension.CoroutineCallAdapterFactory
import com.ruiting.kanglong.net.ApiService
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * @ClassName ServiceAPI
 * @Description TODO
 * @Author WangShunYi
 * @Date 2019-11-14 09:57
 */
object ServiceAPI {
    val apiService: ApiService
    val host: String
        get() {
            return "http://" + PrefUtils.getString("meetingHost", Global.meetingHost)
        }

    init {
        apiService = Retrofit.Builder()
            .baseUrl("$host/")
            .addConverterFactory(GsonConverterFactory.create(Gson()))
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .client(getOkHttpClient())
            .build()
            .create(ApiService::class.java)
    }

    private fun getOkHttpClient(): OkHttpClient {
        return OkHttpClient().newBuilder()
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(15, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
            .addInterceptor(LogInterceptor())
            .addInterceptor(TokenInterceptor {
                PrefUtils.getString("token", "")
            })
            .sslSocketFactory(SSLSocketClient.sslSocketFactory)//忽略https证书，不需要https可以不写
            .hostnameVerifier(SSLSocketClient.hostnameVerifier)//忽略https证书，不需要https可以不写
            .apply {
                //debug模式启用Stetho
                if (BuildConfig.DEBUG)
                    addNetworkInterceptor(StethoInterceptor()).build()
            }
            .build()
    }
}