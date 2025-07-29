package com.test.kmpdemo3_storage

interface KMMContext {
    fun putInt(key: String, value: Int)
    fun putString(key: String, value: String)
    fun putBool(key: String, value: Boolean)
    fun getInt(key: String, default: Int): Int
    fun getString(key: String): String?
    fun getBool(key: String, default: Boolean): Boolean
}
