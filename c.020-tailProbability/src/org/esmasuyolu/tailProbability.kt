package org.esmasuyolu

import kotlin.random.Random

fun main()
{
    runCoinSimulation()
}

fun runCoinSimulation()
{
    print("enter a number:")
    val n = readLine()!!.toInt()

    println("probability of getting money in tails: ${getTailProbability(n)}")
}

fun getTailProbability(n: Int) : Double
{
    var count = 0

    for (i in 1..n)
        if (Random.nextBoolean())
            ++count

    return count.toDouble() / n
}