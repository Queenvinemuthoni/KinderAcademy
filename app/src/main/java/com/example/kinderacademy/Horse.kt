package com.example.kinderacademy

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Horse : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    lateinit var horse: ImageButton
    lateinit var H: Button
    lateinit var sound: ImageButton
    lateinit var backbtn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_horse)

        horse=findViewById(R.id.horse)
        H=findViewById(R.id.H)
        sound=findViewById(R.id.soundred)
        backbtn=findViewById(R.id.buttonback)

        backbtn.setOnClickListener{
            val intent = Intent(this, Alphabet::class.java)
            startActivity(intent)
        }

        horse.setOnClickListener{
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.h))
            mediaPlayer.prepare()
            mediaPlayer.start()
        }
    }
}