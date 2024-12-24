package kotlinequivalent

// Физическое лицо
class PhysicalPerson(name: String, money: Double) : AbstractClient(name, money) {
    override fun pay(cost: Double, company: Company) {
        if (money >= cost) {
            money -= cost
            company.addMoney(cost)  // добавляем деньги компании
            println("\nФизическое лицо $name оплатило $cost$. Остаток: $money$.")
        } else {
            println("\nФизическому лицу $name недостаточно средств для оплаты.")
        }
    }

    override fun order(company: Company, product: String, amount: Int, isUrgent: Boolean, timeLimit: String): Double {
        if (!isUrgent) {
            println("\nФизическое лицо $name сделало заказ \"$product\" количеством $amount шт.")
        } else {
            println("\nФизическое лицо $name сделало срочный заказ \"$product\" количеством $amount шт., лимит времени - $timeLimit.")
        }
        return company.receiveOrder(product, amount, isUrgent, timeLimit)
    }
}