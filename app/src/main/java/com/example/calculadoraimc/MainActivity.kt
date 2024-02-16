package com.example.calculadoraimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var btnCalcular: Button
    private lateinit var editePeso: EditText
    private lateinit var editeAltura: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular = findViewById(R.id.btn_Calcular)
        editePeso = findViewById(R.id.edit_peso)
        editeAltura = findViewById(R.id.edite_altura)

        btnCalcular.setOnClickListener{
            val intent = Intent(this, ResultadoActivity::class.java)

            val peso = editePeso.text.toString()
            val altura = editeAltura.text.toString()

            if (peso.isNotEmpty() && altura.isNotEmpty()){
                intent.putExtra("peso",peso.toDouble())
                intent.putExtra("altura",altura.toDouble())
            }

            startActivity(intent)
        }

    }
}