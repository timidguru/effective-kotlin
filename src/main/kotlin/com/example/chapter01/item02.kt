package com.example.chapter01

import java.awt.Color

fun sub1() {

    val users : Array<String> = arrayOf("A", "B", "C")

    var user : String = ""
    for (i in users.indices){
        user = users[i]
        println("User at $i is $user")
    }
    println("-----")

    for (i in users.indices) {
        val user = users[i]
        println("User at $i is $user")
    }
    println("-----")

    for ((i, user) in users.withIndex()) {
        println("User at $i is $user")
    }
    println("-----")
}

fun sub2(degress: Int) {

    val description1: String

    if (degress < 5) {
        description1 = "cold"
    } else if (degress < 23) {
        description1 = "mild"
    } else {
        description1 = "hot"
    }
    println(description1)
    println("-----")

    val description2 = when {
        degress < 5 -> "cold"
        degress < 23 -> "mild"
        else -> "hot"
    }
    println(description2)
    println("-----")
}

fun sub31() {
    var numbers = (2..100).toList()
    val primes = mutableListOf<Int>()
    while (numbers.isNotEmpty()) {
        val prime = numbers.first()
        primes.add(prime)
        numbers = numbers.filter { it % prime != 0 }
    }
    println(primes)
    println("-----")
}

fun sub32() {
    val primes: Sequence<Int> = sequence {
        var numbers = generateSequence(2) { it + 1 }

        while (true) {
            val prime = numbers.first()
            yield(prime)
            numbers = numbers.drop(1)
                .filter { it % prime != 0 }
        }
    }
    println(primes.take(10).toList())
    println("-----")
}

fun sub33fail() {
    val primes: Sequence<Int> = sequence {
        var numbers = generateSequence(2) { it + 1 }

        var prime: Int
        while (true) {
            prime = numbers.first()
            yield(prime)
            numbers = numbers.drop(1)
                .filter { it % prime != 0 }
        }
    }
    println(primes.take(10).toList())
    println("-----")
}

fun main() {
    sub1()
    sub2(6)
    sub31()
    sub32()
    sub33fail()
}