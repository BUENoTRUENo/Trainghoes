package com.ron.dojotraining

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cc)

        val fishbutton : Button =findViewById(R.id.bigfingerbutton)
        fishbutton .setOnClickListener {
            startActivity(Intent( this,Ddactivty::class.java))
        }
    }
}