package ChainResponsibilityPattern.Kotlin

fun main() {

    val riderService = RiderService(FullTimeRider(PartTimeRider(ConnectRider())))
    val delivery = riderService.delivery("분식")
    println(delivery)
}

class RiderService(private val rider: Rider) {

    fun delivery(foodType: String): String = rider.delivery(foodType)
}