package com.example.medical

class Patient(
    val name: String,
    val age: Int,
    var throat: String,
    var lungs: String,
    private var healthStatus: String
) {
    fun getInfo(): String {
        return "Пациент: $name, Возраст: $age, Состояние горла: $throat, Состояние лёгких: $lungs, Состояние здоровья: $healthStatus"
    }

    fun worsenCondition(illness: Illness) {
        when (illness) {
            is Angina -> {
                illness.causeSymptoms()
                throat = "Боль в горле"
            }
            is Flu -> {
                illness.causeSymptoms()
                lungs = "Кашель"
            }
        }
        healthStatus = "Плохо"
    }

    fun compareIllnessWithMedicine(illness:Illness, medicine: Medicine): Boolean {//сравнить болезнь с лекарством

        println("Сравниваем ${illness::class.simpleName} с ${medicine.name}")
        return when (illness) {
            is Angina -> medicine.name.contains("Антибиотик")
            is Flu -> medicine.name.contains("Антивирусное")
            else -> false
        }
    }
    fun treatWithMedicine(medicine: Medicine, illness: Illness): Boolean {
        if (compareIllnessWithMedicine(illness, medicine)) {
            println("${illness::class.simpleName} лечится лекарством ${medicine.name}.")
            return true
        } else {
            println("${medicine.name} не подходит для лечения ${illness::class.simpleName}.")
            return false
        }
    }

    fun showComplaint() {
        println("Пациент $name жалуется на: горло - $throat, лёгкие - $lungs, общее здоровье - $healthStatus.")
    }

    private fun destroyIllness(illness: Illness) {
        when (illness) {
            is Angina -> throat = "Нормальное"
            is Flu -> lungs = "Нормальные"
        }
        healthStatus = "Хорошо"
    }
}
