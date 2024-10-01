import main

class University {
    private var professorslist : MutableList<String> = mutableListOf()
    private var studentslist : MutableList<String> = mutableListOf()
    public var lessonslist : MutableList<String> = mutableListOf()

    init {
        addlesson("ОАИП")
        addlesson("СЯП")
        addlesson("КПО")
        addlesson("ППД")
        addlesson("ТВиМС")
    }

    fun addstudent(studentname : String) {
        studentslist.add(studentname)
        println("Студент зачислен успешно.")
    }

    fun addprofessor(professorname : String) {
        professorslist.add(professorname)
        println("Преподователь нанят успешно.")
    }

    private fun addlesson(lessontopic : String) {
        lessonslist.add(lessontopic)
        println("План занятий обновлен.")
    }

    fun getstudentslist() : MutableList<String> {
        return studentslist
    }

    fun getprofessorslist() : MutableList<String> {
        return professorslist
    }
}
