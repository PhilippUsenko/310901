package models

class Boar(level: Int, health: Int) : Monster("Кабан", level, health) {

    override fun receiveDamage(damage: Int) {
        health -= damage
        if (health <= 0) {
            die()
        } else {
            println("Кабан получил урон, осталось здоровья: $health")
        }
    }
}
