package com.example.medical
fun main() {
    val patient = Patient("Богдан", 19, "Нормальное", "Нормальные", "Хорошее")
    val doctor = Doctor("Д-р Смирнов", 28, "Терапевт")
    val antibiotic = Medicine("Антибиотик", 1400.0, "Таблетки", "ФармаПлюс")
    val antiviral = Medicine("Антивирусное", 700.0, "Порошок", "ФармаПлюс")
    val angina = Angina()
    val flu = Flu()
    println("1. Пациент вызывает боль в горле (ангина)")
    angina.causeThroatPain()
    patient.worsenCondition(angina)

    println("\n2. Сравниваем ангину с лекарством (антибиотик)")
    val canTreatAngina = patient.compareIllnessWithMedicine(angina, antibiotic)
    println("Может ли лечить ангину: $canTreatAngina")

    println("\n3. Пациент жалуется врачу")
    patient.showComplaint()

    println("\n4. Врач диагностирует пациента")
    doctor.checkup(patient, angina)

    println("\n5. Получаем симптомы ангины")
    angina.causeSymptoms()

    println("\n6. Лечим пациента от ангины")
    doctor.treat(patient, antibiotic, angina)

    println("\n7. Пациент вызывает кашель (грипп)")
    flu.causeCough()
    patient.worsenCondition(flu)

    println("\n8. Сравниваем грипп с лекарством (антивирусное)")
    val canTreatFlu = patient.compareIllnessWithMedicine(flu, antiviral)
    println("Может ли лечить грипп: $canTreatFlu")

    println("\n9. Пациент разрушил болезнь")
    doctor.treat(patient, antiviral, flu)
}