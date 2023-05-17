package com.example.kinderacademy

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Queen : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    lateinit var queen: ImageButton
    lateinit var Q: Button
    lateinit var sound: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_queen)

        queen=findViewById(R.id.queen)
        Q=findViewById(R.id.Q)
        sound=findViewById(R.id.soundred)

        queen.setOnClickListener{
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.q))
            mediaPlayer.prepare()
            mediaPlayer.start()
        }
    }
}