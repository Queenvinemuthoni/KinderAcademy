package com.example.kinderacademy

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Yoyo : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    lateinit var yoyo: ImageButton
    lateinit var Y: Button
    lateinit var sound: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yoyo)

        yoyo=findViewById(R.id.yoyo)
        Y=findViewById(R.id.Y)
        sound=findViewById(R.id.soundred)

        yoyo.setOnClickListener{
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.y))
            mediaPlayer.prepare()
            mediaPlayer.start()
        }
    }
}