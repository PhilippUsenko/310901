import main

class Professor(val univ: University, val lect : Lecture, val journal : Journal) {
    fun readlecture(topic : String) {
        univ.lessonslist.remove(topic)
        println("Лекция прочитана!")
    }

    private fun markpresents(presentstudent: MutableList<String>,topic: String) {
        for (stud in presentstudent) {
            if (stud in univ.getstudentslist()) {
                journal.markstudent(presentstudent, topic)
            } else {
                println("Студента $stud не найдено.")
            }
        }
        println("Журнал обновлен.")
    }

    private fun getlist(topic: String) : MutableList<String> {
        return journal.getlistofstudents()
    }

    fun usemark(presentstudent: MutableList<String>,topic: String) {
        markpresents(presentstudent, topic)
    }

    fun check(topic: String) {
        println("Общий список группы: " + getlist(topic))
        println("Присутствующие на лекции: " + lect.getpresents())
        println("Отмеченные студенты на лекции: " + journal.presentsjourn(topic))
    }

    fun addnewmark(presentstudent: MutableList<String>, topic: String) {
        for (stud in presentstudent) {
            if (univ.getstudentslist().contains(stud) == true) {
                journal.addmarkstudent(presentstudent, topic)
            }
        }
    }
}