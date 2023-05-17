package com.example.kinderacademy

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Elephant : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    lateinit var elephant: ImageButton
    lateinit var E: Button
    lateinit var sound: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elephant)

        elephant=findViewById(R.id.elephant)
        E=findViewById(R.id.E)
        sound=findViewById(R.id.soundred)

        elephant.setOnClickListener{
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.e))
            mediaPlayer.prepare()
            mediaPlayer.start()
        }
    }
}