package org.esmasuyolu

import kotlin.random.Random

fun main()
{
    // it is tested until 0 and smaller values are entered
    while (true) {
        print("enter a number:")
        val n = readLine()!!.toInt()

        if (n <= 0)
            break

        println(getRandomTextTR(n))
        println(getRandomTextEN(n))
    }
}

fun getRandomTextTR(n: Int, random: Random = Random)
        = getRandomText(n, "ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZabcçdefgğhıijklmnoöprsştuüvyz", random)

fun getRandomTextEN(n: Int, random: Random = Random)
        = getRandomText(n, "ABCDEFGHIJKLMNOPQRSTUWXVYZabcdefghijklmnopqrstuwxvyz", random)

fun getRandomText(n: Int, text: String, random: Random = Random) : String
{
    val stringBuilder = StringBuilder()

    for (i in 1..n)
        stringBuilder.append(text[random.nextInt(text.length)])

    return stringBuilder.toString()
}