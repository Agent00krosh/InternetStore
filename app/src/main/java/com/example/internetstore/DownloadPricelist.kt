package com.example.internetstore

import java.io.File

class DownloadPricelist(
    var pricelist: File
) : Operation() {
    private fun sendPriceList() {}

    private fun checkData(): Boolean {
        return true
    }
}