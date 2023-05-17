package com.example.kinderacademy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Learndialog : AppCompatActivity() {

    lateinit var alphabet:Button
    lateinit var colors:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learndialog)

        alphabet=findViewById(R.id.button_alfabeth)
        colors=findViewById(R.id.button_mixcolor)

        alphabet.setOnClickListener {
            val intent = Intent(this, Alphabet::class.java)
            startActivity(intent)
        }

        colors.setOnClickListener {
            val intent = Intent(this, Colors::class.java)
            startActivity(intent)
        }

    }
}