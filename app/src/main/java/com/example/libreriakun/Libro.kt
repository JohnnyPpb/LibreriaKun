package com.example.libreriakun

import java.io.Serializable

class Libro(ISBN: Int = 0, libro: String = "") : Serializable {
    // Propiedades de la clase Libro
    private var ISBN: Int = ISBN
    private var libro: String = libro

    fun getISBN(): Int = this.ISBN
    fun getLibro(): String = this.libro
}