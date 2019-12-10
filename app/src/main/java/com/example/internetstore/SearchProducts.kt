package com.example.internetstore

class SearchProducts(
    var dataForSearch: String = "",
    var product: List<Product> = mutableListOf()
): Operation() {
    var products: List<Product> = mutableListOf()

    private fun showProductList() {
        ShowProductList()
    }

    private fun showWindow() {}

    private fun checkData(): Boolean {
        return true
    }

    fun result(): Product {
        return Product()
    }
}