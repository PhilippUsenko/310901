package kotlinequivalent

// Абстрактный клиент
abstract class AbstractClient(
    protected val name: String,
    protected var money: Double
) {
    abstract fun pay(cost: Double, company: Company)
    abstract fun order(company: Company, product: String, amount: Int, isUrgent: Boolean, timeLimit: String): Double
}