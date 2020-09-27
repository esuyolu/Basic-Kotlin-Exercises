package org.esmasuyolu

fun main()
{
    print("enter the number: ");
    val n = readLine()!!.toInt()

    println("signum of $n: ${signum(n)}")
}

fun signum(num : Int) = if (num > 0) 1 else if (num < 0) -1 else 0
