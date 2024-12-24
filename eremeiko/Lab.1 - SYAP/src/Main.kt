package kotlinequivalent

// Главная функция
fun main() {
    // Создаем компанию и руководителя
    val company = Company(10000.0, "Технологии будущего", "Годовой план")
    val manager = CompanyManager("Александр")

    // Руководитель изменяет название и план компании
    manager.changeCompanyName(company, "Инновационные технологии")
    manager.changeCompanyPlan(company, "Ежеквартальный план")

    // Создаем клиента
    val client = PhysicalPerson("Иван", 1500.0)

    // Клиент (физическое лицо) делает заказ "Ноутбук" количеством 2 штуки и получает стоимость заказа
    val cost = client.order(company, "Ноутбук", 2, true, "24 часа")

    // Клиент оплачивает заказ
    client.pay(cost, company)
}



