package com.example.calculadoraemkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val voltar = findViewById<Button>(R.id.voltar)

        voltar.setOnClickListener({
            basicoParaInicio()
        })

    }


    private fun basicoParaInicio() {
        val basicoParaInicio = Intent(this, MainActivity2::class.java)
        startActivity(basicoParaInicio)
    }
}