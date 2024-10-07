class Money(private var amount: Double) {
    fun spend(amount: Double) {
        this.amount -= amount
        println("Потрачено: $amount. Осталось: ${this.amount}")
    }

    fun hasEnough(amount: Double): Boolean {
        return this.amount >= amount
    }
}