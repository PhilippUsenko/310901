import Foundation

let constantArray = [6, 28, 496, 8128, 33550336, 8589869056, 137438691328]

func checkNum(n: Int) {
    for number in constantArray {
        if number < n {
            print(number) 
        }
    }
}

print("Введите число:")
if let input = readLine(), let num = Int(input) {
checkNum(n: num)
} else {
    print("Некорректный ввод. Пожалуйста, введите целое число.")
}

