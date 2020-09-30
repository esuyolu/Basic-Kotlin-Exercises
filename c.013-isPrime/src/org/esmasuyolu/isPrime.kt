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
    if(a <= 1)
        return false

    val halfValue = a / 2

    for (i in 2..halfValue)
        if (a % i == 0)
            return false

    return true
}