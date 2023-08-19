package com.example.chatbot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import com.airbnb.lottie.LottieAnimationView
import com.example.chatbot.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val anim = findViewById<LottieAnimationView>(R.id.surprise)
        Handler(Looper.getMainLooper()).postDelayed({
            anim.visibility = View.VISIBLE
            anim.playAnimation()
        },1000)

        anim.setOnClickListener{
            anim.playAnimation()
        }

        binding.generateImage.setOnClickListener{
            startActivity(Intent(this,ImageGenerateActivity::class.java))
        }

        binding.chatWithBot.setOnClickListener{
            startActivity(Intent(this,ChatActivity::class.java))
        }


    }
}