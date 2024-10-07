class Buyer( private val money: Money) {
    private val productBuffer = ProductBuffer()
    private val cart = Cart(10)
    private val bag = Bag()

    fun takeProduct(product: Product) {
        productBuffer.addProduct(product)
    }

    fun putInCart() {
        val productsToAdd = productBuffer.getProducts()
        productsToAdd.forEach { cart.acceptProduct(it) }
        productBuffer.clearBuffer()
    }

    fun buyProduct(store: Store) {
        val productsToBuy = cart.getProducts()
        productsToBuy.forEach { product ->
            store.sellToBuyer(this, product)
        }
    }


    fun takeFromCart(): Product? {
        return cart.releaseProduct()
    }

    fun putInBag(product: Product) {
        bag.acceptProduct(product)
    }

    fun hasEnoughMoney(amount: Double): Boolean {
        return money.hasEnough(amount)
    }

    fun spendMoney(amount: Double) {
        money.spend(amount)
    }

    fun takeFromBuffer(): Product? {
        return productBuffer.releaseProduct()
    }
}