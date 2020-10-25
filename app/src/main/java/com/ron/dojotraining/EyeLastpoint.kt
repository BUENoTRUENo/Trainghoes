package com.ron.dojotraining

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class EyeLastpoint : AppCompatActivity() {

    companion object{
        fun newIntent(context:Context):Intent{
           val intent=Intent(context,EyeLastpoint::class.java)
            return intent
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eye_lastpoint)
    }
}