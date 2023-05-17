package com.example.kinderacademy

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton


class Colors : AppCompatActivity() {

    lateinit var soundgreen:ImageButton
    lateinit var soundred:ImageButton
    lateinit var soundblue:ImageButton
    lateinit var soundyellow:ImageButton
    lateinit var btnback:Button

    private lateinit var mediaPlayer: MediaPlayer


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_colors)

        soundgreen=findViewById(R.id.soundgreen)
        soundred=findViewById(R.id.soundred)
        soundblue=findViewById(R.id.soundblue)
        soundyellow=findViewById(R.id.soundyellow)
        btnback=findViewById(R.id.buttonback)

        btnback.setOnClickListener{
            val intent= Intent(this, Learndialog::class.java)
            startActivity(intent)
        }

        soundgreen.setOnClickListener{
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.green))
            mediaPlayer.prepare()
            mediaPlayer.start()
        }

        soundred.setOnClickListener{
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.red))
            mediaPlayer.prepare()
            mediaPlayer.start()
        }

        soundblue.setOnClickListener{
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.blue))
            mediaPlayer.prepare()
            mediaPlayer.start()
        }

        soundyellow.setOnClickListener{
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.yellow))
            mediaPlayer.prepare()
            mediaPlayer.start()
        }




    }
}