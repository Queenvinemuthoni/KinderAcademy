package com.example.kinderacademy

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Doc : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    lateinit var doc: ImageButton
    lateinit var D: Button
    lateinit var sound: ImageButton
    lateinit var backbtn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doc)

        doc=findViewById(R.id.doc)
        D=findViewById(R.id.D)
        sound=findViewById(R.id.soundred)
        backbtn=findViewById(R.id.buttonback)

        backbtn.setOnClickListener{
                val intent = Intent(this, Alphabet::class.java)
            startActivity(intent)
        }

        doc.setOnClickListener{
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.d))
            mediaPlayer.prepare()
            mediaPlayer.start()
        }
    }
}