package com.example.internetstore

import android.app.Application


class Main : Application() {

    override fun onCreate() {
        super.onCreate()

        ShowProductList()
        WatchCatalog()
        WorkWithGarbage()
        SearchProducts()
    }
}