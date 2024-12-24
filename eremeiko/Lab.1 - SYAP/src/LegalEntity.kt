package kotlinequivalent

// Юридическое лицо
class LegalEntity(name: String, money: Double) : AbstractClient(name, money) {
    override fun pay(cost: Double, company: Company) {
        if (money >= cost) {
            money -= cost
            company.addMoney(cost)  // добавляем деньги компании
            println("\nЮридическое лицо $name оплатило $cost$. Остаток: $money$.")
        } else {
            println("\nЮридическому лицу $name недостаточно средств для оплаты.")
        }
    }

    override fun order(company: Company, product: String, amount: Int, isUrgent: Boolean, timeLimit: String): Double {
        if (!isUrgent) {
            println("\nЮридическое лицо $name сделало заказ \"$product\" количеством $amount шт.")
        } else {
            println("\nЮридическое лицо $name сделало срочный заказ \"$product\" количеством $amount шт., лимит времени - $timeLimit.")
        }
        return company.receiveOrder(product, amount, isUrgent, timeLimit)
    }
}