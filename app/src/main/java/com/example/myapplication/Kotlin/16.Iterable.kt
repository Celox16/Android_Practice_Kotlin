package com.example.myapplication.Kotlin

// 16. Iterable

fun main(array: Array<String>) {
    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // how to repeat 1
    for (item in a) {
        if (item == 5) println("item is Five")
        else println("item is not Five")
    }
    println()

    // how to repeat 2
    for ((index, item) in a.withIndex()) {
        println("index : " + index + " value : " + item)
        // 문자열 + Int(정수) = 문자열
        // 문자열 + 아무거나 = 문자
    }

    // how to repeat 3
    a.forEach {
        println(it)
    }

    // how to repeat 4
    a.forEach { item ->
        println(item)
    }

    // how to repeat 5
    a.forEachIndexed { index, item ->
        println("index : " + index + " value : " + item)
    }

    // how to repeat 6
    for (i in 0 until a.size) { // until은 미만의 개념
        println(a.get(i))
    }

    // how to repeat 7
    for (i in 0 until a.size step (2)) { // 2씩 증가
        println(a.get(i))
    }

    // how to repeat 8
    for (i in a.size - 1 downTo (0)) {
        println(a.get(i))
    }

    // how to repeat 9
    for (i in a.size - 1 downTo (0) step (2)) {
        println(a.get(i))
    }

    // how to repeat 10
    for (i in 0..10) { // ..은 이하 개념
        println(i)
    }

    // how to repeat 11
    var b: Int = 0
    var c: Int = 4

    while (b < c) {
        b++
        println("b")
    }

    // how to repeat 12
    var d: Int = 0
    var e: Int = 4
    do {
        println("hello")
        d++
    } while (d < e)
}