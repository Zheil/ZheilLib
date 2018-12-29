package com.zheil.libzheil.ext

import android.app.Activity
import android.widget.Toast


fun Activity.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun Activity.toast(messageId: Int) {
    Toast.makeText(this, getString(messageId), Toast.LENGTH_LONG).show()
}