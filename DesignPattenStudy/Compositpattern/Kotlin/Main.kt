package Compositpattern.Kotlin

fun main(args: Array<String>) {

    val allTypeRider = AllTypeRider(mutableListOf(FullTimeRider(), PartTimeRider(), ConnectRider()))

    val riderService = RiderService(allTypeRider)
    println(riderService.deliveryAllRider("자전거"))
}