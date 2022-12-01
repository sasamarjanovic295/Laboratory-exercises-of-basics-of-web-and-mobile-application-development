package com.example.firstapp

import android.media.MediaDrm.LogMessage
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Count()

        DisplayImg()

        ShowToast()

        LogMsg("Ovo je Log poruka u Main Activityu!")
    }

    fun Count(){
        var counter = 0
        val textView = findViewById<TextView>(R.id.textView2)

        textView.text = counter.toString()

        findViewById<Button>(R.id.button2).setOnClickListener {
            counter += 1
            textView.text = counter.toString()
        }

        findViewById<Button>(R.id.button3).setOnClickListener {
            counter -= 1
            textView.text = counter.toString()
        }
    }

    fun DisplayImg(){
        var state = true
        val imageView = findViewById<ImageView>(R.id.imageView2)
        imageView.setOnClickListener {
            state = !state
            if (!state) {
                imageView.visibility = View.INVISIBLE
            }
            else {
                imageView.visibility = View.VISIBLE
            }
        }
    }

    fun ShowToast() {
        val button = findViewById<Button>(R.id.button4)
        button.setOnClickListener {
            Toast.makeText(this, getString(R.string.app_name), Toast.LENGTH_LONG).show()
        }
    }

    fun LogMsg(poruka: String){
        android.util.Log.d("MAIN ACTIVITY", poruka)
    }
}
