package com.example.internetstore

class Order(
    var id: Int = -1,
    var deliveryData: String = "",
    var orderData: String = "",
    var count: Int = 0,
    var contactInfo: String = "",
    var deliveryWay: String = ""
) {
    fun orderInfo(id: Int): Order {
        return this
    }

    fun createOrder(): Order {
        return Order()
    }
}