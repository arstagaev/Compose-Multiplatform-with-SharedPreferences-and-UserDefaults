package com.test.kmpdemo3_storage

interface KMMContext {
    fun setInt(key: String, value: Int)
    fun setString(key: String, value: String)
    fun setBool(key: String, value: Boolean)

    fun getInt(key: String, default: Int): Int
    fun getString(key: String): String?
    fun getBool(key: String, default: Boolean): Boolean
}
