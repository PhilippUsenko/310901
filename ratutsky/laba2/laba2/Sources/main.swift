swift // The Swift Programming Language
// https://docs.swift.org/swift-book

import Foundation

// Функция для проверки кратности числа девяти
func isDivisibleByNine(_ p: Int) -> Bool {
    // Вычисляем сумму цифр числа
    var sumOfDigits = 0
    var number = p
    
    while number > 0 {
        sumOfDigits += number % 10
        number /= 10
    }
    
    // Проверяем кратность 9
    return sumOfDigits % 9 == 0
}

// Чтение числа P
print("Введите натуральное число P:")
if let input = readLine(), let p = Int(input), p > 0 {
    if isDivisibleByNine(p) {
        print("Число \(p) кратно 9")
    } else {
        print("Число \(p) не кратно 9")
    }
} else {
    print("Некорректный ввод. Введите натуральное число.")
}
