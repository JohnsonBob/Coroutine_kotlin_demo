package com.johnson.coroutine_kotlin_demo.net.https

import javax.net.ssl.*
import java.security.SecureRandom
import java.security.cert.X509Certificate

/**
 * Created by Anonymous on 2017/6/13.
 */

object SSLSocketClient {

    //获取这个SSLSocketFactory
    val sslSocketFactory: SSLSocketFactory
        get() {
            try {
                val sslContext = SSLContext.getInstance("SSL")
                sslContext.init(null, trustManager, SecureRandom())
                return sslContext.socketFactory
            } catch (e: Exception) {
                throw RuntimeException(e)
            }

        }

    //获取TrustManager
    private val trustManager: Array<TrustManager>
        get() = arrayOf(object : X509TrustManager {
            override fun checkClientTrusted(chain: Array<X509Certificate>, authType: String) {}

            override fun checkServerTrusted(chain: Array<X509Certificate>, authType: String) {}

            override fun getAcceptedIssuers(): Array<X509Certificate> {
                return arrayOf()
            }
        })

    //获取HostnameVerifier
    val hostnameVerifier: HostnameVerifier
        get() = HostnameVerifier { _, _ -> true }
}
