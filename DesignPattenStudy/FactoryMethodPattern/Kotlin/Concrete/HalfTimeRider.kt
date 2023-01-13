package FactoryMethodPattern.Kotlin.Concrete

import FactoryMethodPattern.Kotlin.Framework.Rider

class HalfTimeRider : Rider {

    override fun delivery(): String = "자전거 배달"

    override fun repairVehicle(): String = "자전거 수리"
}