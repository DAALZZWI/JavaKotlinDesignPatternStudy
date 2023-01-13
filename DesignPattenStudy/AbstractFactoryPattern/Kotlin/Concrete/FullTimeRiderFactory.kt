package AbstractFactoryPattern.Kotlin.Concrete

import AbstractFactoryPattern.Kotlin.Abstract.Helmet
import AbstractFactoryPattern.Kotlin.Abstract.Rider
import AbstractFactoryPattern.Kotlin.Abstract.RiderFactory
import AbstractFactoryPattern.Kotlin.Abstract.Vehicle

object FullTimeRiderFactory : RiderFactory {

    override fun getRider(): Rider = FullTimeRider()

    override fun getVehicle(): Vehicle = MotorCycle()

    override fun getHelmet(): Helmet = MotorCycleHelmet()
}