package com.example.kinderacademy

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Nest : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    lateinit var nest: ImageButton
    lateinit var N: Button
    lateinit var sound: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nest)

        nest=findViewById(R.id.nest)
        N=findViewById(R.id.N)
        sound=findViewById(R.id.soundred)

        nest.setOnClickListener{
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.n))
            mediaPlayer.prepare()
            mediaPlayer.start()
        }
    }
}