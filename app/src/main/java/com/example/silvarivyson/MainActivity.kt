package com.example.silvarivyson

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : Activity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputText = findViewById<EditText>(R.id.editText)
        val buttonApp = findViewById<Button>(R.id.button)
        val bar = findViewById<View>(R.id.innerquadrado)
        val textArea = findViewById<TextView>(R.id.porcetagem)

        buttonApp.setOnClickListener{
            /*ESCONDE O TECLADO DPS DE CLICAR O BOTAO*/
            val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(buttonApp.windowToken, 0)
            /*ESCONDE O TECLADO DPS DE CLICAR O BOTAO*/

            textArea.text = inputText.text.toString() + "%"
            val params = bar.layoutParams as ConstraintLayout.LayoutParams
            params.height = (inputText.text.toString().toFloat()/100 * 500).toInt()
            bar.layoutParams = params
        }
    }
}