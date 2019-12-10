package com.example.internetstore

class User(
    var id: Int,
    var adress: String,
    var contactData: String,
    var login: String,
    var password: String,
    var orderList: List<Order>,
    var fio: String
)