package FactoryMethodPattern.Kotlin

import FactoryMethodPattern.Kotlin.Framework.Rider
import FactoryMethodPattern.Kotlin.Framework.RiderCreator

fun main(args: Array<String>) {

    val riderCreator = RiderCreator()

    var rider: Rider? = null

    rider= riderCreator.createRider("FullTime")

    rider.delivery()

    rider = riderCreator.createRider("HalfTime")

    rider.delivery()

    rider = riderCreator.createRider("NightTime")

    rider.delivery()
}