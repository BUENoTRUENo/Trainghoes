package com.ron.dojotraining

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Switch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton:Button = findViewById(R.id.fuckinbutton)
        val flippyswitch :Switch =findViewById(R.id.toddlelearn)
        val radsrads :RadioButton =findViewById(R.id.radswitchy)
        val checkychecky :CheckBox = findViewById(R.id.checkingshitout)

          flippyswitch.setOnCheckedChangeListener { buttonView, isChecked ->
              Log.d("here","blahblahblah $isChecked")
              if (isChecked){
                  title="This Shit Works"
              } else{
                  title="This Shit Dont Work"
              }
          }
        loginButton.setOnClickListener {

            startActivity(Intent(this,SecondActivity::class.java))

        }
    }

}