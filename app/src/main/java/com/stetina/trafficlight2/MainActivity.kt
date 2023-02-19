package com.stetina.trafficlight2

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var colors = intArrayOf(-0x10000, -0xff8000, -0x100)


    var message = arrayOf("STOP", "GO", "WAIT")


    var buttonCount = 0


    var label: View? = null
    var messageButton: Button? = null


    fun ChangeTrafficSignal(view: View?) {

        buttonCount += 1
        buttonCount = buttonCount % 3
        
        label!!.setBackgroundColor(colors[buttonCount])

        messageButton!!.text = message[buttonCount]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        label = findViewById(R.id.SingalView)
        messageButton = findViewById(R.id.singalButton)
    }
}