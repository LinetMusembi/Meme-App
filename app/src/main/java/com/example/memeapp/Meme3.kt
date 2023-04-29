package com.example.memeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Meme3 : AppCompatActivity() {
    lateinit var button5:Button
    lateinit var button6:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme3)
        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button5.setOnClickListener {
            val forward = Intent(this,Meme2::class.java)
            startActivity(forward)
        }
        button6.setOnClickListener {
            val forward = Intent(this,Meme4::class.java)
            startActivity(forward)
        }
    }
}