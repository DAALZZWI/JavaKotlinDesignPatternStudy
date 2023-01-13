package FactoryMethodPattern.Kotlin.Concrete

import FactoryMethodPattern.Kotlin.Framework.Rider

class FullTimeRider : Rider {

    override fun delivery(): String = "오토바이 배달"

    override fun repairVehicle(): String = "오토바이 수리"
}