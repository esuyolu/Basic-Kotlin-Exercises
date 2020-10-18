package org.esmasuyolu

fun main()
{
    val z = Complex()

    println("Norm: ${z.norm}")

    z.re = 3.4
    z.im = -4.5

    println("Norm: ${z.norm}")

    val z1 = Complex(3, 4)

    println("Norm: ${z1.norm}")
}