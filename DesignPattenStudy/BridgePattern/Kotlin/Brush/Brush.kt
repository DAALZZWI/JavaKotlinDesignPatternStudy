package BridgePattern.Kotlin.Brush

import BridgePattern.Kotlin.Color.Color

abstract class Brush(protected val color: Color) {

    abstract fun draw(): String
}