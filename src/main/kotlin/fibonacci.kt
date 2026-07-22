package org.example

// a fibonacci number is the sum of the previous 2 fibonacci numbers
// the fibonacci of 0 is 0
// the fibonacci of 1 is 1
// From now on the fibonacci number is the sum of the previous 2 fibonacci numbers
// For instance the fibonacci of 2 is 1 + 0 which is 1
// Next the fibonacci of 3 is the sum of the fibonacci of 2 and the fibonacci of 1
// which is 1 + 1 or 2
// Next the fibonacci of 4 is the sum of the fibonacci of 3 and the fibonacci of 2
// which is 2 + 1 or 3
// Next the fibonacci of 5 is the sum of the fibonacci of 4 and the fibonacci of 3
// which is 3 + 2 or 5
// and so on ...

fun main () {
    val num = 6
    var fib = fibonacci(num)
    println(fib)
}

fun fibonacci(n: Int): Long {
    if (n <= 0) {
        return 0
    }

    if (n == 1) {
        return 1
    }

    return fibonacci(n - 1) + fibonacci(n - 2)
}