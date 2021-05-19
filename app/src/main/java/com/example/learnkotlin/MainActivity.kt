package com.example.learnkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val openBirthdayButton : Button = findViewById(R.id.birthdayButton)
        openBirthdayButton.setOnClickListener {
            val toast: Toast = Toast.makeText(this, "Going to Birthday Page", Toast.LENGTH_SHORT)
            toast.show()

            val intent = Intent(this, BirthdayScreen::class.java)
            startActivity(intent)
        }
    }
}