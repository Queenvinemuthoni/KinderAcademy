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
// import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.FirebaseDatabase
// import com.google.firebase.firestore.auth.User
// import com.google.firebase.ktx.Firebase


class Register : AppCompatActivity() {
    private lateinit var logo:ImageView
    private lateinit var username:EditText
    private lateinit var enteremail:EditText
    private lateinit var enterphone:EditText
    private lateinit var enterpass:EditText
    private lateinit var confirmpass:EditText
    private lateinit var register: Button
    private lateinit var gototlogin:TextView

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
            val intent = Intent(this, Login::class.java)
            startActivity(intent)


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
            var ref=FirebaseDatabase.getInstance().getReference().child("Users/$pass")
            if (it.isSuccessful){
                Toast.makeText(this,"created",Toast.LENGTH_LONG).show()

            }else{
                Toast.makeText(this,"Failed to create",Toast.LENGTH_LONG).show()
            }

        }
    }
}