package com.example.kinderacademy

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Xylophone : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    lateinit var xylophone: ImageButton
    lateinit var X: Button
    lateinit var sound: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xylophone)

        xylophone=findViewById(R.id.xylophone)
        X=findViewById(R.id.X)
        sound=findViewById(R.id.soundred)

        xylophone.setOnClickListener{
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.x))
            mediaPlayer.prepare()
            mediaPlayer.start()
        }
    }
}