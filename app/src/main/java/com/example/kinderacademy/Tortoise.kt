package com.example.kinderacademy

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Tortoise : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    lateinit var tortoise: ImageButton
    lateinit var T: Button
    lateinit var sound: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tortoise)

        tortoise=findViewById(R.id.tortoise)
        T=findViewById(R.id.T)
        sound=findViewById(R.id.soundred)

        tortoise.setOnClickListener{
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.t))
            mediaPlayer.prepare()
            mediaPlayer.start()
        }
    }
}