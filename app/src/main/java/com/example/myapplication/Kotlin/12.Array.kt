package com.example.myapplication.Kotlin

// 12. 배열

fun main(array: Array<String>) {
    var group1 = arrayOf<Int>(1, 2, 3, 4, 5)
    println(group1 is Array)

    var group2 = arrayOf(1, 2, 3.5, "hello")

    // 배열의 값을 꺼내는 법
    var test1 = group1.get(0)
    var test2 = group1.get(4)
    println(test1)
    println(test2)

    val test3 = group1[0]
    println(test3)

    //배열의 값을 바꾸는 법
    group1.set(0, 100) // 0번 인덱스의 값을 100으로 바꿈
    println(group1[0])

    //배열의 값 바꾸는 법
    group1[0] = 200
    println(group1[0])
}