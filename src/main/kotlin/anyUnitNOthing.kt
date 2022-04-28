fun main (args:Array<String>){
    // Any : every type in kotlin, but not null
    val anyNumber:Any = 100
    val anyString:Any = "ksjfkdshf";

    //Unit : Unit object :void in java

    //Nothing: fun is never completes
    //return nothing. do nothing

}
fun doNothing():Nothing {
    while (true){

    }
}
fun add():Unit {
    val result = 2+5
    println(result)
}