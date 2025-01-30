package com.padmakar.customsnackbar

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.padmakar.snacky.Snacky

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val rootView: View = findViewById(R.id.rootView)

        val button = findViewById<Button>(R.id.btn_snackbar)

        button.setOnClickListener {
            Snacky.showSnackbar(rootView, "Hello EveryOne")
        }
    }
}