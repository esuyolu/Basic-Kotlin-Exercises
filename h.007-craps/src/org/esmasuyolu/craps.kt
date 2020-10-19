package org.esmasuyolu

import kotlin.random.Random

fun main()
{
    var count = 0

    for (i in 1..100000)
        if (conditions())
            ++count

    val res = count / 100000.0

    println("the probability of winning the game: $res")
}

fun conditions() : Boolean
{
    val res = playDice()

    if (res == 7 || res == 11)
        return true
    else if (res == 2 || res == 3 || res == 12)
        return false;
    else
        while (true) {
            var secRes = playDice()

            if (secRes == 7)
                return false
            else if (secRes == res)
                return true
        }
}

fun playDice() : Int
{
    var dice1 = Random.nextInt(1, 7)
    var dice2 = Random.nextInt(1, 7)

    return dice1 + dice2
}