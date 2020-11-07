package org.esmasuyolu

import java.lang.StringBuilder
import kotlin.math.absoluteValue

private val onesEN = arrayOf("", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

private val tensEN = arrayOf("", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety")

private val elevenUntilTwenty = arrayOf("ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen")


fun main()
{
    test()
}

fun test()
{
    for (i in -999..999)
        println(numToStr3DEN(i))
}

fun numToStr3DEN(value: Int) : String
{
    if (value == 0)
        return "zero"

    val stringBuilder = StringBuilder(if (value < 0) "minus " else "")
    val temp = value.absoluteValue
    val a = temp / 100
    val b = temp / 10 % 10
    val c = temp % 10

    if (a != 0)
        stringBuilder.append(onesEN[a]).append(" hundred ")
    if (b != 0)
        if (b == 1)
            stringBuilder.append(elevenUntilTwenty[c] + " ")
        else
            stringBuilder.append(tensEN[b] + " ")

    if (c != 0 && b != 1)
        stringBuilder.append(onesEN[c])

    return stringBuilder.toString()
}