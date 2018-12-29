package com.zheil.libzheil.ext

import android.widget.EditText


fun EditText.ifFocus(onHasFocus: () -> Unit) {
    this.setOnFocusChangeListener { _, hasFocus ->
        if (hasFocus) {
            onHasFocus()
        }
    }
}

fun EditText.ifFocusElse(onHasFocus: () -> Unit, onNotFocus: () -> Unit) {
    this.setOnFocusChangeListener { _, hasFocus ->
        if (hasFocus) {
            onHasFocus()
        } else {
            onNotFocus()
        }
    }
}