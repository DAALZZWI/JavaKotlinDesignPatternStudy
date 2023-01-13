package AbstractFactoryPattern.Kotlin.Concrete

import AbstractFactoryPattern.Kotlin.Abstract.Vehicle

class Bike : Vehicle {

    override fun start(): String = "자전거 대기"

    override fun move(): String = "자전거 출발"
}