package org.esmasuyolu

fun main()
{
    print("enter the seconds: ");
    val second = readLine()!!.toLong()

    displayDuration(second)
}

fun displayDuration(sec: Long)
{
    var hour: Long = 0
    var minute: Long = 0
    var second = sec

    hour = second / 3600;
    minute = second % 3600 / 60;
    second = second % 3600 % 60;

    println("************");

    if (hour != 0L)
        println("hour:$hour")
    if (minute != 0L)
        println("minute:$minute")
    if (second != 0L)
        println("second:$second")
}
