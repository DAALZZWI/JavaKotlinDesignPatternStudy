package Compositpattern.Kotlin

class PartTimeRider : Rider {

    override fun delivery(vehicle: String): String = "시간제${vehicle}배달"
}