class Student(val name: String, val group: String, val subjects: List<String>,  val grades: MutableMap<String, Int>)
{
    val studentNumber: String = ""
    var recordBook: GradeBook? = GradeBook()
    private val exams = mutableListOf<Exam>()
    fun takeExam(exam: Exam, grade: Int?) //Метод для сдачи экзамена
    {
        if (subjects.contains(exam.subject))
        {
            exam.status = Exam.ExamStatus.CONDUCTED
            println("Student $name took the exam in ${exam.subject}.")
            if (grade != null)
            {
                grades[exam.subject] = grade
                recordBook?.addRecord(name, group.hashCode(), exam.subject, grade)
                println("Student $name took the exam in ${exam.subject} and received a grade of $grade.")
            }
            else
            {
                println("Student $name did not pass the exam in ${exam.subject}.")
            }
        }
        else
        {
            println("Student $name is not enrolled in ${exam.subject}.")
        }
    }
    fun getExams(): List<Exam> = exams

    fun viewRecordBook(): List<GradeBook.Record>?
    { return recordBook?.getInfo() }
}