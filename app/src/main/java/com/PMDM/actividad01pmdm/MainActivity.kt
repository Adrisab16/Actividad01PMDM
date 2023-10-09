package com.PMDM.actividad01pmdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private var clickCount = 0

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
                        // Mensaje TextView cuando clickCount = 1, obteniendolo de strings.xml
                        textView.text = getString(R.string.First_msg)
                    }
                    2->{
                        // Mensaje TextView cuando clickCount = 1, obteniendolo de strings.xml
                        textView.text = getString(R.string.Second_msg)
                    }
                }
                if (clickCount in 3..5){
                    // Mensaje TextView desde 3er hasta 5o click
                    "¡Has hecho click $clickCount veces!".also { textView.text = it }
                }
            }
            else{
                //Tamaño y texto cambiado cuando clickCount >= 5
                textView.textSize = 22F
                "¡Has hecho click varias veces! ($clickCount)".also { textView.text = it }

                // Implementación de la funcionalidad requerida cuando clickCount >=10
                if (clickCount >= 10){
                    //Desactivamos botón:
                    mainButton.isEnabled = false
                    // Creamos mensaje toast
                    Toast.makeText(this, "El botón ha sido desactivado", Toast.LENGTH_SHORT).show()
                    // Mensaje TextView
                    textView.text = getString(R.string.MuchosClicks_msg)
                }
            }
            /*
            * La parte del mensaje con el contador de números deel 1 al 5
            * se podría hacer de una forma mucho más simplificada de la siguiente forma:
            *
            * if (clickCount <= 5){
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