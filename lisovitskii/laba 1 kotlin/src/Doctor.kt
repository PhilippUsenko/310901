package com.example.medical

class Doctor(
    val name: String,
    val age: Int,
    private val specialty: String
) {
    fun getInfo(): String {
        return "Врач: $name, Возраст: $age, Специальность: $specialty"
    }

    fun checkup(patient: Patient, illness: Illness) {
        println("Врач диагностирует пациента: ${patient.name} с симптомами ${illness.symptoms}")
    }


    private fun diagnosePatient(patient: Patient, illness: Illness) {
        println("$name диагностирует ${patient.getInfo()} с болезнью: ${illness.name}.")
    }

    fun treat(patient: Patient, medicine: Medicine, illness: Illness) {
        if (patient.treatWithMedicine(medicine, illness)) {
            println("Пациент вылечен от ${illness::class.simpleName}.")
        } else {
            println("Не удалось вылечить ${illness::class.simpleName} с помощью ${medicine.name}.")
        }
    }
}
