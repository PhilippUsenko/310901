package kotlinequivalent

// Класс компании
class Company(
    private var money: Double,
    private var name: String,
    var plan: String
) {
    fun getMoney() : Double  {return this.money}
    fun addMoney(cost : Double) {this.money += cost}

    fun getName() : String {return this.name}
    fun setName(newName: String) {this.name = newName}


    fun receiveOrder(product: String, amount: Int, isUrgent: Boolean, timeLimit: String): Double {
        println("\nКомпания \"$name\" получила заказ.")
        val order = if (isUrgent) {
            UrgentOrder(1, product, amount, "ожидает выполнения", timeLimit).apply {
                println("\nКомпания \"$name\" создала срочный заказ №${getNumber()}: $product, " +
                        "количество - $amount шт., лимит времени: $timeLimit, состояние заказа - ${getStatus()}.")
                // Вызов apply позволяет выполнить блок кода в контексте этого объекта
                // Например, обратиться к свойствам без явного упоминания объекта (this используется неявно)
            }
        } else {
            Order(1, product, amount, "ожидает выполнения").apply {
                println("\nКомпания \"$name\" создала обычный заказ №${getNumber()}: $product, " +
                        "количество - $amount шт., состояние заказа - ${getStatus()}.")
            }
        }
        return executeOrder(order)
    }

    private fun executeOrder(order: Order): Double {
        order.setStatus("в процессе выполнения")
        println("\nКомпания \"$name\" приступила к выполнению заказа №${order.getNumber()}, " +
                "состояние заказа - ${order.getStatus()}.")

        if (order is UrgentOrder) {
            order.setTimeLimit("12 часов")
            println("\nКомпания \"$name\" внесла изменения в срочный заказ №${order.getNumber()}.")
            order.checkTime()
        }

        order.setStatus("выполнен")
        println("\nКомпания \"$name\" завершила выполнение заказа №${order.getNumber()}, состояние заказа - ${order.getStatus()}.")
        return 500.0 * order.getAmount()  // возвращаем стоимость заказа
    }
}


