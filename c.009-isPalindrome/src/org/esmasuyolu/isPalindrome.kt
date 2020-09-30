package org.esmasuyolu

fun main()
{
    print("enter a number: ")
    val a = readLine()!!.toInt()

    println(if (isPalindrome(a)) "the number $a is palindrome" else "the number $a is not palindrome")
}

fun isPalindrome(a: Int) = a == reverse(a)

fun reverse(a: Int) : Int
{
    var result = 0
    var value = a

    while (value != 0) {
        result = result * 10 + value % 10
        value /= 10
    }

    return result
}