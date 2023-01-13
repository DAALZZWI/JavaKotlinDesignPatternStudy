package CommandPattern.Kotlin

interface DeliveryCommand {

    fun driveVehicle(): String
}

class MotorCycleCommand(private var motorCycle: MotorCycle) : DeliveryCommand {

    override fun driveVehicle(): String =
            "${motorCycle.start()} , ${motorCycle.accelerate()}"
}

class BikeCommand(private var bike: Bike) : DeliveryCommand {

    override fun driveVehicle(): String = "${bike.pedaling()}"
}