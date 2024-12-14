//1 часть
import Foundation

// Функция для нахождения совершенных чисел, не превосходящих заданное число
func findPerfectNumbers(upTo limit: Int) -> [Int] {
    var perfectNumbers = [Int]()
    
    // Перебираем все числа от 2 до предела (limit)
    for number in 2...limit {
        var sumOfDivisors = 0
        
        // Находим все делители числа, не считая самого числа
        for divisor in 1...(number / 2) {
            if number % divisor == 0 {
                sumOfDivisors += divisor
            }
        }
        
        // Если сумма делителей равна числу, добавляем его в список совершенных чисел
        if sumOfDivisors == number {
            perfectNumbers.append(number)
        }
    }
    
    return perfectNumbers
}

// Основная часть программы
print("Введите натуральное число P:")
if let input = readLine(), let P = Int(input), P > 0 {
    let perfectNumbers = findPerfectNumbers(upTo: P)
    
    if perfectNumbers.isEmpty {
        print("Совершенных чисел, не превосходящих \(P), не найдено.")
    } else {
        print("Совершенные числа, не превосходящие \(P): \(perfectNumbers)")
    }
} else {
    print("Введите корректное натуральное число.")
}
