package AbstractFactoryPattern.Kotlin.Concrete

import AbstractFactoryPattern.Kotlin.Abstract.Helmet

class MotorCycleHelmet : Helmet {

    override fun wear(): String = "오토바이 핼멧 착용"
}