package com.ron.dojotraining

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RoomFtoEye : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_fto_eye)

        val gettooeye : Button =findViewById(R.id.eyetoeye)
        gettooeye .setOnClickListener {

            startActivity(EyeLastpoint.newIntent(this))
        }
    }
}