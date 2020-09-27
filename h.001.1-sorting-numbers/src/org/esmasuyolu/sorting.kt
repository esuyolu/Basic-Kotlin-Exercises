package org.esmasuyolu

fun main()
{
    print("enter the 1st number: ");
    val a = readLine()!!.toInt()

    print("enter the 2nd number: ");
    val b = readLine()!!.toInt()

    print("enter the 3rd number: ");
    val c = readLine()!!.toInt()

    sorting(a, b, c)
}

fun sorting(a: Int, b: Int, c: Int)
{
    if (a < b)
        if (b < c)
            println("$a < $b < $c")
        else if (c < b)
            if (a < c)
                println("$a < $c < $b")
            else if (c < a)
                println("$c < $a < $b")
            else
                println("$a = $c < $b")
        else
            println("$a < $b = $b")
    else if (b < a)
        if (a < c)
            println("$b < $a < $c")
        else if (c < a)
            if (b < c)
                println("$b < $c < $a")
            else if (c < b)
                println("$c < $b < $a")
            else
                println("$b = $c < $a")
        else
            println("$b < $a = $c")
    else if (b < c)
        println("$a = $b < $c")
    else if (c < b)
        println("$c < $a = $b")
    else
        println("$a = $b = $c")
}