import Student.*
import AbstractEducationalInstitution.*
import kotlin.system.exitProcess

fun main(args: Array<String>){
    println("Добро пожаловать в образовательную систему!")

    // Создаем людей разных уровней
    val kindergartener = Kindergartener()
    val pupil = Pupil()
    val student = Student()

    // Создаем учебные заведения
    val kindergarten = Kindergarten()
    val school = School()
    val university = University()

    while(true) {
        println()
        println("1. Поступить в детсад")
        println("2. Поступить в школу")

        var choice: Int
        try {
            choice = readln().toInt()
        } catch (e: Exception) {
            println("Некорректный ввод")
            continue
        }
        println()
        when (choice) {
            1-> {
                // Поступление в детсад и последующий выпуск в школу
                println("Поступаем в ${kindergarten.getInstitutionName()}")
                kindergarten.enrollStudent(kindergartener)
                kindergartener.study()
                kindergartener.graduate()
                kindergarten.expelStudent(kindergartener)
            }
            2-> {
                //поступление в школу
                println("Поступаем в ${school.getInstitutionName()}")
                val passedSchool = school.enrollStudent(pupil)
                if(passedSchool == true) {
                while(true) {
                    println()
                    println("1. Учиться")
                    println("2. Закончить школу")
                    println("3. Назад в меню")
                    var choic: Int
                    try {
                        choic = readln().toInt()
                    } catch (e: Exception) {
                        println("Некорректный ввод")
                        continue
                    }
                    when(choic) {
                        1-> {
                            school.pupilStudy(pupil)
                        }
                        2-> {
                            val ftrstudent = pupil.graduate()
                            if (ftrstudent is Student) {
                            school.expelStudent(pupil)
                            println()
                            println("Желаете сдать вступительный экзамен?")
                            println("1. Да")
                            println("2. Нет")
                            var chh: Int = readln().toInt()
                            if(chh == 1) {
                                if (pupil.takeExam()) {
                                    val newStudent = pupil.graduate()
                                    if (newStudent is Student) {
                                        university.enrollStudent(newStudent)
                                        // Логика для университета
                                        universityRoutine(newStudent, university)
                                    }
                                } else {
                                    println("Вы не сдали экзамен.")
                                    continue
                                }
                            } else continue

                            } else continue
                        }
                        3 -> break // Возврат в главное меню
                    } } }
                else continue
            } } } }

fun universityRoutine(student: Student, university: University): Boolean {
    while (true) {
        println()
        println("1. Учиться")
        println("2. Сходить на лекцию")
        println("3. Сходить на семинар")
        println("4. Сходить лабораторный практикум")
        println("5. Закончить университет")
        println("6. Назад в меню")
        var cho: Int
        try {
            cho = readln().toInt()
        } catch (e: Exception) {
            println("Некорректный ввод")
            continue
        }
        when (cho) {
            1 -> {
                student.study()
                university.assignGrades(student)
            }
            2 -> university.publicConductLecture()
            3 -> university.publicConductSeminar()
            4 -> university.publicConductLab()
            5 -> {
                val graduate = student.graduate()
                if (graduate != null && student.isReadyForGraduation()) {
                    university.expelStudent(student)
                    exitProcess(0) // Возврат значения, чтобы выйти из программы
                } else {
                    continue
                }
            }
            6 -> return false // Возврат в главное меню
        } } }