package com.ron.dojotraining

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_gtoeye)

        val thewayout : Button =findViewById(R.id.mango)
        thewayout .setOnClickListener {
            startActivity(Intent(this,LastActivity::class.java))
        }
    }
}