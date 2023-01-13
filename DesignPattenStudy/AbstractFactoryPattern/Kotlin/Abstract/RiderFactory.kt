package AbstractFactoryPattern.Kotlin.Abstract

interface RiderFactory {

    fun getRider(): Rider
    fun getVehicle(): Vehicle
    fun getHelmet(): Helmet
}