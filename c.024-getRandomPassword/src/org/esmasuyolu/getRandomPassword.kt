package org.esmasuyolu

import kotlin.random.Random

fun main()
{
    // it is tested until 0 and smaller values are entered
    while (true) {
        print("enter a number: ")
        val n = readLine()!!.toInt()

        if (n <= 0)
            break

        println(getRandomPassword(n))
    }
}

fun getRandomPassword(n: Int, random: Random = Random)
        = getRandomText(n, "0123456789abcdefghijklmnopqrstuwxvyzabcçdefgğhıijklmnoöprsştuüvyz_?:-", random)

fun getRandomText(n: Int, text: String, random: Random = Random) : String
{
    val sb = StringBuilder()

    for (i in 1..n)
        sb.append(text[random.nextInt(text.length)])

    return sb.toString()
}