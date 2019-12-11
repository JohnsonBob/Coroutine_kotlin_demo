package com.johnson.coroutine_kotlin_demo

import android.util.Log
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.runner.AndroidJUnit4
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.johnson.coroutine_kotlin_demo", appContext.packageName)
    }

   /* @Test
    fun testOneCoroutine() {
        Log.d("AA", "协程初始化开始，时间: " + System.currentTimeMillis())

        GlobalScope.launch {
            Log.d("AA", "协程初始化完成，时间: " + System.currentTimeMillis())
            for(i in 1..3){
                Log.d("AA", "协程任务1打印第$i 次，时间: " + System.currentTimeMillis())
            }
            delay(500)
            for(i in 1..3){
                Log.d("AA", "协程任务2打印第$i 次，时间: " + System.currentTimeMillis())
            }
        }

        Log.d("AA", "主线程 sleep ，时间: " + System.currentTimeMillis())

        Thread.sleep(1000)
        Log.d("AA", "主线程运行，时间: " + System.currentTimeMillis())

        for (i in 1..3) {
            Log.d("AA", "主线程打印第$i 次，时间: " + System.currentTimeMillis())
        }
    }*/

    @Test
    fun testTwoCoroutine(){
        GlobalScope.launch(Dispatchers.Unconfined) {
            for (i in 1..6) {
                Log.d("AA", "协程任务打印第$i 次，时间: ${System.currentTimeMillis()}")
            }
        }

        for (i in 1..8) {
            Log.d("AA", "主线程打印第$i 次，时间:  ${System.currentTimeMillis()}")
        }
    }
}
