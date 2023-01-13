package VisitorPattern.Kotlin

interface RiderTask {

    fun doTask(rider: Rider): String
}

class DeliveryTask : RiderTask {

    override fun doTask(rider: Rider): String = rider.doTask(this)
}

class DriveVehicleTask : RiderTask {

    override fun doTask(rider: Rider): String = rider.doTask(this)
}

class RepairVehicleTask : RiderTask {

    override fun doTask(rider: Rider): String = rider.doTask(this)
}



class TotalRiderTask : RiderTask {

    private val riderTaskList = mutableListOf<RiderTask>(DeliveryTask(), DeliveryTask(), RepairVehicleTask())

    override fun doTask(rider: Rider): String = riderTaskList.joinToString(separator = ", ") { it.doTask(rider) }
}

