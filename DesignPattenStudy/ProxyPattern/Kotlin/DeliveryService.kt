package ProxyPattern.Kotlin

class DeliveryService(private val rider: Rider) {

    fun delivery(): String = rider.delivery()
    fun getRiderInfo(): String? = rider.getPersonInfo(1)
}