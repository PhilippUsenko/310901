class Store(private val name: String) {
    fun sell(product: Product): Double {
        val price = when (product) {
            is Matches -> 1.0
            is Bread -> 2.0
            is Milk -> 1.5
            else -> 0.0
        }
        println("Магазин $name продает: ${product.showInfo()} за $price.")
        return price
    }

    fun sellToBuyer(buyer: Buyer, product: Product) {
        val price = sell(product)
        askForMoney(buyer, price)
    }

    private fun askForMoney(buyer: Buyer, amount: Double) {
        println("Магазин просит $amount у покупателя.")
        if (buyer.hasEnoughMoney(amount)) {
            buyer.spendMoney(amount)
            println("Покупка успешна!")
        } else {
            println("Недостаточно денег у покупателя.")
        }
    }
}
