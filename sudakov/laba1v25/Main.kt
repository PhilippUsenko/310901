fun main() {
    val buyerMoney = Money(20.0)
    val buyer = Buyer(buyerMoney)
    val store = Store("Магазин")

    val matches = Matches(5, 10.0)
    val whiteBread = Bread("Белый")
    val ryeBread = Bread("Ржаной")
    val milk = Milk(3)

    while (true) {
        println("Вас приветствует магазин!")
        println("1. Взять товар")
        println("2. Положить в тележку")
        println("3. Купить товар")
        println("4. Взять товар из тележки")
        println("5. Положить товар в пакет")
        println("6. Выход")

        val choice = readLine()?.toIntOrNull()

        when (choice) {
            1 -> {
                println("Какой товар вы хотите взять?")
                println("1. Спички")
                println("2. Хлеб")
                println("3. Молоко")

                val productChoice = readLine()?.toIntOrNull()
                when (productChoice) {
                    1 -> buyer.takeProduct(matches)
                    2 -> {
                        println("Какой хлеб вы хотите взять?")
                        println("1. Белый хлеб")
                        println("2. Ржаной хлеб")

                        val breadChoice = readLine()?.toIntOrNull()
                        when (breadChoice) {
                            1 -> buyer.takeProduct(whiteBread)
                            2 -> buyer.takeProduct(ryeBread)
                            else -> println("Некорректный выбор хлеба.")
                        }
                    }
                    3 -> buyer.takeProduct(milk)
                    else -> println("Некорректный выбор товара.")
                }
            }

            2 -> {
                buyer.putInCart()
                println("Товары добавлены в тележку.")
            }
            3 -> {
                buyer.buyProduct(store)
                println("Товар куплен.")
            }
            4 -> {
                val productFromCart = buyer.takeFromCart()
                if (productFromCart != null) {
                    buyer.takeProduct(productFromCart)
                    println("${productFromCart.name} взят из тележки.")
                } else {
                    println("Тележка пуста.")
                }
            }
            5 -> {
                val productFromBufferToBag = buyer.takeFromBuffer()
                if (productFromBufferToBag != null) {
                    buyer.putInBag(productFromBufferToBag)
                    println("${productFromBufferToBag.name} взят из буфера.")
                } else {
                    println("Буфер пуст.")
                }

            }
            6 -> {
                println("Выход из программы.")
                return
            }
            else -> println("Некорректный выбор. Попробуйте снова.")
        }
    }
}



