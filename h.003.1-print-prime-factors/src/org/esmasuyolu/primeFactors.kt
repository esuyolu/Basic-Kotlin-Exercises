package org.esmasuyolu

fun main()
{
    print("enter a number:")
    val a = readLine()!!.toInt()

    println("prime factors of $a:")
    printPrimeFactors(a)
}

fun printPrimeFactors(a: Int)
{
    var b = a

    for (i in 2..a) {
        while (b % i == 0)
            if (isPrime(i)) {
                println(i)
                b /= i
            }
    }
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