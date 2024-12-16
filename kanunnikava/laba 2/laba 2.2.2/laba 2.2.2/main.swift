//2.2
import Foundation

// Функция для нахождения НОД (наибольший общий делитель)
func greatestCommonDivisor(_ a: Int, _ b: Int) -> Int {
    return b == 0 ? abs(a) : greatestCommonDivisor(b, a % b)
}

// Функция для упрощения дроби
func simplifyFraction(numerator: Int, denominator: Int) -> (Int, Int) {
    let gcd = greatestCommonDivisor(numerator, denominator)
    return (numerator / gcd, denominator / gcd)
}

// Функция для сложения дробей
func addFractions(_ frac1: (Int, Int), _ frac2: (Int, Int)) -> (Int, Int) {
    let commonDenominator = frac1.1 * frac2.1 // Знаменатель
    let newNumerator = (frac1.0 * frac2.1) + (frac2.0 * frac1.1) // Числитель
    return simplifyFraction(numerator: newNumerator, denominator: commonDenominator)
}

// Пример использования
let fraction1 = (1, 2) // 1/2
let fraction2 = (1, 3) // 1/3
let sumFraction = addFractions(fraction1, fraction2)
print("Сумма обыкновенных дробей: \(sumFraction.0)/\(sumFraction.1)")
