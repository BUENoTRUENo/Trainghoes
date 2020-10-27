package com.ron.dojotraining

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HhActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_efg)

        val fourthwayout : Button =findViewById(R.id.fact_button)
        fourthwayout .setOnClickListener {
            startActivity(Intent(this,LastActivity::class.java))
        }
    }

}