package com.example.learnkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DiceScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_screen)

        val diceText: TextView = findViewById(R.id.diceText)

        val rollDiceButton: Button = findViewById(R.id.diceButton)
        rollDiceButton.setOnClickListener {
            diceText.text = rollDice()
        }

    }

    private fun rollDice() : String{
        val dice = Dice(6)
        return dice.rollDice().toString()
    }
}

class Dice (private val sides: Int){
    fun rollDice() : Int{
        return (1..sides).random()
    }
}