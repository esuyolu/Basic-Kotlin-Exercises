package org.esmasuyolu

import kotlin.random.Random

fun main()
{
    runDiceSimulation()
}

fun runDiceSimulation()
{
    print("enter a number: ")
    val n = readLine()!!.toInt()

    println("the probability of getting a doublet: ${getSameDiceProbability(n)}")
}

fun getSameDiceProbability(n: Int) : Double
{
    var count = 0

    for (i in 1..n) {
        fun areSame() = Random.nextInt(1, 7) == Random.nextInt(1, 7)

        if (areSame())
            ++count
    }

    return count.toDouble() / n
}