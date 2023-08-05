//package com.example.random
//
//import android.app.Dialog
//import android.content.Intent
//import android.content.SharedPreferences
//import android.content.SharedPreferences.*
//import android.media.MediaPlayer
//import android.os.Build
//import android.os.Bundle
//import android.view.View
//import android.view.View.INVISIBLE
//import android.view.WindowManager
//import android.widget.Button
//import android.widget.TextView
//import android.widget.Toast
//import androidx.annotation.RequiresApi
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.isVisible
//import com.example.random.databinding.ActivityMainBinding
//
//class MainActivity : AppCompatActivity() {
//
//    private lateinit var binding: ActivityMainBinding
//    private lateinit var mediaPlayer:MediaPlayer
//    private lateinit var dialog : Dialog
//    private lateinit var dialog1 : Dialog
//    private lateinit var dialog3 :Dialog
//    private  var score:Int = 0
//    private lateinit var sf: SharedPreferences
//    private lateinit var editor : SharedPreferences.Editor
//
//    @RequiresApi(Build.VERSION_CODES.R)
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//
//        val intent = intent
//        val str1 = intent.getStringExtra("message_key1")
//        val str2 = intent.getStringExtra("message_key2")
//        val check = str1?.uppercase()
//
//        sf = getSharedPreferences("my_sf", MODE_PRIVATE)
//        editor = sf.edit()
//        val hs = sf.getInt("sf_hs",0)
//
//
//        var unjumbled_Word = setRandom()
//        var input_word = unjumbled_Word.toList()
//
//
//        val guessText_1 = binding.input1
//        guessText_1.text = input_word[0].toString()
//        val guessText_2 = binding.input2
//        guessText_2.text = input_word[1].toString()
//        val guessText_3 = binding.input3
//        guessText_3.text = input_word[2].toString()
//        val guessText_4 = binding.input4
//        guessText_4.text = input_word[3].toString()
//        val guessText_5 = binding.input5
//        guessText_5.text = input_word[4].toString()
//        val guessText_6 = binding.input6
//        guessText_6.text = input_word[5].toString()
//        val guessText_7 = binding.input7
//        guessText_7.text = input_word[6].toString()
//        val guessText_8 = binding.input8
//        guessText_8.text = input_word[7].toString()
//        val guessText_9 = binding.input9
//        guessText_9.text = input_word[8].toString()
//        val guessText_10 = binding.input10
//        guessText_10.text = input_word[9].toString()
//        val guessText_11 = binding.input11
//        guessText_11.text = input_word[10].toString()
//        val guessText_12 = binding.input12
//        guessText_12.text = input_word[11].toString()
//        val guessText_13 = binding.input13
//        guessText_13.text = input_word[12].toString()
//        val guessText_14 = binding.input14
//        guessText_14.text = input_word[13].toString()
//        val guessText_15 = binding.input15
//        guessText_15.text = input_word[14].toString()
//        val guessText_16 = binding.input16
//        guessText_16.text = input_word[15].toString()
//
//        val word = binding.wordOutput
//
//        if (str1 != null) {
//            var dash=""
//            for (i in 1..str1.length){
//                dash+="_ "
//            }
//
//                word.hint=dash
//        }
//
//
//
//
//            guessText_1.setOnClickListener {
//                    word.text = word.text.toString()+input_word[0].toString()
//                    music()
//                    guessText_1.visibility= INVISIBLE
//            }
//
//            guessText_2.setOnClickListener  {
//            word.text = (word.text.toString() + input_word[1])
//            music()
//            guessText_2.visibility= INVISIBLE
//        }
//        guessText_3.setOnClickListener {
//            word.text = (word.text.toString() + input_word[2])
//            music()
//            guessText_3.visibility= INVISIBLE
//        }
//        guessText_4.setOnClickListener {
//            word.text = (word.text.toString() + input_word[3])
//            music()
//            guessText_4.visibility= INVISIBLE
//        }
//        guessText_5.setOnClickListener {
//            word.text = (word.text.toString() + input_word[4])
//            music()
//            guessText_5.visibility= INVISIBLE
//        }
//        guessText_6.setOnClickListener {
//            word.text = (word.text.toString() + input_word[5])
//            music()
//            guessText_6.visibility= INVISIBLE
//        }
//        guessText_7.setOnClickListener {
//            word.text = (word.text.toString() + input_word[6])
//            music()
//            guessText_7.visibility= INVISIBLE
//        }
//        guessText_8.setOnClickListener {
//            word.text = (word.text.toString() + input_word[7])
//            music()
//            guessText_8.visibility= INVISIBLE
//        }
//        guessText_9.setOnClickListener {
//            word.text = (word.text.toString() + input_word[8])
//            music()
//            guessText_9.visibility= INVISIBLE
//        }
//        guessText_10.setOnClickListener {
//            word.text = (word.text.toString() + input_word[9])
//            music()
//            guessText_10.visibility= INVISIBLE
//        }
//        guessText_11.setOnClickListener {
//            word.text = (word.text.toString() + input_word[10])
//            music()
//            guessText_11.visibility= INVISIBLE
//        }
//        guessText_12.setOnClickListener {
//            word.text = (word.text.toString() + input_word[11])
//            music()
//            guessText_12.visibility= INVISIBLE
//        }
//        guessText_13.setOnClickListener {
//            word.text = (word.text.toString() + input_word[12])
//            music()
//            guessText_13.visibility= INVISIBLE
//        }
//        guessText_14.setOnClickListener {
//            word.text = (word.text.toString() + input_word[13])
//            music()
//            guessText_14.visibility= INVISIBLE
//        }
//        guessText_15.setOnClickListener {
//            word.text = (word.text.toString() + input_word[14])
//            music()
//            guessText_15.visibility= INVISIBLE
//        }
//        guessText_16.setOnClickListener {
//            word.text = (word.text.toString() + input_word[15])
//            music()
//            guessText_16.visibility= INVISIBLE
//        }
//
//        var count = 3
//        binding.btnCheck.setOnClickListener {
//            if (str1 != null) {
//                if (word.length() == str1.toString().length) {
//
//                    if (word.text.toList() == check.toString().toList()) {
//                        Toast.makeText(this, "YOU WON", Toast.LENGTH_SHORT).show()
//
//                        val showScore = binding.score
//                        var score:Int
//                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
//                            score=showScore.textSizeUnit
//                        }
//                        score=count*100
//
//
//                        if(score > hs){
//                            editor.apply(){
//                                putInt("sf_hs",score)
//                                commit()
//                            }
//                        }
//
//                        winMusic()
//                        dialog1=Dialog(this)
//                        dialog1.setContentView(R.layout.win)
//                        dialog1.show()
//                        val show = (dialog1).findViewById<TextView>(R.id.bestScore)
//                        show.text="Score = "+score.toString()
//                        val home = (dialog1).findViewById<Button>(R.id.btnHome)
//                        home.setOnClickListener {
//                            val intent2 = Intent(this,FirstTemplate::class.java)
//                            startActivity(intent2)
//                        }
//
//
//                    }
//
//                    else {
//                        when (count) {
//                            3 -> binding.life3.setImageResource(R.drawable.white_heart_svgrepo_com)
//                            2 -> binding.life2.setImageResource(R.drawable.white_heart_svgrepo_com)
//                            1 -> binding.life1.setImageResource(R.drawable.white_heart_svgrepo_com)
//                        }
//
//                        shuffle()
//                        word.text=""
//                        unjumbled_Word = setRandom()
//                        input_word = unjumbled_Word.toList()
//                        guessText_1.text = input_word[0].toString()
//                        guessText_1.isVisible=true
//                        guessText_2.text = input_word[1].toString()
//                        guessText_2.isVisible=true
//                        guessText_3.text = input_word[2].toString()
//                        guessText_3.isVisible=true
//                        guessText_4.text = input_word[3].toString()
//                        guessText_4.isVisible=true
//                        guessText_5.text = input_word[4].toString()
//                        guessText_5.isVisible=true
//                        guessText_6.text = input_word[5].toString()
//                        guessText_6.isVisible=true
//                        guessText_7.text = input_word[6].toString()
//                        guessText_7.isVisible=true
//                        guessText_8.text = input_word[7].toString()
//                        guessText_8.isVisible=true
//                        guessText_9.text = input_word[8].toString()
//                        guessText_9.isVisible=true
//                        guessText_10.text = input_word[9].toString()
//                        guessText_10.isVisible=true
//                        guessText_11.text = input_word[10].toString()
//                        guessText_11.isVisible=true
//                        guessText_12.text = input_word[11].toString()
//                        guessText_12.isVisible=true
//                        guessText_13.text = input_word[12].toString()
//                        guessText_13.isVisible=true
//                        guessText_14.text = input_word[13].toString()
//                        guessText_14.isVisible=true
//                        guessText_15.text = input_word[14].toString()
//                        guessText_15.isVisible=true
//                        guessText_16.text = input_word[15].toString()
//                        guessText_16.isVisible=true
//                        word.text=""
//
//                        count--
//                        Toast.makeText(this, "Better luck nxt time", Toast.LENGTH_SHORT).show()
//                                   binding.score.text = "SCORE = 0"
//                        lostgame()
//                    }
//                }else{
//                    Toast.makeText(this, "No of letters do not match", Toast.LENGTH_SHORT).show()
//                }
//            }
//
//            if(count==0){
//                dialog3=Dialog(this)
//                dialog3.setContentView(R.layout.lost)
//                dialog3.show()
//
//                val home = (dialog3).findViewById<Button>(R.id.btnHome)
//                home.setOnClickListener {
//                    val intent3 = Intent(this,FirstTemplate::class.java)
//                    startActivity(intent3)
//                }
//                Toast.makeText(this, "YOU Lost", Toast.LENGTH_SHORT).show()
//
//            }
//        }
//
//        binding.btnClue.setOnClickListener {
//            dialog=Dialog(this)
//            dialog.setContentView(R.layout.dialog)
//           val clue = (dialog).findViewById<TextView>(R.id.displayScore)
//            clue.text =str2.toString()
//            dialog.show()
//
//        }
//
//
//        binding.btnReset.setOnClickListener {
//            shuffle()
//            word.text=""
//            unjumbled_Word = setRandom()
//            input_word = unjumbled_Word.toList()
//            guessText_1.text = input_word[0].toString()
//            guessText_1.isVisible=true
//            guessText_2.text = input_word[1].toString()
//            guessText_2.isVisible=true
//            guessText_3.text = input_word[2].toString()
//            guessText_3.isVisible=true
//            guessText_4.text = input_word[3].toString()
//            guessText_4.isVisible=true
//            guessText_5.text = input_word[4].toString()
//            guessText_5.isVisible=true
//            guessText_6.text = input_word[5].toString()
//            guessText_6.isVisible=true
//            guessText_7.text = input_word[6].toString()
//            guessText_7.isVisible=true
//            guessText_8.text = input_word[7].toString()
//            guessText_8.isVisible=true
//            guessText_9.text = input_word[8].toString()
//            guessText_9.isVisible=true
//            guessText_10.text = input_word[9].toString()
//            guessText_10.isVisible=true
//            guessText_11.text = input_word[10].toString()
//            guessText_11.isVisible=true
//            guessText_12.text = input_word[11].toString()
//            guessText_12.isVisible=true
//            guessText_13.text = input_word[12].toString()
//            guessText_13.isVisible=true
//            guessText_14.text = input_word[13].toString()
//            guessText_14.isVisible=true
//            guessText_15.text = input_word[14].toString()
//            guessText_15.isVisible=true
//            guessText_16.text = input_word[15].toString()
//            guessText_16.isVisible=true
//            word.text=""
//        }
//
//
//    }
//
//    fun setRandom():List<Char>{
//
//        val str1 = intent.getStringExtra("message_key1")
//        val given_word= str1?.uppercase()
//
//        val str = "ABCDEFGHIJKLMNOPQRRSTUVWXYZ"
//
//        var password = ""
//
//        if (given_word != null) {
//            for (i in 1..(16-given_word.length)) {
//                password += str.random()
//            }
//        }
//
//        val input = password+given_word
//        val jumble = (input).toMutableList()
//        val shuffjumble = jumble.shuffled()
//
//        return shuffjumble
//    }
//
//    fun music () {
//        mediaPlayer = MediaPlayer.create(this,R.raw.btnsound)
//        mediaPlayer.start()
//    }
//    fun winMusic(){
//        mediaPlayer = MediaPlayer.create(this,R.raw.win)
//        mediaPlayer.start()
//    }
//    fun lostgame(){
//        mediaPlayer = MediaPlayer.create(this,R.raw.lose)
//        mediaPlayer.start()
//    }
//    fun shuffle(){
//        mediaPlayer = MediaPlayer.create(this,R.raw.shuffle)
//        mediaPlayer.start()
//    }
//
//}
//
//




