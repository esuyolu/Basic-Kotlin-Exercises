package org.esmasuyolu

import kotlin.math.sqrt

fun main()
{
    print("a:")
    val a = readLine()!!.toDouble()

    print("b:")
    val b = readLine()!!.toDouble()

    print("c:")
    val c = readLine()!!.toDouble()

    findRoots(a, b, c)
}

fun findRoots(a: Double, b: Double, c: Double)
{
    fun getDelta() = b * b - 4 * a * c
    val delta = getDelta()

    if (delta >  0) {
        val sqrtDelta = sqrt(delta)
        val x1 = (-b + sqrtDelta) / (2 * a)
        val x2 = (-b - sqrtDelta) / (2 * a)

        println("x1=$x1, x2=$x2")
    }

    else if (delta == 0.0) {
        val x = -b / (2 * a)

        println("x1=x2=$x")
    }

    else
        println("no real roots")
}