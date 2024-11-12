package main

import models.*

fun main() {


    println("Добро пожаловать в игру!\nПредставься путник: ")
    val nameCharacter = readln()
    println("В нашей игре 5 рас:\n1. Орк\n2. Полурослик\n3. Гном\n4. Эльф\n5. Тифлинг")
    println("Выбери расу, $nameCharacter!")

    var raceCharacter = "Гоблин"
    var classCharacter = "Следопыт"
    var choice = readln()
        when (choice) {
            "1" -> raceCharacter = "Орк"
            "2" -> raceCharacter = "Полурослик"
            "3" -> raceCharacter = "Гном"
            "4" -> raceCharacter = "Эльф"
            "5" -> raceCharacter = "Тифлинг"
            else -> println("$nameCharacter, тот кто не играет по правилам, играет за гоблина!")
        }

    println("В нашей игре 5 классов:\n1. Воин\n2. Лучник\n3. Маг\n4. Чародей\n5. Плут")
    println("Выбери класс, $nameCharacter!")
    choice = readln()
    when (choice) {
        "1" -> classCharacter = "Воин"
        "2" -> classCharacter = "Лучник"
        "3" -> classCharacter = "Маг"
        "4" -> classCharacter = "Чародей"
        "5" -> classCharacter = "Плут"
        else -> println("$nameCharacter, тот кто не играет по правилам, играет за следопыта!")
    }

    val character = Character(name = nameCharacter, race = raceCharacter, characterClass = classCharacter, level = 1, x = 0, y = 0, hp = 20)

    character.reportInfo()


}
