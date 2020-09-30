package org.esmasuyolu

fun main()
{
    println(sumUntilZero())
}

fun sumUntilZero() : Int
{
    var result = 0

    println("start entering numbers - enter 0(zero) to exit")

    while (true) {
        val value = readLine()!!.toInt()

        if (value == 0)
            break

        result += value
    }
    println("********************")

    return result
}