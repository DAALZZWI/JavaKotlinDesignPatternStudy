package Compositpattern.Kotlin

class FullTimeRider : Rider {

    override fun delivery(vehicle: String): String = "정규직${vehicle}배달"
}