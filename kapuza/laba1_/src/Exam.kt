class Exam(val subject: String)
{
    var status: ExamStatus = ExamStatus.NOT_PASSED //первоначальный статус экзамена
    var date: String = ""
    fun passExam()
    {
        status = ExamStatus.PASSED
        println("Exam $subject passed.")
    }
    enum class ExamStatus
    {
        PASSED,
        NOT_PASSED,
        SCHEDULED,
        CONDUCTED
    }
    companion object { var Examstatus: String = "" }
}