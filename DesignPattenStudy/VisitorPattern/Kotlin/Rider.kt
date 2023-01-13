package VisitorPattern.Kotlin

interface Rider {

    fun doTask(deliveryTask: DeliveryTask): String
    fun doTask(driveVehicleTask: DriveVehicleTask): String
    fun doTask(repairVehicleTask: RepairVehicleTask): String
}

class FullTimeRider : Rider {

    override fun doTask(deliveryTask: DeliveryTask): String = "오토바이 배달"

    override fun doTask(driveVehicleTask: DriveVehicleTask): String = "오토바이 운전"

    override fun doTask(repairVehicleTask: RepairVehicleTask): String = "오토바이 수리"
}

class PartTimeRider : Rider {

    override fun doTask(deliveryTask: DeliveryTask): String = "자전거 배달"

    override fun doTask(driveVehicleTask: DriveVehicleTask): String = "자전거 운전"

    override fun doTask(repairVehicleTask: RepairVehicleTask): String = "자전거 수리"
}