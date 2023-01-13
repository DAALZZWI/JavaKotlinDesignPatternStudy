package TemplateMethodPattern.Kotlin

import TemplateMethodPattern.Kotlin.dp.AbstServer
import TemplateMethodPattern.Kotlin.dp.DefaultServer

fun main(args: Array<String>) {

    val abstServer: AbstServer  = DefaultServer()
    abstServer.serverConnection("User")
}