class Cart(private val capacity: Int) {
    private val productsInCart = mutableListOf<Product>()

    fun acceptProduct(product: Product) {
        if (productsInCart.size < capacity) {
            productsInCart.add(product)
            println("${product.showInfo()} добавлено в тележку.")
        } else {
            println("Тележка полна!")
        }
    }

    fun releaseProduct(): Product? {
        return if (productsInCart.isNotEmpty()) {
            val product = productsInCart.removeAt(productsInCart.size - 1)
            println("${product.showInfo()} выдан из тележки.")
            product
        } else {
            println("Тележка пуста.")
            null
        }
    }

    fun getProducts(): List<Product> {
        return productsInCart.toList()
    }
}