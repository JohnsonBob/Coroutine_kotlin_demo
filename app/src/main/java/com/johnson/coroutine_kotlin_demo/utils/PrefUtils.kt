package com.johnson.coroutine_kotlin_demo.utils

import android.content.Context
import android.content.Context.MODE_PRIVATE
import com.johnson.coroutine_kotlin_demo.MyApplication


/**
 * @ClassName PrefUtils
 * @Description TODO
 * @Author WangShunYi
 * @Date 2019-12-11 11:20
 */
object PrefUtils {

    private const val SHARE_PREFS_NAME = "coroutine_kotlin_demo"

    fun putBoolean(ctx: Context, key: String, value: Boolean) {
        val pref = ctx.getSharedPreferences(
            SHARE_PREFS_NAME,
            MODE_PRIVATE
        )

        pref.edit().putBoolean(key, value).apply()
    }

    fun getBoolean(
        ctx: Context, key: String,
        defaultValue: Boolean
    ): Boolean {
        val pref = ctx.getSharedPreferences(
            SHARE_PREFS_NAME,
            MODE_PRIVATE
        )

        return pref.getBoolean(key, defaultValue)
    }

    fun putString(ctx: Context, key: String, value: String) {
        val pref = ctx.getSharedPreferences(
            SHARE_PREFS_NAME,
            MODE_PRIVATE
        )

        pref.edit().putString(key, value).apply()
    }

    fun getString(ctx: Context, key: String, defaultValue: String): String {
        val pref = ctx.getSharedPreferences(
            SHARE_PREFS_NAME,
            MODE_PRIVATE
        )

        return pref.getString(key, null) ?: defaultValue
    }

    fun putInt(ctx: Context, key: String, value: Int) {
        val pref = ctx.getSharedPreferences(
            SHARE_PREFS_NAME,
            MODE_PRIVATE
        )

        pref.edit().putInt(key, value).apply()
    }

    fun getInt(ctx: Context, key: String, defaultValue: Int): Int {
        val pref = ctx.getSharedPreferences(
            SHARE_PREFS_NAME,
            MODE_PRIVATE
        )

        return pref.getInt(key, defaultValue)
    }

    fun putString(key: String, value: String) {
        val pref = MyApplication.context.getSharedPreferences(
            SHARE_PREFS_NAME,
            MODE_PRIVATE
        )
        pref.edit().putString(key, value).apply()
    }

    fun getString(key: String, defaultValue: String): String {
        val pref = MyApplication.context.getSharedPreferences(
            SHARE_PREFS_NAME,
            MODE_PRIVATE
        )

        return pref.getString(key, null) ?: defaultValue
    }

    fun putFloat(key: String, value: Float?) {
        val pref = MyApplication.context.getSharedPreferences(
            SHARE_PREFS_NAME,
            MODE_PRIVATE
        )
        pref.edit().putFloat(key, value!!).apply()
    }

    fun getFloat(key: String, defaultValue: Float?): Float {
        val pref = MyApplication.context.getSharedPreferences(
            SHARE_PREFS_NAME,
            MODE_PRIVATE
        )

        return pref.getFloat(key, defaultValue!!)
    }


}
