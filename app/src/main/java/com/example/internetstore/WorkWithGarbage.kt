package com.example.internetstore

class WorkWithGarbage : Operation() {
    var garbage: List<Garbage> = mutableListOf()

    private fun showProductList() {
        ShowProductList()
    }

    fun addProductToGarbage(product: Product): Boolean {
        return true
    }

    private fun showWindow() {}

    private fun checkData(): Boolean {
        return true
    }

    fun listProductsInGarbage(): List<Product> {
        return mutableListOf()
    }

    fun deleteProductFromGarbage(product: Product): Boolean {
        return true
    }
}