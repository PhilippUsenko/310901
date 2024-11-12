package actions

import models.Character
import models.Monster

object BattleActions {
    fun attackMonster(character: Character, monster: Monster) {
        character.hitMonster(monster)
    }

    fun reportMonsterDeath(monster: Monster) {
        if (monster.health <= 0) {
            monster.die()
        } else {
            println("Монстр всё ещё жив с ${monster.health} HP.")
        }
    }
}
