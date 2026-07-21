package org.example

fun main() {
    var sum = 1

    while (sum < 1000) {
        sum = sum + (sum + 1)
        println(sum)
    }
}