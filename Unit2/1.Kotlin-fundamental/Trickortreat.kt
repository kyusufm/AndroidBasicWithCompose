fun main(){
    val treatFunction = TrickOrTreat(false) {"$it quarters2s"}
    val trickFunction = TrickOrTreat(true, null)
    repeat (4){
        treatFunction()
    }
    trickFunction()

}

fun TrickOrTreat (isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        if (extraTreat != null){
          println(extraTreat(5))  
        }
        
        return treat
    }
}

val trick = {
    println("No treats!")
}

val treat: () -> Unit = {
    println("Have a treat")
}