package org.esmasuyolu

fun main()
{
    val p1 = Point()
    val p2 = Point(10)
    val p3 = Point(y = 3)
    val p4 = Point(40, -56)
    val p5 = Point(y = 40, x = -56)

    println("p1:(${p1.x}, ${p1.y})")
    println("p2:(${p2.x}, ${p2.y})")
    println("p3:(${p3.x}, ${p3.y})")
    println("p4:(${p4.x}, ${p4.y})")
    println("p5:(${p5.x}, ${p5.y})")

    var p = Point(40, -56)

    println("p:(${p.x}, ${p.y})")

    p.offset(-34, 8)

    println("p:(${p.x}, ${p.y})")

    p.offset(7)

    println("p:(${p.x}, ${p.y})")

    val p11 = Point(3, 4)
    val p12 = Point(100, 100)

    println(p11.distance(p12))
    println(p11.distance(100, 100))
    println(p11.distance())
}