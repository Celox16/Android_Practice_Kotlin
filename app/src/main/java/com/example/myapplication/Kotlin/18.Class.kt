package com.example.myapplication.Kotlin

import java.util.zip.DeflaterInputStream

// 18. Class

fun main(array: Array<String>) {
    // instance (object)
    val bigCar = Car("v8 engine", "big")
    val bigCar1: Car = Car("v8 engine", "big")
    val superCar: SuperCar = SuperCar("good engine", "big", "white")

    // how to use instance has function
    val runnableCar: RunnableCar = RunnableCar("simple engine", "body")
    // RunnableCar.ride() -> impossible
    runnableCar.ride()
    runnableCar.navi("부산")
    runnableCar.drive()

    // 인스턴스 멤버 변수에 접근하는 방법
    val runnableCar2 : RunnableCar2 = RunnableCar2("nice engine", "long body")
    println(runnableCar2.body)
    println(runnableCar2.engine)

    val testClass = TestClass()
    testClass.test(1)
    testClass.test(1, 2)
}

// how to create class 1
class Car(var engine: String, var body: String) {

}

// how to create class 2
class SuperCar {
    var engine: String
    var body: String
    var door: String

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

// how to create class 3 -> first solution extensional
class Car1(engine: String, body: String) {
    var door: String = "" // must be initial default value

    constructor(engine: String, body: String, door: String) : this(engine, body) {
        this.door = door
    }
}

// how to create class 4 -> second solution extensional
class Car2 {
    var engine: String = ""
    var body: String = ""
    var door: String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

class RunnableCar(engine: String, body: String) {
    fun ride() {
        println("탑승 하였습니다.")
    }

    fun drive() {
        println("달랍니다 !")
    }

    fun navi(destination: String){
        println("$destination 으로 목적지가 설정되었습니다.")
    }
}

class RunnableCar2{
    var engine: String
    var body: String

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    init { // 인스턴스화 할때 가장 먼저 호출됨
        // 초기화 할때 유용하게 사용
        println("RunnableCar2가 만들어 졌습니다.")
    }

    fun ride() {
        println("탑승 하였습니다.")
    }

    fun drive() {
        println("달랍니다 !")
    }

    fun navi(destination: String){
        println("$destination 으로 목적지가 설정되었습니다.")
    }

}

// Overloading (same function name, different parameters)
class TestClass() {
    fun test(a: Int) {
        println("up")
    }

    fun test(a: Int, b: Int) {
        println("down")
    }
}