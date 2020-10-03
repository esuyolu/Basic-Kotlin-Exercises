package org.esmasuyolu

fun main()
{
    print("enter a number: ")
    val a = readLine()!!.toInt()

    println(when (signum(a)) {
        1 -> "positive"
        0 -> "zero"
        else -> "negative"
    })
}

fun signum(a: Int) = when {
    a > 0 -> 1
    a == 0 -> 0
    else -> -1
}