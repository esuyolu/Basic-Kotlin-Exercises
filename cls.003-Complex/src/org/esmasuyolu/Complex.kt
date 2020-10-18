package org.esmasuyolu

import kotlin.math.sqrt

class Complex(var re: Double = 0.0, var im: Double = 0.0) {
    val norm: Double
    get() = sqrt(re * re + im * im)

    constructor(re: Int, im: Int) : this(re.toDouble(), im.toDouble())
}