package com.example.kinderacademy

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Wolf : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    lateinit var wolf: ImageButton
    lateinit var W: Button
    lateinit var sound: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wolf)

        wolf=findViewById(R.id.wolf)
        W=findViewById(R.id.W)
        sound=findViewById(R.id.soundred)

        wolf.setOnClickListener{
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.w))
            mediaPlayer.prepare()
            mediaPlayer.start()
        }
    }
}