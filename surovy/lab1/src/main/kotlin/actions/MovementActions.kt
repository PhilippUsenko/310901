package actions

import models.Character

object MovementActions {
    fun moveCharacter(character: Character, newX: Int, newY: Int) {
        character.move(newX, newY)
    }

    fun reportCoordinates(character: Character) {
        println("Текущие координаты персонажа: (${character.x}, ${character.y})")
    }
}
