import main

class Journal(val uni : University) {
    private var listofstudents : MutableList<String> = uni.getstudentslist()
    public var mapjournal : MutableMap<String, StringOfJournal> = mutableMapOf()
    val lessons :MutableList<String> = mutableListOf("СЯП", "ОАИП", "КПО", "ППД", "ТВиМС")

    init {
        for (lessonname in lessons) {
            val stringj = StringOfJournal(this)
            mapjournal[lessonname] = stringj
        }
    }

    fun getlistofstudents() : MutableList<String> {
        return listofstudents
    }

    fun markstudent(presentstudent: MutableList<String>, topic : String) {
        for (stud in presentstudent) {
            mapjournal[topic]?.markgood(stud)
        }
        var templist = uni.getstudentslist().filter { it !in presentstudent }.toMutableList()
        for (stud in templist) {
            mapjournal[topic]?.markbad(stud)
        }
    }

    fun addmarkstudent(presentstudent: MutableList<String>, topic : String) {
        for (stud in presentstudent) {
            mapjournal[topic]?.markgood(stud)
        }
    }

    fun presentsjourn(topic: String) : MutableList<String> {
        val listofpresence : MutableList<String> = mutableListOf()
            for (stud in listofstudents) {
                if (mapjournal[topic]!!.mapstringjournal[stud] == "присутствовал") {
                    listofpresence.add(stud)
            }
        }
        return listofpresence
    }
}