class ProductBuffer {
        private val products = mutableListOf<Product>()

        fun addProduct(product: Product) {
            products.add(product)
            println("${product.showInfo()} добавлено в буфер.")
        }

        fun clearBuffer() {
            products.clear()
            println("Буфер очищен.")
        }

        fun getProducts(): List<Product> {
            return products.toList()
        }

    fun releaseProduct(): Product? {
        return if (products.isNotEmpty()) {
            val product = products.removeAt(products.size - 1)
            println("${product.showInfo()} выдан из буфера.")
            product
        } else {
            println("Пакет пуст.")
            null
        }
    }
}
