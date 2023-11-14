package com.example.calculadoraemkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val botaoBasico = findViewById<Button>(R.id.botaoBasico)

        botaoBasico.setOnClickListener({
            inicioParaBasico()
        })

    }

    private fun inicioParaBasico() {
        val inicioParaBasico = Intent(this,MainActivity3::class.java)
        startActivity(inicioParaBasico)
    }
}