package models

class Character(
    val name: String,
    val race: String,
    val characterClass: String,
    var level: Int,
    var x: Int,
    var y: Int,
    var hp: Int
) {
    fun takeQuest(quest: Quest) {
        println("Персонаж $race - $characterClass с $level LVL $hp HP взял квест: ${quest.introText}")
    }

    fun reportInfo(){
        println("\n Имя - $name" +
                "\n Раса - $race" +
                "\n Класс - $characterClass" +
                "\n $level LVL $hp HP" +
                "\n Координаты - $x, $y"
        )
    }

    fun move(newX: Int, newY: Int) {
        x = newX
        y = newY
        println("Персонаж переместился на координаты ($x, $y)")
    }

    fun hitMonster(monster: Monster) {
        println("Персонаж атакует монстра!")
        monster.receiveDamage(10)
    }
}
