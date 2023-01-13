package AbstractFactoryPattern.Kotlin.Concrete

import AbstractFactoryPattern.Kotlin.Abstract.Rider

class PartTimeRider : Rider {

    override fun delivery(): String = "자전거 배달"

    override fun repairVehicle(): String = "자전거 수리"
}