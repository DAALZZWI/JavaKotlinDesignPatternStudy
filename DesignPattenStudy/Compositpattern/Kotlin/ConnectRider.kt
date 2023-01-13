package Compositpattern.Kotlin

class ConnectRider : Rider {

    override fun delivery(vehicle: String): String = "외주${vehicle}배달"
}