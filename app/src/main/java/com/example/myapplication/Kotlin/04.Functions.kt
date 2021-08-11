package com.example.myapplication.Kotlin

// - 함수를 선언하는 방법
// fun 함수명 (변수명: 타입, 변수명: 타입 ...) : 반환형 {
//      함수내용
//      return 반환값
// }
fun plus(first: Int, second: Int): Int {
    val result: Int = first + second
    return result
}

// - default 값을 갖는 함수 만들기
fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

// - 반환값이 없는 함수 만들기
fun printPlus(first: Int, second: Int): Unit {
    val result: Int = first + second
    println(result)
}

// - 간단하게 함수 선언하기
fun plusShort(first: Int, second: Int) = first + second

// - 가변인자를 갖는 함수 선언하는 방법
fun plusMany(vararg numbers: Int): Unit {
    for(number in numbers){
        println(number)
    }
}

fun main(array: Array<String>) {
    val result = plus(5, 10)
    val result2 = plus(first = 20, second = 30)
    println(result)
    println(result2)

    val result3 = plusFive(10)
    println(result3)
    printPlus(10, 20)
    println(plusShort(50, 50))

    plusMany(1, 2, 3, 4, 5)
}