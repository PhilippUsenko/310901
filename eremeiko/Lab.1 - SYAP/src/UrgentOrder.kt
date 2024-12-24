package kotlinequivalent

// Срочный заказ
class UrgentOrder(
    number: Int,
    product: String,
    amount: Int,
    status: String,
    private var timeLimit: String
) : Order(number, product, amount, status) {
    fun checkTime() {
        println("\nПроверка времени для срочного заказа №${getNumber()}: лимит времени - $timeLimit.")
    }
    fun setTimeLimit(newTimeLimit : String) {this.timeLimit = newTimeLimit}
}