package org.esmasuyolu

import kotlin.math.abs

fun main()
{
    print("enter a number: ")
    val a = readLine()!!.toInt()

    println("the sum of the digits of the number $a : ${digitsSum(a)}")
}

fun digitsSum(a: Int) : Int
{
    var sum: Int = 0

    var value = abs(a)

    while (value != 0) {
        sum += value % 10
        value /= 10
    }

    return sum
}