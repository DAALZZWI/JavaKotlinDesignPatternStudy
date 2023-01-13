package AbstractFactoryPattern.Kotlin

import AbstractFactoryPattern.Kotlin.Abstract.RiderFactory
import AbstractFactoryPattern.Kotlin.Concrete.FullTimeRiderFactory
import AbstractFactoryPattern.Kotlin.Concrete.PartTimeRiderFactory

fun main() {

    val riderService1 = RiderService(FullTimeRiderFactory)
    val riderService2 = RiderService(PartTimeRiderFactory)

    println(riderService1.work())
    println(riderService2.work())
}

class RiderService(private val riderFactory: RiderFactory) {

    fun work(): String {

        val rider = riderFactory.getRider()
        val vehicle = riderFactory.getVehicle()
        val helmet = riderFactory.getHelmet()

        return "${rider.delivery()}, ${vehicle.move()}, ${helmet.wear()}"
    }
}