package com.example.kinderacademy

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Cabbage : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    lateinit var cabbage: ImageButton
    lateinit var C: Button
    lateinit var sound: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cabbage)

        cabbage=findViewById(R.id.cabbage)
        C=findViewById(R.id.C)
        sound=findViewById(R.id.soundred)

        cabbage.setOnClickListener{
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.c))
            mediaPlayer.prepare()
            mediaPlayer.start()
        }
    }
}