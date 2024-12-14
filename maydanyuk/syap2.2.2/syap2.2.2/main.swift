//2.2 часть
import Foundation

// Структура для представления обыкновенной дроби
struct Fraction {
    var numerator: Int // числитель
    var denominator: Int // знаменатель
    
    // Инициализатор для создания дроби
    init(_ numerator: Int, _ denominator: Int) {
        self.numerator = numerator
        self.denominator = denominator
    }
    
    // Метод для упрощения дроби
    func simplified() -> Fraction {
        let gcd = gcd(numerator, denominator)
        return Fraction(numerator / gcd, denominator / gcd)
    }
    
    // Метод для нахождения наибольшего общего делителя (НОД)
    private func gcd(_ a: Int, _ b: Int) -> Int {
        if b == 0 {
            return a
        } else {
            return gcd(b, a % b)
        }
    }
}

// Функция для деления обыкновенных дробей
let divideFractions: (Fraction, Fraction) -> Fraction = { (a, b) in
    // Деление дробей: (a/b) / (c/d) = (a * d) / (b * c)
    let resultNumerator = a.numerator * b.denominator
    let resultDenominator = a.denominator * b.numerator
    return Fraction(resultNumerator, resultDenominator).simplified()
}

// Пример использования
let fractionA = Fraction(3, 4)
let fractionB = Fraction(2, 5)
let fractionResult = divideFractions(fractionA, fractionB)
print("Результат деления \(fractionA.numerator)/\(fractionA.denominator) на \(fractionB.numerator)/\(fractionB.denominator) равен \(fractionResult.numerator)/\(fractionResult.denominator)")
