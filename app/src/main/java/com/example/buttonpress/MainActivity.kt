package com.example.buttonpress

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.rollButton)
        val resultsTextView = findViewById<TextView>(R.id.resultsTextView)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)
        var rand = 0
        rollButton.setOnClickListener {
            var temp = rand
            rand = Random.nextInt(seekBar.progress)
            resultsTextView.text = rand.toString()
            textView.text = temp.toString()
            textView4.setText("")
            textView5.setText("")
        }
        imageButton.setOnClickListener {
            textView4.setText("Press the roll button to get a random number between 0 and the number selected on the bar (max 20).")
            textView5.setText("Developed by Ali Solanki")
            resultsTextView.setText("")
            textView.setText("")
        }
    }
}
