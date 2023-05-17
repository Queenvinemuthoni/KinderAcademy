package com.example.kinderacademy

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Rabbit : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    lateinit var rabbit: ImageButton
    lateinit var bunny: Button
    lateinit var sound: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rabbit)

        rabbit=findViewById(R.id.rabbit)
        bunny=findViewById(R.id.B)
        sound=findViewById(R.id.soundred)

        rabbit.setOnClickListener{
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.r))
            mediaPlayer.prepare()
            mediaPlayer.start()
        }


    }
}