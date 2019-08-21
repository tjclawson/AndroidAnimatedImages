package com.example.androidanimatedimages

import android.content.Intent
import android.graphics.drawable.Animatable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

//step 1. format acitivity_main with an imageview for the vector and buttons to launch other activities
//step 2. create two activities for animations, vector animation will go in mainactivity, create listeners to launch other activities

class MainActivity : AppCompatActivity() {

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_image_gif.setOnClickListener {
            intent = Intent(this, GifActivity::class.java)
            startActivity(intent)
        }

        button_image_animated.setOnClickListener {
            intent = Intent(this, AnimatedActivity::class.java)
            startActivity(intent)
        }

        //initially setting the image to the play button

        var vector = ContextCompat.getDrawable(this, R.drawable.pausetoplay)
        image_vector.setImageDrawable(vector)
        (vector as Animatable).start()

        image_vector.setOnClickListener {
            if (counter == 0 ) {
                var vector = ContextCompat.getDrawable(this, R.drawable.playtopause)
                image_vector.setImageDrawable(vector)
                (vector as Animatable).start()

                counter++

            } else {
                var vector = ContextCompat.getDrawable(this, R.drawable.pausetoplay)
                image_vector.setImageDrawable(vector)
                (vector as Animatable).start()

                counter--
            }
        }


    }
}
