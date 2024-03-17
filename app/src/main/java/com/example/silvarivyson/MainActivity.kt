package com.example.silvarivyson

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputText = findViewById<EditText>(R.id.editText)
        val buttonApp = findViewById<Button>(R.id.button)
        val textLabel = findViewById<TextView>(R.id.Label)
        val textArea = findViewById<TextView>(R.id.textView)

        buttonApp.setOnClickListener{
            val text = inputText.text.toString()
            textLabel.visibility = View.VISIBLE
            textArea.text = text
        }
    }
}