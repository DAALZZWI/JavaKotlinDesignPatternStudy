package StrategyPattern.Kotlin

class GameCharacter() : Weapon {

    // 접근점
    private var weapon: Weapon? = null

    fun setWeapon(weapon: Weapon) {

        this.weapon = weapon
    }

    fun getWeapon(): Weapon? {

        return this.weapon
    }

    override fun attack() {

        // 델리 게이트
        this.weapon?.attack()
    }
}