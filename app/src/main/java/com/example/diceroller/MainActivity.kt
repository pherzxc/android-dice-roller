package com.example.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text: TextView = this.findViewById(R.id.text)
        val rollButton: Button = this.findViewById(R.id.roll_button)
        text.text = "Try Again"
        rollButton.text = "Lets Roll"

        rollButton.setOnClickListener {
            rollDice()
            Toast.makeText(this, "Dice has been rolled", Toast.LENGTH_SHORT).show()
        }


    }

    private fun rollDice() {
        val text: TextView = this.findViewById(R.id.text)

        val random = Random.nextInt(1, 6)

        text.text = random.toString()
    }
}
