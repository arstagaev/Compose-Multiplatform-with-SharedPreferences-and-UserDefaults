package com.test.kmpdemo3_storage

import platform.Foundation.NSUserDefaults

/** Implementation backed by NSUserDefaults */
class IosKMMContext : KMMContext {
    private val ud = NSUserDefaults.standardUserDefaults()

    override fun putInt(key: String, value: Int) =
        ud.setInteger(value.toLong(), key)

    override fun putString(key: String, value: String) =
        ud.setObject(value, key)

    override fun putBool(key: String, value: Boolean) =
        ud.setBool(value, key)

    override fun getInt(key: String, default: Int): Int =
        ud.integerForKey(key).toInt().takeIf { it != 0 } ?: default

    override fun getString(key: String): String? =
        ud.stringForKey(key)

    override fun getBool(key: String, default: Boolean): Boolean =
        ud.boolForKey(key)
}