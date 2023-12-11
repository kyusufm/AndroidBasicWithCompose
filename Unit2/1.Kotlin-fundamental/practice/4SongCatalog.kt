fun main(){
    val jacksong = Song("jack","jim",1997,999)
    jacksong.description()
}

class Song (val name:String, val artist:String, val published:Int, val played: Int) {
    var popularity:String = "This song is popular"

    fun description() {
        if (played < 1000) {
            popularity = "This song is not popular"
        }
        println("The song $name by $artist was published in $published and has been played $played times. $popularity ")
    }
}