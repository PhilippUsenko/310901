import kotlin.system.exitProcess

abstract class AbstractStudent() {
    var grades: MutableList<Int> = mutableListOf() //объявляем изменяемый список оценок студента
    protected var knowledge: Int = 0

    abstract fun study()
    abstract fun increaseKnowledge(amount: Int)
    abstract fun graduate(): AbstractStudent?
    fun isReadyForGraduation(): Boolean {
        val averageGrade = grades.average() //вычисляем среднюю оценку из списка оценок
        return knowledge >= 25 && averageGrade >= 7 // Выпуск возможен при достаточном уровне знаний и оценках
    }
}

class Kindergartener: AbstractStudent() {

    override fun study() {
        println()
        println("Вы играете и учитесь...")
        increaseKnowledge(2)
    }

    override fun increaseKnowledge(amount: Int) {
        knowledge += amount
        println("Уровень знаний увеличился на $amount. Общий уровень знаний: $knowledge")
    }

    override fun graduate(): AbstractStudent? {
        return if (knowledge >= 2) {
            println()
            println("Вы готовы к школе!")
            Pupil() // Возвращаем объект Pupil, так как это следующий этап.
        } else {
            println()
            println("Вы пока не готовы к школе.")
            null
        }
    }
}

class Pupil: AbstractStudent() {
    fun takeExam(): Boolean {
        //имитация сдачи вступительного экзамена
        val success = (1..10).random() > 5 // Проходит экзамен с вероятностью 50%
        if (success) {
            println("Школьник сдал вступительный экзамен!")
        }
        else {
            println("Школьник не сдал вступительный экзамен.")
        }
        return success
    }
    override fun study() {
        println("Школьник учится...")
        increaseKnowledge (2)
    }

    override fun increaseKnowledge(amount: Int) {
        knowledge += amount
        println("Уровень знаний увеличился на $amount. Общий уровень знаний: $knowledge")
    }
    override fun graduate(): AbstractStudent? {
        return if (knowledge >= 10) {
            println("Школьник готов стать студентом!")
            Student() // Переход на следующий этап
        } else {
            println("Школьник пока не готов стать студентом.")
            null
        }
    }
}

class Student: AbstractStudent() {
    override fun study() {
        println("Студент учится...")
        increaseKnowledge (3)
    }

    override fun increaseKnowledge(amount: Int) {
        knowledge += amount
        println("Уровень знаний увеличился на $amount. Общий уровень знаний: $knowledge")
    }
    override fun graduate(): AbstractStudent? {
        return if (knowledge >= 25) {
            println("Студент готов работать!")
            exitProcess(0)
        } else {
            println("Студент не готов работать.")
            null
        }
    }
}




