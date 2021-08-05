package nullsafety


class Simple {

    companion object {
        fun getNullableString(): String? = null

        fun getNullableAny(): Any? = if (true) 10 else null


        fun example1() {
            var temp: String = "string";

            // temp = null // error

            var nullableTemp: String? = "string2"

            nullableTemp = null
        }


        fun exampleCast() {
            var temp: String = "string";
            var nullableTemp: String? = "string"

            // temp = nullableTemp //error

            nullableTemp = temp

            temp = nullableTemp

            //---------------
            nullableTemp = getNullableString()

            //temp = nullableTemp //error
            // temp = nullableTemp as String //error

            println("temp---$temp")
            println("nullableTemp---$nullableTemp")


        }

        fun exampleCast2() {
//            val t = getNullableAny() as String // error
//            println(t)
            val t2 = getNullableAny() as? String // ok
            println("t2---$t2")
        }

        fun exampleNullChaining() {
            //------------------------------------------ !! ?: ?

            val value = getNullableAny() as? String ?: "default"
            println("value --$value")

            val value2: Any = getNullableAny()!!
            println("value2 --$value2")

            val value3 = getNullableString()?.length
            println("value3 --$value3")

            val value4 = getNullableString()!!.length
            println("value4 --$value4")
        }
    }

}

fun main() {

    Simple.example1()
    Simple.exampleCast()
    Simple.exampleCast2()
    Simple.exampleNullChaining()
}