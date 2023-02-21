package com.pallavi.relative_layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tv1:TextView
    lateinit var et1:EditText
    lateinit var tv2:TextView
    lateinit var et2:EditText
    lateinit var b1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv1=findViewById(R.id.tv1)
        et1=findViewById(R.id.et1)
        tv2=findViewById(R.id.tv2)
        et2=findViewById(R.id.et2)
        b1=findViewById(R.id.b1)
        b1.setOnClickListener {
            if (et1.text.isEmpty())
            {
                et1.error="enter your name"
            }
            else if(et2.text.isEmpty())
            {
                et2.error="enter your last name"
            }

        }
    }
}