package com.example.random

import android.app.Dialog
import android.content.Intent
import android.content.SharedPreferences
import android.content.SharedPreferences.*
import android.media.MediaPlayer
import android.os.Build
import android.os.Bundle
import android.view.View.INVISIBLE
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.random.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mediaPlayer:MediaPlayer
    private lateinit var dialog : Dialog
    private lateinit var dialog1 : Dialog
    private lateinit var dialog3 :Dialog
    private lateinit var sf: SharedPreferences
    private lateinit var editor : Editor
    private var count = 3
    private var initialWordLength = 0
    private var timeTaken = 0L
    var hs:Int = 0

    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val intent = intent
        val str1 = intent.getStringExtra("message_key1")
        val str2 = intent.getStringExtra("message_key2")
        val check = str1?.uppercase()

        sf = getSharedPreferences("my_sf", MODE_PRIVATE)
        editor = sf.edit()
        hs = sf.getInt("sf_hs",0)


        initialWordLength = str1?.length ?: 0
        timeTaken = System.currentTimeMillis()

        var unjumbled_Word = setRandom()
        var input_word = unjumbled_Word.toList()


        val guessTextList = listOf(
            binding.input1, binding.input2, binding.input3, binding.input4,
            binding.input5, binding.input6, binding.input7, binding.input8,
            binding.input9, binding.input10, binding.input11, binding.input12,
            binding.input13, binding.input14, binding.input15, binding.input16
        )

        val word = binding.wordOutput
        if (str1 != null) {
            var dash=""
            for (i in 1..str1.length){
                dash+="_ "
            }
            word.hint=dash
        }


        guessTextList.forEachIndexed { index, guessText ->
            guessText.text = input_word[index].toString()
            guessText.setOnClickListener {
                word.text = word.text.toString() + input_word[index].toString()
                music()
                guessText.visibility = INVISIBLE
            }
        }

        binding.btnCheck.setOnClickListener {
            if (str1 != null) {
                if (word.length() == str1.toString().length) {

                    if (word.text.toList() == check.toString().toList()) {
                        Toast.makeText(this, "YOU WON", Toast.LENGTH_SHORT).show()

                        binding.score.text=calculateScore().toString()


                        winMusic()
                        dialog1=Dialog(this)
                        dialog1.setContentView(R.layout.win)
                        dialog1.show()
                        val show = (dialog1).findViewById<TextView>(R.id.bestScore)
                        show.text="Score = "+calculateScore().toString()
                        val home = (dialog1).findViewById<Button>(R.id.btnHome)
                        home.setOnClickListener {
                            val intent2 = Intent(this,FirstTemplate::class.java)
                            startActivity(intent2)
                        }


                    }

                    else {
                        when (count) {
                            3 -> binding.life3.setImageResource(R.drawable.white_heart_svgrepo_com)
                            2 -> binding.life2.setImageResource(R.drawable.white_heart_svgrepo_com)
                            1 -> binding.life1.setImageResource(R.drawable.white_heart_svgrepo_com)
                        }

                        shuffle()
                        word.text=""
                        unjumbled_Word = setRandom()
                        input_word = unjumbled_Word.toList()
                        guessTextList.forEach { guessText ->
                            guessText.text = input_word[guessTextList.indexOf(guessText)].toString()
                            guessText.isVisible = true
                        }
                        word.text=""

                        count--
                        Toast.makeText(this, "Better luck nxt time", Toast.LENGTH_SHORT).show()
                        binding.score.text = "SCORE = 0"
                        lostgame()
                    }
                }else{
                    Toast.makeText(this, "No of letters do not match", Toast.LENGTH_SHORT).show()
                }
            }

            if(count==0){
                dialog3=Dialog(this)
                dialog3.setContentView(R.layout.lost)
                dialog3.show()

                val home = (dialog3).findViewById<Button>(R.id.btnHome)
                home.setOnClickListener {
                    val intent3 = Intent(this,FirstTemplate::class.java)
                    startActivity(intent3)
                }
                Toast.makeText(this, "YOU Lost", Toast.LENGTH_SHORT).show()

            }
        }

        binding.btnClue.setOnClickListener {
            dialog=Dialog(this)
            dialog.setContentView(R.layout.dialog)
           val clue = (dialog).findViewById<TextView>(R.id.displayScore)
            clue.text =str2.toString()
            dialog.show()

        }


        binding.btnReset.setOnClickListener {
            shuffle()
            word.text=""
            unjumbled_Word = setRandom()
            input_word = unjumbled_Word.toList()
            guessTextList.forEach { guessText ->
                guessText.text = input_word[guessTextList.indexOf(guessText)].toString()
                guessText.isVisible = true
            }
            word.text=""
        }


    }

    fun setRandom():List<Char>{

        val str1 = intent.getStringExtra("message_key1")
        val given_word= str1?.uppercase()

        val str = "ABCDEFGHIJKLMNOPQRRSTUVWXYZ"

        var password = ""

        if (given_word != null) {
            for (i in 1..(16-given_word.length)) {
                password += str.random()
            }
        }

        val input = password+given_word
        val jumble = (input).toMutableList()
        val shuffjumble = jumble.shuffled()

        return shuffjumble
    }


    private fun calculateScore(): Int {
        // Calculate the time taken to complete the word in seconds
        val endTime = System.currentTimeMillis()
        val timeElapsed = (endTime - timeTaken) / 1000

        // Calculate score based on word length, attempts left, and time taken
        var score = (initialWordLength * 20) // 20 points per letter
        score += (count * 100) // 100 points per attempt left
        score += (100 - timeElapsed).toInt() // Bonus for completing quickly

        // Update high score if needed
        if(score > hs){
            editor.apply {
                putInt("sf_hs",score)
                commit()
            }
        }

        return score
    }

    fun music () {
        mediaPlayer = MediaPlayer.create(this,R.raw.btnsound)
        mediaPlayer.start()
    }
    fun winMusic(){
        mediaPlayer = MediaPlayer.create(this,R.raw.win)
        mediaPlayer.start()
    }
    fun lostgame(){
        mediaPlayer = MediaPlayer.create(this,R.raw.lose)
        mediaPlayer.start()
    }
    fun shuffle(){
        mediaPlayer = MediaPlayer.create(this,R.raw.shuffle)
        mediaPlayer.start()
    }


}



