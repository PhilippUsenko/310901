//2.1 часть
import Foundation

// Функция для деления десятичных дробей
let divideDecimals: (Double, Double) -> Double = { (a, b) in
    return a / b
}

// Пример использования
let decimalA: Double = 10.5
let decimalB: Double = 2.5
let decimalResult = divideDecimals(decimalA, decimalB)
print("Результат деления \(decimalA) на \(decimalB) равен \(decimalResult)")
