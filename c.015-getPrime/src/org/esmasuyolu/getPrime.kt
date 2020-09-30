package org.esmasuyolu

fun main()
{
    print("enter a number: ")
    val a = readLine()!!.toInt()

    println("$a. prime number: ${getPrime(a)}")
}

fun getPrime(n: Int) : Int
{
    var count = 0
    var value = 2

    while (true) {
        if (isPrime(value))
            ++count

        if (count == n)
            return value

        ++value
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