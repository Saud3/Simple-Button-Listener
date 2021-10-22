package com.example.simplebuttonlistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

lateinit var btKotlin:Button
lateinit var btXml:Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btKotlin = findViewById(R.id.btKotlin)
        btKotlin.setOnClickListener {
           Toast.makeText(this,"Hello world from Kotlin",Toast.LENGTH_LONG).show()

        }

    }
    fun sendMessage(view: View){
        Toast.makeText(this,"Hello world from Xml",Toast.LENGTH_LONG).show()

    }
}