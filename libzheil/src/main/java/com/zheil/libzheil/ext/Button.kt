package com.zheil.libzheil.ext

import android.widget.Button


fun Button.click(onClick: () -> Unit) {
    this.setOnClickListener { onClick() }
}