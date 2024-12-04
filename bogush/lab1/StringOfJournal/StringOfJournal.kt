import main


class StringOfJournal(val journal: Journal) {
    private val presence : MutableList<String> = mutableListOf()
    public var mapstringjournal : MutableMap<String, String> = mutableMapOf()
    private var nameofstudent : String = ""

    init {
        for (person in journal.getlistofstudents()) {
            mapstringjournal[person] = ""
        }
    }

    fun markgood(name: String) {
        mapstringjournal[name] = "присутствовал"
    }

    fun markbad(name: String) {
        mapstringjournal[name] = "отсутствовал"
    }

    fun check(topic : String) {
        println("Журнал предмета $topic: ")
        for ((key,value) in mapstringjournal) {
            println("$key: $value")
        }
    }
}