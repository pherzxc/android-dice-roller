package com.example.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text: TextView = this.findViewById(R.id.text)
        val rollButton: Button = this.findViewById(R.id.roll_button)
        rollButton.text = "Lets Roll"

        rollButton.setOnClickListener {
            rollDice()
            Toast.makeText(this, "Dice has been rolled", Toast.LENGTH_SHORT).show()
        }


    }

    private fun rollDice() {
        val diceImg: ImageView = findViewById(R.id.diceImage)

        val random = Random.nextInt(1, 6)

        val drawableResource = when (random) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_6
        }

        diceImg.setImageResource(drawableResource)



    }
}
