package com.example.rolldice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button = findViewById<Button>(R.id.roll)
        button.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val dice = Dice(numSides = 6)
        val diceRoll = dice.roll()
        val resultDiceRoll = findViewById<TextView>(R.id.dice_roll)
        resultDiceRoll.text = diceRoll.toString()
    }
}