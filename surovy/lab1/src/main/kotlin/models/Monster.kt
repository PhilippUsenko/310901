package models

abstract class Monster(
    val type: String,
    val level: Int,
    var health: Int
) {
    abstract fun receiveDamage(damage: Int)

    fun die() {
        println("$type умер.")
    }
}
