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
            //Cada vez que hace click, clickcount subirá en 1 (clickCount = clickCount +1)
            clickCount ++

            //Implementación del tamaño especificado si clickCount < 5
            if (clickCount <= 5){
                textView.textSize = 24F
                when(clickCount){
                    1->{
                        // Mensaje TextView cuando clickCount = 1
                        textView.text = "¡Has hecho click una vez!"
                    }
                    2->{
                        // Mensaje TextView cuando clickCount = 1
                        textView.text = "¡Has hecho click dos veces!"
                    }
                }
                if (clickCount in 3..5){
                    // Desde
                    textView.text = "¡Has hecho click $clickCount veces!"
                }
            }
            else{
                //Tamaño y texto cambiado cuando clickCount >= 5
                textView.textSize = 22F
                textView.text = "¡Has hecho click varias veces ($clickCount)"

                // Implementación de la funcionalidad requerida cuando clickCount >=10
                if (clickCount >= 10){
                    //Desactivamos botón:
                    mainButton.isEnabled = false
                    // Creamos mensaje toast
                    Toast.makeText(this, "El botón ha sido desactivado", Toast.LENGTH_SHORT).show()
                    // Mensaje TextView
                    textView.text = "¡Te has pasado de clicks!"
                }
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