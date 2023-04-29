package com.example.memeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class meme5 : AppCompatActivity() {
    lateinit var button2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme5)
        button2 = findViewById(R.id.button2)
        button2.setOnClickListener {
            var forward = Intent(this,Meme4::class.java)
            startActivity(forward)
        }
    }
}