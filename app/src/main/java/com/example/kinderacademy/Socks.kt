package com.example.kinderacademy

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Socks : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    lateinit var socks: ImageButton
    lateinit var S: Button
    lateinit var sound: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_socks)

        socks=findViewById(R.id.socks)
        S=findViewById(R.id.S)
        sound=findViewById(R.id.soundred)

        socks.setOnClickListener{
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.s))
            mediaPlayer.prepare()
            mediaPlayer.start()
        }
    }
}