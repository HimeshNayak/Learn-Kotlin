package com.example.learnkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.learnkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.birthdayButton.setOnClickListener {
            val toast: Toast = Toast.makeText(this, "Going to Birthday Page", Toast.LENGTH_SHORT)
            toast.show()

            val intent = Intent(this, BirthdayScreen::class.java)
            startActivity(intent)
        }

        binding.diceButton.setOnClickListener {
            val toast: Toast = Toast.makeText(this, "Going to Dice Page", Toast.LENGTH_SHORT)
            toast.show()

            val intent = Intent(this, DiceScreen::class.java)
            startActivity(intent)
        }

        binding.tipButton.setOnClickListener {
            val toast: Toast = Toast.makeText(this, "Going to Tip Calculate Page", Toast.LENGTH_SHORT)
            toast.show()

            val intent = Intent(this, TipCalculate::class.java)
            startActivity(intent)
        }

        binding.affirmationsButton.setOnClickListener {
            val toast: Toast = Toast.makeText(this, "Going to Affirmations Screen", Toast.LENGTH_SHORT)
            toast.show()

            val intent = Intent(this, AffirmationsScreen::class.java)
            startActivity(intent)
        }

        binding.wordGameButton.setOnClickListener {
            val toast: Toast = Toast.makeText(this, "Going to Word Game Screen", Toast.LENGTH_SHORT)
            toast.show()

            val intent = Intent(this, WordGameScreen::class.java)
            startActivity(intent)
        }

        binding.dessertClickerButton.setOnClickListener {
            val toast: Toast = Toast.makeText(this, "Going to Dessert Clicker Screen", Toast.LENGTH_SHORT)
            toast.show()

            val intent = Intent(this, DessertClickerScreen::class.java)
            startActivity(intent)
        }

        binding.unscrambleButton.setOnClickListener {
            val toast: Toast = Toast.makeText(this, "Going to Unscramble Screen", Toast.LENGTH_SHORT)
            toast.show()

            val intent = Intent(this, UnscrambleActivity::class.java)
            startActivity(intent)
        }

    }
}