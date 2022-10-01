package com.example.androidstudyjamsession3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    var diceImage : ImageView ?= null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll: Button = findViewById(R.id.btnRoll)
        btnRoll.setOnClickListener { rollDice() }

        diceImage = findViewById(R.id.imgDice)
    }

    private fun rollDice(){
        val randomInt = Random().nextInt(6)+1
        Toast.makeText(this,"Dice:$randomInt",Toast.LENGTH_SHORT).show()

        val drawableResource = when(randomInt){

            1->R.drawable.ic_dice_one
            2->R.drawable.ic_dice_two
            3->R.drawable.ic_dice_three
            4->R.drawable.ic_dice_four
            5->R.drawable.ic_dice_five
            6->R.drawable.ic_dice_six
            else->R.drawable.ic_dice
        }
        diceImage?.setImageResource(drawableResource)


    }
}