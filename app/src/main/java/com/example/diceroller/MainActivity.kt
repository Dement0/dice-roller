package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get button with the id roll_button
        val rollButton : Button = findViewById(R.id.roll_button)

        // Call rollDice function when clicked
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {

        // Get a random integer between 1 and 7
        val randomInt : Int = Random().nextInt(6) + 1

        // Get a reference to the ImageView and assign it to diceImage
        val diceImage : ImageView = findViewById(R.id.dice_image)

        // Choose the right drawable resource based on the value of randomInt
        val drawableResource =  when(randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Set the image to the corresponding drawableResource
        diceImage.setImageResource(drawableResource)
    }
}
