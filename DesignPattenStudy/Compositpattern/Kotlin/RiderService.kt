package Compositpattern.Kotlin

class RiderService(private val allTypeRider: AllTypeRider) {

    fun deliveryAllRider(vehicle: String): String = allTypeRider.delivery(vehicle)
}