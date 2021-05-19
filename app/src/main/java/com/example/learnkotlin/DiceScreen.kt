package com.example.learnkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class DiceScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_screen)

        val rollDiceButton: Button = findViewById(R.id.diceButton)
        rollDiceButton.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceImage: ImageView = findViewById(R.id.diceImage)
        val resultText : TextView = findViewById(R.id.resultText)
//        val diceArray : IntArray = intArrayOf(R.drawable.dice_1, R.drawable.dice_2, R.drawable.dice_3, R.drawable.dice_4, R.drawable.dice_5, R.drawable.dice_6)
        val result : Int = dice.rollDice()
//        diceImage.setImageResource(diceArray[result - 1])
        when (result) {
           4 -> resultText.text = getText(R.string.winDiceResult)
           1, 2, 3, 5, 6 -> resultText.text = getText(R.string.loseDiceResult)
       }

//        Much better way to implement
        val drawableResource = when (result) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)

    }
}

class Dice (private val sides: Int){
    fun rollDice() : Int{
        return (1..sides).random()
    }
}