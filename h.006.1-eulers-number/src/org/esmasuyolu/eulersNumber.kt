package org.esmasuyolu

fun main()
{
    println("Euler's Number : ${eulerNumber()}")
}

fun eulerNumber() : Double
{
    var e : Double = 0.0

    for (i in 0..10)
        e += (1.0 / factorial(i))

    return e
}

fun factorial(n: Int) : Int
{
    var fac = 1

    for (i in 2..n)
        fac *= i

    return fac
}