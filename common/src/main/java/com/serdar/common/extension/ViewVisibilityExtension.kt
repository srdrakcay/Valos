package com.serdar.common.extension

import android.view.View

fun View.show() {
    visibility = View.VISIBLE
}

fun View.notShow() {
    visibility = View.GONE
}