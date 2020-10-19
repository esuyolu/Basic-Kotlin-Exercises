package org.esmasuyolu

fun main()
{
    control()
}

fun control()
{
    var count = 0
    var max = Int.MIN_VALUE
    var min = Int.MAX_VALUE
    var sum = 0
    var avg: Double = 0.0

    while (true) {
        println("do you want to enter a new value? [Enter 1 for Yes, 0 for No]");
        var value = readLine()!!.toInt()

        if (value == 0) {
            avg = sum.toDouble() / count

            println("$count values entered")
            println("max: $max")
            println("min: $min")
            println("average: $avg")
            println("the program has ended")

            break
        }

        if (value == 1) {
            println("please enter a value in the range [0-100]")
            var num = readLine()!!.toInt()

            while (num < 0 || num > 100) {
                println("invalid value")
                println("please enter a value in the range [0-100]")
                num = readLine()!!.toInt()
            }

            if (num == 0) {
                avg = sum.toDouble() / count

                println("$count values entered")
                println("max: $max")
                println("min: $min")
                println("average: $avg")
                println("the program has ended")

                break
            }

            ++count
            sum += num

            if (num > max)
                max = num

            if (num < min)
                min = num
        }
    }
}