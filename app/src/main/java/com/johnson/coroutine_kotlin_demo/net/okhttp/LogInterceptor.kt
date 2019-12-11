package cn_rt.ids.net.okhttp

import com.orhanobut.logger.Logger
import okhttp3.*

import java.io.IOException

/**
 * OkHttp 日志拦截器
 */

class LogInterceptor : Interceptor {

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        //请求体
        val request = chain.request()
        //返回参数
        val response = chain.proceed(chain.request())
        val mediaType = response.body()?.contentType()
        val content = response.body()!!.string()
        if ("POST" == request.method()) {
            val sb = StringBuilder()
            if (request.body() is FormBody) {
                val body = request.body() as FormBody?
                for (i in 0 until body!!.size()) {
                    sb.append(body.encodedName(i) + "=" + body.encodedValue(i) + "\n")
                }
                sb.delete(sb.length - 1, sb.length)
                Logger.i(
                    "请求地址:\n" + response.request().url().toString() + "\n\n" +
                            "请求参数体:\n" + sb.toString() + "\n\n" +
                            "返回参数:\n" + content
                )
            }
        }
        Logger.json(content)
        return response.newBuilder()
            .body(ResponseBody.create(mediaType, content))
            .build()
    }
}