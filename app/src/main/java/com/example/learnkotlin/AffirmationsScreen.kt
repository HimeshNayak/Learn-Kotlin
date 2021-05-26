package com.example.learnkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

import com.example.learnkotlin.data.DataSource

class AffirmationsScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_affirmations_screen)

        val textView: TextView = findViewById(R.id.lengthText)
        textView.text = DataSource().loadAffirmations().size.toString()

    }
}