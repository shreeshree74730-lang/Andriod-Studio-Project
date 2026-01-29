package com.example.eldersupport

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val parentBtn = findViewById<Button>(R.id.btnParent)
        val elderBtn = findViewById<Button>(R.id.btnElder)

        parentBtn.setOnClickListener {
            startActivity(Intent(this, ParentLoginActivity::class.java))
        }

        elderBtn.setOnClickListener {
            startActivity(Intent(this, ElderHomeActivity::class.java))
        }
    }
}
