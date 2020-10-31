package org.esmasuyolu

fun main()
{
    print("enter a text:")
    val text = readLine()!!

    // Turkish pangram: Pijamalı hasta yağız şoföre çabucak güvendi
    println(if (isPangramTR(text)) "pangram" else "pangram değil")

    // English pangram: The quick brown fox jumps over the lazy dog
    println(if (isPangramEN(text)) "pangram" else "not a pangram")
}

fun isPangramTR(text: String) = isPangram(text, "abcçdefgğhıijklmnoöprsştuüvyz")

fun isPangramEN(text: String) = isPangram(text, "abcdefghijklmnopqrstuwxvyz")

//A pangram is a unique sentence in which every letter of the alphabet is used at least once.

fun isPangram(text: String, alphabet: String) : Boolean
{
    for (c in alphabet)
        if (!text.contains(c, true))
            return false

    return true
}
