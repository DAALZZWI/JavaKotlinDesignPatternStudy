package FlyweightPattern.Kotlin

fun main() {

    val riderService = RiderService()
    println(riderService.delivery("강남", "FullTimeRider"))
    println(riderService.delivery("강남", "FullTimeRider"))
    println(riderService.delivery("강북", "PartTimeRider"))
    println(riderService.delivery("강북", "PartTimeRider"))
}

