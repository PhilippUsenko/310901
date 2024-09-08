class Lecturer(name: String, val subject: String) : AbstractEmployee(name)
{
    fun conductExam(exam: Exam)
    {
        if (exam.status == Exam.ExamStatus.SCHEDULED)
        {
            exam.status = Exam.ExamStatus.CONDUCTED
            println("Exam for ${exam.subject} has been conducted")
        }
        else
        {
            println("Exam for ${exam.subject} cannot be conducted. Current status: ${exam.status}")
        }
    }
    fun manageRecordBook(group: String, students: List<Student>, subject: Subject, grade: Int)
    {
        for (student in students)
        {
            if (student.group == group)
            {
                student.recordBook?.addRecord(student.name, student.group.hashCode(), subject.name, grade)
            }
        }
    }
}