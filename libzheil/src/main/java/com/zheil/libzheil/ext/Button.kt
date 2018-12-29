package com.zheil.libzheil.ext

import android.widget.Button


fun Button.OnClick(onClick: ()-> Unit) {
    this.setOnClickListener { onClick() }
}