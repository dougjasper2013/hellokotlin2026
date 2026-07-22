package org.example

fun main() {

    // Long hand version
    var multiplyLambda = { x: Int, y: Int -> x + y }

    // For some reason in this application it may be
    // beneficial to change what the function does
    // and here we use the short hand version shown
    // below to do that.

    // Short hand version
    multiplyLambda = { x, y -> x * y }

    var lambdaResult = multiplyLambda(4, 2)
    println(lambdaResult)

}