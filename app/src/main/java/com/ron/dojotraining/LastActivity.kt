package com.ron.dojotraining

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LastActivity : AppCompatActivity() {

    companion object{
        fun hoeassbugga(context:Context):Intent{
           val intent=Intent(context,LastActivity::class.java)
            return intent
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eye_lastpoint)
    }
}