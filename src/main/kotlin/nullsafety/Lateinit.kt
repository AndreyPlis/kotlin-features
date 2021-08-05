package nullsafety

class Lateinit() {

    private var prop:String? = null

    fun init( cache: Cache){
        prop = cache.getValueOrNull("prop")
    }

    //call after init
    fun foo(){
        println(prop?.length)
    }

}


fun main(){

    val l = Lateinit()

    l.init(Cache())
    l.foo()

}