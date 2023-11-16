package com.example.calculadoraemkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

private lateinit var valor1EditText: EditText
private lateinit var valor2EditText: EditText

private  lateinit var resultadoTextView: TextView
var operacaoSelecionada : String ? = null
class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val voltar = findViewById<Button>(R.id.voltar)

        voltar.setOnClickListener({
            basicoParaInicio()
        })

        valor1EditText = findViewById(R.id.valor1)
        valor2EditText = findViewById(R.id.valor2)

        resultadoTextView = findViewById(R.id.resultado)

        val somaButton : Button = findViewById(R.id.soma)
        val subtracaoButton : Button = findViewById(R.id.subtracao)
        val divisaoButton : Button = findViewById(R.id.divisao)
        val multicacaoButton : Button = findViewById(R.id.multiplicacao)

        val enterButton : Button = findViewById(R.id.enter)

        somaButton.setOnClickListener{operacao("+")}
        subtracaoButton.setOnClickListener{operacao("-") }
        divisaoButton.setOnClickListener{operacao("/")}
        multicacaoButton.setOnClickListener{operacao("*")}

        enterButton.setOnClickListener{calcular()}
    }

    private fun calcular() {
        val valor1 = valor1EditText.text.toString().toDoubleOrNull()?: 0.0
        val valor2 = valor2EditText.text.toString().toDoubleOrNull()?: 0.0

        val resultado : Double = when(operacaoSelecionada){

            "+" -> valor1 + valor2
            "-" -> valor1 - valor2
            "*" -> valor1 * valor2
            "/" -> if (valor2 != 0.0) valor1 / valor2 else Double.NaN
            else -> Double.NaN
        }
        resultadoTextView.text = "$valor1 $operacaoSelecionada $valor2 = $resultado"
    }

    private fun operacao(operacao: String) {
    operacaoSelecionada = operacao
    }


    private fun basicoParaInicio() {
        val basicoParaInicio = Intent(this, MainActivity2::class.java)
        startActivity(basicoParaInicio)
    }
}