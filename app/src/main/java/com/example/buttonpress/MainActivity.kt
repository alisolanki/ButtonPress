package com.example.buttonpress

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.xw.repo.BubbleSeekBar
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.rollButton)
        val resultsTextView = findViewById<TextView>(R.id.resultsTextView)
        val seekBar = findViewById<BubbleSeekBar>(R.id.seekBar)
        var rand = 0
        rollButton.setOnClickListener {
            var temp = rand
            rand = Random.nextInt(seekBar.progress)
            resultsTextView.text = rand.toString()
            textView.text = temp.toString()
            textView4.text = ""
            button.visibility = View.INVISIBLE
        }

        imageButton.setOnClickListener {
            textView4.text = "Press the roll button to get a random number between 0 and the number selected on the bar."
            button.visibility = View.VISIBLE
            resultsTextView.text = ""
            textView.text = ""

        }

        button.setOnClickListener {
            val intent = Intent(this, AboutAliActivity::class.java)
            startActivity(intent)
        }
    }
}
