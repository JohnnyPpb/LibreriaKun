package com.example.libreriakun

import android.os.Bundle
import android.widget.Button
import android.widget.TableLayout
import android.widget.TableRow
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

        val i = intent.getStringExtra("Nro.")
        val cliente = intent.getStringExtra("Cliente")

        text.text = cliente
        val bundle = intent.extras

        val listaLibros = bundle?.getSerializable("listaLibros") as List<Libro>

        if(listaLibros != null){
            for(libro in listaLibros){
                val row = TableRow(this)
                val textViewNum = TextView(this)

                textViewNum.text = nro.toString()
                this.nro++

            }

        this.btnVolver = findViewById(R.id.btnVolver)
        btnVolver.setOnClickListener {

        }

    }
}