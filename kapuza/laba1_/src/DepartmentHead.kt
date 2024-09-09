class DepartmentHead (name: String) : AbstractEmployee(name)
{
    fun scheduleExam(exam: Exam, date: String) //метод отвечающий за назначения экзамена
    {
        exam.date = date
        exam.status = Exam.ExamStatus.SCHEDULED
        println("Exam for ${exam.subject} scheduled on $date")
    }
    fun manageUniversity(university: University) //метод для управления университетом
    {
        println("Managing university: ${university.name}")
        university.students.forEach()
        {   student ->
            println("Student: ${student.name}, Number: ${student.studentNumber}")
        }
        university.exams.forEach()
        {   exam ->
            println("Exam: ${exam.subject}, Status: ${exam.status}, Date: ${exam.date}")
        }
    }
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
}