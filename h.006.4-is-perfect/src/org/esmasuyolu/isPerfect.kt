package org.esmasuyolu

fun main()
{
    // there is a single 4 digit perfect number. write program to find 4-digit perfect number using the isPerfect method

    for (i in 1000..9999)
        if (isPerfect(i))
            println(i)
}

fun isPerfect(n: Int) = n == sumFactors(n)

fun sumFactors(n: Int) : Int
{
    var sum = 0

    for (i in 1 until n)
        if (n % i == 0)
            sum += i

    return sum
}