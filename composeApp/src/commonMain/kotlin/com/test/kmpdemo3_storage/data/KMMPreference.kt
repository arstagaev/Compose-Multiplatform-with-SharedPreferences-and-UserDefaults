package com.test.kmpdemo3_storage.data

interface KMMContext {
  fun setInt(key: String, value: Int)
  fun setString(key: String, value: String)
  fun setBool(key: String, value: Boolean)

  fun getInt(key: String, default: Int): Int
  fun getString(key: String): String?
  fun getBool(key: String, default: Boolean): Boolean
}

/** Wrapper you’ll inject everywhere */
class KMMPreference(private val context: KMMContext) {
  fun put(key: String, value: Int)     = context.setInt(key, value)
  fun put(key: String, value: String)  = context.setString(key, value)
  fun put(key: String, value: Boolean) = context.setBool(key, value)

  fun getInt(key: String, default: Int): Int       = context.getInt(key, default)
  fun getString(key: String): String?              = context.getString(key)
  fun getBool(key: String, default: Boolean): Boolean = context.getBool(key, default)
}