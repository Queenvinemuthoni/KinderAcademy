package com.example.kinderacademy

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import java.sql.BatchUpdateException

class Jar : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    lateinit var jar: ImageButton
    lateinit var J: Button
    lateinit var sound: ImageButton
    lateinit var backbtn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jar)

        jar=findViewById(R.id.jar)
        J=findViewById(R.id.J)
        sound=findViewById(R.id.soundred)
        backbtn=findViewById(R.id.buttonback)

        backbtn.setOnClickListener{
            val intent = Intent(this, Alphabet::class.java)
            startActivity(intent)
        }

        jar.setOnClickListener{
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.j))
            mediaPlayer.prepare()
            mediaPlayer.start()
        }
    }
}