import kotlin.random.Random // Импортируем Random для генерации случайных чисел

abstract class AbstractEducationalInstitution {
    protected abstract val name: String
    fun getInstitutionName(): String {
        return name
    }
    abstract fun enrollStudent(student: AbstractStudent): Boolean
    abstract fun expelStudent(student: AbstractStudent)
    abstract fun assignGrades(student: AbstractStudent)
}

class University: AbstractEducationalInstitution() {
    private var student: Student? = null
    override val name = "Университет"
    override fun enrollStudent(student: AbstractStudent): Boolean {
        return if (student is Student) {
            this.student = student //ссылка на текущий объект класса
            println("Студент зачислен в университет.")
            true
        }
        else {return false}
    }
    override fun expelStudent(student: AbstractStudent) {
        if (this.student == student) {
            this.student = null
            println("Студент отчислен из университета и готов работать.")
        }
    }
    override fun assignGrades(student: AbstractStudent) {
        if (this.student == student) {
            // Генерируем случайную оценку от 1 до 10
            val grades = List(1) { Random.nextInt(1, 11) }
            student.grades.addAll(grades)
            println("Оценки выставлены студенту: $grades")
        }
    }

    fun publicConductLecture() {
        conductLecture()
    }

    fun publicConductSeminar() {
        conductSeminar()
    }

    fun publicConductLab() {
        conductLab()
    }

    private fun conductLecture () {
        println("Для студента проводится лекция.")
        student?.study();
        assignGrades(student!!) // Вызываем метод с текущим студентом
    }
    private fun conductSeminar() {
        println("Проводится семинар.")
        student?.study(); //оператор безопасного вызова (только для случаев не с null)
        assignGrades(student!!) // Вызываем метод с текущим студентом
    }
    private fun conductLab() {
        println("Проводится лабораторный практикум.")
        student?.study();
        assignGrades(student!!)
    }
}

class School: AbstractEducationalInstitution() {
    private var pupil: Pupil? = null
    override val name = "Школа"
    override fun enrollStudent(pupil: AbstractStudent): Boolean {
        return if (pupil is Pupil) {
            this.pupil = pupil
            println()
            println("Вы зачислены в школу.")
            true
        }
        else {return false}
    }
    override fun expelStudent(pupil: AbstractStudent) {
        if (this.pupil == pupil) {
            this.pupil = null
            println()
            println("Школьник отчислен из школы.")
            conductRuler()
        }
    }
    override fun assignGrades(pupil: AbstractStudent) {
        if (this.pupil == pupil) {
            // Генерируем 3 случайные оценки от 1 до 10
            val grades = List(1) { Random.nextInt(1, 11) }
            pupil.grades.addAll(grades)
            println("Оценки выставлены школьнику: $grades")
        }
    }

    fun pupilStudy(pupil: AbstractStudent) {
        conductLesson ()
        assignGrades(pupil)
    }

    private fun conductLesson () {
        println()
        println("Для школьников проводится урок.")
            pupil?.study()
    }
    private fun conductRuler() {
        println("Проводится линейка.")
    }
}

class Kindergarten: AbstractEducationalInstitution() {
    private var kindergartener: Kindergartener? = null
    override val name = "Детсад"
    private fun takeBreakfast() {
        println()
        println("Вам приготовили завтрак!")
    }
    override fun enrollStudent(kindergartener: AbstractStudent):Boolean {
        return if (kindergartener is Kindergartener) {
            this.kindergartener = kindergartener
            println()
            println("Вы зачислены в детсад.")
            takeBreakfast()
            true
        }
        else {return false}
    }
    override fun expelStudent(kindergartener: AbstractStudent) {
        if (this.kindergartener == kindergartener) {
            this.kindergartener = null
            println()
            println("Вы отчислены из сада.")
        }
    }
    override fun assignGrades(kindergartener: AbstractStudent) {
        if (this.kindergartener == kindergartener) {
            // Генерируем случайную оценку от 1 до 10
            val grades = List(1) { Random.nextInt(1, 11) }
            kindergartener.grades.addAll(grades)
            println("Оценки выставлены детсадовцу.")
        }
    }
}