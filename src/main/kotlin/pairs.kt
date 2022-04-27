fun main (args:Array<String>){
    //pair and triples
    //(a,b)     (a,b,c)

    val coord: Pair<Int,Int> = Pair(2,3)
    val coord1 = Pair(2,3) //type interface
    val coord2 = 2 to 3  //using "to" operator
    println("Coordinate: ${coord.first} ${coord.second}")
}