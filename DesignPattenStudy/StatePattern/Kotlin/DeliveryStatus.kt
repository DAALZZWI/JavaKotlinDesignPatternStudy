package StatePattern.Kotlin

interface DeliveryStatus {

    val name: String
    fun forward(delivery: Delivery): String
    fun backward(delivery: Delivery): String
}