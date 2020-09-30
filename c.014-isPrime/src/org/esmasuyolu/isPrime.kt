package org.esmasuyolu

fun main()
{
    println("prime numbers from 1 to 100")

    for (n in 1..100)
        if (isPrime(n))
            print("$n ")
}

fun isPrime(a: Int) : Boolean
{
    if (a <= 1)
        return false

    if (a % 2 == 0)
        return a == 2

    if (a % 3 == 0)
        return a == 3

    if (a % 5 == 0)
        return a == 5

    if (a % 7 == 0)
        return a == 7

    var i = 11

    while (i * i <= a) {
        if (a % i == 0)
            return false

        i += 2
    }

    return true
}