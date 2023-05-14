package com.example.random

import android.app.Dialog
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.random.databinding.ActivityFirstTemplateBinding


public class FirstTemplate : AppCompatActivity() {
    lateinit var binding: ActivityFirstTemplateBinding
    // define the variable
    private lateinit var send_word: EditText
   private lateinit var send_clue: EditText
    private lateinit var send_button: Button
    private lateinit var sf : SharedPreferences
    private lateinit var dialog2:Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstTemplateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        send_word=findViewById(R.id.wordInput)
        send_clue=findViewById(R.id.clueInput)
        send_button=findViewById(R.id.btnStart)

        sf =getSharedPreferences("my_sf", MODE_PRIVATE)
        var hs = sf.getInt("sf_hs",0)

        binding.highScore.setOnClickListener {

            dialog2=Dialog(this)
            dialog2.setContentView(R.layout.highscore)
            dialog2.show()
            val best = (dialog2).findViewById<TextView>(R.id.bestScore)
            best.text="Best Score:"+hs.toString()
        }






        send_button.setOnClickListener {
            val str1 = send_word.text.toString()
            val str2 = send_clue.text.toString()
            val intent = Intent(applicationContext, MainActivity::class.java)
            intent.putExtra("message_key1", str1)
            intent.putExtra("message_key2", str2)
            startActivity(intent)
        }


    }
}