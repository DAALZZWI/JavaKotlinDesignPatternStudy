package BridgePattern.Kotlin

import BridgePattern.Kotlin.Brush.Brush
import BridgePattern.Kotlin.Brush.HB
import BridgePattern.Kotlin.Brush.MonoLine
import BridgePattern.Kotlin.Color.Blue
import BridgePattern.Kotlin.Color.Red

fun main() {

    val hbr: Brush = HB(Red())
    val hbb: Brush = HB(Blue())

    println(hbr.draw())
    println(hbb.draw())


    val mor: Brush = MonoLine(Red())
    val mob: Brush = MonoLine(Blue())

    println(mor.draw())
    println(mob.draw())
}