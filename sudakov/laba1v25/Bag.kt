class Bag {
    private val products = mutableListOf<Product>()

    fun acceptProduct(product: Product) {
        products.add(product)
        println("${product.showInfo()} добавлено в пакет.")
    }

    fun releaseProduct(): Product? {
        return if (products.isNotEmpty()) {
            val product = products.removeAt(products.size - 1)
            println("${product.showInfo()} выдан из пакета.")
            product
        } else {
            println("Пакет пуст.")
            null
        }
    }
}