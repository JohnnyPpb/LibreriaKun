package com.example.libreriakun

import android.os.Bundle
import android.widget.Button
import android.widget.TableLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Nota : AppCompatActivity() {

    private var nro:Int=0
    private lateinit var btnVolver: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nota)

        val tableLayoutNota = findViewById<TableLayout>(R.id.tablaNota)
        val text = findViewById<TextView>(R.id.txtNota)

        this.btnVolver = findViewById(R.id.btnVolver)

        btnVolver.setOnClickListener {

        }

    }
}