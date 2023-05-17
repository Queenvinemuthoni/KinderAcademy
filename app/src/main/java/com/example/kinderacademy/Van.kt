package com.example.kinderacademy

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Van : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    lateinit var volleyball: ImageButton
    lateinit var V: Button
    lateinit var sound: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volleyball)

        volleyball=findViewById(R.id.volleyball)
        V=findViewById(R.id.V)
        sound=findViewById(R.id.soundred)

        volleyball.setOnClickListener{
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.v))
            mediaPlayer.prepare()
            mediaPlayer.start()
        }
    }
}