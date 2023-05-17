package com.example.kinderacademy

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Firetruck : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    lateinit var firetruck: ImageButton
    lateinit var F: Button
    lateinit var sound: ImageButton
    lateinit var backbtn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firetruck)

        firetruck=findViewById(R.id.firetruck)
        F=findViewById(R.id.F)
        sound=findViewById(R.id.soundred)
        backbtn=findViewById(R.id.buttonback)

        backbtn.setOnClickListener{
            val intent = Intent(this, Alphabet::class.java)
            startActivity(intent)
        }

        firetruck.setOnClickListener{
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.f))
            mediaPlayer.prepare()
            mediaPlayer.start()
        }
    }
}