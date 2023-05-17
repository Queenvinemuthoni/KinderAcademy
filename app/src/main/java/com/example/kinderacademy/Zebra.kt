package com.example.kinderacademy

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Zebra : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    lateinit var zebra: ImageButton
    lateinit var Z: Button
    lateinit var sound: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zebra)

        zebra=findViewById(R.id.zebra)
        Z=findViewById(R.id.Z)
        sound=findViewById(R.id.soundred)

        zebra.setOnClickListener{
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.z))
            mediaPlayer.prepare()
            mediaPlayer.start()
        }
    }
}