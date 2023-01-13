package AbstractFactoryPattern.Kotlin.Concrete

import AbstractFactoryPattern.Kotlin.Abstract.Vehicle

class MotorCycle : Vehicle {

    override fun start(): String = "오토바이 대기"
    override fun move(): String = "오토바이 출발"
}