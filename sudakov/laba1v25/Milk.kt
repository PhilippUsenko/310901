class Milk(quantity: Int) : Product(quantity) {
    override val name: String
        get() = "Молоко (количество: $quantity)"

    override fun showInfo(): String {
        return "Молоко: количество = $quantity"
    }
}
