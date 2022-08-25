package com.insearching.library

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.insearching.core.MainActivity

class DemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)

        findViewById<Button>(R.id.button).setOnClickListener {
            startActivity(MainActivity.createIntent(this, """{"configuration":"demo"}""""))
        }
    }
}