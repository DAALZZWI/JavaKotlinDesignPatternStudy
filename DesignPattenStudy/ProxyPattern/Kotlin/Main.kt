package ProxyPattern.Kotlin

fun main() {

    val deliveryService = DeliveryService(ProxyRider("hello"))
    println(deliveryService.delivery())
    println(deliveryService.getRiderInfo())
}