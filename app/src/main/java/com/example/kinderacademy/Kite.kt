package com.example.kinderacademy

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Kite : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    lateinit var kite: ImageButton
    lateinit var K: Button
    lateinit var sound: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kite)

        kite=findViewById(R.id.kite)
        K=findViewById(R.id.K)
        sound=findViewById(R.id.soundred)

        kite.setOnClickListener{
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.k))
            mediaPlayer.prepare()
            mediaPlayer.start()
        }
    }
}