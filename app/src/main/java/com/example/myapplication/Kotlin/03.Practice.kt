package com.example.myapplication.Kotlin

var a = 1 + 2 + 3 + 4 + 5 // 연산의 결과값을 넣을 수 있음
var b = "1"
var c = b.toInt() // b를 int형으로 바꿔줌
var d = b.toFloat() // b를 float형으로 바꿔줌

var e = "John"
var f = "My name is $e Nice to meet you"

//var abc : Int = null
var abc1 : Int? = null

var g = a + 3

fun main(array: Array<String>){
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(abc1)

    println(g)
}