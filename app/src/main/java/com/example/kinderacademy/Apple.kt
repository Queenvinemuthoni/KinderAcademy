package com.example.kinderacademy

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Apple : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    lateinit var apple:ImageButton
    lateinit var a:Button
    lateinit var sound:ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apple)

        apple=findViewById(R.id.apple)
        a=findViewById(R.id.A)
        sound=findViewById(R.id.soundred)

        apple.setOnClickListener{
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.a))
            mediaPlayer.prepare()
            mediaPlayer.start()
        }

        }
    }
