package com.example.myapplication.Kotlin

// 11. 제어흐름 실습

fun main(args: Array<String>) {
    val value: Int? = null
    when (value) {
        null -> println("value is null")
        else -> println("value is not null")
    }

    val value2: Boolean? = null

    // when 구문은 조건으로 갖는 값의 모든 경우에 대응해주는 것이 좋음
    when (value2) {
        true -> println("")
        false -> println("")
        null -> println("")
    }

    // 값을 return하는 when구문의 경우 반드시 값을 return해야 한다.
    val value3 = when (value2) {
        true -> 1
        false -> 3
        else -> 4
    }

    val value4: Int = 10
    when (value4) {
        is Int -> { // is는 type을 물을수 있는 구문
            println("value4 is int")
        }
        else -> {
            println("value4 is not int")
        }
    }

    val value5: Int = 87
    when (value5) {
        in 60..70 -> {
            println("value is in 60-70")
        }
        in 70..80 -> {
            println("value is in 70-80")
        }
        in 80..90 -> {
            println("value is in 80-90")
        }
    }
}