package com.example.myapplication.Kotlin

fun main(array: Array<String>) {
    val array = arrayOf<Int>(1, 2, 3)

    // get, set
    val number = array.get(0)
    println(number)
    //val number1 = array.get(100)

    // how to create array 3
    val a1 = intArrayOf(1, 2, 3)
    val a2 = charArrayOf('a', 'b', 'c')
    val a3 = doubleArrayOf(1.2, 3.0, 4.5)
    val a4 = booleanArrayOf(true, false, true)

    // how to create array 4 -> use lambda
    var a5 = Array(10, { 0 })
    var a6 = Array(5, { 1;2;3;4;5 })
}