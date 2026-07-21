package org.example

import  kotlin.random.Random.Default.nextInt

fun main() {
    var intro = printName("Daffy Duck") // calling or invoking the function
    println(intro)

    var dice = rollDice()
    println(dice)

    for(i in 1..100) {
        dice = rollDice()
        println(dice)
    }
}

fun printName(name: String): String { // function definition
    println("My name is $name")
    var greeting = "Hi, $name! How are you?"

    return greeting
}

fun rollDice(): Int {
    val roll = nextInt(1, 7)
    return roll
}