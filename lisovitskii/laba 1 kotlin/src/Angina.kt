package com.example.medical

class Angina : Illness("Ангина") {
    override val symptoms = listOf("Боль в горле")

    fun causeThroatPain() {
        println("Вызывает боль в горле.")
    }
}
