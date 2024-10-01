import main

open abstract class AbstractLesson {

}

class Lecture(val univ : University) : AbstractLesson() {
    private var presentstudents : MutableList<String> = mutableListOf()
    public var topic : String = ""
    private var mapoflessons : MutableMap<String, MutableList<String>> = mutableMapOf()

    init {
        for (lessonname in univ.lessonslist) {
            mapoflessons[lessonname] = mutableListOf()
        }
    }

    fun getpresents() : MutableList<String> {
        val default : MutableList<String> = mutableListOf()
        presentstudents = mapoflessons[topic] ?: default
        return presentstudents
    }

    fun addpresents(nameofstudent : String) {
        mapoflessons[topic]?.add(nameofstudent)
    }
}