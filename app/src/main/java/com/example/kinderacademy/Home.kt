package com.example.kinderacademy

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Home : AppCompatActivity(){

    private lateinit var buttonlearn:ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        buttonlearn=findViewById(R.id.buttonlearn)

        buttonlearn.setOnClickListener{
            val intent =Intent(this,Learndialog::class.java)
            startActivity(intent)
        }
    }
}