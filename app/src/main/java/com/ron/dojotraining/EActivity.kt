package com.ron.dojotraining

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_eto_eye)

        val eebitchassee : Button =findViewById(R.id.heatbear)
        eebitchassee .setOnClickListener {
            startActivity(Intent(this,LastActivity::class.java))
        }
    }
}