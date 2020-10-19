package org.esmasuyolu

fun main()
{
    print("enter the first number: ")
    var n1 = readLine()!!.toInt()

    print("enter the second number: ")
    var n2 = readLine()!!.toInt()

    println(if (areFriends(n1, n2)) "$n1 and $n2 form a friendly pair" else "$n1 and $n2 doesn't form a friendly pair")
}

fun areFriends(x: Int, y: Int) = x == sumFactors(y) && y == sumFactors(x)

fun sumFactors(n: Int) : Int
{
    var sum = 0

    for (i in 1 until n)
        if (n % i == 0)
            sum += i

    return sum
}