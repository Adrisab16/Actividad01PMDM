package com.PMDM.actividad01pmdm

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private var clickCount = 0
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainButton = findViewById<Button>(R.id.button1)
        val textView = textView.findViewById<TextView>(R.id.textView2)
        mainButton.setOnClickListener{
            clickCount ++

            if (clickCount < 5){
                textView.text = "¡Has hecho click $clickCount veces!"
                textView.textSize = 24F
            }
            else{
                textView.textSize = 22F
                textView.text = "¡Has hecho click varias veces ($clickCount)"
                if (clickCount >= 10){
                    mainButton.isEnabled = false
                    Toast.makeText(this, "El botón ha sido desactivado", Toast.LENGTH_SHORT).show()
                    textView.text = "¡Te has pasado de clicks!"
                }
            }

            when(clickCount){
                1->{
                    textView.text = "¡Has hecho click una vez!"
                }
                2->{
                    textView.text = "¡Has hecho click dos veces!"
                }
            }

            if (clickCount in 3..4){
                textView.text = "¡Has hecho click $clickCount veces!"
            }

            /*
            * Se podría hacer de una forma mucho más simplificada de la siguiente forma:
            *
            * if (clickCount < 5){
                textView.text = "¡Has hecho click $clickCount veces!"
                textView.textSize = 24F
            }
            *
            * Sin embargo, el ejercicio me pide que la primera y segunda vez que se haga
            * click, el número debe aparecer escrito en letras, no en números.
            * */
        }
    }
}