package com.zheil.libzheil.ext

import android.util.Log


fun logd(message: String) {
    Log.d("AppLog", message)
}

fun logd(tag: String, message: String) {
    Log.d(tag, message)
}