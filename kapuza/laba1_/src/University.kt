class University(val name: String)
{
    val students = mutableListOf<Student>() //список студентов
    val exams = mutableListOf<Exam>() //список экзаменов
    fun enrollStudent(student: Student) //метод для зачисления студентов
    {
        students.add(student)
        student.recordBook = GradeBook()
        println("Student ${student.name} enrolled.")
    }
    fun createExam(subject: String) : Exam //метод для создания экзаменов
    {
        val exam = Exam(subject)
        exams.add(exam)
        println("Exam for subject $subject has been created.")
        return exam
    }
    val records = mutableListOf<Record>()
    data class Record(val studentName: String, val groupNumber: Int, val subject: String, val grade: Int)
    fun getRecordsForStudent(studentName: String): List<Record>
    { return records.filter { it.studentName == studentName } }
    fun listExams(): List<Exam> = exams
}