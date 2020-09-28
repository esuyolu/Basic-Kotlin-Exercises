package org.esmasuyolu

fun main()
{
    print("enter a number: ")
    val num = readLine()!!.toInt()

    diamond(num)
}

fun diamond(n: Int)
{
    for (i in 1..n) {
        for (j in (n-i) downTo 1)
            print(" ")
        for (k in 1 until 2*i)
            print("*")
        println()
    }

    var num = n
    --num
    var count = num

    for (i in 1..num) {
        for (j in 1..i)
            print(" ")
        for (k in 1 until 2*count)
            print("*")

        --count
        println()
    }
}
