//2.1

import Foundation

// Определяем тип для операции сложения
typealias DecimalAddition = (Double, Double) -> Double

// Реализация функции сложения десятичных дробей
let addDecimals: DecimalAddition = { (a, b) in // замыкание
    return a + b
}

// Пример использования
let decimal1 = 3.14
let decimal2 = 2.71
let sumDecimal = addDecimals(decimal1, decimal2)
print("Сумма десятичных дробей: \(sumDecimal)")
