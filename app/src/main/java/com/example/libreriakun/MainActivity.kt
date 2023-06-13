package com.example.libreriakun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import java.io.Serializable

class MainActivity : AppCompatActivity() {

    private lateinit var txtNewISBN: EditText
    private lateinit var txtNewBook: EditText
    private lateinit var btnRegister: Button
    private lateinit var txtNro: TextView
    private lateinit var txtISBN: TextView
    private lateinit var txtBook: TextView
    private lateinit var tabla: TableLayout
    private lateinit var spinCliente: Spinner
    private lateinit var btnNota: Button
    private lateinit var btnVolver: Button

    private var ISBN: Int = 0
    private var libro: String = ""
    private var nameCli: String = ""
    private var fechaNota: String = ""
    private var cont: Int = 0

    private var list: MutableList<Any> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.txtNewISBN = findViewById(R.id.txtNewISBN)
        this.txtNewBook = findViewById(R.id.txtNewBook)
        this.btnRegister = findViewById(R.id.btnRegister)
        this.txtNro = findViewById(R.id.txtNro)
        this.txtISBN = findViewById(R.id.txtISBN)
        this.txtBook = findViewById(R.id.txtBook)
        this.tabla = findViewById(R.id.tabla)
        this.spinCliente = findViewById(R.id.spinCliente)
        this.btnNota = findViewById(R.id.btnNota)

        btnRegister.setOnClickListener {
            //Add new Book - All ok
            cont++
            ISBN = txtNewISBN.text.toString().toInt()
            libro = txtNewBook.text.toString()
            val librito = Libro(ISBN, libro)

            //Agregar fila a la tabla
            val newRow = TableRow(this)
            tabla.addView(newRow)
            //Agregar datos a la fila
            val contTV = TextView(this)
            val iSBNTV = TextView(this)
            val bookTV = TextView(this)
            contTV.text = cont.toString()
            iSBNTV.text = librito.getISBN().toString()
            bookTV.text = librito.getLibro()
            newRow.addView(contTV)
            newRow.addView(iSBNTV)
            newRow.addView(bookTV)

            //Vaciar los datos del editTxt
            txtNewISBN.text.clear()
            txtNewBook.text.clear()
        }

        btnNota.setOnClickListener {
            val intent = Intent(this,Nota::class.java)

            //ir a acitivty_nota



        }

    }
}