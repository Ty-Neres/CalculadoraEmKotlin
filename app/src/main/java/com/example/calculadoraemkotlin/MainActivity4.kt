package com.example.calculadoraemkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)


        val voltar2 = findViewById<Button>(R.id.voltar2)

        voltar2.setOnClickListener({
            intermediarioParaInicio()
        })

    }


    private fun intermediarioParaInicio() {
        val intermediarioParaInicio = Intent(this, MainActivity2::class.java)
        startActivity(intermediarioParaInicio)
    }
}
