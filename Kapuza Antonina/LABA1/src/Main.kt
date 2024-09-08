fun main()
{
    val university = University("Белорусский государственный университет информатики и радиоэлектроники")
    val student1 = Student("Lyi Grey", "12345", listOf("Math", "Phisics"), mutableMapOf())
    university.enrollStudent(student1)
    student1.viewRecordBook()
    val lecturer = Lecturer("Dr. Smith", "Math")

    val subjects = listOf("Math", "Physics")
    val grades = mutableMapOf<String, Int>()
    val student2 = Student("John Doe", "Group A34", subjects, grades)
    val exam2 = Exam("Dark arts defence")
    student2.takeExam(exam2, 3)
    println(student2.viewRecordBook())

    val exam1 = university.createExam("Math")
    val departmenthead = DepartmentHead("Mr. Black")
    departmenthead.scheduleExam(exam1, "2024-06-05")
    lecturer.conductExam(exam1)

    student1.takeExam(exam1, 10)
    println(student1.viewRecordBook())

    val engineer = Engineer("Fred Weasley", "101")
    println("Engineer ${engineer.name} is assigned to room ${engineer.roomNumber}.")
}