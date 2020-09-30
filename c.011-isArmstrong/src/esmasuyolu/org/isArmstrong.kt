package esmasuyolu.org

fun main()
{
    for (n in -1..999999)
        if (isArmstrong(n))
            println(n)
}

fun isArmstrong(a: Int) : Boolean
{
    if (a < 0)
        return false

    return a == getSum(a)
}

fun getSum(a: Int) : Int
{
    val count = digitsCount(a)
    var sum = 0
    var num = a

    while (num != 0) {
        sum += pow(num % 10, count)
        num /= 10
    }

    return sum
}

fun digitsCount(a: Int) : Int
{
    var count = 0
    var number = a

    do {
        ++count
        number /= 10
    } while (number != 0)

    return count
}

fun pow(a: Int, b: Int) : Int
{
    var result = 1

    for (i in 1..b)
        result *= a

    return result
}

