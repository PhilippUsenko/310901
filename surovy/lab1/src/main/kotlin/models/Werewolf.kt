package models

class Werewolf(level: Int, health: Int) : Monster("Оборотень", level, health) {

    override fun receiveDamage(damage: Int) {
        health -= damage
        if (health <= 0) {
            die()
        } else {
            println("Оборотень получил урон, осталось здоровья: $health")
        }
    }
}
