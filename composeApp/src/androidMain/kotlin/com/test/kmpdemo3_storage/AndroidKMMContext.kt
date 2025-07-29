package com.test.kmpdemo3_storage

import android.content.SharedPreferences

/** Implementation backed by Android SharedPreferences */
class AndroidKMMContext(private val prefs: SharedPreferences) : KMMContext {
    override fun putInt(key: String, value: Int)     = prefs.edit().putInt(key, value).apply()
    override fun putString(key: String, value: String) = prefs.edit().putString(key, value).apply()
    override fun putBool(key: String, value: Boolean)  = prefs.edit().putBoolean(key, value).apply()

    override fun getInt(key: String, default: Int): Int       = prefs.getInt(key, default)
    override fun getString(key: String): String?              = prefs.getString(key, null)
    override fun getBool(key: String, default: Boolean): Boolean = prefs.getBoolean(key, default)
}