package com.example.kinderacademy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class Login : AppCompatActivity() {
    lateinit var Appname: ImageView
    lateinit var loginemail: EditText
    lateinit var loginpass: EditText
    lateinit var btnlogin: Button
    lateinit var gotoregister: TextView

    lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        Appname=findViewById(R.id.logo)
        loginemail = findViewById(R.id.edt_loginemail)
        loginpass = findViewById(R.id.edt_loginpass)
        btnlogin = findViewById(R.id.login)
        gotoregister = findViewById(R.id.txt_gotoregister)

        auth= FirebaseAuth.getInstance()

        btnlogin.setOnClickListener {
            login()
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        gotoregister.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
            // using finish() to end the activity
            finish()
        }
    }

    private fun login() {
        val email = loginemail.text.toString()
        val pass = loginpass.text.toString()

        auth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(this) {
            var ref= FirebaseDatabase.getInstance().getReference().child("Users/$pass")
            if (it.isSuccessful) {
                Toast.makeText(this,"created",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"Failed to create",Toast.LENGTH_LONG).show()
            }

        }


    }

}