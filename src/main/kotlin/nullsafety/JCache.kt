package nullsafety

import java.util.*


fun main()
{
    val cache = Cache()
    val nullableString = cache.getValueOrNull("example")

    if(nullableString != null) // java style
        println(nullableString.length)

    if(Objects.nonNull(nullableString)) // java style
        println(nullableString.length)


    println(nullableString.length)
}