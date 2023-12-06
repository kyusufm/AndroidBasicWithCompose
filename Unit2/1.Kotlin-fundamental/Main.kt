
fun main() {
    // true
    println(1 == 1)
    // false
    println(1 < 1)
    
    val trafficLightColor = "Yellow"

    if (trafficLightColor == "Red") {
        println("Stop")
    } else if (trafficLightColor == "Yellow") {
        println("Slow")
    } else if (trafficLightColor == "Green"){
        println("Go")
    } else{
        println("Invalid traffic-light-color")
    }

    //when statement
    when(trafficLightColor){
        "Red" -> println("Stop")
        "Yellow" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid traffic-light-color")
    }

    val number = 4

    when(number){
        2 -> println("number is a prime number betweeen 1 and 10")
        3 -> println("number is a prime number betweeen 1 and 10")
        5 -> println("number is a prime number betweeen 1 and 10")
        7 -> println("number is a prime number betweeen 1 and 10")
        else -> println("number is not a prime number between 1 and 10")
    }

    //use comma for multiple conditions
    when(number){
        2,3,5,7 -> println("number is a prime number betweeen 1 and 10")
        in 1..10 -> println("number is between 1 and 10 but not a prime number")
        else -> println("number is not a prime number between 1 and 10")
    }

    //check data type using is
    val x: Any = 11

    when(x){
        2,3,5,7 -> println("number is a prime number betweeen 1 and 10")
        in 1..10 -> println("number is between 1 and 10 but not a prime number")
        is Int -> println("x is an integer, but not between 1 and 10")
        else -> println("number is not a prime number between 1 and 10")
    }

    val newTrafficLightColor = "Amber"

    when(newTrafficLightColor){
        "Red" -> println("Stop")
        "Yellow", "Amber" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid traffic-light-color")
    }

    //remove redundan function
    val message = 
    if (newTrafficLightColor == "Red") "Stop"
    else if (newTrafficLightColor == "Yellow") "Slow"
    else if (newTrafficLightColor == "Green")"Go"
    else "Invalid traffic-light-color"

    println(message)

    val messagetwo = when(newTrafficLightColor){
        "Red" -> "Stop"
        "Yellow", "Amber" -> "Slow"
        "Green" -> "Go"
        else -> "Invalid traffic-light-color"
    }
    println(messagetwo)

    // Nullability in kotlin

    val favActor = null
    println(favActor)

    var favActorTwo: String? = "joko"
    favActorTwo = null

    var numerTwo: Int? = 10
    println(numerTwo)
    numerTwo = null
    println(numerTwo)

    // Handle nullable variable
    var favActorThree: String = "Sandra sagitha"
    println("jumlah: "+favActorThree.length)

    var favActorFour: String? = "Baldwin"
    println("jumlah: "+favActorFour?.length)

    var favActorFive: String? = null
    println("jumlah: "+favActorFive?.length)

    var favActorSix: String? = null
    // un comment to see an exception error
    //println("jumlah: "+favActorSix!!.length)

    var favActorSeven: String? = "Gindo Gindo"
    if (favActorSeven != null){
        println("jumlah: "+ favActorSeven.length)
    } else {
        println("null")
    }

    favActorSeven = null
    if (favActorSeven != null){
        println("jumlah: "+ favActorSeven.length)
    } else {
        println("null ndak ada actor name")
    }

    favActorSeven = "December wake"
    val lengthOfName =  if (favActorSeven != null) favActorSeven.length else 0
    println ("jumlah huruf aktor favorit anda adalah {$lengthOfName}")

    val lengthofNameElvish =  favActorSeven?.length ?: 0
    println("jumlah huruf elvish adalah $lengthofNameElvish")
}