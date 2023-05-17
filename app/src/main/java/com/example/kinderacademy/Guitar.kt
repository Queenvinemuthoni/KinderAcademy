package com.example.kinderacademy

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Guitar : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    lateinit var guitar: ImageButton
    lateinit var G: Button
    lateinit var sound: ImageButton
    lateinit var backbtn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guitar)

        guitar=findViewById(R.id.guitar)
        G=findViewById(R.id.G)
        sound=findViewById(R.id.soundred)
        backbtn=findViewById(R.id.buttonback)

        backbtn.setOnClickListener{
            val intent = Intent(this, Alphabet::class.java)
            startActivity(intent)
        }

        guitar.setOnClickListener{
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.g))
            mediaPlayer.prepare()
            mediaPlayer.start()
        }
    }
}