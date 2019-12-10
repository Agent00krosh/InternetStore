package com.example.internetstore

class Product(
    var catalogId:Int = -1,
    var productId: Int = -1,
    var description: String = "",
    var cost: Int = -1
) {
    fun order(id:Int): Boolean{
        return false
    }

    private fun sendData():Product{
        return this
    }
}