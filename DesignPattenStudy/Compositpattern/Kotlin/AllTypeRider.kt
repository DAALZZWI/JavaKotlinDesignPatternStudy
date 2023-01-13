package Compositpattern.Kotlin

class AllTypeRider(private val riders: MutableList<Rider>) : Rider {

    override fun delivery(vehicle: String): String = riders.joinToString(separator = " ") { it.delivery(vehicle) }

    fun add(rider: Rider) = riders.add(rider)

    fun remove(rider: Rider) = riders.remove(rider)
}