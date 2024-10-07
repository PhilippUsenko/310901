class Matches(quantity: Int, val length: Double) : Product(quantity) {
    fun ignite() {
        println("Спички зажжены!")
    }

    override val name: String
        get() = "Спички (длина: $length см, количество: $quantity)"

    override fun showInfo(): String {
        return "Спички: длина = $length см, количество = $quantity"
    }
}
