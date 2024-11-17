package com.example.medical

abstract class Illness(val name: String) {
    abstract val symptoms: List<String>

    open fun causeSymptoms() {
        println("Вызывает симптомы: $symptoms")
    }
}