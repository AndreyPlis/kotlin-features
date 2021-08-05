package nullsafety

import java.util.*


class KCache {
    private val cache: Map<String, String> = mutableMapOf()


    fun getValueOrNull(key: String): String? {
        return cache[key]
    }
}

fun main()
{
    val stringOrNull = KCache().getValueOrNull("key")


    if(stringOrNull != null)
        println(stringOrNull.length)

//    if(Objects.nonNull(stringOrNull)) // java style
//        println(stringOrNull.length)


    println(stringOrNull?.length)
    println(stringOrNull!!.length)

    if(Objects.nonNull(stringOrNull)) // java style
        println(stringOrNull.length)

    println(stringOrNull.length)
}