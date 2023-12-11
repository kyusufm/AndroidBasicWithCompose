fun main() {    
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, null, amanda)
    val asiyah = Person("Asiyah", 28, "climb", atiqah)
    
    amanda.showProfile()
    atiqah.showProfile()
    asiyah.showProfile()
}


class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
       // Fill in code 
        println("Name: $name")
        println("Age: $age")
        if (hobby != null) {
            println("Likes to $hobby.")
        } else {
            println("Hobby: Unknown")
        
        }
        if (referrer == null) {
            println("Does not have referrer")
        } else {
            print("Has referrer name ${referrer.name} ")
            if (referrer.hobby == null) {
                print(".")
            }else{
                print("who likes to ${referrer.hobby}")
            }
        }
        
        println()
    }
}