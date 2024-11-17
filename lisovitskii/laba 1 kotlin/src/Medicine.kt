package com.example.medical

class Medicine(
    val name: String,
    val price: Double,
    val form: String,
    val manufacturer: String
) {
    fun canTreat(illness: Illness): Boolean {
        return when (illness) {
            is Angina -> name == "Антибиотик"
            is Flu -> name == "Антивирусное"
            else -> false
        }
    }

    fun displayInfo() {
        println("Лекарство: $name, Цена: $price, Форма: $form, Производитель: $manufacturer")
    }
}