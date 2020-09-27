package org.esmasuyolu

fun main()
{
    print("enter the 1st number: ");
    val a = readLine()!!.toInt()

    print("enter the 2nd number: ");
    val b = readLine()!!.toInt()

    print("enter the 3rd number: ");
    val c = readLine()!!.toInt()

    print("median number: ${mid(a, b, c)}")
}

fun mid(a: Int, b: Int, c: Int) : Int
{
    if (a < b)
        if (c < b)
            if (a < c)
                return c
            else
                return a
        else
            return b
    else if (b < a)
        if (b < c)
            if (a < c)
                return a
            else
                return c
        else
            return b
    else
        return a
}

