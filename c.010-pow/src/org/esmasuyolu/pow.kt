package org.esmasuyolu

import kotlin.math.abs

fun main()
{
    print("base? ")
    val base = readLine()!!.toInt()

    print("exponent? ")
    val exponent = readLine()!!.toInt()

    println("$base^$exponent = ${pow(base, exponent)}")
}

fun pow(a: Int, b: Int) : Int
{
    var result = 1
    val b = abs(b)

    for (i in 1..b)
        result *= a

    return result
}
