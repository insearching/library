package com.insearching.core

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object {
        private const val CONFIGURATION = "CONFIG"

        fun createIntent(context: Context, configuration: String): Intent =
            Intent(context, MainActivity::class.java).apply {
                putExtra(CONFIGURATION, configuration)
            }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.message).text = intent.extras?.getString(CONFIGURATION) ?: ""
    }
}