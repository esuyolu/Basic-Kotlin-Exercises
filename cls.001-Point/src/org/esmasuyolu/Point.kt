package org.esmasuyolu

class Point(var x: Int = 0, var y: Int = 0) {
    fun distance(p: Point) = distance(p.x, p.y)

    fun distance(x: Int = 0, y: Int = 0) = Math.sqrt((this.x - x.toDouble()) * (this.x - x.toDouble()) +
            (this.y - y.toDouble()) * (this.y - y.toDouble()))

    fun offset(dx: Int, dy: Int = dx)
    {
        x += dx
        y += dy
    }
}