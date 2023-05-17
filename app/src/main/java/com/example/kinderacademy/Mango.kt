package com.example.kinderacademy

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Mango : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    lateinit var mango: ImageButton
    lateinit var M: Button
    lateinit var sound: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mango)

        mango=findViewById(R.id.mango)
        M=findViewById(R.id.M)
        sound=findViewById(R.id.soundred)

        mango.setOnClickListener{
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.m))
            mediaPlayer.prepare()
            mediaPlayer.start()
        }
    }
}