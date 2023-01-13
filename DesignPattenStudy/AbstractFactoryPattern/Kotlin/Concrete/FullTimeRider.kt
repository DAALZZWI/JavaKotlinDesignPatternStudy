package AbstractFactoryPattern.Kotlin.Concrete

import AbstractFactoryPattern.Kotlin.Abstract.Rider

class FullTimeRider : Rider {

    override fun delivery(): String = "오토바이 배달"

    override fun repairVehicle(): String = "오토바이 수리"
}