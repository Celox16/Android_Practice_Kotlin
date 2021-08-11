package com.example.myapplication.Kotlin

fun first() {
    val list1 = MutableList(9, { 0 })
    val list2 = MutableList(9, { true })

    for (i in 0..8) {
        list1[i] = i + 1
    }


}

fun main(array: Array<String>){
    first()
}