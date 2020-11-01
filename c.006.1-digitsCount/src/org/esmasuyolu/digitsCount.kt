package org.esmasuyolu

import kotlin.math.absoluteValue
import kotlin.math.log10

fun main()
{
    print("enter a number: ")
    val a = readLine()!!.toInt()

    println("number of digits for $a: ${digitsCount(a)}")
}

fun digitsCount(value: Int) = if (value == 0) 1 else log10(value.absoluteValue.toDouble()).toInt() + 1