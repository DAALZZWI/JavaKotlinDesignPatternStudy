package DecoratorPattern.Kotlin.Concrete

import DecoratorPattern.Kotlin.Astract.Component

class BaseComponent : Component {

    override fun addPrice(): Int = 0

    override fun showItem(): String = ""
}