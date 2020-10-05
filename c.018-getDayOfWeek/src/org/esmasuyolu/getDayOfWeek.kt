package org.esmasuyolu

fun main()
{
    print("day? ")
    val day = readLine()!!.toInt()

    print("month? ")
    val month = readLine()!!.toInt()

    print("year? ")
    val year = readLine()!!.toInt()

    displayDateEN(day, month, year)
    displayDateTR(day, month, year)
}

fun displayDateTR(day: Int, month: Int, year: Int)
{
    val dayOfWeek = getDayOfWeek(day, month, year)

    println(when {
        dayOfWeek >= 0 -> "%02d/%02d/%04d %s".format(day, month, year, getDayNameTR(dayOfWeek))
        else -> "Geçersiz Tarih"
    })
}

fun displayDateEN(day: Int, month: Int, year: Int)
{
    val dayOfWeek = getDayOfWeek(day, month, year)

    println(when {
        dayOfWeek >= 0 -> "$day${getDaySuffixEN(day)} ${getMonthNameEN(month)} $year ${getDayNameEN(dayOfWeek)}"
        else -> "Invalid Date"
    })
}

fun getMonthNameEN(month: Int) = when (month) {
    1 -> "Jan"
    2 -> "Feb"
    3 -> "Mar"
    4 -> "Apr"
    5 -> "May"
    6 -> "Jun"
    7 -> "Jul"
    8 -> "Aug"
    9 -> "Sep"
    10 -> "Oct"
    11 -> "Nov"
    else -> "Dec"
}

fun getDaySuffixEN(day: Int) = when (day) {
    1, 21, 31 -> "st"
    2, 22 -> "nd"
    3, 23 -> "rd"
    else -> "th"
}

fun getDayNameEN(dayOfWeek: Int) = when (dayOfWeek) {
    0 -> "Sun"
    1 -> "Mon"
    2 -> "Tue"
    3 -> "Wed"
    4 -> "Thu"
    5 -> "Fri"
    else -> "Sat"
}

fun getDayNameTR(dayOfWeek: Int) = when (dayOfWeek) {
    0 -> "Pazar"
    1 -> "Pazartesi"
    2 -> "Salı"
    3 -> "Çarşamba"
    4 -> "Perşembe"
    5 -> "Cuma"
    else -> "Cumartesi"
}

fun getDayOfWeek(day: Int, month: Int, year: Int) : Int
{
    var totalDays = getDayOfYear(day, month, year)

    if (totalDays == -1)
        return -1

    for (y in 1900 until year)
        totalDays += if (isLeapYear(y)) 366 else 365

    return totalDays % 7
}

fun getDayOfYear(day: Int, month: Int, year: Int) : Int
{
    if (!isValidDate(day, month, year))
        return -1

    var dayOfYear = day

    for (m in (month - 1) downTo 1)
        dayOfYear += getDaysOfMonth(m, year)

    return dayOfYear
}

fun isValidDate(day: Int, month: Int, year: Int) : Boolean
{
    if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1900)
        return false

    return day <= getDaysOfMonth(month, year)
}

fun getDaysOfMonth(month: Int, year: Int) = when (month) {
    4, 6, 9, 11 -> 30
    2 -> if (isLeapYear(year)) 29 else 28
    else -> 31
}

fun isLeapYear(year: Int) = year % 4 == 0 && year % 100 != 0 || year % 400 == 0