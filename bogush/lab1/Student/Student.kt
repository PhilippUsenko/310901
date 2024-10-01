import main

open abstract class AbstractStudent {

}

open class Student(val univ : University, val lect: Lecture) : AbstractStudent() {
    private var marks : MutableList<Int> = mutableListOf()
    private var mapofstudents : MutableMap<String, String> = mutableMapOf()

    init {
        for (studs in univ.getstudentslist()) {
            mapofstudents[studs] = "Знания получены по предметам:"
        }
    }

    fun visitlecture(topic: String, name : String) {
        lect.topic = topic
        if (lect.getpresents().contains(name)) {
            println("Вы уже посетили данную лекцию!")
        } else {
            lect.addpresents(name)
            mapofstudents[name] += " $topic"
            println("Вы успешно посетили лекцию!")
        }
    }

    fun getlessons() {
        println("Ваши занятия: " + univ.lessonslist)
    }

    fun getknowledge(name: String) {
        println(mapofstudents[name])
    }
}

class Headman(univ: University, lect : Lecture, val journal: Journal) : Student(univ, lect) {
    private fun markpresentsjournal(presentstudent: MutableList<String>, topic: String) {
        for (stud in presentstudent) {
            if (univ.getstudentslist().contains(stud) == true) {
                journal.markstudent(presentstudent, topic)
            } else {
                println("Студента $stud не найдено.")
            }
        }
        println("Журнал обновлен.")
    }

    fun addnewmark(presentstudent: MutableList<String>, topic: String) {
        for (stud in presentstudent) {
            if (univ.getstudentslist().contains(stud) == true) {
                journal.addmarkstudent(presentstudent, topic)
            }
        }
    }

    fun getpres(presentstudent: MutableList<String>, topic: String) {
        markpresentsjournal(presentstudent, topic)
    }
}