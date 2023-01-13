package AbstractFactoryPattern.Kotlin.Concrete

import AbstractFactoryPattern.Kotlin.Abstract.Helmet
import AbstractFactoryPattern.Kotlin.Abstract.Rider
import AbstractFactoryPattern.Kotlin.Abstract.RiderFactory
import AbstractFactoryPattern.Kotlin.Abstract.Vehicle

object PartTimeRiderFactory : RiderFactory {

    override fun getRider(): Rider = PartTimeRider()

    override fun getVehicle(): Vehicle = Bike()

    override fun getHelmet(): Helmet = BikeHelmet()
}