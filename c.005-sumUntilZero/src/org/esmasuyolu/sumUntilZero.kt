package org.esmasuyolu

fun main()
{
    sumUntilZero()
}

fun sumUntilZero()
{
    var sum = 0
    var value : Int

    while (true) {
        print("enter a number[enter 0 (zero) to stop] : ")
        value = readLine()!!.toInt()

        if (value == 0)
            break

        sum += value
    }

    println("sum: $sum")
}