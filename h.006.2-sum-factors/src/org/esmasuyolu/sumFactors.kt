package org.esmasuyolu

fun main()
{
    print("enter a number: ")
    var n = readLine()!!.toInt()

    println("the sum of all the multipliers, excluding the number $n itself : ${sumFactors(n)}")
}

fun sumFactors(n: Int) : Int
{
    var sum = 0

    for (i in 1 until n)
        if (n % i == 0)
            sum += i

    return sum
}