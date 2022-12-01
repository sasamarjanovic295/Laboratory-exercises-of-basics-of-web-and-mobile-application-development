package com.example.secondapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Unesi()

        Izracunaj()
    }

    fun Unesi(){
        val viewTextIgrac = findViewById<TextView>(R.id.textView2)
        val viewTextOpis = findViewById<TextView>(R.id.textView3)
        val editTextIgrac = findViewById<EditText>(R.id.editTex2)
        val editTextOpis = findViewById<EditText>(R.id.editTex3)
        val buttonUnesi = findViewById<Button>(R.id.button2)

        buttonUnesi.setOnClickListener {
            viewTextIgrac.text = editTextIgrac.text
            viewTextOpis.text = editTextOpis.text
        }
    }

    fun Izracunaj(){
        val editTextCm = findViewById<EditText>(R.id.editText4)
        val editTextKg = findViewById<EditText>(R.id.editText5)
        val buttonIzracunaj = findViewById<Button>(R.id.button3)

        buttonIzracunaj.setOnClickListener {
            var m = editTextCm.text.toString().toDouble() / 100.0
            var kg = editTextKg.text.toString().toDouble()
            var bmi = kg / m.pow(2)
            Toast.makeText(this, bmi.toString(), Toast.LENGTH_LONG).show()
        }
    }

}