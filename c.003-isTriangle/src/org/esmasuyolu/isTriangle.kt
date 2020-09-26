package org.esmasuyolu

import kotlin.math.abs

fun main()
{
    triangle()
}

fun triangle()
{
    print("a:")
    val a = readLine()!!.toDouble()

    print("b:")
    val b = readLine()!!.toDouble()

    print("c:")
    val c = readLine()!!.toDouble()

    if (isTriangle(a, b, c))
        println("$a, $b, $c form a triangle")
    else
        println("$a, $b, $c don't form a triangle")
}

fun isTriangle(a: Double, b: Double, c: Double)
        = a + b > c && a + c > b && b + c > a && abs(a- b) < c && abs(a - c) < b && abs(b - c) < a
