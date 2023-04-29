package com.example.memeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import javax.microedition.khronos.egl.EGL10

class Meme2 : AppCompatActivity() {
    lateinit var tilButton: Button
    lateinit var button4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme2)
        tilButton = findViewById(R.id.tilbutton1)
        button4 = findViewById(R.id.button4)


        tilButton.setOnClickListener {
            val forward = Intent(this,MainActivity::class.java)
            startActivity(forward)
        }
        button4.setOnClickListener {
            val forward = Intent(this,Meme3::class.java)
            startActivity(forward)
        }

    }
}