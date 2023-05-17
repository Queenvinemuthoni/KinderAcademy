package com.example.kinderacademy

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Banana : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    lateinit var banana: ImageButton
    lateinit var B:Button
    lateinit var sound:ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banana)

        banana=findViewById(R.id.banana)
        B=findViewById(R.id.B)
        sound=findViewById(R.id.soundred)

        banana.setOnClickListener{
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.b))
            mediaPlayer.prepare()
            mediaPlayer.start()
        }

    }
}