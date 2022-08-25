package com.example.rolldice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rolldice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val button = binding.roll
        button.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val dice = Dice(numSides = 6)
        val diceRoll = dice.roll()
        val resultDiceRoll = binding.diceRoll
        resultDiceRoll.text = diceRoll.toString()
    }
}