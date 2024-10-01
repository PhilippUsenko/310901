import Journal.*
import AbstractLesson.*
import Professor.*
import StringOfJournal.*
import Student.*
import University.*

fun main() {
    val univer = University()
    univer.addstudent("Богуш")
    univer.addstudent("Дашкевич")
    univer.addstudent("Осталовски")
    univer.addstudent("Воскресенский")
    univer.addstudent("Навросюк")

    univer.addprofessor("Василькова")
    univer.addprofessor("Дорошевич")
    univer.addprofessor("Давыдович")
    univer.addprofessor("Усенко")
    univer.addprofessor("Хмелев")
    val lecture = Lecture(univer)
    val student = Student(univer,lecture)
    val journal = Journal(univer)
    while (true) {
        println("Кто вы?")
        println("1. Староста")
        println("2. Преподаватель")
        println("3. Студент")
        println("4. Выход")

        var choice: Number
        try {
            choice = readln().toInt()
        } catch (e: Exception) {
            println("Некорректный ввод")
            Thread.sleep(500)
            continue
        }
        when (choice) {
            1->{
                println("Представьтесь, пожалуйста.")
                val name : String
                name = readln()
                var isStudExist : Boolean = false
                if (univer.getstudentslist().contains(name)) {
                    isStudExist = true
                } else {
                    println("Такого старосты не найдено.")
                    Thread.sleep(500)
                }
                while (isStudExist) {
                    println("Выберите действие:")
                    println("1. Отметить присутствующих")
                    println("2. Посетить лекцию")
                    println("3. Просмотреть свое расписание")
                    println("4. Просмотреть свои знания")
                    println("5. Просмотреть журнал")
                    println("6. Доотметить присутствующих")
                    println("7. Выход")

                    var choice2 : Number
                    try {
                        choice2 = readln().toInt()
                    } catch (e2: Exception) {
                        println("Некорректный ввод")
                        Thread.sleep(500)
                        continue
                    }
                    when (choice2) {
                        1->{
                            val starosta = Headman(univer, lecture, journal)
                            println("Введите предмет: ")
                            val predmet : String
                            predmet = readln()
                            if (univer.lessonslist.contains(predmet)) {
                                lecture.topic = predmet
                                print("Общий список студентов: ")
                                println(univer.getstudentslist())
                                println("Список присутствующих на лекции: " + lecture.getpresents())
                                println("Введите фамилии студентов через пробел, которых хотите отметить, как присутствующих: ")
                                val input = readLine()
                                if (input != null) {
                                    val list = input.split(" ").toMutableList()
                                    starosta.getpres(list, predmet)
                                } else {
                                    println("Ошибка: вы ничего не ввели.")
                                }
                                Thread.sleep(1000)
                            } else {
                                println("Такого предмета не существует.")
                                Thread.sleep(500)
                            }
                        }
                        2->{
                            val starosta = Headman(univer, lecture, journal)
                            println("Введите предмет: ")
                            val predmet : String
                            predmet = readln()
                            if (univer.lessonslist.contains(predmet)) {
                                starosta.visitlecture(predmet,name)
                                Thread.sleep(1000)
                            } else {
                                println("Такого предмета не существует.")
                                Thread.sleep(500)
                            }
                        }
                        3->{
                            val starosta = Headman(univer, lecture, journal)
                            starosta.getlessons()
                            Thread.sleep(1000)
                        }
                        4->{
                            student.getknowledge(name)
                            Thread.sleep(1000)
                        }
                        5->{
                            println("Введите предмет: ")
                            val predmet : String
                            predmet = readln()
                            if (journal.lessons.contains(predmet)) {
                                journal.mapjournal[predmet]?.check(predmet)
                                Thread.sleep(5000)
                            } else {
                                println("Такого предмета не существует.")
                                Thread.sleep(500)
                            }
                        }
                        6->{
                            val starosta = Headman(univer, lecture, journal)
                            println("Введите предмет: ")
                            val predmet : String
                            predmet = readln()
                            if (univer.lessonslist.contains(predmet)) {
                                lecture.topic = predmet
                                print("Общий список студентов: ")
                                println(univer.getstudentslist())
                                println("Список присутствующих на лекции: " + lecture.getpresents())
                                journal.mapjournal[predmet]?.check(predmet)
                                println("Введите фамилии студентов через пробел, которых хотите доотметить, как присутствующих: ")
                                val input = readLine()
                                if (input != null) {
                                    val list = input.split(" ").toMutableList()
                                    starosta.addnewmark(list, predmet)
                                } else {
                                    println("Ошибка: вы ничего не ввели.")
                                }
                                Thread.sleep(1000)
                            } else {
                                println("Такого предмета не существует.")
                                Thread.sleep(500)
                            }
                        }
                        7->{
                            break
                        }
                    }
                }
            }
            2->{
                println("Представьтесь, пожалуйста.")
                val name : String
                name = readln()
                var isPrepodExist : Boolean = false
                if (univer.getprofessorslist().contains(name)) {
                    isPrepodExist = true
                } else {
                    println("Такого преподавателя не найдено.")
                    Thread.sleep(500)
                }
                while(isPrepodExist) {
                    println("Выберите действие:")
                    println("1. Прочитать лекцию")
                    println("2. Отметить присутствующих")
                    println("3. Сверить присутствие студентов на лекции с отметками в журнале")
                    println("4. Просмотреть журнал")
                    println("5. Доотметить присутствующих")
                    println("6. Выход")

                    var choice3 : Number
                    try {
                        choice3 = readln().toInt()
                    } catch (e3: Exception) {
                        println("Некорректный ввод")
                        Thread.sleep(500)
                        continue
                    }
                    when (choice3) {
                        1->{
                            val prepod = Professor(univer, lecture, journal)
                            print("Все лекции: ")
                            println(univer.lessonslist)
                            println("Введите предмет, который хотите прочитать: ")
                            val predmet : String
                            predmet = readln()
                            if (univer.lessonslist.contains(predmet)) {
                                prepod.readlecture(predmet)
                                Thread.sleep(1000)
                            } else {
                                println("Такого предмета не существует.")
                                Thread.sleep(500)
                            }
                        }
                        2->{
                            val prepod = Professor(univer, lecture, journal)
                            println("Введите предмет: ")
                            val predmet : String
                            predmet = readln()
                            if (univer.lessonslist.contains(predmet)) {
                                lecture.topic = predmet
                                print("Общий список студентов: ")
                                println(univer.getstudentslist())
                                println("Список присутствующих на лекции: " + lecture.getpresents())
                                println("Введите через пробел фамилии студентов, которых хотите отметить, как присутствующих: ")
                                val input = readLine()
                                if (input != null) {
                                    val list = input.split(" ").toMutableList()
                                    prepod.usemark(list, predmet)
                                } else {
                                    println("Ошибка: вы ничего не ввели.")
                                }
                                Thread.sleep(1000)
                            } else {
                                println("Такого предмета не существует.")
                                Thread.sleep(500)
                            }
                        }
                        3->{
                            val prepod = Professor(univer, lecture, journal)
                            println("Введите предмет: ")
                            val predmet : String
                            predmet = readln()
                            if (journal.lessons.contains(predmet)) {
                                lecture.topic = predmet
                                prepod.check(predmet)
                                Thread.sleep(500)
                            } else {
                                println("Такого предмета не существует.")
                                Thread.sleep(500)
                            }
                        }
                        4->{
                            println("Введите предмет: ")
                            val predmet : String
                            predmet = readln()
                            if (journal.lessons.contains(predmet)) {
                                journal.mapjournal[predmet]?.check(predmet)
                                Thread.sleep(5000)
                            } else {
                                println("Такого предмета не существует.")
                                Thread.sleep(500)
                            }
                        }
                        5->{
                            val prepod = Professor(univer, lecture, journal)
                            println("Введите предмет: ")
                            val predmet : String
                            predmet = readln()
                            if (univer.lessonslist.contains(predmet)) {
                                lecture.topic = predmet
                                print("Общий список студентов: ")
                                println(univer.getstudentslist())
                                println("Список присутствующих на лекции: " + lecture.getpresents())
                                journal.mapjournal[predmet]?.check(predmet)
                                println("Введите фамилии студентов через пробел, которых хотите доотметить, как присутствующих: ")
                                val input = readLine()
                                if (input != null) {
                                    val list = input.split(" ").toMutableList()
                                    prepod.addnewmark(list, predmet)
                                } else {
                                    println("Ошибка: вы ничего не ввели.")
                                }
                                Thread.sleep(1000)
                            } else {
                                println("Такого предмета не существует.")
                                Thread.sleep(500)
                            }
                        }
                        6->{
                            break
                        }
                    }
                }
            }
            3->{
                println("Представьтесь, пожалуйста.")
                val name : String
                name = readln()
                var isStuddExist : Boolean = false
                if (univer.getstudentslist().contains(name)) {
                    isStuddExist = true
                } else {
                    println("Такого студента не найдено.")
                    Thread.sleep(500)
                }
                while(isStuddExist) {
                    println("Выберите действие:")
                    println("1. Посетить лекцию")
                    println("2. Просмотреть свое расписание")
                    println("3. Просмотреть свои знания")
                    println("4. Выход")

                    var choice4 : Number
                    try {
                        choice4 = readln().toInt()
                    } catch (e4: Exception) {
                        println("Некорректный ввод")
                        Thread.sleep(500)
                        continue
                    }
                    when (choice4) {
                        1->{
                            println("Введите предмет: ")
                            val predmet : String
                            predmet = readln()
                            if (univer.lessonslist.contains(predmet)) {
                                student.visitlecture(predmet,name)
                                Thread.sleep(1000)
                            } else {
                                println("Такого предмета не существует.")
                                Thread.sleep(500)
                            }
                        }
                        2->{
                            student.getlessons()
                            Thread.sleep(1000)
                        }
                        3->{
                            student.getknowledge(name)
                            Thread.sleep(1000)
                        }
                        4->{
                            break
                        }
                    }
                }
            }
            4->{
                break
            }
        }
    }
}