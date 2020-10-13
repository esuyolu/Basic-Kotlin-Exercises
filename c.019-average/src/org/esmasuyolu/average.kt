package org.esmasuyolu

fun main()
{
    println("average of numbers: ${average()}")
}

fun average() : Double
{
    var sum = 0
    var count = 0

    while (true)
    {
        print("(enter 0 (zero) to exit) enter a number: ")
        val num = readLine()!!.toInt()

        if (num == 0)
            break

        sum += num
        ++count
    }

    return sum.toDouble() / count
}