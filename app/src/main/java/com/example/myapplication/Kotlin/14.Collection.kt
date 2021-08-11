package com.example.myapplication.Kotlin

// list, set, map

fun main(args: Array<String>){
    // Immuytable collection (변경 불가능)
    // list 중복 허용
    val numberList = listOf<Int>(1, 2, 3, 3)
    println(numberList)
    println(numberList.get(0))
    println(numberList[0])

    // set 중복 허용하지 않음
    val numberSet = setOf<Int>(1, 2, 3, 3, 3)
    println(numberSet)
    numberSet.forEach{
        println(it)
    }

    // map key-value형식
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    println(numberMap.get("one"))

    // Mutable Collection (변경가능)
    val mNumberList = mutableListOf<Int>(1, 2, 3)
    mNumberList.add(3, 4)
    println(mNumberList)

    val mNumberSet = mutableSetOf<Int>(1, 2, 3, 4, 4, 4)
    mNumberSet.add(10)
    println(mNumberSet)

    val mNumberMap = mutableMapOf<String, Int>("one" to 1)
    mNumberMap.put("two", 2)
    println(mNumberMap)
}