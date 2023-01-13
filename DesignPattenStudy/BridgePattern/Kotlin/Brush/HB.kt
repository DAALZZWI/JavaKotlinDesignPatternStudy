package BridgePattern.Kotlin.Brush

import BridgePattern.Kotlin.Color.Color

class HB(color: Color) : Brush(color) {

    val type: String = "[HB 연필]"
    override fun draw(): String = "$type ${color.fill()}"
}