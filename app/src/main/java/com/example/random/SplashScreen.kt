package com.example.random

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.postDelayed


class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        var appIcon = findViewById<ImageView>(R.id.icon)

       val move= AnimationUtils.loadAnimation(this,R.anim.move)
        appIcon.setAnimation(move)

      Handler(Looper.getMainLooper()).postDelayed(3000){
          startActivity(Intent(this,FirstTemplate::class.java))
      }

        supportActionBar?.hide()

    }
}