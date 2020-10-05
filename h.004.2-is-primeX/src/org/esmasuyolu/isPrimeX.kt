package org.esmasuyolu

fun main()
{
    print("enter a number: ")
    val num = readLine()!!.toInt()

    if (isPrimeX(num))
        println("the number you enter is a number that matches the given rule")
    else
        println("the number you entered did not match the given rule")
}

fun isPrimeX(n: Int) : Boolean
{
    var num = n
    while (true) {
        if (digitsCount(num) == 1 && isPrime(num)) {
            println("$num is prime")
            break
        }
        if (isPrime(num)) {
            println("$num is prime")
            num = sumOfDigits(num)
        }
        else {
            println("$num is not prime")
            println("------------RESULT------------")
            return false
        }
    }

    println("------------RESULT------------")

    return true
}

fun sumOfDigits(a: Int) : Int
{
    var num = a
    var sum = 0

    while (num != 0) {
        sum += num % 10
        num /= 10
    }

    return sum
}

fun digitsCount(num : Int) : Int
{
    var count : Int = 0
    var n = num

    do {
        ++count
        n /= 10
    } while (n != 0)

    return count
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