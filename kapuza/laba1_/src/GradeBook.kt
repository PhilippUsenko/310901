class GradeBook
{
    val records = mutableListOf<Record>()
    data class Record(val studentName: String, val groupNumber: Int, val subject: String, val grade: Int)
    fun addRecord(studentName: String, groupNumber: Int, subject: String, grade: Int)
    {
        records.add(Record(studentName, groupNumber, subject, grade))
        println("Record added: $studentName, $groupNumber, $subject, $grade")
    }
//    fun getRecordsForStudent(studentName: String): List<Record>
//    { return records.filter { it.studentName == studentName } }
    fun getInfo(): List<Record>
    { return records }
}