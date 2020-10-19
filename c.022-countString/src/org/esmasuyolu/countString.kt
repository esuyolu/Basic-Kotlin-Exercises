package org.esmasuyolu

fun main()
{
    runApplication()
}

fun runApplication()
{
    print("enter a text: ")
    val text = readLine()!!

    print("enter the text to search: ")
    val searchText = readLine()!!

    println(countString(text, searchText))
    println(countString(text, searchText, true))
}

fun countString(s1: String, s2: String, ignoreCase: Boolean = false) : Int
{
    var count = 0
    var index = 0

    while (true) {
        index = s1.indexOf(s2, index, ignoreCase)

        if (index == -1)
            break

        ++index
        ++count
    }

    return count
}