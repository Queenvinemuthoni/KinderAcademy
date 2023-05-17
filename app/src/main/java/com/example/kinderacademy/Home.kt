package com.example.kinderacademy

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity(){

    private lateinit var epicDialog : Dialog
    private lateinit var btnxPopUP : ImageButton
    private lateinit var btnLearnXGames : Button
    private lateinit var btnLearnXGames2: Button

    lateinit var buttonlearn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        epicDialog = Dialog(this)


        buttonlearn.setOnClickListener{
            epicDialog.setContentView(R.layout.activity_learndialog)
            btnxPopUP= epicDialog.findViewById(R.id.button_xlearn)

            btnLearnXGames = epicDialog.findViewById(R.id.buttonlearn)
            btnLearnXGames.setOnClickListener {
                val move = Intent(this, Alphabet::class.java)
                epicDialog.dismiss()
                startActivity(move)
                overridePendingTransition(R.anim.slideoutright, R.anim.slideinleft)
            }

            btnLearnXGames2 = epicDialog.findViewById(R.id.button_mixcolor)
            btnLearnXGames2.setOnClickListener {
                val move = Intent(this, Colors::class.java)
                epicDialog.dismiss()
                startActivity(move)
                overridePendingTransition(R.anim.slideoutright, R.anim.slideinleft)
            }

            btnxPopUP.setOnClickListener {
                epicDialog.dismiss()
            }
            epicDialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            epicDialog.show()
        }


    }
}