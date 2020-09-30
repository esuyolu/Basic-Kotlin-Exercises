package org.esmasuyolu

fun main()
{
    print("enter a number: ")
    val a = readLine()!!.toInt()

    println("reverse of the number $a: ${reverse(a)}")
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