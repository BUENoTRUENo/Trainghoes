package com.ron.dojotraining

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton:Button = findViewById(R.id.fuckinbutton)
        loginButton.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java))
        }
    }

}