package com.example.internetstore

class Registration(
    var login: String = "",
    var password: String = "",
    var email: String = ""
): Operation() {
    private fun showWindow() {}

    private fun checkData(): Boolean {
        return true
    }

    private fun registration(email: String, login: String, password: String) {

    }
}