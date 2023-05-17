package com.example.kinderacademy

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Icecream : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    lateinit var icecream: ImageButton
    lateinit var I: Button
    lateinit var sound: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_icecream)

        icecream=findViewById(R.id.icecream)
        I=findViewById(R.id.I)
        sound=findViewById(R.id.soundred)

        icecream.setOnClickListener{
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.i))
            mediaPlayer.prepare()
            mediaPlayer.start()
        }
    }
}