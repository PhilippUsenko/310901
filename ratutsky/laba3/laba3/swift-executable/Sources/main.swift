// The Swift Programming Language
// https://docs.swift.org/swift-book

class Math {
    
    // Метод для сложения
    func addition(a: Double, b: Double) {
        let result = a + b
        print("Сложение: \(a) + \(b) = \(result)")
    }
    
    // Метод для вычитания
    func subtraction(a: Double, b: Double) {
        let result = a - b
        print("Вычитание: \(a) - \(b) = \(result)")
    }
    
    // Метод для умножения
    func multiplication(a: Double, b: Double) {
        let result = a * b
        print("Умножение: \(a) * \(b) = \(result)")
    }
    
    // Метод для деления
    func division(a: Double, b: Double) {
        if b != 0 {
            let result = a / b
            print("Деление: \(a) / \(b) = \(result)")
        } else {
            print("Ошибка: Деление на ноль невозможно")
        }
    }
}

// Пример использования:
let math = Math()

math.addition(a: 10, b: 5)       // Сложение: 10.0 + 5.0 = 15.0
math.subtraction(a: 10, b: 5)    // Вычитание: 10.0 - 5.0 = 5.0
math.multiplication(a: 10, b: 5) // Умножение: 10.0 * 5.0 = 50.0
math.division(a: 10, b: 5)       // Деление: 10.0 / 5.0 = 2.0

