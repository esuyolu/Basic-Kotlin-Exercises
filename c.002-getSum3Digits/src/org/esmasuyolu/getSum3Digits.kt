package org.esmasuyolu

import kotlin.math.abs

fun main()
{
    print("enter a three-digit number: ")
    val n = readLine()!!.toInt()

    println("the sum of digits of the number $n: ${getSum3Digits(n)}")
}

fun getSum3Digits(num: Int) : Int
{
    val a = num / 100
    val b = num / 10 % 10
    val c = num % 10

    return abs(a + b + c)
}