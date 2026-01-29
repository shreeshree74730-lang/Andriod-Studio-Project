package com.example.eldersupport

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MedicineActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medicine)

        val etMedicineName = findViewById<EditText>(R.id.etMedicineName)
        val btnSelectTime = findViewById<Button>(R.id.btnSelectTime)
        val btnSaveReminder = findViewById<Button>(R.id.btnSaveReminder)

        btnSelectTime.setOnClickListener {
            Toast.makeText(this, "Select Time clicked", Toast.LENGTH_SHORT).show()
        }

        btnSaveReminder.setOnClickListener {
            if (etMedicineName.text.toString().isEmpty()) {
                Toast.makeText(this, "Enter medicine name", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Reminder saved (test)", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
