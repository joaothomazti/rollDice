package com.example.rolldice

class Dice(var numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}