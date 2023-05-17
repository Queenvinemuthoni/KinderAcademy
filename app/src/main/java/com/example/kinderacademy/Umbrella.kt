package com.example.kinderacademy

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Umbrella : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    lateinit var umbrella: ImageButton
    lateinit var U: Button
    lateinit var sound: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_umbrella)

        umbrella=findViewById(R.id.umbrella)
        U=findViewById(R.id.U)
        sound=findViewById(R.id.soundred)

        umbrella.setOnClickListener{
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.u))
            mediaPlayer.prepare()
            mediaPlayer.start()
        }
    }
}