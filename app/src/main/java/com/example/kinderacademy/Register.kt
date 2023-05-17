package com.example.kinderacademy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class Register : AppCompatActivity() {
    lateinit var logo:ImageView
    lateinit var username:EditText
    lateinit var enteremail:EditText
    lateinit var enterphone:EditText
    lateinit var enterpass:EditText
    lateinit var confirmpass:EditText
    lateinit var register: Button
    lateinit var gototlogin:TextView

    private lateinit var auth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        logo=findViewById(R.id.applogo)
        username=findViewById(R.id.edt_username)
        enteremail=findViewById(R.id.edt_email)
        enterphone=findViewById(R.id.edt_phone)
        enterpass=findViewById(R.id.edt_password)
        confirmpass=findViewById(R.id.edt_confirmpassword)
        register=findViewById(R.id.button)
        gototlogin=findViewById(R.id.txt_gotologin)

        auth = FirebaseAuth.getInstance()

        register.setOnClickListener {
            SignUpUser()

        }
        gototlogin.setOnClickListener {
            val intent=Intent(this,Login::class.java)
            startActivity(intent)
        }
    }
    private fun SignUpUser(){
        val email=enteremail.text.toString()
        val pass=enterpass.text.toString()
        val confirmpass=confirmpass.text.toString()
        if (email.isBlank() || pass.isBlank() || confirmpass.isBlank()){
            Toast.makeText(this,"Please Email and password cant be blank",Toast.LENGTH_LONG).show()
            return
        }  else if (pass != confirmpass){
            Toast.makeText(this,"Password do not match",Toast.LENGTH_LONG).show()
            return

        }
        auth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(this) {
            if (it.isSuccessful){
                register.setOnClickListener{
                    val intent = Intent(this, Login::class.java)
                    startActivity(intent)
                }
            }else{
                Toast.makeText(this,"Failed to create",Toast.LENGTH_LONG).show()
            }

        }
    }
}