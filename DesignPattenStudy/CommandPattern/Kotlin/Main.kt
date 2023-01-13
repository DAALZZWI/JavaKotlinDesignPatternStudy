package CommandPattern.Kotlin

fun main() {

    val motorCycleCommand = MotorCycleCommand(MotorCycle())
    val bikeCommand = BikeCommand(Bike())

    val rider = Rider(motorCycleCommand)

    println(rider.delivery())
    rider.changeDeliveryCommand(bikeCommand)
    println(rider.delivery())
}