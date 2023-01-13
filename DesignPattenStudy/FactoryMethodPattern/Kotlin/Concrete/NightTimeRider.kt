package FactoryMethodPattern.Kotlin.Concrete

import FactoryMethodPattern.Kotlin.Framework.Rider

class NightTimeRider : Rider {

    override fun delivery(): String = "택시 배달"

    override fun repairVehicle(): String = "택시 수리"
}