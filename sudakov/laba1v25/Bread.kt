class Bread(private val flavor: String, quantity: Int = 1) : Product(quantity) {
    override val name: String
        get() = "Хлеб: вкус = $flavor"

    override fun showInfo(): String {
        return "Хлеб: вкус = $flavor, количество = $quantity"
    }
}

