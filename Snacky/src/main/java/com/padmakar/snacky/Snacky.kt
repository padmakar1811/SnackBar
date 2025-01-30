package com.padmakar.snacky

import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar


object Snacky {
    fun showSnackbar(view: View, message: String) {
        val snackbar = Snackbar.make(view, message, Snackbar.LENGTH_LONG)
        val snackbarView = snackbar.view

        // Set text color
        val textView = snackbarView.findViewById(com.google.android.material.R.id.snackbar_text) as? TextView
        textView?.setTextColor(ContextCompat.getColor(view.context, android.R.color.white))

        // Set position
        val params = snackbarView.layoutParams as? FrameLayout.LayoutParams
        params?.gravity = Gravity.BOTTOM
        snackbarView.layoutParams = params

        snackbar.show()
    }
}