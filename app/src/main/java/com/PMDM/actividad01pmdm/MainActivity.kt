package com.PMDM.actividad01pmdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

class FirstActivity : AppCompatActivity() {
    var mainButton = findViewById<Button>(R.id.button1)
    fun initlistener(){

    }
    private fun clickCount(){
        var contador:Int=0
        while (contador < 5){
            when (contador){
                1 ->{}
            }
        }
    }
}