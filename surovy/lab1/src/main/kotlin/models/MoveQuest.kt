package models

class MoveQuest(
    introText: String,
    completionText: String,
    val targetX: Int,
    val targetY: Int
) : Quest(introText, completionText) {

    fun checkCoordinates(character: Character): Boolean {
        return character.x == targetX && character.y == targetY
    }

    override fun complete(): String {
        return "Координаты достигнуты, квест завершен!"
    }
}
