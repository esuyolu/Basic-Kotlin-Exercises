package org.esmasuyolu

import kotlin.math.absoluteValue
import kotlin.math.log10
import kotlin.math.pow

fun main()
{
    print("enter a number: ")
    var n = readLine()!!.toInt()

    display(digits(n))
    display(digits(n, 3))
}

fun display(numbers: IntArray)
{
    for (n in numbers)
        print("$n ")

    println()
}

fun digits(num: Int, n: Int = 1) : IntArray
{
    val count = if (num == 0) 1 else (log10(num.absoluteValue.toDouble()) / n).toInt() + 1
    val result = IntArray(count)
    var temp = num.absoluteValue
    val divisor = 10.0.pow(n).toInt()

    for (i in result.indices.reversed()) {
        result[i] = temp % divisor
        temp /= divisor
    }

    return result
}