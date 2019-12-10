package com.example.internetstore

class Catalog(
    var id: Int = -1,
    var name: String
) {
    var orders: List<Product> = mutableListOf()

    fun sendCatalog(id: Int): Catalog{
        return this
    }
}