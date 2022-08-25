package com.example.rolldice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rolldice.R.drawable.*
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
        rollDice()
    }

    private fun rollDice() {
        val dice = Dice(numSides = 6)
        val diceRoll = dice.roll()
        val diceImg = binding.imgDice
        when(diceRoll){
            1 -> diceImg.setImageResource(dice_1)
            2 -> diceImg.setImageResource(dice_2)
            3 -> diceImg.setImageResource(dice_3)
            4 -> diceImg.setImageResource(dice_4)
            5 -> diceImg.setImageResource(dice_5)
            else -> diceImg.setImageResource(dice_6)
        }
    }
}