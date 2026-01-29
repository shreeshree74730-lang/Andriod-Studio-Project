package com.example.eldersupport

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ElderHomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elder_home)

        val btnMedicine = findViewById<Button>(R.id.btnMedicine)

        btnMedicine.setOnClickListener {
            val intent = Intent(this, MedicineActivity::class.java)
            startActivity(intent)
        }
    }
}
