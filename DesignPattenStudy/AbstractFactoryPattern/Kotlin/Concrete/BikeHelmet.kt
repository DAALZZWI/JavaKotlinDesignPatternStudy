package AbstractFactoryPattern.Kotlin.Concrete

import AbstractFactoryPattern.Kotlin.Abstract.Helmet

class BikeHelmet :  Helmet {
    
    override fun wear(): String = "자전거 헬멧 착용"
}