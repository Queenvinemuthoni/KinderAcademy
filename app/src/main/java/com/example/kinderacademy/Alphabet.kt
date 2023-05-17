package com.example.kinderacademy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Alphabet : AppCompatActivity() {

    lateinit var a:Button
    lateinit var b:Button
    lateinit var c:Button
    lateinit var d:Button
    lateinit var e:Button
    lateinit var f:Button
    lateinit var g:Button
    lateinit var h:Button
    lateinit var i:Button
    lateinit var j:Button
    lateinit var k:Button
    lateinit var l:Button
    lateinit var m:Button
    lateinit var n:Button
    lateinit var o:Button
    lateinit var p:Button
    lateinit var q:Button
    lateinit var r:Button
    lateinit var s:Button
    lateinit var t:Button
    lateinit var u:Button
    lateinit var v:Button
    lateinit var w:Button
    lateinit var x:Button
    lateinit var y:Button
    lateinit var z:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alphabet)

        a=findViewById(R.id.button_a)
        b=findViewById(R.id.button_b)
        c=findViewById(R.id.button_c)
        d=findViewById(R.id.button_d)
        e=findViewById(R.id.button_E)
        f=findViewById(R.id.button_f)
        g=findViewById(R.id.button_g)
        h=findViewById(R.id.button_h)
        i=findViewById(R.id.button_i)
        j=findViewById(R.id.button_j)
        k=findViewById(R.id.button_k)
        l=findViewById(R.id.button_l)
        m=findViewById(R.id.button_m)
        n=findViewById(R.id.button_n)
        o=findViewById(R.id.button_o)
        p=findViewById(R.id.button_p)
        q=findViewById(R.id.button_q)
        r=findViewById(R.id.button_r)
        s=findViewById(R.id.button_s)
        t=findViewById(R.id.button_t)
        u=findViewById(R.id.button_u)
        v=findViewById(R.id.button_v)
        w=findViewById(R.id.button_w)
        x=findViewById(R.id.button_x)
        y=findViewById(R.id.button_y)
        z=findViewById(R.id.button_z)

        a.setOnClickListener {
            val intent = Intent(this, Apple::class.java)
            startActivity(intent)
        }
        b.setOnClickListener {
            val intent = Intent(this, Banana::class.java)
            startActivity(intent)
        }
        c.setOnClickListener {
            val intent = Intent(this, Cabbage::class.java)
            startActivity(intent)
        }
        d.setOnClickListener {
            val intent = Intent(this, Doc::class.java)
            startActivity(intent)
        }
        e.setOnClickListener {
            val intent = Intent(this, Elephant::class.java)
            startActivity(intent)
        }
        f.setOnClickListener {
            val intent = Intent(this, Firetruck::class.java)
            startActivity(intent)
        }
        g.setOnClickListener {
            val intent = Intent(this, Guitar::class.java)
            startActivity(intent)
        }
        h.setOnClickListener {
            val intent = Intent(this, Horse::class.java)
            startActivity(intent)
        }
        i.setOnClickListener {
            val intent = Intent(this, Icecream::class.java)
            startActivity(intent)
        }
        j.setOnClickListener {
            val intent = Intent(this, Jar::class.java)
            startActivity(intent)
        }
        k.setOnClickListener {
            val intent = Intent(this, Kite::class.java)
            startActivity(intent)
        }
        l.setOnClickListener {
            val intent = Intent(this, Ladder::class.java)
            startActivity(intent)
        }
        m.setOnClickListener {
            val intent = Intent(this, Mango::class.java)
            startActivity(intent)
        }
        n.setOnClickListener {
            val intent = Intent(this, Nest::class.java)
            startActivity(intent)
        }
        o.setOnClickListener {
            val intent = Intent(this, Owl::class.java)
            startActivity(intent)
        }
        p.setOnClickListener {
            val intent = Intent(this, Panda::class.java)
            startActivity(intent)
        }
        q.setOnClickListener {
            val intent = Intent(this, Queen::class.java)
            startActivity(intent)
        }
        r.setOnClickListener {
            val intent = Intent(this, Rabbit::class.java)
            startActivity(intent)
        }
        s.setOnClickListener {
            val intent = Intent(this, Socks::class.java)
            startActivity(intent)
        }
        t.setOnClickListener {
            val intent = Intent(this, Tortoise::class.java)
            startActivity(intent)
        }
        u.setOnClickListener {
            val intent = Intent(this, Umbrella::class.java)
            startActivity(intent)
        }
        v.setOnClickListener {
            val intent = Intent(this, Van::class.java)
            startActivity(intent)
        }
        w.setOnClickListener {
            val intent = Intent(this, Wolf::class.java)
            startActivity(intent)
        }
        x.setOnClickListener {
            val intent = Intent(this, Xylophone::class.java)
            startActivity(intent)
        }
        y.setOnClickListener {
            val intent = Intent(this, Yoyo::class.java)
            startActivity(intent)
        }
        z.setOnClickListener {
            val intent = Intent(this, Zebra::class.java)
            startActivity(intent)
        }


    }
}