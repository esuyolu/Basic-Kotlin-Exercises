package org.esmasuyolu

fun main()
{
    run(113)
}

fun run(abc: Int)
{
    val cba = reverse(abc)
    val ab = abc / 10
    val ba = reverse(ab)
    val bc = abc % 100
    val cb = reverse(bc)

    if (cba > abc && isPrime(abc) && isPrime(cba) && isPrime(ab) && isPrime(bc) && isPrime(cb) && isPrime(ba)) {
        println("$cba > $abc")
        println("$abc is prime")
        println("$cba is prime")
        println("$ab is prime")
        println("$bc is prime")
        println("$cb is prime")
        println("$ba is prime")
    }
}

fun reverse(a: Int) : Int
{
    var result = 0
    var value = a

    while (value != 0) {
        result = result * 10 + value % 10
        value /= 10
    }

    return result
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