import Foundation
func factorial(of number: Int) -> Int {
    if number < 0 {
        print("Факториал не определен для отрицательных чисел")
    }
    
    if number == 0 {
        return 1
    } else {
        return number * factorial(of: number - 1)
    }
}

print("Введите число для вычисления факториала:")
if let input = readLine(), let P = Int(input) {
    let result = factorial(of: P)
    print("Факториал числа \(P) равен \(result)")
} else {
    print("Вы ввели некорректное значение")
}
