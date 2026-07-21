package org.example

fun main() {
    var sum = 500

    while (sum < 1000) {
        sum = sum + (sum + 1)
        println(sum)
    }

    println("The loop is finished and the sum is $sum")

    var sum2 = 0
    do {
        sum2 = sum2 + (sum2 + 1)
        println(sum2)
    } while (sum2 < 1000)

    println("The loop is finished and the sum is $sum2")

    // do while always executes at leat once
    // while may or may not execute at least once

    var sum3 = 1

    for (i in 1..5) {
        sum3 = sum3 + (i * 2)
        println(sum3)
    }
    println("The loop is finished and the sum is $sum3")


}