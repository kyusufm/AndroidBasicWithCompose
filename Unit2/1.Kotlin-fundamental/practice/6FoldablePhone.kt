open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }
    
    fun switchOff() {
        isScreenLightOn = false
    }
    
    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class foldablePhone(var isFold: Boolean = true): Phone() {
    override fun switchOn() {
        if (!isFold) {
            isScreenLightOn = true
        }
    }
    
    fun fold() {
        isFold = true
    }
    
    fun unfold() {
        isFold = false
    }
}

fun main() {
    val myPhone = foldablePhone()
    myPhone.switchOn()
    myPhone.checkPhoneScreenLight()
    myPhone.unfold()
    myPhone.switchOn()
    myPhone.checkPhoneScreenLight()
    myPhone.fold()
    myPhone.checkPhoneScreenLight()
}