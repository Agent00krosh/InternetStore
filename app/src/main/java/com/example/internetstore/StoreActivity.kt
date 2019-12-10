package com.example.internetstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.internetstore.enums.Operation

class StoreActivity : AppCompatActivity() {

    private var contactData: String = ""
    private var name: String = ""
    private var aboutStore = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun makeOpetion(operation: Operation) {

    }

    private fun exit() {
    }

    fun showPI() {}

    private fun checkData():Boolean {
        return false
    }
}
