package com.example.androidanimatedimages

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_animated.*

class AnimatedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animated)

        val animatedDrawable = ContextCompat.getDrawable(this, R.drawable.elmo_animated)
        image_animated.setImageDrawable(animatedDrawable)
        (animatedDrawable as AnimationDrawable).start()
    }
}
