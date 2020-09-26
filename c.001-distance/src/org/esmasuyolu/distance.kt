package org.esmasuyolu

import kotlin.math.pow
import kotlin.math.sqrt

fun main()
{
    findDistance()
}

fun findDistance()
{
    print("x1?")
    val x1 = readLine()!!.toDouble()

    print("y1?")
    val y1 = readLine()!!.toDouble()

    print("x2?")
    val x2 = readLine()!!.toDouble()

    print("y2?")
    val y2 = readLine()!!.toDouble()

    val result = distance(x1, y1, x2, y2)

    println("distance between points ($x1, $y1) and ($x2, $y2): $result")
}

fun distance(x1: Double, y1: Double, x2: Double = 0.0, y2: Double = 0.0) = sqrt((x1 - x2).pow(2.0) + (y1 - y2).pow(2.0))