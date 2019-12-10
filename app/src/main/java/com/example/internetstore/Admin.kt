package com.example.internetstore

class Admin(
    var id: Int = -1,
    var login: String = "",
    var password: String = "",
    var procentSale: Int = -1,
    var fio: String = ""
) {
    fun addProductToCatalog(product: Product) {

    }

    fun deleteProductFromCatalog(product: Product) {

    }

    fun addSale(sale: Int) {
        this.procentSale = sale
    }
}