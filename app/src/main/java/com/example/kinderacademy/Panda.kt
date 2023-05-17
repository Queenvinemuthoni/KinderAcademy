package com.example.kinderacademy

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Panda : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    lateinit var panda: ImageButton
    lateinit var P: Button
    lateinit var sound: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panda)

        panda=findViewById(R.id.panda)
        P=findViewById(R.id.P)
        sound=findViewById(R.id.soundred)

        panda.setOnClickListener{
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.p))
            mediaPlayer.prepare()
            mediaPlayer.start()
        }
    }
}