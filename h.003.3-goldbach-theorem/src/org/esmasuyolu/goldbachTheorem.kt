package org.esmasuyolu

fun main()
{
    print("enter an even number: ")
    val a = readLine()!!.toInt()

    println("*********************")
    goldbachTheorem(a)
}

fun goldbachTheorem(a: Int)
{
    for (i in 2..(a - 2)) 
        if (isPrime(i) && isPrime(a - i))
            println("$a = $i + ${(a - i)}")
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
