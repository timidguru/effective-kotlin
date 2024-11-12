package com.example.chapter01

fun sub() {
    val list = mutableListOf(1,2,3)
    list.add(4)

    println(list)
}

data class User(
    val name: String,
    val surname: String
)

fun main() {
    sub()

    var user = User("Jerry", "Kang")
    user = user.copy(surname = "Yang")
    print(user)
}