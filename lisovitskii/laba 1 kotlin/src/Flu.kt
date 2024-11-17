package com.example.medical

class Flu : Illness("Грип") {
    override val symptoms = listOf("Кашель")

    fun causeCough() {
        println("Вызывает кашель.")
    }
}