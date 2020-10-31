package org.esmasuyolu

fun main()
{
    print("enter a text:")
    val text = readLine()!!

    println(capitalize(text))
}

fun capitalize(s: String) : String
{
    if (s.isBlank())
        return s

    return s[0].toUpperCase() + s.substring(1).toLowerCase()
}