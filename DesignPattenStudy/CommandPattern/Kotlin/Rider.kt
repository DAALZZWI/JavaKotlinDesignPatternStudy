package CommandPattern.Kotlin

class Rider(private var deliveryCommand: DeliveryCommand) {

    fun changeDeliveryCommand(deliveryCommand: DeliveryCommand): Rider {
        this.deliveryCommand = deliveryCommand
        return this
    }

    fun delivery(): String = this.deliveryCommand.driveVehicle()
}