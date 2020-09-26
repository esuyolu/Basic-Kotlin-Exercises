package org.esmasuyolu

fun main()
{
    print("enter a number: ")
    val a = readLine()!!.toInt()

    println("number of digits for $a: ${digitsCount(a)}")
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