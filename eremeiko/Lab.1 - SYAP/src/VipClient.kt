package kotlinequivalent

// ВИП-клиент
class VipClient(name: String, money: Double) : AbstractClient(name, money) {
    override fun pay(cost: Double, company: Company) {
        val finalCost = cost - (cost * 0.1)
        if (money >= finalCost) {
            money -= finalCost
            company.addMoney(cost)  // добавляем деньги компании
            println("\nВИП-клиент $name оплатил $finalCost$ с учетом скидки. Остаток: $money$.")
        } else {
            println("\nВИП-клиенту $name недостаточно средств для оплаты.")
        }
    }

    override fun order(company: Company, product: String, amount: Int, isUrgent: Boolean, timeLimit: String): Double {
        if (!isUrgent) {
            println("\nВИП-клиент $name сделал заказ \"$product\" количеством $amount шт.")
        } else {
            println("\nВИП-клиент $name сделал срочный заказ \"$product\" количеством $amount шт., лимит времени - $timeLimit.")
        }
        return company.receiveOrder(product, amount, isUrgent, timeLimit)
    }
}