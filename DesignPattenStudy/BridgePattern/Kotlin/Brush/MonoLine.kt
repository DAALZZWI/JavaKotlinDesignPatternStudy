package BridgePattern.Kotlin.Brush

import BridgePattern.Kotlin.Color.Color

class MonoLine(color: Color) : Brush(color) {

    val type: String = "[MonoLine 연필]"
    override fun draw(): String = "$type ${color.fill()}"
}