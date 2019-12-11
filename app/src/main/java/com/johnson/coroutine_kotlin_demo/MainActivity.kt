package com.johnson.coroutine_kotlin_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import cn_rt.ids.net.BaseResponse
import com.johnson.coroutine_kotlin_demo.net.ServiceAPI
import com.johnson.coroutine_kotlin_demo.utils.load
import com.johnson.coroutine_kotlin_demo.utils.then
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        testOneCoroutine()
        loadData()
    }

    private fun loadData() {
        load {
            /*try {
                ServiceAPI.apiService.getWeatherAsync()
            } catch (e: Exception) {
                val a = 10
            }*/
            Log.d("AA", "时间1:  ${System.currentTimeMillis()}")
            ServiceAPI.apiService.getWeatherAsync().await()
        } then {
            Log.d("AA", "时间2:  ${System.currentTimeMillis()}")
            tv_text.text = it.toString()
        }


        /*GlobalScope.launch(Dispatchers.IO) {
            Log.d("AA", "时间1:  ${System.currentTimeMillis()}")
            val weatherAsync = ServiceAPI.apiService.getWeatherAsync()
            Log.d("AA", "时间2:  ${System.currentTimeMillis()}")

            val await = try {
                weatherAsync.await()
            } catch (e: Exception) {
                e
            }
            Log.d("AA", "时间3:  ${System.currentTimeMillis()}")
            launch(Dispatchers.Main) {
                Log.d("AA", "时间4:  ${System.currentTimeMillis()}")
                tv_text.text = await.toString()
            }
        }*/
    }

    private fun testOneCoroutine() {
        Log.d("AA", "协程初始化开始，时间: " + System.currentTimeMillis())

        GlobalScope.launch {
            Log.d("AA", "协程初始化完成，时间: " + System.currentTimeMillis())
            for (i in 0..3) {
                Log.d("AA", "协程任务1打印第$i 次，时间: " + System.currentTimeMillis())
            }
            delay(500)
            for (i in 0..3) {
                Log.d("AA", "协程任务2打印第$i 次，时间: " + System.currentTimeMillis())
            }
        }

        Log.d("AA", "主线程 sleep ，时间: " + System.currentTimeMillis())

        Thread.sleep(1000)
        Log.d("AA", "主线程运行，时间: " + System.currentTimeMillis())

        for (i in 1..3) {
            Log.d("AA", "主线程打印第$i 次，时间: " + System.currentTimeMillis())
        }

        runBlocking {
            delay(50000L)
        }
    }


}
