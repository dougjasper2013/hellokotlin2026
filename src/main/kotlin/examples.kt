package org.example

fun main() {
    val num1: Int = 7
    val num2 = 3

    // num2 = 4 val can NOT be reassigned
    // We can NOT change the value of anything created with val

    val num3 = num1/num2

    println("$num1 / $num2 is $num3")

    var dog = "Odie"
    println("My dog's name is $dog")

    dog = "Lassie"
    println("My dog's name is $dog")
    // var creates a variable which can be reassigned

    val yes: Boolean = true
    val no: Boolean = false

    val notYes: Boolean = !yes
    println("Yes: $yes, No: $no, Not Yes: $notYes")

    if (yes == !no)
    {
        println("These are the same")
    }
    else
    {
        println("These are NOT the same")
    }

    // ***** Note: Variables and Constants use camel casing for names *****
    val hourOfDay = 10

    val timeOfDay = if (hourOfDay < 6 ) {
        "Early Morning"
    }
    else if (hourOfDay < 12) {
        "Morning"
    }
    else if (hourOfDay < 17) {
        "Afternoon"
    }
    else if (hourOfDay < 20) {
        "Evening"
    }
    else if (hourOfDay < 24) {
        "Late Evening"
    }
    else {
        "INVALID HOUR!"
    }

    println("hourOfDay is $hourOfDay, timeOfDay is $timeOfDay")



}