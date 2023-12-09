fun main(){
    val coins: (Int) -> String = { quantity ->
        "$quantity quarters"
    }

    val treatFunction = TrickOrTreat(false, coins)
    val trickFunction = TrickOrTreat(true, null)
    
    treatFunction()
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