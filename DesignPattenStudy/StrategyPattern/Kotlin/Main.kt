package StrategyPattern.Kotlin

fun main(args: Array<String>) {

    val gameCharacter = GameCharacter()

    gameCharacter.setWeapon(Sword())
    gameCharacter.attack()

    gameCharacter.setWeapon(Knife())
    gameCharacter.attack()

    gameCharacter.setWeapon(Axe())
    gameCharacter.attack()
}