package com.ron.dojotraining

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FActivity : AppCompatActivity() {

    companion object{
        fun frontDoorSixNine(context: Context):Intent{
            val intent=Intent(context,FActivity::class.java)
            return intent
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_fto_eye)

        val gettooeye : Button =findViewById(R.id.eyetoeye)
        gettooeye.setOnClickListener {
            startActivity(LastActivity.hoeassbugga(this))
        }
    }
}