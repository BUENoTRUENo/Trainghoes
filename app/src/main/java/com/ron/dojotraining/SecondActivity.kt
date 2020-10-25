package com.ron.dojotraining

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val byuton : Button =findViewById(R.id.superbutton)
        byuton .setOnClickListener {
            //startActivity(Intent(this,CcActivity::class.java))
            startActivity(EyeLastpoint.newIntent(this))
        }
    }
}