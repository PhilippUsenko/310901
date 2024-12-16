abstract class AbstractEmployee(
    protected val name: String,
    protected var money: Double,
    private var completedOrders: Int = 0 // Количество выполненных заказов
) {
    abstract fun receiveSalary() // Абстрактный метод для получения зарплаты

    open fun requestRaise(): Boolean { // Метод для запроса повышения зарплаты
        return false
    }

    protected fun completeOrder() { // Метод для увеличения количества выполненных заказов
        completedOrders++
    }

    fun getCompletedOrders(): Int {
        return completedOrders
    }

    fun getEmployeeName(): String {
        return name
    }

    fun getEmployeeMoney(): Double {
        return money
    }

    fun setEmployeeMoney(amount: Double) {
        money = amount
    }
}

class Director(
    name: String,
    money: Double
) : AbstractEmployee(name, money) {
    override fun receiveSalary() { // Переопределение метода для получения зарплаты
        println("${getEmployeeName()} получил зарплату: ${getEmployeeMoney()}")
    }

    fun manageCompany() { // Метод для управления компанией
        println("${getEmployeeName()} управляет компанией")
    }

    fun reward() { // Метод для премирования сотрудников
        println("${getEmployeeName()} премирует сотрудников")
    }
}

class Programmer(
    name: String,
    money: Double
) : AbstractEmployee(name, money) {
    override fun receiveSalary() { // Переопределение метода для получения зарплаты
        println("${getEmployeeName()} получил зарплату: ${getEmployeeMoney()}")
    }

    fun writeCode() {
        println("${getEmployeeName()} пишет код")
        completeOrder() // Увеличение количества выполненных заказов
    }

    override fun requestRaise(): Boolean { // Переопределение метода для запроса повышения зарплаты
        if (getCompletedOrders() >= 3) {
            setEmployeeMoney(getEmployeeMoney() * 1.05)
            println("${getEmployeeName()} получил повышение зарплаты до ${getEmployeeMoney()}")
            return true
        }
        println("${getEmployeeName()} не выполнил достаточно заданий для повышения зарплаты")
        return false
    }
}

class Cleaner(
    name: String,
    money: Double
) : AbstractEmployee(name, money) {
    override fun receiveSalary() { // Переопределение метода для получения зарплаты
        println("${getEmployeeName()} получил зарплату: ${getEmployeeMoney()}")
    }

    fun clean() {
        println("${getEmployeeName()} занимается уборкой")
        completeOrder() // Увеличение количества выполненной работы
    }

    override fun requestRaise(): Boolean { // Переопределение метода для запроса повышения зарплаты
        if (getCompletedOrders() >= 6) {
            setEmployeeMoney(getEmployeeMoney() * 1.03)
            println("${getEmployeeName()} получил повышение зарплаты до ${getEmployeeMoney()}")
            return true
        }
        println("${getEmployeeName()} не выполнил достаточно заданий для повышения зарплаты")
        return false
    }
}

class Company(
    private val name: String,
    private val tasks: List<String>, // Список задач компании
    private var budget: Double
) {
    fun hireEmployee(employee: AbstractEmployee) { // Метод для найма сотрудника
        println("Нанят новый сотрудник: ${employee.getEmployeeName()}")
    }

    fun transferMoney(employee: AbstractEmployee, amount: Double) { // Метод для перевода денег сотруднику
        if (budget >= amount) {
            budget -= amount
            employee.setEmployeeMoney(employee.getEmployeeMoney() + amount)
            println("Переведено $amount сотруднику ${employee.getEmployeeName()}. Остаток бюджета: $budget")
        } else {
            println("Недостаточно средств для перевода денег сотруднику ${employee.getEmployeeName()}")
        }
    }

    fun evaluateRaiseRequest(employee: AbstractEmployee): Boolean { // Метод для оценки запроса повышения зарплаты
        val result = employee.requestRaise()
        if (result) {
            println("${employee.getEmployeeName()} получил повышение зарплаты!")
        } else {
            println("${employee.getEmployeeName()} не получил повышение зарплаты.")
        }
        return result
    }
}

fun main() {
    val company = Company("Company Crazy", listOf("Task1", "Task2"), 100000.0)
    val director = Director("Eva", 10000.0)
    val programmer = Programmer("Dan", 5000.0)
    val cleaner = Cleaner("Alex", 2000.0)

    company.hireEmployee(director)
    company.hireEmployee(programmer)
    company.hireEmployee(cleaner)

    director.manageCompany()

    repeat(4) { programmer.writeCode() } // Выполняем заказы программиста
    repeat(7) { cleaner.clean() } // Выполняем заказы уборщика

    company.evaluateRaiseRequest(director) // Запрос повышения для директора
    company.evaluateRaiseRequest(programmer) // Запрос повышения для программиста
    company.evaluateRaiseRequest(cleaner) // Запрос повышения для уборщика

    programmer.receiveSalary()
    cleaner.receiveSalary()
    director.receiveSalary()

    company.transferMoney(director, director.getEmployeeMoney())
    company.transferMoney(programmer, programmer.getEmployeeMoney())
    company.transferMoney(cleaner, cleaner.getEmployeeMoney())
}