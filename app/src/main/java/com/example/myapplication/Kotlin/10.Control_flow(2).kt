package com.example.myapplication.Kotlin

// When

fun main(args: Array<String>) {
    val value: Int = 3

    when (value) {
        1 -> {
            println("first")
        }
        2 -> {
            println("second")
        }
        3 -> {
            println("third")
        }
        else -> {
            println("I don't know")
        }
    }
}