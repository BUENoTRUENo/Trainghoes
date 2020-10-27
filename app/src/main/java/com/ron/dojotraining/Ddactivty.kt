package com.ron.dojotraining

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Ddactivty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ddactivty)

        val firstbooty : Button =findViewById(R.id.firstmist)
        firstbooty .setOnClickListener {
            startActivity(Intent(  this,EActivity::class.java))
        }

        val secbooty : Button =findViewById(R.id.segunda)
        secbooty .setOnClickListener {
            startActivity(Intent( this,FActivity::class.java))
        }

        val thirdbooty : Button =findViewById(R.id.thirdccc)
        thirdbooty .setOnClickListener {
            startActivity(Intent( this,GActivity::class.java))
        }

        val fouthbooty : Button =findViewById(R.id.fourthcorner)
        fouthbooty .setOnClickListener {
            startActivity(Intent(this,HhActivity::class.java))
        }
    }
}