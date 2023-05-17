package com.example.kinderacademy

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Ladder : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    lateinit var ladder: ImageButton
    lateinit var L: Button
    lateinit var sound: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ladder)

        ladder=findViewById(R.id.ladder)
        L=findViewById(R.id.L)
        sound=findViewById(R.id.soundred)

        ladder.setOnClickListener{
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.l))
            mediaPlayer.prepare()
            mediaPlayer.start()
        }
    }
}