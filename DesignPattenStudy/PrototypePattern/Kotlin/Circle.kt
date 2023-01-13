package PrototypePattern.Kotlin

data class Circle(var x: Int, var y: Int, var r: Int, override var id: Int): Shape(id) {

    fun copy(): Circle {

        return clone() as Circle
    }
}