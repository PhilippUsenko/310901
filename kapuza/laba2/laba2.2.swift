// Функция для вычитания десятичных дробей
func subtractDecimals(_ a: Double, _ b: Double) -> Double {
    return a - b
}
let decimalResult = subtractDecimals(5.75, 2.30)
print("Результат вычитания десятичных дробей: \(decimalResult)")


// Структура для представления обыкновенной дроби
struct Fraction {
    var numerator: Int // Числитель
    var denominator: Int // Знаменатель
    
    // Метод для вычитания другой дроби
    func subtract(_ other: Fraction) -> Fraction {
        // Приведение дробей к общему знаменателю
        let commonDenominator = self.denominator * other.denominator
        let newNumerator = self.numerator * other.denominator - other.numerator * self.denominator
        // Возвращаем результат в упрощенном виде
        return Fraction(numerator: newNumerator, denominator: commonDenominator).simplify()
    }
    
    // Метод для упрощения дроби
    func simplify() -> Fraction {
        let gcdValue = gcd(numerator, denominator)
        return Fraction(numerator: numerator / gcdValue, denominator: denominator / gcdValue)
    }
    
    // Метод для нахождения наибольшего общего делителя (НОД)
    private func gcd(_ a: Int, _ b: Int) -> Int {
        return b == 0 ? a : gcd(b, a % b)
    }
}
let fraction1 = Fraction(numerator: 3, denominator: 4)
let fraction2 = Fraction(numerator: 1, denominator: 2)
let fractionResult = fraction1.subtract(fraction2)
print("Результат вычитания обыкновенных дробей: \(fractionResult.numerator)/\(fractionResult.denominator)")
