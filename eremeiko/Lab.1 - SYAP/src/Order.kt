package kotlinequivalent

// Класс заказа
open class Order(
    private val number: Int,
    private val product: String,
    private val amount: Int,
    private var status: String
) {
    fun getNumber() : Int {return this.number}
    fun getProduct() : String {return this.product}
    fun getAmount() : Int {return this.amount}
    fun getStatus() : String {return this.status}
    fun setStatus(newStatus : String) {this.status = newStatus}
}