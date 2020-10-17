package org.esmasuyolu

fun main()
{
    var c = Circle(-3.4)

    println(c.area)
    println(c.circumference)

    c.r = -4.5

    println(c.area)
    println(c.circumference)
}