package org.esmasuyolu

fun main()
{
    print("height: ")
    val height = readLine()!!.toInt()

    print("width: ")
    val width = readLine()!!.toInt()

    rollingBallShape(width, height)
}

fun fillWithCharacter(start: Int, end: Int, ch: Char)
{
    for (i in start until end)
        print(ch)
}

fun rollingBallShape(width: Int, height: Int)
{
    var incFlag = true
    var index = 0

    for (i in 1..height) {
        print("|")

        fillWithCharacter(0, index, ' ')
        print("*")
        fillWithCharacter(index + 1, width, ' ')

        if (index == 0)
            incFlag = true
        if (index == width - 1)
            incFlag = false

        if (incFlag)
            ++index
        else
            --index

        println("|")
    }
}